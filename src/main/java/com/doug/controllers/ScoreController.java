package com.doug.controllers;

import com.doug.domain.*;
import com.doug.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Doug on 1/8/17.
 */

@Controller
public class ScoreController {

	//public ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
	//public ArrayList<Card> enteredAnswers = new ArrayList<Card>();

	public ArrayList<Test> testArray = new ArrayList<Test>();


	@Autowired
	private ScoreRepository scoreRepository;

	@RequestMapping("/saveScore")
	public String testScore(Model model) {
		Score myScore = scoreRepository.save(createTestScore());

		model.addAttribute("score", myScore );
//		model.addAttribute("masters", myScore.getMasterList());
//		model.addAttribute("answers", myScore.getAnswerList());
//		model.addAttribute("scoreLists", myScore.getScoreList());

		return "score/showScore";
	}

	@RequestMapping("/getScores")
	public String getScores(Model model) {

		//List<Score> scores = scoreRepository.findAll();

		ArrayList<Display> displayList = createDisplayList();

		//displayList.get(0).getMasterCardName();
		model.addAttribute("scores", displayList );

		return "score/showScores";

	}

	private ArrayList<Display> createDisplayList() {

		ArrayList<Display> displayArrayList = new ArrayList<Display>();

		ArrayList<Card> answerList = createAnswerList();
		ArrayList<CardInfo> masterList = createTestRandomList();
		ArrayList<Test> scoreList = createScoreList();

		List<Score> scores = scoreRepository.findAll();

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

	private Score createTestScore() {
		Score score = new Score();

		//score.setUserid(1);
		score.setAnswerList(createAnswerList());
		score.setMasterList(createTestRandomList());
		score.setScoreList(createScoreList());
		score.setComments("comments here");
		score.setTimestamp(new Date());

		return score;
	}

	private ArrayList<CardInfo> createTestRandomList() {
		CardInfo cardInfo;

		ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
		cardInfo = new CardInfo("Ace_of_Hearts", "people we love", "sportsmen",
				  "Hearts", "Peyton Manning", "throwing", "football");
		learningRandomCards.add(cardInfo);
		cardInfo = new CardInfo("2_of_Hearts", "people we love", "sportswomen",
				  "Hearts", "Ana Kornikova", "bending over", "small white tennis dress");
		learningRandomCards.add(cardInfo);

		cardInfo = new CardInfo("Ace_of_Diamonds", "rich people", "sportsmen",
				  "Diamonds", "Michael Jordan", "dunking", "basketball");
		learningRandomCards.add(cardInfo);
		cardInfo = new CardInfo("2_of_Diamonds", "rich people", "sportswomen",
				  "Diamonds", "Maria Sharopova", "swinging ", "tennis racket");
		learningRandomCards.add(cardInfo);
		cardInfo = new CardInfo("3_of_Diamonds", "rich people", "male movie stars",
				  "Diamonds", "George Clooney", "smoking", "cigar");
		learningRandomCards.add(cardInfo);

		return learningRandomCards;
	}


	private ArrayList<Card> createAnswerList() {
		Card card;

		ArrayList<Card> answerList = new ArrayList<Card>();

		card = new Card(0, "Ace_of_Hearts", 0);
		answerList.add(card);
		card = new Card(1, "2_of_Hearts", 1);
		answerList.add(card);

		card = new Card(2, "Ace_of_Diamonds", 2);
		answerList.add(card);
		card = new Card(3, "2_of_Diamonds", 3);
		answerList.add(card);
		card = new Card(4, "3_of_Diamonds", 4);
		answerList.add(card);


		return answerList;
	}

	private ArrayList<Test> createScoreList() {
		ArrayList<Test> testList = new ArrayList<Test>();
		Test test;

		test = new Test("Ace_of_Hearts", "Ace_of_Hearts",false);
		testList.add(0,test);

		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", true);
		testList.add(0,test);

		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
		testList.add(0,test);

		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", true);
		testList.add(0,test);

		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
		testList.add(0,test);

		return testList;
	}
//	private ArrayList<Test> createTestList() {
//		ArrayList<Test> testList = new ArrayList<Test>();
//		Test test;
//
//		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
//		testList.add(0,test);
//
//		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
//		testList.add(0,test);
//
//		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
//		testList.add(0,test);
//
//		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
//		testList.add(0,test);
//
//		test = new Test("Ace_of_Hearts", "Ace_of_Hearts", false);
//		testList.add(0,test);
//
//		return testList;
//	}
}
