package com.doug.services;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.DeckMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

import static com.doug.services.Helpers.makeCard;

/**
 * Created by doug on 12/17/16.
 */

@Service
public class CardServiceImpl implements CardService{
	
	@Override
	public Boolean ScoreSingleCard(String cardName, ArrayList<CardInfo> masterCardList) {
		return null;
	}

	@Autowired
	private CardService cardService;


	@Override
	public CardInfo GetCardInfoFromCardName(String cardName, ArrayList<CardInfo> masterCardList) {

		for(int i=0;i< masterCardList.size();i++){
			if(cardName.equals(masterCardList.get(i).getCardName())){
				return masterCardList.get(i);
			}
		}

		return null;
	}

	public Boolean ScoreSingleCardName(CardInfo cardInfo, ArrayList<CardInfo> masterCardList) {

		for(int i=0;i< masterCardList.size();i++){
			if(cardInfo.getCardName().equals(masterCardList.get(i).getCardName())){
				return true;
			}
		}
		return false;
	}



	public ArrayList<Card> createmasterCardList (HttpSession session) {
		ArrayList<CardInfo> learningmasterCards = cardService.createCardLearningMasterList();
		ArrayList<Card> justCards = new ArrayList<Card>();

		for(int i=0;i<learningmasterCards.size();i++) {

			justCards.add(makeCard(learningmasterCards.get(i).getCardName()));

		}

		return justCards;
	}

