package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.domain.Score;
import com.doug.services.CardService;
import com.doug.services.Helpers;
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

	public ArrayList<Score> scoresArray = new ArrayList<Score>();

	public ArrayList<Card> cachedCards = new ArrayList<Card>();

	public Integer counter=0;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	@RequestMapping(value = "/studyList", method = RequestMethod.GET)
	public String getStudyList() {
		return "studyList";
	}

	@RequestMapping(value = "/locationMasterList", method = RequestMethod.GET)
	public String getLocationMasterList() {
		return "locationMasterList";
	}


	@RequestMapping(value = "/masterList", method = RequestMethod.GET)
	public String list(Model model) {

		cachedCards = CreateMasterDeck();

		model.addAttribute("cards",cachedCards);

		return "masterList";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.GET)
	public String getOne(Model model) {

		model.addAttribute(getNextCard(0));

		return "nextOne";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.POST)
	public String processAnswers(Model model, Card card) {

		model.addAttribute(getNextCard(card.getCounter()));

		return "nextOne";
	}




	@RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
	public String enterAnswers(Model model) {
		model.addAttribute("deckAnswer", new DeckAnswer());

		return "enterAnswersTest";

	}


	@RequestMapping(value="/enterAnswers", method = RequestMethod.POST)
	public String getAnswers(DeckAnswer deckAnswer) {
		//model.addAttribute(getNextCard(card.getCounter()());

		String fullAnswerName = "";

		enteredAnswers.add(makeCard(deckAnswer.getA1()));
		enteredAnswers.add(makeCard(deckAnswer.getA2()));
		enteredAnswers.add(makeCard(deckAnswer.getA3()));
		enteredAnswers.add(makeCard(deckAnswer.getA4()));
		enteredAnswers.add(makeCard(deckAnswer.getA5()));
		enteredAnswers.add(makeCard(deckAnswer.getA6()));
		enteredAnswers.add(makeCard(deckAnswer.getA7()));
		enteredAnswers.add(makeCard(deckAnswer.getA8()));
		enteredAnswers.add(makeCard(deckAnswer.getA9()));
		enteredAnswers.add(makeCard(deckAnswer.getA10()));
		enteredAnswers.add(makeCard(deckAnswer.getA11()));
		enteredAnswers.add(makeCard(deckAnswer.getA12()));
		enteredAnswers.add(makeCard(deckAnswer.getA13()));
		enteredAnswers.add(makeCard(deckAnswer.getA14()));
		enteredAnswers.add(makeCard(deckAnswer.getA15()));
		enteredAnswers.add(makeCard(deckAnswer.getA16()));
		enteredAnswers.add(makeCard(deckAnswer.getA17()));
		enteredAnswers.add(makeCard(deckAnswer.getA18()));
		enteredAnswers.add(makeCard(deckAnswer.getA19()));
		enteredAnswers.add(makeCard(deckAnswer.getA20()));
		enteredAnswers.add(makeCard(deckAnswer.getA21()));
		enteredAnswers.add(makeCard(deckAnswer.getA22()));
		enteredAnswers.add(makeCard(deckAnswer.getA23()));
		enteredAnswers.add(makeCard(deckAnswer.getA24()));
		enteredAnswers.add(makeCard(deckAnswer.getA25()));
		enteredAnswers.add(makeCard(deckAnswer.getA26()));
		enteredAnswers.add(makeCard(deckAnswer.getA27()));
		enteredAnswers.add(makeCard(deckAnswer.getA28()));
		enteredAnswers.add(makeCard(deckAnswer.getA29()));
		enteredAnswers.add(makeCard(deckAnswer.getA30()));
		enteredAnswers.add(makeCard(deckAnswer.getA31()));
		enteredAnswers.add(makeCard(deckAnswer.getA32()));
		enteredAnswers.add(makeCard(deckAnswer.getA33()));
		enteredAnswers.add(makeCard(deckAnswer.getA34()));
		enteredAnswers.add(makeCard(deckAnswer.getA35()));
		enteredAnswers.add(makeCard(deckAnswer.getA36()));
		enteredAnswers.add(makeCard(deckAnswer.getA37()));
		enteredAnswers.add(makeCard(deckAnswer.getA38()));
		enteredAnswers.add(makeCard(deckAnswer.getA39()));
		enteredAnswers.add(makeCard(deckAnswer.getA40()));
		enteredAnswers.add(makeCard(deckAnswer.getA41()));
		enteredAnswers.add(makeCard(deckAnswer.getA42()));
		enteredAnswers.add(makeCard(deckAnswer.getA43()));
		enteredAnswers.add(makeCard(deckAnswer.getA44()));
		enteredAnswers.add(makeCard(deckAnswer.getA45()));
		enteredAnswers.add(makeCard(deckAnswer.getA46()));
		enteredAnswers.add(makeCard(deckAnswer.getA47()));
		enteredAnswers.add(makeCard(deckAnswer.getA48()));
		enteredAnswers.add(makeCard(deckAnswer.getA49()));
		enteredAnswers.add(makeCard(deckAnswer.getA50()));
		enteredAnswers.add(makeCard(deckAnswer.getA51()));
		enteredAnswers.add(makeCard(deckAnswer.getA52()));

		for(int i=0; i< enteredAnswers.size(); i++) {
			fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());

			enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
		}

		Helpers.Score(cachedCards, enteredAnswers);

		return "test";
	}


	@RequestMapping(value = "/scoreAnswers", method = RequestMethod.POST)
	public String scoreAnswers(Model model) {

		scoresArray = Helpers.SimpleCompareArrays(cachedCards, enteredAnswers);
		String finalScore = Helpers.CalcFinalScore(scoresArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", scoresArray);

		return "scores";

	}


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

	private Card makeCard(String cardName) {
	Card card = new Card();
	card.setCardName(cardName + ".png");

	return card;
}
	private Card getNextCard(Integer id) {
		Card myCard = cachedCards.get(id);
		myCard.setCounter(id+1);

		return myCard;
	}
	public ArrayList<Card> CreateMasterDeck() {

		cachedCards = cardService.listAllCards();
		return cachedCards;

	}
}
