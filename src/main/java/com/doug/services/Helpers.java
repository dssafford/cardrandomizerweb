package com.doug.services;

import com.doug.domain.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Doug on 12/19/16.
 */

public abstract class Helpers {

	public static Timestamp getTimeStamp() {
		//Date object
		Date date = new Date();
		//getTime() returns current time in milliseconds
		long time = date.getTime();
		//Passed the milliseconds to constructor of Timestamp class
		Timestamp ts = new Timestamp(time);

		System.out.println("Current Time Stamp: " + ts);
		return ts;
	}
	public static String EncryptInput(String inputString){
		String cryptedPassword=new BCryptPasswordEncoder().encode("ass");
		System.out.println(cryptedPassword);
		return cryptedPassword;
	}

	public static ArrayList<Card> Score(ArrayList<Card> masterDeck, ArrayList<Card> quickAnswers) {
		ArrayList testArray = new ArrayList();

		for (int i = 0; i < quickAnswers.size(); i++) {
			if (masterDeck.get(i).getCardName().equals(quickAnswers.get(i).getCardName())) {
				testArray.add(true);
				//System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + quickAnswers.get(i).getCardName());
			} else {

				testArray.add(false);
				//System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
				//		  quickAnswers.get(i).getCardName());
			}
		}
		return testArray;


	}

	public static String ResolveAnswers(String cardEntry) {
		String firstChar;
		String cardName;
		String suit = "";
		String suitCode = "";

		firstChar = ((String) cardEntry.substring(0, 1));
		suitCode = ((String) cardEntry.substring(1, 2));

		//Get cardName
		switch (firstChar) {
			case "a":
				cardName = "ace";
				break;
			case "j":
				cardName = "jack";
				break;
			case "k":
				cardName = "king";
				break;
			case "q":
				cardName = "queen";
				break;
			case "1":
				cardName = "10";
				break;
			default:
				cardName = firstChar;
				break;
		}

		//Get suit
		switch (suitCode) {
			case "s":
				suit = "spades";
				break;
			case "h":
				suit = "hearts";
				break;
			case "c":
				suit = "clubs";
				break;
			case "d":
				suit = "diamonds";
				break;
			default:
				suit = null;
				break;
		}


		return (cardName + "_of_" + suit);

	}
	public static ArrayList SimpleCompareCardInfoArrays(ArrayList<CardInfo> masterDeck, ArrayList<SingleCardScore> answerCardList) {
		ArrayList<SimpleCardQuiz> SimpleCardQuizArray = new ArrayList();
		SimpleCardQuiz SimpleCardQuiz;

		for (int i = 0; i < answerCardList.size(); i++) {
			SimpleCardQuiz = new SimpleCardQuiz();
			SimpleCardQuiz.setQuestionCardName(masterDeck.get(i).getCardName());
			SimpleCardQuiz.setAnswerCardName(answerCardList.get(i).getCardName());

			if (masterDeck.get(i).getCardName().equals(answerCardList.get(i).getCardName())) {
				SimpleCardQuiz.setAnswerCardNameCorrect(true);
//				finalScore = finalScore + 1;
				System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + answerCardList.get(i).getCardName());
			} else {
				SimpleCardQuiz.setAnswerCardNameCorrect(false);
				System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
						  answerCardList.get(i).getCardName());
			}
			SimpleCardQuizArray.add(i, SimpleCardQuiz);
		}

		return SimpleCardQuizArray;


	}

	public static ArrayList ComplexCompareCardInfoArrays(ArrayList<CardInfo> masterDeck, ArrayList<SingleCardScore> answerLocationList) {
		ArrayList<SimpleCardQuiz> SimpleCardQuizArray = new ArrayList();
		SimpleCardQuiz SimpleCardQuiz;
		Double finalScore = 0.00;

		for (int i = 0; i < answerLocationList.size(); i++) {
			SimpleCardQuiz = new SimpleCardQuiz();
//			SimpleCardQuiz.setId(i);
			SimpleCardQuiz.setQuestionCardName(masterDeck.get(i).getCardName());
			SimpleCardQuiz.setAnswerCardName(answerLocationList.get(i).getCardName());

			if (masterDeck.get(i).getCardName().equals(answerLocationList.get(i).getCardName())) {
				SimpleCardQuiz.setAnswerCardNameCorrect(true);
				finalScore = finalScore + 1;
				System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + answerLocationList.get(i).getCardName());
			} else {
				SimpleCardQuiz.setAnswerCardNameCorrect(false);
				System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
						  answerLocationList.get(i).getCardName());
			}
			SimpleCardQuizArray.add(i, SimpleCardQuiz);
		}

		return SimpleCardQuizArray;


	}

