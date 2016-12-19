package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.DeckAnswer;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

/**
 * Created by Doug on 12/17/16.
 */
@Controller
public class IndexController {

	public DeckAnswer deckAnswer;

	private CardService cardService;

	public ArrayList answers = new ArrayList<Card>();
	public ArrayList scoresArray = new ArrayList();

	public ArrayList<Card> cachedCards = new ArrayList<Card>();

	public Integer counter=0;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}

	public ArrayList<Card> CreateMasterDeck() {

		cachedCards = cardService.listAllCards();
		return cachedCards;

	}

	@RequestMapping(value = "/wow", method = RequestMethod.GET)
	public String list(Model model) {

		cachedCards = CreateMasterDeck();

		model.addAttribute("cards",cachedCards);

		return "return";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.GET)
	public String getOne(Model model) {

//		counter = counter++;

		model.addAttribute(getNextCard(0));

		return "nextOne";
	}

	@RequestMapping(value = "/nextOne", method = RequestMethod.POST)
	public String processAnswers(Model model, Card card) {

//		counter = counter++;

		model.addAttribute(getNextCard(card.getCounter()));

		return "nextOne";
	}

	private Card getNextCard(Integer id) {
		Card myCard = cachedCards.get(id);
		myCard.setCounter(id+1);

		return myCard;
	}

	private ArrayList SimpleCompareArrays(ArrayList<Card> masterDeck, ArrayList<Card> answerDeck) {
//		ArrayList scoresArray = new ArrayList();

		for(int i=0;i<masterDeck.size();i++){
			if(masterDeck.get(i).getCardName().equals(answerDeck.get(i).getCardName())) {
				scoresArray.add(true);
				System.out.println("Found equal on number " + i + " - " + masterDeck.get(i).getCardName() + " = " + answerDeck.get(i).getCardName());
			} else {

				scoresArray.add(false);
				System.out.println("Found not equal on number " + i + " - " + masterDeck.get(i).getCardName() + " != " +
						  answerDeck.get(i).getCardName());
			}
		}
		return scoresArray;


	}
	
	@RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
	public String enterAnswers(Model model) {
		model.addAttribute("deckAnswer", new DeckAnswer());

		return "enterAnswers";

	}

	private Card makeCard(String cardName) {
		Card card = new Card();
		card.setCardName(cardName + ".png");
		
		return card;
	}
	@RequestMapping(value="/enterAnswers", method = RequestMethod.POST) 
		public String getAnswers(DeckAnswer deckAnswer) {
		//model.addAttribute(getNextCard(card.getCounter()());

			answers.add(makeCard(deckAnswer.getA1()));
			answers.add(makeCard(deckAnswer.getA2()));
			answers.add(makeCard(deckAnswer.getA3()));
			answers.add(makeCard(deckAnswer.getA4()));
			answers.add(makeCard(deckAnswer.getA5()));
			answers.add(makeCard(deckAnswer.getA6()));
			answers.add(makeCard(deckAnswer.getA7()));
			answers.add(makeCard(deckAnswer.getA8()));
			answers.add(makeCard(deckAnswer.getA9()));
			answers.add(makeCard(deckAnswer.getA10()));
			answers.add(makeCard(deckAnswer.getA11()));
			answers.add(makeCard(deckAnswer.getA12()));
			answers.add(makeCard(deckAnswer.getA13()));
			answers.add(makeCard(deckAnswer.getA14()));
			answers.add(makeCard(deckAnswer.getA15()));
			answers.add(makeCard(deckAnswer.getA16()));
			answers.add(makeCard(deckAnswer.getA17()));
			answers.add(makeCard(deckAnswer.getA18()));
			answers.add(makeCard(deckAnswer.getA19()));
			answers.add(makeCard(deckAnswer.getA20()));
			answers.add(makeCard(deckAnswer.getA21()));
			answers.add(makeCard(deckAnswer.getA22()));
			answers.add(makeCard(deckAnswer.getA23()));
			answers.add(makeCard(deckAnswer.getA24()));
			answers.add(makeCard(deckAnswer.getA25()));
			answers.add(makeCard(deckAnswer.getA26()));
			answers.add(makeCard(deckAnswer.getA27()));
			answers.add(makeCard(deckAnswer.getA28()));
			answers.add(makeCard(deckAnswer.getA29()));
			answers.add(makeCard(deckAnswer.getA30()));
			answers.add(makeCard(deckAnswer.getA31()));
			answers.add(makeCard(deckAnswer.getA32()));
			answers.add(makeCard(deckAnswer.getA33()));
			answers.add(makeCard(deckAnswer.getA34()));
			answers.add(makeCard(deckAnswer.getA35()));
			answers.add(makeCard(deckAnswer.getA36()));
			answers.add(makeCard(deckAnswer.getA37()));
			answers.add(makeCard(deckAnswer.getA38()));
			answers.add(makeCard(deckAnswer.getA39()));
			answers.add(makeCard(deckAnswer.getA40()));
			answers.add(makeCard(deckAnswer.getA41()));
			answers.add(makeCard(deckAnswer.getA42()));
			answers.add(makeCard(deckAnswer.getA43()));
			answers.add(makeCard(deckAnswer.getA44()));
			answers.add(makeCard(deckAnswer.getA45()));
			answers.add(makeCard(deckAnswer.getA46()));
			answers.add(makeCard(deckAnswer.getA47()));
			answers.add(makeCard(deckAnswer.getA48()));
			answers.add(makeCard(deckAnswer.getA49()));
			answers.add(makeCard(deckAnswer.getA50()));
			answers.add(makeCard(deckAnswer.getA51()));
			answers.add(makeCard(deckAnswer.getA52()));

			return "test";
		}

		@RequestMapping(value = "/scoreAnswers", method = RequestMethod.POST)
		public String scoreAnswers(Model model) {


			SimpleCompareArrays(cachedCards, answers);

			return "redirect:/newScores";

		}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String scores(@ModelAttribute ArrayList<Card> cachedCards, Model model, BindingResult bindingResult) {
//		deckAnswer = new DeckAnswer();
//		deckAnswer.setA1("dude");
//		model.addAttribute("doug", deckAnswer);

		ArrayList<Card> myCachedCards = CreateMasterDeck();

		model.addAttribute("cachedCards", myCachedCards);

		return "newScores";

	}

}
