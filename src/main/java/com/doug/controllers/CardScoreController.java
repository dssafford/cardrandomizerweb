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
	CardRepository cardRepository;

	@Autowired
	ExamRepository examRepository;

	@Autowired
	LocationTestRepository locationTestRepository;

	@Autowired
	LocationScoreRepository locationScoreRepository;

	@Autowired
	CardScoreRepository cardScoreRepository;

	@Autowired
	SimpleCardTestRepository cardTestRepository;

	BigDecimal finalScore;

	@RequestMapping(value = "/scoreSimpleCardAnswersTest", method = RequestMethod.GET)
	public String scoreAnswersTest(HttpSession session, Model model) {
		ArrayList<CardInfo> masterCardDeck;
		ArrayList<SimpleCardTest> cardSimpleSimpleCardTestArray = new ArrayList<>();
		masterCardDeck = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

		//create test answers
		//create master list if it doesn't exist
		if(masterCardDeck == null){
			masterCardDeck = cardService.createCardLearningMasterList();
			session.setAttribute("masterCardDeck", masterCardDeck);
		}

		// get answers from session
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");

		cardSimpleSimpleCardTestArray = Helpers.SimpleCompareArrays(cardService.createmasterCardList(session), enteredAnswers);


		session.setAttribute("cardSimpleTestArray", cardSimpleSimpleCardTestArray);

		finalScore = Helpers.CalcFinalScore(cardSimpleSimpleCardTestArray);

		model.addAttribute("finalScore", finalScore + "%");
		model.addAttribute("scores", cardSimpleSimpleCardTestArray);

		return "scores";

	}

	@RequestMapping(value = "/scoreCardAnswers", method = RequestMethod.GET)
	public String scoreAnswers(HttpSession session, Model model) {
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");
		ArrayList<Card> cachedShuffledCardNames = (ArrayList<Card>)session.getAttribute("cachedShuffledCardNames");
		ArrayList<SimpleCardTest> cardSimpleSimpleCardTestArray = new ArrayList<>();

		cardSimpleSimpleCardTestArray = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		session.setAttribute("cardSimpleTestArray", cardSimpleSimpleCardTestArray);

		finalScore = Helpers.CalcFinalScore(cardSimpleSimpleCardTestArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", cardSimpleSimpleCardTestArray);


		return "scores";

	}

	@RequestMapping("/saveCardScore")
	public String testScore(HttpSession session, Model model) {

//		Exam myScore = examRepository.save(createTestScore());

		Exam exam = new Exam(finalScore,Helpers.getTimeStamp(), "card",  "my comments here", true);


//public CardTest(String answerPersonName, String answerPersonAction, String answerPersonObject, Boolean answerPersonNameCorrect,
//				  Boolean answerPersonActionCorrect, Boolean answerPersonObjectCorrect, Integer testid) {
		//save new entry in SimpleCardTest table
		Object myObj = examRepository.save(exam);

		//Add to Session
		ArrayList<SimpleCardTest> cardSimpleTestArray = (ArrayList<SimpleCardTest>)session.getAttribute("cardSimpleTestArray");
		for(int i =0;i<cardSimpleTestArray.size()-1;i++){
			cardSimpleTestArray.get(i).setExamId(((Exam) myObj).getId());
		}

//		ArrayList<SimpleCardTest> cardTests = new ArrayList<SimpleCardTest>();



/*		for(int i = 0; i< simpleCardSimpleCardTestEnteredAnswers.size()-1; i++){
			cardTests.add(new SimpleCardTest(simpleCardSimpleCardTestEnteredAnswers.get(i).getQuestionCardName(),
					  simpleCardSimpleCardTestEnteredAnswers.get(i).getAnswerCardName(),
					  simpleCardSimpleCardTestEnteredAnswers.get(i).isAnswerCardCorrect()));

		}*/
//		cardTests.add(new CardTest("Doug","swing","bat",false,false,true, ((Exam) myObj).getId()));


		//then save in LocationTest
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
	@RequestMapping("/showCardScoreHistory")
	public String getAllScores(Model model) {

		ArrayList<Exam> mylist = (ArrayList<Exam>)examRepository.findByTesttype("card");

		model.addAttribute("scores", mylist);


		return "score/showCardScoresHistory";
	}




	@RequestMapping("cardScore/{id}")
	public String showSingleTest(@PathVariable Integer id, Model model){

//		Exam myList = examRepository.findOne(id);

		ArrayList<CardTest> myList = (ArrayList<CardTest>)cardScoreRepository.findByTestId(id);

		model.addAttribute("finalScore", 80 + "%");
		model.addAttribute("scores", myList);
		model.addAttribute("tests", myList);
//		model.addAttribute("masterList", masterList);



//		Integer masterListID= myList.getMasterListID();
//
//		Integer myListAnswerListID = myList.getAnswerListID();



//		ArrayList<Answer> answerList = (ArrayList<Answer>)answerService.findById(myListAnswerListID);
//
//		answerList.add(new Answer("doug","throw", "ball"));
//		answerList.add(new Answer("bill","throw", "kite"));
//		answerList.add(new Answer("joe","throw", "ball"));
//		answerList.add(new Answer("sally","throw", "hat"));


		//ArrayList masterList = cardRepository.findAll(myListAnswerListID);


//		cardSimpleTestArray = Helpers.SimpleCompareCardInfoArrays(masterList, answerList);
//
//		finalScore = Helpers.CalcFinalScore(cardSimpleTestArray);

		model.addAttribute("finalScore", 80 + "%");
//		model.addAttribute("scores", myList);
//		model.addAttribute("tests", answerList);
//		model.addAttribute("masterList", masterList);

		return "score/singleCardTestScores";
	}


	private void createScoreToSave(ArrayList learningMasterCards, ArrayList enteredAnswers) {
		Exam exam = new Exam();
//		scoreList.setMasterList(learningMasterCards);
//		scoreList.setAnswerList(enteredAnswers);

		ArrayList<SimpleCardTest> cardSimpleSimpleCardTestArray = new ArrayList<>();

		exam.setFinalScore(finalScore);

		scoreRepository.save(exam);


	}

	public ArrayList createScoreList(HttpSession session) {
		ArrayList returnList = new ArrayList();

		ArrayList<SimpleCardTest> cardSimpleSimpleCardTestArray = ((ArrayList<SimpleCardTest>)session.getAttribute("cardSimpleSimpleCardTestArray"));

		for(int i = 0; i< cardSimpleSimpleCardTestArray.size(); i++) {
			returnList.add(cardSimpleSimpleCardTestArray.get(i).isAnswerCardNameCorrect());
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
		ArrayList<SimpleCardTest> scoreList = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

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
