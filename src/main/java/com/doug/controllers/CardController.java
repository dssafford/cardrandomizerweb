package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.domain.Test;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by Doug on 12/20/16.
 */
@Controller
public class CardController {
	public DeckAnswer deckAnswer;

	private CardService cardService;

	public ArrayList<Card> enteredAnswers = new ArrayList<Card>();
	public ArrayList<Card> fullAnswers = new ArrayList<Card>();

	public ArrayList<Test> scoresArray = new ArrayList<Test>();

	public ArrayList<Card> cachedCards = new ArrayList<Card>();


//	public ArrayList<CardInfo> learningCards = new ArrayList<CardInfo>();
//
//	public ArrayList<CardInfo> cachedRandomLearningCards = new ArrayList<CardInfo>();
//
//	public Integer counter=0;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


//	//Create a random deck and tie to learningCards (people/object/action)
//	@RequestMapping(value = "/learnCards")
//	public String createLearningDeck(Model model) {
//
//		cachedRandomLearningCards = CreateRandomLearningDeck();
//		model.addAttribute("cards", cachedRandomLearningCards);
//
//		return "masterCardLearningList";
//
//	}

	@RequestMapping(value = "/studyList", method = RequestMethod.GET)
	public String getStudyList() {
		return "learning/studyList";
	}

	@RequestMapping(value = "/locationMasterList", method = RequestMethod.GET)
	public String getLocationMasterList() {

		return "learning/locationMasterList";
	}


	@RequestMapping(value = "/masterList", method = RequestMethod.GET)
	public String list(Model model) {

		cachedCards = CreateMasterDeck();

		model.addAttribute("cards",cachedCards);

		return "masterList";
	}



//	@RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
//	public String enterAnswers(Model model) {
//		model.addAttribute("deckAnswer", new DeckAnswer());
//
//		return "enterAnswers";
//
//	}


//	@RequestMapping(value="/enterAnswers", method = RequestMethod.POST)
//	public String getAnswers(DeckAnswer deckAnswer) {
//		enteredAnswers = new ArrayList<Card>();
//
//		String fullAnswerName = "";
//
//		enteredAnswers.add(makeCard(deckAnswer.getA1()));
//		enteredAnswers.add(makeCard(deckAnswer.getA2()));
//		enteredAnswers.add(makeCard(deckAnswer.getA3()));
//		enteredAnswers.add(makeCard(deckAnswer.getA4()));
//		enteredAnswers.add(makeCard(deckAnswer.getA5()));
//		enteredAnswers.add(makeCard(deckAnswer.getA6()));
//		enteredAnswers.add(makeCard(deckAnswer.getA7()));
//		enteredAnswers.add(makeCard(deckAnswer.getA8()));
//		enteredAnswers.add(makeCard(deckAnswer.getA9()));
//		enteredAnswers.add(makeCard(deckAnswer.getA10()));
//		enteredAnswers.add(makeCard(deckAnswer.getA11()));
//		enteredAnswers.add(makeCard(deckAnswer.getA12()));
//		enteredAnswers.add(makeCard(deckAnswer.getA13()));
//		enteredAnswers.add(makeCard(deckAnswer.getA14()));
//		enteredAnswers.add(makeCard(deckAnswer.getA15()));
//		enteredAnswers.add(makeCard(deckAnswer.getA16()));
//		enteredAnswers.add(makeCard(deckAnswer.getA17()));
//		enteredAnswers.add(makeCard(deckAnswer.getA18()));
//		enteredAnswers.add(makeCard(deckAnswer.getA19()));
//		enteredAnswers.add(makeCard(deckAnswer.getA20()));
//		enteredAnswers.add(makeCard(deckAnswer.getA21()));
//		enteredAnswers.add(makeCard(deckAnswer.getA22()));
//		enteredAnswers.add(makeCard(deckAnswer.getA23()));
//		enteredAnswers.add(makeCard(deckAnswer.getA24()));
//		enteredAnswers.add(makeCard(deckAnswer.getA25()));
//		enteredAnswers.add(makeCard(deckAnswer.getA26()));
//		enteredAnswers.add(makeCard(deckAnswer.getA27()));
//		enteredAnswers.add(makeCard(deckAnswer.getA28()));
//		enteredAnswers.add(makeCard(deckAnswer.getA29()));
//		enteredAnswers.add(makeCard(deckAnswer.getA30()));
//		enteredAnswers.add(makeCard(deckAnswer.getA31()));
//		enteredAnswers.add(makeCard(deckAnswer.getA32()));
//		enteredAnswers.add(makeCard(deckAnswer.getA33()));
//		enteredAnswers.add(makeCard(deckAnswer.getA34()));
//		enteredAnswers.add(makeCard(deckAnswer.getA35()));
//		enteredAnswers.add(makeCard(deckAnswer.getA36()));
//		enteredAnswers.add(makeCard(deckAnswer.getA37()));
//		enteredAnswers.add(makeCard(deckAnswer.getA38()));
//		enteredAnswers.add(makeCard(deckAnswer.getA39()));
//		enteredAnswers.add(makeCard(deckAnswer.getA40()));
//		enteredAnswers.add(makeCard(deckAnswer.getA41()));
//		enteredAnswers.add(makeCard(deckAnswer.getA42()));
//		enteredAnswers.add(makeCard(deckAnswer.getA43()));
//		enteredAnswers.add(makeCard(deckAnswer.getA44()));
//		enteredAnswers.add(makeCard(deckAnswer.getA45()));
//		enteredAnswers.add(makeCard(deckAnswer.getA46()));
//		enteredAnswers.add(makeCard(deckAnswer.getA47()));
//		enteredAnswers.add(makeCard(deckAnswer.getA48()));
//		enteredAnswers.add(makeCard(deckAnswer.getA49()));
//		enteredAnswers.add(makeCard(deckAnswer.getA50()));
//		enteredAnswers.add(makeCard(deckAnswer.getA51()));
//		enteredAnswers.add(makeCard(deckAnswer.getA52()));
//
//		for(int i=0; i< enteredAnswers.size(); i++) {
//			fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());
//
//			enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
//		}
//
//		Helpers.Test(cachedCards, enteredAnswers);
//
//		return "redirect:/scoreAnswers";
//	}
//
//
//	@RequestMapping(value = "/scoreAnswers", method = RequestMethod.GET)
//	public String scoreAnswers(Model model) {
//
//		scoresArray = Helpers.SimpleCompareArrays(cachedCards, enteredAnswers);
//		String finalScore = Helpers.CalcFinalScore(scoresArray);
//		model.addAttribute("finalScore", finalScore);
//		model.addAttribute("scores", scoresArray);
//
//		return "scores";
//
//	}


//	@RequestMapping(value = "/showList", method = RequestMethod.GET)
//	public String scores(@ModelAttribute ArrayList<Card> cachedCards, Model model, BindingResult bindingResult) {
////		deckAnswer = new DeckAnswer();
////		deckAnswer.setA1("dude");
////		model.addAttribute("doug", deckAnswer);
//
//
//		//ResolveAnswers();
//
//		ArrayList<Card> myCachedCards = CreateMasterDeck();
//
//		model.addAttribute("cachedCards", myCachedCards);
//
//		return "newScores";
//
//	}

//	protected String makeCardString(String cardName){
//
//		return cardName+".png";
//
//	}
//
	private Card makeCard(String cardName) {
	Card card = new Card();
	card.setCardName(cardName + ".png");

	return card;
}
//
//	private CardInfo getNextLearningCard(Integer id) {
//		CardInfo myCard = cachedRandomLearningCards.get(id);
//
//		myCard.setCardName(makeCardString(myCard.getCardName()));
//
//		this.counter=id+1;
//
//		return myCard;
//	}

