package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.DeckMaster;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */

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

		//Hearts
		cardInfo = new CardInfo("Ace_of_Hearts", "people we love", "sportsmen",
				"Hearts", "Peyton Manning", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_Hearts", "people we love", "sportswomen",
				"Hearts", "Ana Kornikova", "bending over", "small white tennis dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_Hearts", "people we love", "male movie stars",
				"Hearts", "Tom Hanks", "running like Forrest Gump", "leg brAces");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_Hearts", "people we love", "female movie stars",
				"Hearts", "Scarlett Johansen", "throwing up", "booze bottle");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_Hearts", "people we love", "controversial males",
				"Hearts", "Julian Assange", "vanishing in", "puff of smoke");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_Hearts", "people we love", "controversial females",
				"Hearts", "Taylor Swift", "being attacked by Kanye", "grammy trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_Hearts", "people we love", "famous male physiques",
				"Hearts", "Johnny Depp", "looQueen out window", "window");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_Hearts", "people we love", "famous female physiques",
				"Hearts", "Pam Anderson", "running on beach", "orange bouy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_Hearts", "people we love", "famous powerful men",
				"Hearts", "Steve Jobs", "presenting on stage", "the iphone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_Hearts", "people we love", "famous powerful women",
				"Hearts", "Ivanka Trump", "speaKing at convention", "podium");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Jack_of_Hearts", "people we love", "religious figures",
				"Hearts", "Jesus", "walking", "on lake");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Queen_of_Hearts", "people we love", "celeb couple men",
				"Hearts", "Michelle Obama", "jumping Jacks", "white house lawn");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("King_of_Hearts", "people we love", "celeb couple women",
				"Hearts", "Barak Obama", "fly swatting", "fly");
		returnList.add(cardInfo);

		//Diamonds
		cardInfo = new CardInfo("Ace_of_Diamonds", "rich people", "sportsmen",
				"Diamonds", "Michael Jordan", "dunking", "basketball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_Diamonds", "rich people", "sportswomen",
				"Diamonds", "Maria Sharopova", "swinging ", "tennis racket");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_Diamonds", "rich people", "male movie stars",
				"Diamonds", "George Clooney", "smoking", "cigar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_Diamonds", "rich people", "female movie stars",
				"Diamonds", "Julia Roberts", "pushing up", "boobs");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_Diamonds", "rich people", "controversial males",
				"Diamonds", "Trump", "tweeting", "phone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_Diamonds", "rich people", "controversial females",
				"Diamonds", "Madonna", "dancing", "on stage");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_Diamonds", "rich people", "famous male physiques",
				"Diamonds", "Kevin Costner", "riding", "horse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_Diamonds", "rich people", "famous female physiques",
				"Diamonds", "Marilyn Monroe", "dress blowing up", "subway vent");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_Diamonds", "rich people", "famous powerful men",
				"Diamonds", "Bill Gates", "yelling at", "pc");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_Diamonds", "rich people", "famous powerful women",
				"Diamonds", "Oprah", "interviewing", "couch");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Jack_of_Diamonds", "rich people", "religious figures",
				"Diamonds", "Zeus", "turning into", "swan");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Queen_of_Diamonds", "rich people", "celeb couple men",
				"Diamonds", "Princess Kate", "wearing beautiful dress", "church");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("King_of_Diamonds", "rich people", "celeb couple women",
				"Diamonds", "Prince William", "air lifting someone", "helicopter");
		returnList.add(cardInfo);

		//Spades
		cardInfo = new CardInfo("Ace_of_Spades", "odd people", "sportsmen",
				"Spades", "Dennis Rodman", "diving into", "cameraman");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_Spades", "odd people", "sportswomen",
				"Spades", "Anika Sorenstam", "driving", "golf ball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_Spades", "odd people", "male movie stars",
				"Spades", "Ben Stiller", "getting lie detector", "Deniro");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_Spades", "odd people", "female movie stars",
				"Spades", "Reece Witherspoon", "playing guitar", "guitar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_Spades", "odd people", "controversial males",
				"Spades", "Osama", "rapping with", "suicide bomber");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_Spades", "odd people", "controversial females",
				"Spades", "Lady Gaga", "wearing meat dress", "meat dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_Spades", "odd people", "famous male physiques",
				"Spades", "Anthony Weiner", "taKing selfie", "in mirror");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_Spades", "odd people", "famous female physiques",
				"Spades", "naomi Campbell", "hitting maid", "purse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_Spades", "odd people", "famous powerful men",
				"Spades", "Mr Bean", "slapping", "Queen");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_Spades", "odd people", "famous powerful women",
				"Spades", "Sarah Palin", "shooting", "moose");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Jack_of_Spades", "odd people", "religious figures",
				"Spades", "Dali Lama", "praying to", "buddha");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Queen_of_Spades", "odd people", "celeb couple men",
				"Spades", "Victoria Beckham", "putting lipstick on ", "lipstick");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("King_of_Spades", "odd people", "celeb couple women",
				"Spades", "David Beckham", "kicking", "soccer ball");
		returnList.add(cardInfo);

		
		//Clubs
		cardInfo = new CardInfo("Ace_of_Clubs", "strong people", "sportsmen",
				"Clubs", "Mohamad Ali", "punching", "butterfly");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_Clubs", "strong people", "sportswomen",
				"Clubs", "Serena Williams", "lifting wimbledon trophy", "trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_Clubs", "strong people", "male movie stars",
				"Clubs", "Brad Pitt", "getting punched in face", "black eye");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_Clubs", "strong people", "female movie stars",
				"Clubs", "Angelena Jolie", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_Clubs", "strong people", "controversial males",
				"Clubs", "Hitler", "goosestepping", "a bunker");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_Clubs", "strong people", "controversial females",
				"Clubs", "Rhianna", "holding umbrella", "rain storm");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_Clubs", "strong people", "famous male physiques",
				"Clubs", "Arnold Swartzeneggar", "shooting gun", "gun");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_Clubs", "strong people", "famous female physiques",
				"Clubs", "Medusa", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_Clubs", "strong people", "famous powerful men",
				"Clubs", "Bill Clinton", "order bombing", "baby food");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_Clubs", "strong people", "famous powerful women",
				"Clubs", "Hillary Clinton", "punching", "Monica Lewinsky");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Jack_of_Clubs", "strong people", "religious figures",
				"Clubs", "Pope", "baptizing man", "water");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("Queen_of_Clubs", "strong people", "celeb couple men",
				"Clubs", "Beyonce", "power dancing on", "beach");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("King_of_Clubs", "strong people", "celeb couple women",
				"Clubs", "JZ", "rapping", "giant microphone");
		returnList.add(cardInfo);
		
		
		
		return returnList;
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

			System.out.println((i + 1) + " :You have the " + rank + "_of_" + suit + ".png");


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

