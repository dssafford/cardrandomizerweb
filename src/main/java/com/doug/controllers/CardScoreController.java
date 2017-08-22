package com.doug.controllers;

import com.doug.domain.*;
import com.doug.repositories.*;
import com.doug.services.AnswerServiceImpl;
import com.doug.services.CardServiceImpl;
import com.doug.services.Helpers;
import com.doug.services.LocationService;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Created by Doug on 1/8/17.
 */

@Controller
public class CardScoreController {

	@Autowired
	private ScoreRepository scoreRepository;

	@Autowired
	private CardServiceImpl cardService;

	@Autowired
	private LocationService locationService;

	@Autowired
	AnswerRepository answerRepository;

	@Autowired
	private AnswerServiceImpl answerService;


	@Autowired
	ExamRepository examRepository;

	@Autowired
	LocationQuizRepository locationQuizRepository;

	@Autowired
	LocationScoreRepository locationScoreRepository;

	@Autowired
	CardScoreRepository cardScoreRepository;

	@Autowired
	SimpleCardQuizRepository cardTestRepository;

	BigDecimal finalScore;






	@RequestMapping(value = "/scoreSimpleCardAnswersTest", method = RequestMethod.GET)
	public String scoreAnswersTest(HttpSession session, Model model) {
		ArrayList<CardInfo> masterCardDeck;
		ArrayList<SimpleCardQuiz> cardSimpleSimpleCardQuizArray = new ArrayList<>();
		masterCardDeck = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

		//create test answers
		//create master list if it doesn't exist
		if(masterCardDeck == null){
			masterCardDeck = cardService.createCardLearningMasterList();
			session.setAttribute("masterCardDeck", masterCardDeck);
		}

		// get answers from session
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");

		cardSimpleSimpleCardQuizArray = Helpers.SimpleCompareArrays(cardService.createmasterCardList(session), enteredAnswers);


		session.setAttribute("cardSimpleTestArray", cardSimpleSimpleCardQuizArray);

		finalScore = Helpers.CalcFinalScore(cardSimpleSimpleCardQuizArray);

		model.addAttribute("finalScore", finalScore + "%");
		model.addAttribute("scores", cardSimpleSimpleCardQuizArray);

		return "scores";

	}

	@RequestMapping(value = "/scoreCardAnswers", method = RequestMethod.GET)
	public String scoreAnswers(HttpSession session, Model model) {
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");
		ArrayList<Card> cachedShuffledCardNames = (ArrayList<Card>)session.getAttribute("cachedShuffledCardNames");
		ArrayList<SimpleCardQuiz> cardSimpleSimpleCardQuizArray = new ArrayList<>();

		cardSimpleSimpleCardQuizArray = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		session.setAttribute("cardSimpleTestArray", cardSimpleSimpleCardQuizArray);

		finalScore = Helpers.CalcFinalScore(cardSimpleSimpleCardQuizArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", cardSimpleSimpleCardQuizArray);


		return "scores";

	}

	@RequestMapping("/saveCardScore")
	public String testScore(HttpSession session, Model model) {


		Exam exam = new Exam(finalScore,Helpers.getTimeStamp(), "card",  "my comments here", true);

		//save new entry in SimpleCardQuiz table
		Object myObj = examRepository.save(exam);

		//Add to Session
		ArrayList<SimpleCardQuiz> cardSimpleTestArray = (ArrayList<SimpleCardQuiz>)session.getAttribute("cardSimpleTestArray");
		for(int i =0;i<cardSimpleTestArray.size();i++){
			cardSimpleTestArray.get(i).setExamId(((Exam) myObj).getId());
		}



		//then save in LocationQuiz
		cardTestRepository.save(cardSimpleTestArray);

		return "index";
	}

	@RequestMapping("/getScores")
	public String getScores(HttpSession session, Model model) {

		ArrayList<CardInfo> learningRandomCards = (ArrayList<CardInfo>)session.getAttribute("learningRandomCards");
		ArrayList<CardInfo> enteredAnswers = (ArrayList<CardInfo>)session.getAttribute("enteredAnswers");
		ArrayList<CardInfo> cachedShuffledCardNames = (ArrayList<CardInfo>)session.getAttribute("cachedShuffledCardNames");


		ArrayList<Display> displayList = createDisplayList(learningRandomCards, enteredAnswers, cachedShuffledCardNames  );

		//displayList.get(0).getMasterCardName();
		model.addAttribute("scores", displayList);

		return "score/showScores";

	}
	@RequestMapping("/showSimpleCardScoreHistory")
	public String getAllScores(Model model) {

		ArrayList<Exam> mylist = (ArrayList<Exam>)examRepository.findByTesttype("simpleCard");

		model.addAttribute("scores", mylist);


		return "score/showSimpleCardScoresHistory";
	}

	@RequestMapping("/showComplexCardScoreHistory")
	public String getAllComplexScores(Model model) {

		ArrayList<Exam> mylist = (ArrayList<Exam>)examRepository.findByTesttype("complexcard");

		model.addAttribute("scores", mylist);


		return "score/showComplexCardScoresHistory";
	}


	@RequestMapping("cardScore/{id}")
	public String showSingleTest(@PathVariable Integer id, Model model){

		ArrayList<SimpleCardQuiz> myList = (ArrayList<SimpleCardQuiz>)cardScoreRepository.findByExamId(id);
		finalScore = Helpers.CalcFinalScore(myList);

		model.addAttribute("tests", myList);
		model.addAttribute("finalScore", finalScore + "%");

		return "score/singleSimpleCardQuizScores";
	}


	private void createScoreToSave(ArrayList learningMasterCards, ArrayList enteredAnswers) {
		Exam exam = new Exam();
//		scoreList.setMasterList(learningMasterCards);
//		scoreList.setAnswerList(enteredAnswers);

		ArrayList<SimpleCardQuiz> cardSimpleSimpleCardQuizArray = new ArrayList<>();

		exam.setFinalScore(finalScore);

		scoreRepository.save(exam);

	}

	public ArrayList createScoreList(HttpSession session) {
		ArrayList returnList = new ArrayList();

		ArrayList<SimpleCardQuiz> cardSimpleSimpleCardQuizArray = ((ArrayList<SimpleCardQuiz>)session.getAttribute("cardSimpleSimpleCardQuizArray"));

		for(int i = 0; i< cardSimpleSimpleCardQuizArray.size(); i++) {
			returnList.add(cardSimpleSimpleCardQuizArray.get(i).isAnswerCardNameCorrect());
		}

		return returnList;

	}


	private Exam createTestScore() {
		Exam exam = new Exam();

		exam.setComments("comments here");
		exam.setTimestamp(new Timestamp(Time.now()));
		exam.setTesttype("card");

		return exam;
	}

	private ArrayList<Display> createDisplayList(ArrayList learningRandomCards,
																ArrayList enteredAnswers, ArrayList cachedShuffledCardNames) {

		ArrayList<Display> displayArrayList = new ArrayList<Display>();

		ArrayList<Card> answerList = enteredAnswers;
		ArrayList<CardInfo> masterList = learningRandomCards;
		ArrayList<SimpleCardQuiz> scoreList = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		Display display;

		for(int i=0;i<6;i++) {
			display = new Display();

			display.setId(i);
			display.setMasterCardName(masterList.get(i).getCardName());
			display.setAnswerCardName(answerList.get(i).getCardName());
			display.setAnswerCorrect(scoreList.get(i).isAnswerCardNameCorrect());

			displayArrayList.add(display);

		}

		return displayArrayList;
	}



}
