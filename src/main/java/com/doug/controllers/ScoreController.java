package com.doug.controllers;

import com.doug.domain.*;
import com.doug.repository.ScoreRepository;
import com.doug.services.CardServiceImpl;
import com.doug.services.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Doug on 1/8/17.
 */

@Controller
public class ScoreController {

	ArrayList<Test> testArray = new ArrayList<>();

	@Autowired
	private ScoreRepository scoreRepository;

	@Autowired
	private CardServiceImpl cardService;

	BigDecimal finalScore;


	@RequestMapping(value = "/scoreAnswersTest", method = RequestMethod.GET)
	public String scoreAnswersTest(HttpSession session, Model model) {
		ArrayList<CardInfo> masterCardDeck;

		masterCardDeck = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

		//create test answers
		//create master list if it doesn't exist
		if(masterCardDeck == null){
			masterCardDeck = cardService.createCardLearningMasterList();
			session.setAttribute("masterCardDeck", masterCardDeck);
		}

		// get answers from session
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");

		testArray = Helpers.SimpleCompareArrays(cardService.createmasterCardList(session), enteredAnswers);


		session.setAttribute("testArray", testArray);

		finalScore = Helpers.CalcFinalScore(testArray);

		model.addAttribute("finalScore", finalScore + "%");
		model.addAttribute("scores", testArray);

		return "scores";

	}

	@RequestMapping(value = "/scoreAnswers", method = RequestMethod.GET)
	public String scoreAnswers(HttpSession session, Model model) {
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");
		ArrayList<Card> cachedShuffledCardNames = (ArrayList<Card>)session.getAttribute("cachedShuffledCardNames");


		testArray = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		session.setAttribute("testArray", testArray);

		finalScore = Helpers.CalcFinalScore(testArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", testArray);


		return "scores";

	}

	@RequestMapping("/saveScore")
	public String testScore(Model model) {
		ScoreList myScore = scoreRepository.save(createTestScore());
		model.addAttribute("score", myScore);
		return "score/showScore";
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
	@RequestMapping("/showScoreHistory")
	public String getAllScores(Model model) {

		ArrayList<ScoreList> mylist = (ArrayList<ScoreList>)scoreRepository.findAll();

//

//		ArrayList<CardInfo> masterList = mylist.get(1).getMasterList();
//		String cardName = masterList.get(0).getCardName();

		model.addAttribute("scores", mylist);

		//displayList.get(0).getMasterCardName();
		//model.addAttribute("scores", displayList);

		return "score/showScoresHistory";

	}

	@RequestMapping("scoreHistory/{id}")
	public String showSingleTest(@PathVariable Integer id, Model model){

//		ScoreList myList = scoreRepository.findOne(id.toString());

//		ArrayList<CardInfo> masterList = myList.getMasterList();
//		ArrayList<CardInfo> answerList = myList.getAnswerList();

//		testArray = Helpers.SimpleCompareCardInfoArrays(myList.getMasterList(), myList.getAnswerList());

		finalScore = Helpers.CalcFinalScore(testArray);

		model.addAttribute("finalScore", finalScore + "%");
		model.addAttribute("scores", testArray);
//		model.addAttribute("answerList", answerList);
//		model.addAttribute("masterList", masterList);

		return "score/singleTestScores";
	}


	private void createScoreToSave(ArrayList learningMasterCards, ArrayList enteredAnswers) {
		ScoreList scoreList = new ScoreList();
//		scoreList.setMasterList(learningMasterCards);
//		scoreList.setAnswerList(enteredAnswers);
		scoreList.setFinalScore(finalScore);

		scoreRepository.save(scoreList);

	}

	public ArrayList createScoreList() {
		ArrayList returnList = new ArrayList();

		for(int i=0;i< testArray.size();i++) {
			returnList.add(testArray.get(i).isCorrect());
		}

		return returnList;

	}


	private ScoreList createTestScore() {
		ScoreList scoreList = new ScoreList();

		//score.setUserid(1);
//		scoreList.setAnswerList(TestHelper.createAnswerList());
//		scoreList.setMasterList(createTestRandomList());
		//scoreList.setFinalScore(finalScore);
		scoreList.setComments("comments here");
		scoreList.setTimestamp(new Date());

		return scoreList;
	}

	private ArrayList<Display> createDisplayList(ArrayList learningRandomCards,
																ArrayList enteredAnswers, ArrayList cachedShuffledCardNames) {

		ArrayList<Display> displayArrayList = new ArrayList<Display>();

		ArrayList<Card> answerList = enteredAnswers;
		ArrayList<CardInfo> masterList = learningRandomCards;
		ArrayList<Test> scoreList = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		Display display;

		for(int i=0;i<6;i++) {
			display = new Display();

			display.setId(i);
			display.setMasterCardName(masterList.get(i).getCardName());
			display.setAnswerCardName(answerList.get(i).getCardName());
			display.setAnswerCorrect(scoreList.get(i).isCorrect());

			displayArrayList.add(display);

		}

		return displayArrayList;
	}

}
