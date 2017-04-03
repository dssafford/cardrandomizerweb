package com.doug.controllers;

import com.doug.domain.CardInfo;
import com.doug.domain.Exam;
import com.doug.domain.ScoreList;
import com.doug.domain.SingleCardScore;
import com.doug.repositories.CardRepository;
import com.doug.repositories.ExamRepository;
import com.doug.repositories.ScoreRepository;
import com.doug.services.CardService;
import com.doug.services.Helpers;
import com.doug.services.ScoreService;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by doug on 1/24/17.
 */
@Controller
public class CardController {

	@Autowired
	CardService cardService;

	@Autowired
	ScoreService scoreService;

	@Autowired
	CardScoreController scoreController;

	@Autowired
	ScoreRepository scoreRepository;

	@Autowired
	private LearnCardController learnCardController;

	@Autowired
	private CardRepository cardRepository;


	@Autowired
	ExamRepository examRepository;

	private Integer deckIndex;

	private ArrayList<CardInfo> cachedRandomLearningCards;

	BigDecimal cumulativeScore = null;

	SingleCardScore singleCardScore;
	ArrayList<SingleCardScore> singleCardScoreArrayList;


	@RequestMapping(value = "/crap")
	public String getDiamonds() {
		List<CardInfo> cards = cardRepository.findByCardNameLike("%diamonds%");

		return "index";
	}
	@RequestMapping(value = "/showAnswerSingle", method = RequestMethod.GET)
	public String showSingleAnswer(HttpSession session, Model model) {
		ArrayList<CardInfo> masterCardDeck;
		deckIndex = (Integer)session.getAttribute("deckIndex");

		if (deckIndex <= 3) {
			masterCardDeck = (ArrayList<CardInfo>) session.getAttribute("masterCardDeck");

			CardInfo masterCard = (CardInfo) session.getAttribute("singleCardResults");
			CardInfo cardInfo = (CardInfo) session.getAttribute("enteredCardInfo");

			model.addAttribute("singleCardScore", masterCard);
			model.addAttribute("cardInfo", cardInfo);
			model.addAttribute("cardNumber", deckIndex.toString());
			return "answer/showAnswerSingle";
		} else {
			// Ready to Score

			model.addAttribute("score", cumulativeScore + "%");
			model.addAttribute("cardNumber", "end of deck");

			//Create SimpleCardTest Score
			ScoreList scoreList = new ScoreList();
//			scoreList.setMasterList(cachedRandomLearningCards);
//			scoreList.setAnswerList(singleCardScoreArrayList);
//			scoreList.setFinalScore(cumulativeScore);
			createScoreToSave(cachedRandomLearningCards, singleCardScoreArrayList);

		}
		return "index";
	}

	@RequestMapping(value = "/showAnswerSingle", method = RequestMethod.POST)
	public String showSingleAnswerPost(HttpSession session, CardInfo cardInfo, Model model) {
		ArrayList<CardInfo> masterCardDeck;

		deckIndex = (Integer)session.getAttribute("deckIndex");

		if (deckIndex <= 3) {

			if (session.getAttribute("masterCardDeck") == null) {
				masterCardDeck = cardService.createCardLearningMasterList();
			} else {
				masterCardDeck = (ArrayList<CardInfo>) session.getAttribute("masterCardDeck");
				cumulativeScore = (BigDecimal) session.getAttribute("cumulativeScore");
			}


			CardInfo masterCardInfo = Helpers.getCardInfoFromCardName(cardInfo.getCardName(), masterCardDeck);

			singleCardScore = scoreService.ScoreSingleCard(cardInfo, masterCardDeck);
			session.setAttribute("singleCardScore", singleCardScore);

			//Add to score
			singleCardScoreArrayList =
					  (ArrayList<SingleCardScore>) session.getAttribute("scoreSoFar");


			//if first one then createSingleCardScoreArrayList
			if (deckIndex == 0) {

				singleCardScoreArrayList = new ArrayList<SingleCardScore>();
			}

			singleCardScoreArrayList.add(singleCardScore);

			//Set back to Session
			session.setAttribute("scoreSoFar", singleCardScoreArrayList);


			cumulativeScore = scoreService.GetCumulativeScore(singleCardScoreArrayList);
			session.setAttribute("cumulativeScore", cumulativeScore);

			model.addAttribute("singleCardScore", masterCardInfo);
			model.addAttribute("cardInfo", cardInfo);
			model.addAttribute("cardNumber", deckIndex.toString());
			model.addAttribute("score", cumulativeScore + "%");
		}else {
			// Ready to Score

			model.addAttribute("score", cumulativeScore + "%");
			model.addAttribute("cardNumber", "end of deck");

			//Create SimpleCardTest Score
			ScoreList scoreList = new ScoreList();
//			scoreList.setMasterList(cachedRandomLearningCards);
//			scoreList.setAnswerList(singleCardScoreArrayList);
//			scoreList.setFinalScore(cumulativeScore);
			createScoreToSave(cachedRandomLearningCards, singleCardScoreArrayList);

		}
		return "answer/showAnswerSingle";
	}

