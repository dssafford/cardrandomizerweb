package com.doug.services;

import com.doug.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by Doug on 12/19/16.
 */
public class Helpers {

	private CardService cardService;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


	public String ResolveAnswers(String cardEntry) {
		String firstChar;
		String cardName;
		String suit = "";
		String suitCode = "";

		firstChar = ((String) cardEntry.substring(0,1));
		suitCode = ((String) cardEntry.substring(1,2));

		//Get cardName
		switch (firstChar) {
			case "a":
				cardName = "Ace";
				break;
			case "j":
				cardName = "Jack";
				break;
			case "k":
				cardName = "King";
				break;
			case "q":
				cardName = "Queen";
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
				suit = "Spades";
				break;
			case "h":
				suit = "Hearts";
				break;
			case "c":
				suit = "Clubs";
				break;
			case "d":
				suit = "Diamonds";
				break;
			default:
				suit=null;
				break;
		}


		return (cardName + "_of_" + suit);

	}

	public ArrayList SimpleCompareArrays(ArrayList<Card> masterDeck, ArrayList<Card> answerDeck) {
		ArrayList scoresArray = new ArrayList();

		for(int i=0;i<masterDeck.size();i++){
			if(masterDeck.get(i).getCardName().equals(answerDeck.get(i).getCardName())) {
				scoresArray.add(true);
				System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + answerDeck.get(i).getCardName());
			} else {

				scoresArray.add(false);
				System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
						  answerDeck.get(i).getCardName());
			}
		}
		return scoresArray;


	}

	public ArrayList<Card> CreateMasterDeck() {

		ArrayList<Card> cachedCards = new ArrayList<Card>();

		cachedCards = cardService.listAllCards();
		return cachedCards;

	}

}
