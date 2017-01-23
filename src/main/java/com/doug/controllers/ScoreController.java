package com.doug.controllers;

import com.doug.domain.*;
import com.doug.repository.ScoreRepository;
import com.doug.services.Helpers;
import com.doug.services.TestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;

import static com.doug.services.TestHelper.createTestRandomList;

/**
 * Created by Doug on 1/8/17.
 */

@Controller
public class ScoreController {

	//public ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
	//public ArrayList<Card> enteredAnswers = new ArrayList<Card>();

	ArrayList<Test> testArray = new ArrayList<>();

	@Autowired
	private ScoreRepository scoreRepository;

	@Autowired
	private LearnCardController learnCardController;


	@RequestMapping(value = "/scoreAnswersTest", method = RequestMethod.GET)
	public String scoreAnswersTest(HttpSession session, Model model) {

		// get answers from session
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");

		testArray = Helpers.SimpleCompareArrays(learnCardController.createMasterCardList(), enteredAnswers);


		session.setAttribute("testArray", testArray);

		String finalScore = Helpers.CalcFinalScore(testArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", testArray);

		return "scores";

	}

	@RequestMapping(value = "/scoreAnswers", method = RequestMethod.GET)
	public String scoreAnswers(HttpSession session, Model model) {
		ArrayList<Card> enteredAnswers = (ArrayList<Card>)session.getAttribute("enteredAnswers");
		ArrayList<Card> cachedShuffledCardNames = (ArrayList<Card>)session.getAttribute("cachedShuffledCardNames");


		testArray = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		session.setAttribute("testArray", testArray);

		String finalScore = Helpers.CalcFinalScore(testArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", testArray);

		return "scores";

	}






	@RequestMapping("/saveScore")
	public String testScore(Model model) {
		Score myScore = scoreRepository.save(createTestScore());



		model.addAttribute("score", myScore);
//		model.addAttribute("masters", myScore.getMasterList());
//		model.addAttribute("answers", myScore.getAnswerList());
//		model.addAttribute("scoreLists", myScore.getScoreList());

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

		//List<Score> scores = scoreRepository.findAll();

		//ArrayList<Display> displayList = createDisplayList();

		model.addAttribute("scores", scoreRepository.findAll());

		//displayList.get(0).getMasterCardName();
		//model.addAttribute("scores", displayList);

		return "score/showScoresHistory";

	}

	private void createScoreToSave(ArrayList learningMasterCards, ArrayList enteredAnswers) {
		Score score = new Score();
		score.setMasterList(learningMasterCards);
		score.setAnswerList(enteredAnswers);
		score.setScoreList(createScoreList());

		scoreRepository.save(score);

	}

	public ArrayList createScoreList() {
		ArrayList returnList = new ArrayList();

		for(int i=0;i< testArray.size();i++) {
			returnList.add(testArray.get(i).isCorrect());
		}

		return returnList;

	}


	private Score createTestScore() {
		Score score = new Score();

		//score.setUserid(1);
		score.setAnswerList(TestHelper.createAnswerList());
		score.setMasterList(createTestRandomList());
		score.setScoreList(TestHelper.createScoreTestList());
		score.setComments("comments here");
		score.setTimestamp(new Date());

		return score;
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