	@RequestMapping(value = "/singleCardTestStart", method = RequestMethod.GET)
	public String startSingleCardScoring(HttpSession session) {

		session.setAttribute("randomLearningDeck", null);
		session.setAttribute("scoreSoFar", null);
		session.setAttribute("cumulativeScore", null);

		return "redirect:/singleCardTest";

	}

	@RequestMapping(value = "/singleCardTest", method = RequestMethod.GET)
	public String getSingleCardTest(HttpSession session, Model model) {
		//Create master random list and put in session


		if (session.getAttribute("randomLearningDeck") == null) {
			cachedRandomLearningCards = learnCardController.CreateRandomLearningDeck();
			session.setAttribute("randomLearningDeck", cachedRandomLearningCards);
			deckIndex = 0;
			session.setAttribute("deckIndex", deckIndex);
			cumulativeScore = new BigDecimal(0);
			session.setAttribute("cumulativeScore", new BigDecimal(0));
		} else {
			cachedRandomLearningCards = (ArrayList<CardInfo>) session.getAttribute("randomLearningDeck");

			cumulativeScore = (BigDecimal)session.getAttribute("cumulativeScore");

			deckIndex = (Integer) session.getAttribute("deckIndex") + 1;
			session.setAttribute("deckIndex", deckIndex);
		}


		CardInfo cardInfo = new CardInfo();
		cardInfo.setCardName(cachedRandomLearningCards.get(deckIndex).getCardName());
		cardInfo.setActionName("");
		cardInfo.setObjectName("");
		cardInfo.setPersonName("");

		model.addAttribute("cardInfo", cardInfo);
		model.addAttribute("cardNumber", deckIndex.toString());
		model.addAttribute("score", cumulativeScore + "%");

		return "answer/enterAnswerSingle";
	}

