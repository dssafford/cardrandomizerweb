package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.DeckMaster;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */

//private String cardName;
//private String mainCategoryName;
//private String subCategoryName;
//private String categorySuit;
//private String personName;
//private String action;
//private String object;

@Service
public class CardServiceImpl implements CardService{

	@Override
	public ArrayList<CardInfo> listAllCardsForLearning() {

		return null;

	}

	@Override
	public ArrayList<CardInfo> createCardLearningMasterList() {
		CardInfo cardInfo;

		ArrayList<CardInfo> returnList = new ArrayList<CardInfo>();

		cardInfo = new CardInfo("ace_of_hearts", "people we love", "sportsman",
				"hearts", "peyton manning", "throwing", "football");







		return null;
	}

	@Override
		public ArrayList listAllCards() {
			Card card;

			ArrayList<Card> returnDeck = new ArrayList<Card>();

			DeckMaster deckMaster = new DeckMaster();
			
		// make the cards
		int[] deck = new int[52]; // how many total
		String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		// intitialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] += i;
		}

		// shuffle cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int x = deck[i]; // x now has all 52 cards?
			deck[i] = deck[index]; // pick a random card
			deck[index] = x; // pick a radom card

		}

		// display all cards
		for (int i = 0; i < 52; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];


			card = new Card();
			card.setId(i+1);
			card.setCardName(rank + "_of_" + suit + ".png");
//				returnDeck.add(i, rank + "of" + suit);

			
			returnDeck.add(card);

			System.out.println((i + 1) + " :You have the " + rank + " of " + suit + ".png");


		}

		//fill out DeckMaster object
		//fillDeckMaster(returnDeck);
		return returnDeck;

		}

		private DeckMaster fillDeckMaster(ArrayList returnDeck) {
			
			DeckMaster deckMaster = new DeckMaster();

			deckMaster.setA1(returnDeck.get(0).toString());
			deckMaster.setA2(returnDeck.get(1).toString());
			deckMaster.setA3(returnDeck.get(2).toString());
			deckMaster.setA4(returnDeck.get(3).toString());
			deckMaster.setA5(returnDeck.get(4).toString());
			deckMaster.setA6(returnDeck.get(5).toString());
			deckMaster.setA7(returnDeck.get(6).toString());
			deckMaster.setA8(returnDeck.get(7).toString());
			deckMaster.setA9(returnDeck.get(8).toString());
			deckMaster.setA10(returnDeck.get(9).toString());
			deckMaster.setA11(returnDeck.get(10).toString());
			deckMaster.setA12(returnDeck.get(11).toString());
			deckMaster.setA13(returnDeck.get(12).toString());
			deckMaster.setA14(returnDeck.get(13).toString());
			deckMaster.setA15(returnDeck.get(14).toString());
			deckMaster.setA16(returnDeck.get(15).toString());
			deckMaster.setA17(returnDeck.get(16).toString());
			deckMaster.setA18(returnDeck.get(17).toString());
			deckMaster.setA19(returnDeck.get(18).toString());
			deckMaster.setA20(returnDeck.get(19).toString());
			deckMaster.setA21(returnDeck.get(20).toString());
			deckMaster.setA22(returnDeck.get(21).toString());
			deckMaster.setA23(returnDeck.get(22).toString());
			deckMaster.setA24(returnDeck.get(23).toString());
			deckMaster.setA25(returnDeck.get(24).toString());
			deckMaster.setA26(returnDeck.get(25).toString());
			deckMaster.setA27(returnDeck.get(26).toString());
			deckMaster.setA28(returnDeck.get(27).toString());
			deckMaster.setA29(returnDeck.get(28).toString());
			deckMaster.setA30(returnDeck.get(29).toString());
			deckMaster.setA31(returnDeck.get(30).toString());
			deckMaster.setA32(returnDeck.get(31).toString());
			deckMaster.setA33(returnDeck.get(32).toString());
			deckMaster.setA34(returnDeck.get(33).toString());
			deckMaster.setA35(returnDeck.get(34).toString());
			deckMaster.setA36(returnDeck.get(35).toString());
			deckMaster.setA37(returnDeck.get(36).toString());
			deckMaster.setA38(returnDeck.get(37).toString());
			deckMaster.setA39(returnDeck.get(38).toString());
			deckMaster.setA40(returnDeck.get(39).toString());
			deckMaster.setA41(returnDeck.get(40).toString());
			deckMaster.setA42(returnDeck.get(41).toString());
			deckMaster.setA43(returnDeck.get(42).toString());
			deckMaster.setA44(returnDeck.get(43).toString());
			deckMaster.setA45(returnDeck.get(44).toString());
			deckMaster.setA46(returnDeck.get(45).toString());
			deckMaster.setA47(returnDeck.get(46).toString());
			deckMaster.setA48(returnDeck.get(47).toString());
			deckMaster.setA49(returnDeck.get(48).toString());
			deckMaster.setA50(returnDeck.get(49).toString());
			deckMaster.setA51(returnDeck.get(50).toString());
			deckMaster.setA52(returnDeck.get(51).toString());

			return deckMaster;

		}
}