	public void heyanswerListSmall(HttpSession session) {

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
				"hearts", "peyton manning", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_hearts", "people we love", "sportswomen",
				"hearts", "anna kornikova", "bending over", "white tennis dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_hearts", "people we love", "male movie stars",
				"hearts", "tom hanks", "forrest gump running", "leg braces");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_hearts", "people we love", "female movie stars",
				"hearts", "scarlett johansen", "throwing up", "booze bottle");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_hearts", "people we love", "controversial males",
				"hearts", "julian assange", "vanishing", "puff of smoke");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_hearts", "people we love", "controversial females",
				"hearts", "taylor swift", "being attacked by Kanye", "grammy trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_hearts", "people we love", "famous male physiques",
				"hearts", "johnny depp", "looking out window", "window");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_hearts", "people we love", "famous female physiques",
				"hearts", "pam anderson", "running on beach", "orange bouy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_hearts", "people we love", "famous powerful men",
				"hearts", "steve jobs", "presenting on stage", "the iphone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_hearts", "people we love", "famous powerful women",
				"hearts", "ivanka trump", "speaking at convention", "podium");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_hearts", "people we love", "religious figures",
				"hearts", "jesus", "walking", "on lake");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_hearts", "people we love", "celeb couple women",
				"hearts", "michelle obama", "jumping jacks", "white house lawn");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_hearts", "people we love", "celeb couple men",
				"hearts", "barak obama", "swatting", "fly");
		returnList.add(cardInfo);

		//diamonds
		cardInfo = new CardInfo("ace_of_diamonds", "rich people", "sportsmen",
				"diamonds", "michael jordan", "dunking", "basketball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_diamonds", "rich people", "sportswomen",
				"diamonds", "maria sharopova", "swinging ", "tennis racket");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_diamonds", "rich people", "male movie stars",
				"diamonds", "george clooney", "smoking", "cigar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_diamonds", "rich people", "female movie stars",
				"diamonds", "julia roberts", "pushing", "boobs");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_diamonds", "rich people", "controversial males",
				"diamonds", "trump", "tweeting", "phone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_diamonds", "rich people", "controversial females",
				"diamonds", "madonna", "dancing", "on stage");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_diamonds", "rich people", "famous male physiques",
				"diamonds", "kevin costner", "riding", "horse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_diamonds", "rich people", "famous female physiques",
				"diamonds", "marilyn monroe", "dress blowing up", "subway vent");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_diamonds", "rich people", "famous powerful men",
				"diamonds", "bill gates", "yelling at", "pc");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_diamonds", "rich people", "famous powerful women",
				"diamonds", "oprah", "interviewing", "couch");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_diamonds", "rich people", "religious figures",
				"diamonds", "zeus", "turning into", "swan");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_diamonds", "rich people", "celeb couple women",
				"diamonds", "princess kate", "wearing beautiful dress", "church");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_diamonds", "rich people", "celeb couple men",
				"diamonds", "prince william", "air lifting someone", "helicopter");
		returnList.add(cardInfo);

		//spades
		cardInfo = new CardInfo("ace_of_spades", "odd people", "sportsmen",
				"spades", "dennis rodman", "diving into", "cameraman");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_spades", "odd people", "sportswomen",
				"spades", "anika sorenstam", "driving", "golf ball");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_spades", "odd people", "male movie stars",
				"spades", "ben stiller", "getting lie detector", "deniro");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_spades", "odd people", "female movie stars",
				"spades", "reece witherspoon", "playing guitar", "guitar");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_spades", "odd people", "controversial males",
				"spades", "osama", "rapping with", "suicide bomber");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_spades", "odd people", "controversial females",
				"spades", "lady gaga", "showing", "meat dress");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_spades", "odd people", "famous male physiques",
				"spades", "anthony weiner", "taking selfie", "in mirror");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_spades", "odd people", "famous female physiques",
				"spades", "naomi campbell", "hitting maid", "purse");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_spades", "odd people", "famous powerful men",
				"spades", "mr bean", "slapping", "queen");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_spades", "odd people", "famous powerful women",
				"spades", "sarah palin", "shooting", "moose");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_spades", "odd people", "religious figures",
				"spades", "dali lama", "praying to", "buddha");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_spades", "odd people", "celeb couple women",
				"spades", "victoria beckham", "putting lipstick on ", "lipstick");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_spades", "odd people", "celeb couple men",
				"spades", "david beckham", "kicking", "soccer ball");
		returnList.add(cardInfo);

		
		//clubs
		cardInfo = new CardInfo("ace_of_clubs", "strong people", "sportsmen",
				"clubs", "mohamad ali", "punching", "butterfly");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("2_of_clubs", "strong people", "sportswomen",
				"clubs", "serena williams", "lifting wimbledon trophy", "trophy");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("3_of_clubs", "strong people", "male movie stars",
				"clubs", "brad pitt", "punched in face", "black eye");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("4_of_clubs", "strong people", "female movie stars",
				"clubs", "angelena jolie", "throwing", "football");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("5_of_clubs", "strong people", "controversial males",
				"clubs", "hitler", "goosestepping", "a bunker");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("6_of_clubs", "strong people", "controversial females",
				"clubs", "rhianna", "holding umbrella", "rain storm");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("7_of_clubs", "strong people", "famous male physiques",
				"clubs", "arnold", "shooting", "gun");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("8_of_clubs", "strong people", "famous female physiques",
				"clubs", "medusa", "staring", "stone");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("9_of_clubs", "strong people", "famous powerful men",
				"clubs", "bill clinton", "bombing", "baby food factory");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("10_of_clubs", "strong people", "famous powerful women",
				"clubs", "hillary clinton", "punching", "monica Lewinsky");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("jack_of_clubs", "strong people", "religious figures",
				"clubs", "pope", "baptizing man", "water");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("queen_of_clubs", "strong people", "celeb couple women",
				"clubs", "beyonce", "power dancing", "beach");
		returnList.add(cardInfo);
		cardInfo = new CardInfo("king_of_clubs", "strong people", "celeb couple men",
				"clubs", "jz", "rapping", "microphone");
		returnList.add(cardInfo);
		
		
		
		return returnList;
	}

	@Override
		public ArrayList listAllCards() {
			Card card;

			ArrayList<Card> returndeck = new ArrayList<Card>();

			DeckMaster DeckMaster = new DeckMaster();
			
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
//				returndeck.add(i, rank + "of" + suit);

			
			returndeck.add(card);

			//System.out.println((i + 1) + " :You have the " + rank + "_of_" + suit + ".png");


		}

		//fill out DeckMaster object
		//fillDeckMaster(returndeck);
		return returndeck;

		}

		private DeckMaster fillDeckMaster(ArrayList returndeck) {
			
			DeckMaster DeckMaster = new DeckMaster();

			DeckMaster.setA1(returndeck.get(0).toString());
			DeckMaster.setA2(returndeck.get(1).toString());
			DeckMaster.setA3(returndeck.get(2).toString());
			DeckMaster.setA4(returndeck.get(3).toString());
			DeckMaster.setA5(returndeck.get(4).toString());
			DeckMaster.setA6(returndeck.get(5).toString());
			DeckMaster.setA7(returndeck.get(6).toString());
			DeckMaster.setA8(returndeck.get(7).toString());
			DeckMaster.setA9(returndeck.get(8).toString());
			DeckMaster.setA10(returndeck.get(9).toString());
			DeckMaster.setA11(returndeck.get(10).toString());
			DeckMaster.setA12(returndeck.get(11).toString());
			DeckMaster.setA13(returndeck.get(12).toString());
			DeckMaster.setA14(returndeck.get(13).toString());
			DeckMaster.setA15(returndeck.get(14).toString());
			DeckMaster.setA16(returndeck.get(15).toString());
			DeckMaster.setA17(returndeck.get(16).toString());
			DeckMaster.setA18(returndeck.get(17).toString());
			DeckMaster.setA19(returndeck.get(18).toString());
			DeckMaster.setA20(returndeck.get(19).toString());
			DeckMaster.setA21(returndeck.get(20).toString());
			DeckMaster.setA22(returndeck.get(21).toString());
			DeckMaster.setA23(returndeck.get(22).toString());
			DeckMaster.setA24(returndeck.get(23).toString());
			DeckMaster.setA25(returndeck.get(24).toString());
			DeckMaster.setA26(returndeck.get(25).toString());
			DeckMaster.setA27(returndeck.get(26).toString());
			DeckMaster.setA28(returndeck.get(27).toString());
			DeckMaster.setA29(returndeck.get(28).toString());
			DeckMaster.setA30(returndeck.get(29).toString());
			DeckMaster.setA31(returndeck.get(30).toString());
			DeckMaster.setA32(returndeck.get(31).toString());
			DeckMaster.setA33(returndeck.get(32).toString());
			DeckMaster.setA34(returndeck.get(33).toString());
			DeckMaster.setA35(returndeck.get(34).toString());
			DeckMaster.setA36(returndeck.get(35).toString());
			DeckMaster.setA37(returndeck.get(36).toString());
			DeckMaster.setA38(returndeck.get(37).toString());
			DeckMaster.setA39(returndeck.get(38).toString());
			DeckMaster.setA40(returndeck.get(39).toString());
			DeckMaster.setA41(returndeck.get(40).toString());
			DeckMaster.setA42(returndeck.get(41).toString());
			DeckMaster.setA43(returndeck.get(42).toString());
			DeckMaster.setA44(returndeck.get(43).toString());
			DeckMaster.setA45(returndeck.get(44).toString());
			DeckMaster.setA46(returndeck.get(45).toString());
			DeckMaster.setA47(returndeck.get(46).toString());
			DeckMaster.setA48(returndeck.get(47).toString());
			DeckMaster.setA49(returndeck.get(48).toString());
			DeckMaster.setA50(returndeck.get(49).toString());
			DeckMaster.setA51(returndeck.get(50).toString());
			DeckMaster.setA52(returndeck.get(51).toString());

			return DeckMaster;

		}
}

