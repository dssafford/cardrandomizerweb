package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	private CardService cardService;

	public ArrayList<Card> cachedCards = new ArrayList();
	public Integer counter=0;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	//	@RequestMapping({"/", ""})
//	public String index(){
//		return "index";
//	}

	public ArrayList<Card> CreateCards () {

//		Card myCard1 = new Card();
//		myCard1.setId(1);
//		myCard1.setCardName("dude1");
//
//		cachedCard.add(myCard1);
//
//		Card myCard2 = new Card();
//		myCard2.setId(2);
//		myCard2.setCardName("dude2");
//
//		cachedCard.add(myCard2);
//
//		Card myCard3 = new Card();
//		myCard3.setId(1);
//		myCard3.setCardName("dude3");
//
//		cachedCard.add(myCard3);
//		Iterable<Card> myDeck = cardService.listAllCards();

		return cardService.listAllCards();

	}


	@RequestMapping("/login")
	public String loginForm(Model model){
		model.addAttribute("cards");

		return "/user/login";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {

		cachedCards = CreateCards();

		ArrayList<Card> myDeck = cardService.listAllCards();

		model.addAttribute("cards",myDeck);

		return "return";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.GET)
	public String getOne(Model model) {

//		counter = counter++;

		model.addAttribute(getNextCard(0));

		return "click";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.POST)
	public String getOnePost(Model model, Card card) {

//		counter = counter++;

		model.addAttribute(getNextCard(card.getCounter()));

		return "click";
	}


	private Card getNextCard(Integer id) {
		Card myCard = cachedCards.get(id);
		myCard.setCounter(id+1);

		return myCard;
	}
}