	private Card getNextCard(Integer id) {
		Card myCard = cachedCards.get(id);
		myCard.setCounter(id+1);

		return myCard;
	}
	public ArrayList<Card> CreateMasterDeck() {

		cachedCards = cardService.listAllCards();
		return cachedCards;

	}

//	@RequestMapping(value="/getRandomLearningList")
//	public String getRandomLearningList(Model model) {
//
//		learningCards = CreateRandomLearningDeck();
//
//
//
//		model.addAttribute("cards", learningCards);
//
//		return "masterCardLearningList";
//
//	}
//
//	private ArrayList<CardInfo> CreateRandomLearningDeck() {
//
//		ArrayList<CardInfo> workingLearningCards = new ArrayList<CardInfo>();
//
//		//Create master CardInfo Arraylist
//		learningCards = cardService.createCardLearningMasterList();
//
//		//Get random deck
//		cachedCards = cardService.listAllCards();
//
//
//		//loop through random deck and get CardInfo information
//		for(int i=0; i<cachedCards.size(); i++) {
//			workingLearningCards.add(GetCardInfo(cachedCards.get(i).getCardName()));
//		}
//
//		return workingLearningCards;
//
//	}
//
//	private CardInfo GetCardInfo(String cardName) {
//		//loop through CardInfo arraylist to find the same cardname
//		//then return the CardInfo
//		String cardNameNoSuffix = "";
//
//		for(int i=0;i<learningCards.size();i++) {
//			cardNameNoSuffix = cardName.substring(0, cardName.length()-4);
//
//			System.out.println("CardNameNoSuffix :" + cardNameNoSuffix + " and learningCards.get : " + learningCards.get(i).getCardName());
//
//			if(learningCards.get(i).getCardName().equals(cardNameNoSuffix)){
//				System.out.println("*************** Found one *****************************************");
//				return learningCards.get(i);
//			}
//		}
//
//		return null;
//	}

}
