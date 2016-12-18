package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
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

	public ArrayList answers;
	public ArrayList scores;

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

//		Card myCard1 = new Card(());
//		myCard1.setId(1());
//		myCard1.setCardName("dude1"());
//
//		cachedCard.add(myCard1());
//
//		Card myCard2 = new Card(());
//		myCard2.setId(2());
//		myCard2.setCardName("dude2"());
//
//		cachedCard.add(myCard2());
//
//		Card myCard3 = new Card(());
//		myCard3.setId(1());
//		myCard3.setCardName("dude3"());
//
//		cachedCard.add(myCard3());
//		Iterable<Card> myDeck = cardService.listAllCards(());

		answers = cardService.listAllCards();
		return answers;

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

//	@RequestMapping(value = "/nextOne", method = RequestMethod.POST)
//	public String getOnePost(Model model, Card card) {
//
////		counter = counter++;
//
//		model.addAttribute(getNextCard(card.getCounter()));
//
//		return "click";
//	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.POST)
	public String processAnswers(Model model, Card card) {

//		counter = counter++;

		model.addAttribute(getNextCard(card.getCounter()));

		return "click";
	}

	private Card getNextCard(Integer id) {
		Card myCard = cachedCards.get(id);
		myCard.setCounter(id+1);

		return myCard;
	}

	private ArrayList SimpleCompareArrays(ArrayList one, ArrayList two) {
		ArrayList scoresArray = new ArrayList();

		for(int i=0;i<one.size();i++){
			if(one.get(i) != two.get(i)) {
				scoresArray.add(false);
				System.out.println("Found not equal on number" + i + one.get(i) + " != " + two.get(i));
			} else {
				scoresArray.add(true);
			}
		}
		return scoresArray;


	}
	
	@RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
	public String enterAnswers(Model model) {
		model.addAttribute("deckAnswer", new DeckAnswer());
		return "enterAnswers";

	}


	@RequestMapping(value="/enterAnswers", method = RequestMethod.POST) 
		public String getAnswers(DeckAnswer deckAnswer) {
		//model.addAttribute(getNextCard(card.getCounter()());

			ArrayList answers = new ArrayList();
			answers.add(deckAnswer.getA1());
			answers.add(deckAnswer.getA2());
			answers.add(deckAnswer.getA3());
			answers.add(deckAnswer.getA4());
			answers.add(deckAnswer.getA5());
			answers.add(deckAnswer.getA6());
			answers.add(deckAnswer.getA7());
			answers.add(deckAnswer.getA8());
			answers.add(deckAnswer.getA9());
			answers.add(deckAnswer.getA10());
			answers.add(deckAnswer.getA11());
			answers.add(deckAnswer.getA12());
			answers.add(deckAnswer.getA13());
			answers.add(deckAnswer.getA14());
			answers.add(deckAnswer.getA15());
			answers.add(deckAnswer.getA16());
			answers.add(deckAnswer.getA17());
			answers.add(deckAnswer.getA18());
			answers.add(deckAnswer.getA19());
			answers.add(deckAnswer.getA20());
			answers.add(deckAnswer.getA21());
			answers.add(deckAnswer.getA22());
			answers.add(deckAnswer.getA23());
			answers.add(deckAnswer.getA24());
			answers.add(deckAnswer.getA25());
			answers.add(deckAnswer.getA26());
			answers.add(deckAnswer.getA27());
			answers.add(deckAnswer.getA28());
			answers.add(deckAnswer.getA29());
			answers.add(deckAnswer.getA30());
			answers.add(deckAnswer.getA31());
			answers.add(deckAnswer.getA32());
			answers.add(deckAnswer.getA33());
			answers.add(deckAnswer.getA34());
			answers.add(deckAnswer.getA35());
			answers.add(deckAnswer.getA36());
			answers.add(deckAnswer.getA37());
			answers.add(deckAnswer.getA38());
			answers.add(deckAnswer.getA39());
			answers.add(deckAnswer.getA40());
			answers.add(deckAnswer.getA41());
			answers.add(deckAnswer.getA42());
			answers.add(deckAnswer.getA43());
			answers.add(deckAnswer.getA44());
			answers.add(deckAnswer.getA45());
			answers.add(deckAnswer.getA46());
			answers.add(deckAnswer.getA47());
			answers.add(deckAnswer.getA48());
			answers.add(deckAnswer.getA49());
			answers.add(deckAnswer.getA50());
			answers.add(deckAnswer.getA51());
			answers.add(deckAnswer.getA52());



			return "test";
		}


}
