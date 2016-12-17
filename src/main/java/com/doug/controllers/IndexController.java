package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	private CardService cardService;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	//	@RequestMapping({"/", ""})
//	public String index(){
//		return "index";
//	}

	@RequestMapping("/login")
	public String loginForm(Model model){
		model.addAttribute("cards");

		return "/user/login";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Model model) {

		Iterable<Card> myDeck = cardService.listAllCards();

		model.addAttribute("cards",myDeck);

		return "return";
	}

}
