package com.doug.services;

import com.doug.domain.AnswerListSmall;
import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.DeckMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

import static com.doug.services.Helpers.makeCard;

/**
 * Created by Doug on 12/17/16.
 */

@Service
public class CardServiceImpl implements CardService{


	@Autowired
	private CardService cardService;



	public CardInfo GetCardInfo(String cardName, ArrayList<CardInfo> masterCardList) {

		for(int i=0;i< masterCardList.size();i++){
			if(cardName.equals(masterCardList.get(i).getCardName())){
				return masterCardList.get(i);
			}
		}

		return null;
	}



	public ArrayList<Card> createMasterCardList (HttpSession session) {
		ArrayList<CardInfo> learningMasterCards = cardService.createCardLearningMasterList();
		ArrayList<Card> justCards = new ArrayList<Card>();

		for(int i=0;i<learningMasterCards.size();i++) {

			justCards.add(makeCard(learningMasterCards.get(i).getCardName()));

		}

		return justCards;
	}

	public void heyAnswerListSmall(HttpSession session) {

		Object mycard = session.getAttribute("answer");
		String hey = "hey";

	}

	@Override
	public ArrayList<CardInfo> listAllCardsForLearning() {

		return null;

	}

	@Override
	public ArrayList<CardInfo> createCardLearningMasterList() {
		CardInfo cardInfo;

		ArrayList<CardInfo> returnList = new ArrayList<CardInfo>();

		//hearts
		cardInfo = new CardInfo("ace_of_hearts", "people we love", "sportsmen",
				"hearts", "Peyton Manning", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_hearts", "people we love", "sportswomen",
				"hearts", "Ana Kornikova", "bending over", "small white tennis dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_hearts", "people we love", "male movie stars",
				"hearts", "Tom Hanks", "running like Forrest Gump", "leg braces");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_hearts", "people we love", "female movie stars",
				"hearts", "Scarlett Johansen", "throwing up", "booze bottle");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_hearts", "people we love", "controversial males",
				"hearts", "Julian Assange", "vanishing in", "puff of smoke");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_hearts", "people we love", "controversial females",
				"hearts", "Taylor Swift", "being attacked by Kanye", "grammy trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_hearts", "people we love", "famous male physiques",
				"hearts", "Johnny Depp", "looqueen out window", "window");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_hearts", "people we love", "famous female physiques",
				"hearts", "Pam Anderson", "running on beach", "orange bouy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_hearts", "people we love", "famous powerful men",
				"hearts", "Steve Jobs", "presenting on stage", "the iphone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_hearts", "people we love", "famous powerful women",
				"hearts", "Ivanka Trump", "speaking at convention", "podium");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_hearts", "people we love", "religious figures",
				"hearts", "Jesus", "walking", "on lake");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_hearts", "people we love", "celeb couple men",
				"hearts", "Michelle Obama", "jumping jacks", "white house lawn");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_hearts", "people we love", "celeb couple women",
				"hearts", "Barak Obama", "fly swatting", "fly");
		returnList.add(cardInfo);

		//diamonds
		cardInfo = new CardInfo("ace_of_diamonds", "rich people", "sportsmen",
				"diamonds", "Michael Jordan", "dunking", "basketball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_diamonds", "rich people", "sportswomen",
				"diamonds", "Maria Sharopova", "swinging ", "tennis racket");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_diamonds", "rich people", "male movie stars",
				"diamonds", "George Clooney", "smoking", "cigar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_diamonds", "rich people", "female movie stars",
				"diamonds", "Julia Roberts", "pushing up", "boobs");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_diamonds", "rich people", "controversial males",
				"diamonds", "Trump", "tweeting", "phone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_diamonds", "rich people", "controversial females",
				"diamonds", "Madonna", "dancing", "on stage");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_diamonds", "rich people", "famous male physiques",
				"diamonds", "Kevin Costner", "riding", "horse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_diamonds", "rich people", "famous female physiques",
				"diamonds", "Marilyn Monroe", "dress blowing up", "subway vent");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_diamonds", "rich people", "famous powerful men",
				"diamonds", "Bill Gates", "yelling at", "pc");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_diamonds", "rich people", "famous powerful women",
				"diamonds", "Oprah", "interviewing", "couch");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_diamonds", "rich people", "religious figures",
				"diamonds", "Zeus", "turning into", "swan");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_diamonds", "rich people", "celeb couple men",
				"diamonds", "Princess Kate", "wearing beautiful dress", "church");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_diamonds", "rich people", "celeb couple women",
				"diamonds", "Prince William", "air lifting someone", "helicopter");
		returnList.add(cardInfo);

		//spades
		cardInfo = new CardInfo("ace_of_spades", "odd people", "sportsmen",
				"spades", "Dennis Rodman", "diving into", "cameraman");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_spades", "odd people", "sportswomen",
				"spades", "Anika Sorenstam", "driving", "golf ball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_spades", "odd people", "male movie stars",
				"spades", "Ben Stiller", "getting lie detector", "Deniro");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_spades", "odd people", "female movie stars",
				"spades", "Reece Witherspoon", "playing guitar", "guitar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_spades", "odd people", "controversial males",
				"spades", "Osama", "rapping with", "suicide bomber");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_spades", "odd people", "controversial females",
				"spades", "Lady Gaga", "wearing meat dress", "meat dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_spades", "odd people", "famous male physiques",
				"spades", "Anthony Weiner", "taking selfie", "in mirror");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_spades", "odd people", "famous female physiques",
				"spades", "naomi Campbell", "hitting maid", "purse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_spades", "odd people", "famous powerful men",
				"spades", "Mr Bean", "slapping", "queen");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_spades", "odd people", "famous powerful women",
				"spades", "Sarah Palin", "shooting", "moose");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_spades", "odd people", "religious figures",
				"spades", "Dali Lama", "praying to", "buddha");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_spades", "odd people", "celeb couple men",
				"spades", "Victoria Beckham", "putting lipstick on ", "lipstick");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_spades", "odd people", "celeb couple women",
				"spades", "David Beckham", "kicking", "soccer ball");
		returnList.add(cardInfo);

		
		//clubs
		cardInfo = new CardInfo("ace_of_clubs", "strong people", "sportsmen",
				"clubs", "Mohamad Ali", "punching", "butterfly");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_clubs", "strong people", "sportswomen",
				"clubs", "Serena Williams", "lifting wimbledon trophy", "trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_clubs", "strong people", "male movie stars",
				"clubs", "Brad Pitt", "getting punched in face", "black eye");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_clubs", "strong people", "female movie stars",
				"clubs", "Angelena Jolie", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_clubs", "strong people", "controversial males",
				"clubs", "Hitler", "goosestepping", "a bunker");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_clubs", "strong people", "controversial females",
				"clubs", "Rhianna", "holding umbrella", "rain storm");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_clubs", "strong people", "famous male physiques",
				"clubs", "Arnold Swartzeneggar", "shooting gun", "gun");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_clubs", "strong people", "famous female physiques",
				"clubs", "Medusa", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_clubs", "strong people", "famous powerful men",
				"clubs", "Bill Clinton", "order bombing", "baby food");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_clubs", "strong people", "famous powerful women",
				"clubs", "Hillary Clinton", "punching", "Monica Lewinsky");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_clubs", "strong people", "religious figures",
				"clubs", "Pope", "baptizing man", "water");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_clubs", "strong people", "celeb couple men",
				"clubs", "Beyonce", "power dancing on", "beach");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_clubs", "strong people", "celeb couple women",
				"clubs", "JZ", "rapping", "giant microphone");
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
		String[] suits = {"hearts", "diamonds", "spades", "clubs"};
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

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

			//System.out.println((i + 1) + " :You have the " + rank + "_of_" + suit + ".png");


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

