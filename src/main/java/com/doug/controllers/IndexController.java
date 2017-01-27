package com.doug.controllers;

import com.doug.domain.CardInfo;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	@Autowired
	CardService cardService;

	ArrayList<CardInfo> masterCardDeck;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage(HttpSession session) {

		//create master list if it doesn't exist
//		if(masterCardDeck == null){
//			masterCardDeck = cardService.createCardLearningMasterList();
//			session.setAttribute("masterCardDeck", masterCardDeck);
//		}

		return "index";

	}

}
