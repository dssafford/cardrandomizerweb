package com.doug.controllers;

import com.doug.domain.AnswerListSmall;
import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.SimpleCardTest;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

import static com.doug.services.Helpers.makeCardString;

/**
 * Created by doug on 12/30/16.
 */
@Controller
public class LearnCardController {

	public ArrayList<CardInfo> learningMasterCards = new ArrayList<CardInfo>();
	public ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
	public ArrayList<Card> enteredAnswers = new ArrayList<Card>();
	public ArrayList<CardInfo> cachedRandomLearningCards = new ArrayList<CardInfo>();
	public ArrayList<SimpleCardTest> simpleCardTestArray = new ArrayList<SimpleCardTest>();


	public ArrayList<Card> cachedShuffledCardNames = new ArrayList<Card>();

	public Integer counter = 0;

	private CardService cardService;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


	@Autowired
	private AnswerListSmall answerListSmall;


	@RequestMapping("/saveTest")
	public String saveTest() {
		String doug = new String();
		learningRandomCards.size();

		return "index";
	}

	//Create a random deck and tie to learningRandomCards (people/object/action)
	@RequestMapping(value = "/masterCardLearningRandomList")
	public String createLearningDeck(HttpSession session, Model model) {

		cachedRandomLearningCards = CreateRandomLearningDeck();
		model.addAttribute("cards", cachedRandomLearningCards);

		session.setAttribute("cachedRandomLearningCards", cachedRandomLearningCards);

		return "learning/masterCardLearningRandomList";

	}

	@RequestMapping(value = "/nextOneLearnRandomCards", method = RequestMethod.GET)
	public String getNextRandomLearningCard(@RequestParam(value = "cardVisible") String cardVisible,
														 @RequestParam(value = "firstTime", required = false) String firstTime, Model model) {

		if (cachedRandomLearningCards.size() == 0) {
			cachedRandomLearningCards = CreateRandomLearningDeck();
		}


		if (firstTime == null) {

			model.addAttribute(getNextRandomLearningCard(counter, false));
			if (cardVisible.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}

		} else {
			model.addAttribute(getNextRandomLearningCard(0, true));
			if (cardVisible.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}
		}
		if (counter != 0) {
			model.addAttribute("previousVisible", "true");
		} else {
			model.addAttribute("previousVisible", "false");
		}

		if (counter != 51) {
			model.addAttribute("nextVisible", "true");
		} else {
			model.addAttribute("nextVisible", "false");
		}

		model.addAttribute("counter", counter);

		return "learning/nextOneLearnRandomCards";
	}

	@RequestMapping(value = "/previousOneLearnRandomCards", method = RequestMethod.GET)
	public String getPreviousRandomLearningCard(@RequestParam(value = "cardVisible") String myCard, Model model) {

		if (model != null) {

			model.addAttribute(getPreviousRandomLearningCard(counter));


			if (myCard.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}

		} else {

		}

		if (counter != 0) {
			model.addAttribute("previousVisible", "true");
		} else {
			model.addAttribute("previousVisible", "false");
		}

		if (counter != 51) {
			model.addAttribute("nextVisible", "true");
		} else {
			model.addAttribute("nextVisible", "false");
		}


		model.addAttribute("counter", counter);

		return "learning/nextOneLearnRandomCards";
	}


	@RequestMapping(value = "/nextOneLearnMasterCards", method = RequestMethod.GET)
	public String getNextMasterLearningCard(@RequestParam(value = "cardVisible") String cardVisible,
														 @RequestParam(value = "firstTime", required = false) String firstTime,
														 Model model) {

		if (firstTime == null) {

			model.addAttribute(getNextMasterLearningCard(counter, false));

			if (cardVisible.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}

		} else {
			model.addAttribute(getNextMasterLearningCard(0, true));
			if (cardVisible.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}


		}

		if (firstTime == null && counter != 0) {
			model.addAttribute("previousVisible", "true");
		} else {
			model.addAttribute("previousVisible", "false");
		}


		if (counter != 51) {
			model.addAttribute("nextVisible", "true");
		} else {
			model.addAttribute("nextVisible", "false");
		}


		model.addAttribute("counter", counter);

		return "learning/nextOneLearnMasterCards";
	}


