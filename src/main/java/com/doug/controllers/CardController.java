package com.doug.controllers;

import com.doug.domain.AnswerListSmall;
import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.domain.Test;
import com.doug.services.CardService;
import com.doug.services.CardServiceImpl;
import com.doug.services.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
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

	@Autowired
	private AnswerListSmall answerListSmall;

	@RequestMapping(value = "/studyList", method = RequestMethod.GET)
	public String getStudyList() {
		return "learning/studyList";
	}

	@RequestMapping("/shit1")
	public String getAnswerListSmall(HttpSession session){

		Object myobj = session.getAttribute("answer");


		CardServiceImpl cardService = new CardServiceImpl();
		cardService.heyAnswerListSmall(session);

		Object dudeObject = Helpers.heyAnswerListSmallx(session);

		return "index";

	}





}