//	public static ArrayList SimpleCompareLocationArrays(ArrayList<Location> masterLocationList, ArrayList<Location> answerLocationList) {
//		ArrayList<TestLocation> testArray = new ArrayList();
//		TestLocation testLocation;
//
//		Double finalScore = 0.00;
//
//		for (int i = 0; i < masterLocationList.size(); i++) {
//			testLocation = new TestLocation();
//			testLocation.setMasterLocationName(masterLocationList.get(i).getLocationName());
//			testLocation.setAnswerLocationName(answerLocationList.get(i).getLocationName());
//
//			if (testLocation.getMasterLocationName().equals(testLocation.getAnswerLocationName())) {
//				testLocation.setCorrect(true);
//				finalScore = finalScore + 1;
////				System.out.println("Found equal on number " + i + " - " + masterLocationList.get(i).getLocationName() + " = "
////						  + answerLocationList.get(i).getLocationName());
//			} else {
//				testLocation.setCorrect(false);
////				System.out.println("Found not equal on number " + i + " - " + masterLocationList.get(i).getLocationName() + " != " +
////						  answerLocationList.get(i).getLocationName());
//			}
//			testArray.add(i, testLocation);
//		}
//
//		return testArray;
//
//
//	}

	public static ArrayList SimpleCompareArrays(ArrayList<Card> masterDeck, ArrayList<Card> answerLocationList) {
		ArrayList<SimpleCardQuiz> SimpleCardQuizArray = new ArrayList();
		SimpleCardQuiz SimpleCardQuiz;
		Double finalScore = 0.00;

		for (int i = 0; i < masterDeck.size(); i++) {
			SimpleCardQuiz = new SimpleCardQuiz();
//			SimpleCardQuiz.setId(i);
			SimpleCardQuiz.setQuestionCardName(masterDeck.get(i).getCardName());
			SimpleCardQuiz.setAnswerCardName(answerLocationList.get(i).getCardName());

			if (masterDeck.get(i).getCardName().equals(answerLocationList.get(i).getCardName())) {
				SimpleCardQuiz.setAnswerCardNameCorrect(true);
				finalScore = finalScore + 1;
				System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + answerLocationList.get(i).getCardName());
			} else {
				SimpleCardQuiz.setAnswerCardNameCorrect(false);
				System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
						  answerLocationList.get(i).getCardName());
			}
			SimpleCardQuizArray.add(i, SimpleCardQuiz);
		}

		return SimpleCardQuizArray;


	}

	public static BigDecimal CalcFinalScore(ArrayList<SimpleCardQuiz> SimpleCardQuizArray) {
		Double finalScore = 0.00;

		for (int i = 0; i < SimpleCardQuizArray.size(); i++) {
			if (SimpleCardQuizArray.get(i).isAnswerCardNameCorrect()) {
				finalScore = finalScore + 1;
			}
		}

		BigDecimal b = new BigDecimal((finalScore / 52) * 100);
		b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		return b;
	}

	public static String makeCardString(String cardName) {

		if (cardName.indexOf(".png") == -1) {
			return cardName + ".png";
		}

		return cardName;
	}

	public static Card makeCard(String cardName) {

		if (cardName.indexOf(".png") == -1) {
			Card card = new Card();
			card.setCardName(cardName + ".png");
			return card;
		}

		return null;
	}



//	public static CardInfo getCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterCardList) {
//
//		for (int i = 0; i < masterCardList.size(); i++) {
//			if (cardName.equals(masterCardList.get(i).getCardName())) {
//				CardInfo cardInfo = new CardInfo();
//				cardInfo.setCardName(cardName);
//				cardInfo.setPersonName(masterCardList.get(i).getPersonName());
//				cardInfo.setActionName(masterCardList.get(i).getActionName());
//				cardInfo.setObjectName(masterCardList.get(i).getObjectName());
//				return cardInfo;
//			}
//		}
////		TODO: throw cardNotFoundException
//		return null;
//	}

	public static String heyAnswerListSmallx(HttpSession session) {


		Object mycard = session.getAttribute("answer");
		String hey = "hey";

		return hey;

	}

}
