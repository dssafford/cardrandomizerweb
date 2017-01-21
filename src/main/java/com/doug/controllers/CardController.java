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


	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	@RequestMapping(value = "/studyList", method = RequestMethod.GET)
	public String getStudyList() {
		return "learning/studyList";
	}

	@RequestMapping(value = "/locationMasterList", method = RequestMethod.GET)
	public String getLocationMasterList() {

		return "learning/locationMasterList";
	}


//	@RequestMapping(value = "/masterList", method = RequestMethod.GET)
//	public String list(Model model) {
//
//		cachedCards = CreateMasterDeck();
//
//		model.addAttribute("cards",cachedCards);
//
//		return "masterList";
//	}


//	private Card makeCard(String cardName) {
//	Card card = new Card();
//	card.setCardName(cardName + ".png");
//
//	return card;
//}
//
//	private Card getNextCard(Integer id) {
//		Card myCard = cachedCards.get(id);
//		myCard.setCounter(id+1);
//
//		return myCard;
//	}
//	public ArrayList<Card> CreateMasterDeck() {
//
//		cachedCards = cardService.listAllCards();
//		return cachedCards;
//
//	}


}