	@RequestMapping(value = "/singleCardTest", method = RequestMethod.POST)
	public String scoreSingleCardTest(HttpSession session, CardInfo cardInfo, Model model) {

		deckIndex = (Integer)session.getAttribute("deckIndex");

		if (deckIndex <= 3) {

			ArrayList<CardInfo> masterCardDeck;

			masterCardDeck = (ArrayList<CardInfo>) session.getAttribute("masterCardDeck");

			//create master list if it doesn't exist
			if (masterCardDeck == null) {
				masterCardDeck = cardService.createCardLearningMasterList();
				session.setAttribute("masterCardDeck", masterCardDeck);
			}


			singleCardScore = scoreService.ScoreSingleCard(cardInfo, masterCardDeck);
			session.setAttribute("singleCardScore", singleCardScore);

			CardInfo masterCardInfo = Helpers.getCardInfoFromCardName(cardInfo.getCardName(), masterCardDeck);

			//Add to score
			singleCardScoreArrayList =
					  (ArrayList<SingleCardScore>) session.getAttribute("scoreSoFar");


			//if first one then createSingleCardScoreArrayList
			if (deckIndex == 0) {

				singleCardScoreArrayList = new ArrayList<SingleCardScore>();
			}

			singleCardScoreArrayList.add(singleCardScore);

			session.setAttribute("singleCardResults", masterCardInfo);
			session.setAttribute("enteredCardInfo", cardInfo);

			//Set back to Session
			session.setAttribute("scoreSoFar", singleCardScoreArrayList);

			cumulativeScore = scoreService.GetCumulativeScore(singleCardScoreArrayList);
			session.setAttribute("cumulativeScore", cumulativeScore);

			//Then go to next card, get from masterRandomList
			cachedRandomLearningCards = (ArrayList<CardInfo>) session.getAttribute("randomLearningDeck");
			session.getAttribute("randomLearningDeckIndex");

			deckIndex = deckIndex + 1;
			session.setAttribute("deckIndex", deckIndex);

			cardInfo.setCardName(cachedRandomLearningCards.get(deckIndex).getCardName());
			cardInfo.setActionName("");
			cardInfo.setObjectName("");
			cardInfo.setPersonName("");

			model.addAttribute("cardInfo", cardInfo);
			model.addAttribute("cardNumber", deckIndex.toString());

			model.addAttribute("score", cumulativeScore + "%");

			//Update score just for show
			System.out.println("number of cards in score = " + singleCardScoreArrayList.size());
			System.out.println("Card Name = " + singleCardScore.getCardName());
			System.out.println("Card Person = " + singleCardScore.getPersonName() + "- " + singleCardScore.getPersonNameCorrect().toString());
			System.out.println("Card Action = " + singleCardScore.getActionName() + "- " + singleCardScore.getActionNameCorrect().toString());
			System.out.println("Card Object = " + singleCardScore.getObjectName() + "- " + singleCardScore.getObjectNameCorrect().toString());
			System.out.println("out of " + deckIndex + " cards, " + deckIndex * 3 + " possible answers. Score = " + cumulativeScore + "%");

		} else {
			// Ready to Score

			model.addAttribute("score", cumulativeScore + "%");
			model.addAttribute("cardNumber", "end of deck");

			//Create SimpleCardTest Score
			ScoreList scoreList = new ScoreList();
//			scoreList.setMasterList(cachedRandomLearningCards);
//			scoreList.setAnswerList(singleCardScoreArrayList);
//			scoreList.setFinalScore(cumulativeScore);
			createScoreToSave(cachedRandomLearningCards, singleCardScoreArrayList);

		}
		return "redirect:/showAnswerSingle";
	}

	private ArrayList createScoreList() {
		ArrayList returnList = new ArrayList();
		Integer denominator = singleCardScoreArrayList.size();
		Double numberCorrect = 0.00;

		for (int i = 0; i < denominator; i++) {
			if (singleCardScoreArrayList.get(i).getPersonNameCorrect() == true) {
				numberCorrect = numberCorrect + 1;
			}
			if (singleCardScoreArrayList.get(i).getObjectNameCorrect() == true) {
				numberCorrect = numberCorrect + 1;
			}
			if (singleCardScoreArrayList.get(i).getActionNameCorrect() == true) {
				numberCorrect = numberCorrect + 1;
			}
			returnList.add(i);
		}

		BigDecimal b = new BigDecimal((numberCorrect / (denominator * 3) * 100));
		b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		return returnList;

	}
	private ScoreList createTestScore() {
		ScoreList scoreList = new ScoreList();

		//score.setUserid(1);
//		scoreList.setAnswerList(TestHelper.createAnswerList());
//		scoreList.setMasterList(createTestRandomList());
//		scoreList.setFinalScore(cumulativeScore);
		scoreList.setComments("comments here");
		scoreList.setTimestamp(new Date());

		return scoreList;
	}

	private void createScoreToSave(ArrayList learningMasterCards, ArrayList enteredAnswers) {
		Exam exam = new Exam();
//		scoreList.setMasterList(learningMasterCards);
//		scoreList.setAnswerList(enteredAnswers);
//		exam.setFinalScore(cumulativeScore);
		exam.setComments("comments here");
		exam.setTimestamp(new Timestamp(Time.now()));

		examRepository.save(exam);

	}
}

