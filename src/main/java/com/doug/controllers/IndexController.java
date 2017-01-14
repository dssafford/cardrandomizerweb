package com.doug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

//	public DeckAnswer deckAnswer;
//
//	private CardService cardService;
//
//	public ArrayList<Card> enteredAnswers = new ArrayList<Card>();
//	public ArrayList<Card> answers = new ArrayList<Card>();
//
//	public ArrayList scoresArray = new ArrayList();
//
//	public ArrayList<Card> cachedCards = new ArrayList<Card>();
//
//	public Integer counter=0;
//
//	@Autowired
//	public void setCardService(CardService cardService) {
//		this.cardService = cardService;
//	}
//



	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "index";

	}

}