	@RequestMapping(value = "/previousOneLearnMasterCards", method = RequestMethod.GET)
	public String getPreviousMasterLearningCard(@RequestParam(value = "cardVisible") String myCard, Model model) {

		if (model != null) {

			model.addAttribute(getPreviousMasterLearningCard(counter));
			model.addAttribute("counter", counter);

			if (myCard.equals("true")) {
				model.addAttribute("cardVisible", "true");
			} else {
				model.addAttribute("cardVisible", "false");
			}

		} else {

		}

		if (counter != 0) {
			model.addAttribute("previousVisible", "true");
		} else {
			model.addAttribute("previousVisible", "false");
		}

		if (counter != 51) {
			model.addAttribute("nextVisible", "true");
		} else {
			model.addAttribute("nextVisible", "false");
		}

		return "learning/nextOneLearnMasterCards";
	}



	protected CardInfo getNextRandomLearningCard(Integer id, Boolean firstTime) {


		if (id != 51) {
			if (firstTime == false) {
				this.counter = id + 1;
			} else {
				counter = 0;
			}

			CardInfo myCard = cachedRandomLearningCards.get(counter);

			myCard.setCardName(makeCardString(myCard.getCardName()));


			return myCard;
		}

		return null;
	}

	private CardInfo getPreviousRandomLearningCard(Integer id) {

		if (counter != 0) {
			counter = id - 1;
			id = id - 1;

			CardInfo myCard = cachedRandomLearningCards.get(counter);

			myCard.setCardName(makeCardString(myCard.getCardName()));

			return myCard;
		}

		return null;
	}

	private CardInfo getNextMasterLearningCard(Integer id, Boolean firstTime) {

		if (id != 51) {

			if (firstTime == false) {
				this.counter = id + 1;
			} else {
				counter = 0;
			}
			CardInfo myCard = learningMasterCards.get(counter);

			myCard.setCardName(makeCardString(myCard.getCardName()));

			return myCard;
		}
		return null;
	}

	private CardInfo getPreviousMasterLearningCard(Integer id) {

		if (counter != 0) {
			counter = id - 1;
			id = id - 1;
			CardInfo myCard = learningMasterCards.get(id);

			myCard.setCardName(makeCardString(myCard.getCardName()));
			return myCard;
		}
		return null;
	}

	@RequestMapping(value = "/masterCardLearningMasterList", method = RequestMethod.GET)
	public String getMasterLearningList(HttpSession session, Model model) {

		learningMasterCards = cardService.createCardLearningMasterList();


		model.addAttribute("cards", learningMasterCards);


		//Put in Session
		session.setAttribute("learningMasterCards", learningMasterCards);

		return "learning/masterCardLearningMasterList";

	}

	protected ArrayList<CardInfo> CreateRandomLearningDeck() {

		ArrayList<CardInfo> workinglearningRandomCards = new ArrayList<CardInfo>();

		//Create master CardInfo Arraylist
		learningRandomCards = cardService.createCardLearningMasterList();

		//Get random deck
		cachedShuffledCardNames = cardService.listAllCards();


		//loop through random deck and get CardInfo information
		for (int i = 0; i < cachedShuffledCardNames.size(); i++) {
			workinglearningRandomCards.add(GetRandomCardInfo(cachedShuffledCardNames.get(i).getCardName()));
		}


		return workinglearningRandomCards;

	}

	private CardInfo GetMasterCardInfo(String cardName) {
		//loop through CardInfo arraylist to find the same cardname
		//then return the CardInfo
		String cardNameNoSuffix = "";

		for (int i = 0; i < learningMasterCards.size(); i++) {
			cardNameNoSuffix = cardName.substring(0, cardName.length() - 4);

			//System.out.println("CardNameNoSuffix :" + cardNameNoSuffix + " and learningMasterCards.get : " + learningMasterCards.get(i).getCardName());

			if (learningMasterCards.get(i).getCardName().equals(cardNameNoSuffix)) {
				//System.out.println("*************** Found one *****************************************");
				return learningMasterCards.get(i);
			}
		}

		return null;
	}

	private CardInfo GetRandomCardInfo(String cardName) {
		//loop through CardInfo arraylist to find the same cardname
		//then return the CardInfo
		String cardNameNoSuffix = "";

		for (int i = 0; i < learningRandomCards.size(); i++) {
			cardNameNoSuffix = cardName.substring(0, cardName.length() - 4);

			//System.out.println("CardNameNoSuffix :" + cardNameNoSuffix + " and learningRandomCards.get : " + learningRandomCards.get(i).getCardName());

			if (learningRandomCards.get(i).getCardName().equals(cardNameNoSuffix)) {
				//System.out.println("*************** Found one *****************************************");
				return learningRandomCards.get(i);
			}
		}

		return null;
	}

}
