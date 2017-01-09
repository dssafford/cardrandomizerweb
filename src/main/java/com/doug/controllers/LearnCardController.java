package com.doug.controllers;

import com.doug.domain.*;
import com.doug.services.CardService;
import com.doug.services.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by doug on 12/30/16.
 */
@Controller
public class LearnCardController {

	public ArrayList<CardInfo> learningMasterCards = new ArrayList<CardInfo>();
	public ArrayList<CardInfo> learningRandomCards = new ArrayList<CardInfo>();
	public ArrayList<Card> enteredAnswers = new ArrayList<Card>();
	public ArrayList<CardInfo> cachedRandomLearningCards = new ArrayList<CardInfo>();
	public ArrayList<Test> testArray = new ArrayList<Test>();


	public ArrayList<Card> cachedShuffledCardNames = new ArrayList<Card>();

	public Integer counter = 0;

	private CardService cardService;

	@Autowired
	public void setCardService(CardService cardService) {
		this.cardService = cardService;
	}


	@RequestMapping(value = "/answer", method = RequestMethod.GET)
	public String testenterAnswers(Model model) {
		model.addAttribute("deckAnswer", new DeckAnswer());


		return "learning/testEnterAnswers";

	}




	private ArrayList<Display> createDisplayList() {

		ArrayList<Display> displayArrayList = new ArrayList<Display>();

		ArrayList<Card> answerList = enteredAnswers;
		ArrayList<CardInfo> masterList = learningRandomCards;
		ArrayList<Test> scoreList = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);

		Display display;

		for(int i=0;i<6;i++) {
			display = new Display();

			display.setId(i);
			display.setMasterCardName(masterList.get(i).getCardName());
			display.setAnswerCardName(answerList.get(i).getCardName());
			display.setAnswerCorrect(scoreList.get(i).isCorrect());

			displayArrayList.add(display);

		}

		return displayArrayList;
	}





	@RequestMapping(value = "/enterAnswers", method = RequestMethod.GET)
	public String enterAnswers(Model model) {
		model.addAttribute("deckAnswer", new DeckAnswer());


		return "enterAnswers";

	}

	public ArrayList<Card> createTestAnswers() {
		ArrayList<Card> testAnswers = new ArrayList<Card>();

		for (int i = 0; i < 52; i++) {
			testAnswers.add(new Card(i, "2_of_Clubs.png", i));
		}

		return testAnswers;
	}

	@RequestMapping(value = "/enterAnswers", method = RequestMethod.POST)
	public String getAnswersTestOnly(DeckAnswer deckAnswer) throws Exception {
		enteredAnswers = new ArrayList<Card>();

		String fullAnswerName = "";

		enteredAnswers.add(makeCard(""));
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

		if (enteredAnswers.get(0) != null) {
			for (int i = 0; i < enteredAnswers.size(); i++) {
				fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());
				enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
			}
		} else {
			enteredAnswers = createTestAnswers();
		}

		//Helpers.Score(cachedShuffledCardNames, enteredAnswers);

		return "redirect:/scoreAnswers";
	}





	@RequestMapping(value = "/enterAnswersTest", method = RequestMethod.POST)
	public String getAnswers(DeckAnswer deckAnswer) throws Exception {
		enteredAnswers = new ArrayList<Card>();

		String fullAnswerName = "";

		enteredAnswers.add(makeCard("Ace_of_Hearts"));
		enteredAnswers.add(makeCard("2h"));
		enteredAnswers.add(makeCard("3h"));
		enteredAnswers.add(makeCard("4h"));
		enteredAnswers.add(makeCard("5h"));
		enteredAnswers.add(makeCard("6h"));
		enteredAnswers.add(makeCard("7h"));
		enteredAnswers.add(makeCard("8h"));
		enteredAnswers.add(makeCard("9h"));
		enteredAnswers.add(makeCard("10h"));
		enteredAnswers.add(makeCard("jh"));
		enteredAnswers.add(makeCard("qh"));
		enteredAnswers.add(makeCard("kh"));
		enteredAnswers.add(makeCard("ad"));
		enteredAnswers.add(makeCard("2d"));
		enteredAnswers.add(makeCard("3d"));
		enteredAnswers.add(makeCard("4d"));
		enteredAnswers.add(makeCard("5d"));
		enteredAnswers.add(makeCard("6d"));
		enteredAnswers.add(makeCard("7d"));
		enteredAnswers.add(makeCard("8d"));
		enteredAnswers.add(makeCard("9d"));
		enteredAnswers.add(makeCard("1d"));
		enteredAnswers.add(makeCard("jd"));
		enteredAnswers.add(makeCard("qd"));
		enteredAnswers.add(makeCard("kd"));

		enteredAnswers.add(makeCard("as"));
		enteredAnswers.add(makeCard("2s"));
		enteredAnswers.add(makeCard("3s"));
		enteredAnswers.add(makeCard("4s"));
		enteredAnswers.add(makeCard("5s"));
		enteredAnswers.add(makeCard("6s"));
		enteredAnswers.add(makeCard("7s"));
		enteredAnswers.add(makeCard("8s"));
		enteredAnswers.add(makeCard("9s"));
		enteredAnswers.add(makeCard("1s"));
		enteredAnswers.add(makeCard("js"));
		enteredAnswers.add(makeCard("qs"));
		enteredAnswers.add(makeCard("ks"));
		enteredAnswers.add(makeCard("ac"));
		enteredAnswers.add(makeCard("2c"));
		enteredAnswers.add(makeCard("3c"));
		enteredAnswers.add(makeCard("4c"));
		enteredAnswers.add(makeCard("5c"));
		enteredAnswers.add(makeCard("6c"));
		enteredAnswers.add(makeCard("7c"));
		enteredAnswers.add(makeCard("8c"));
		enteredAnswers.add(makeCard("9c"));
		enteredAnswers.add(makeCard("1c"));
		enteredAnswers.add(makeCard("jc"));
		enteredAnswers.add(makeCard("qc"));
		enteredAnswers.add(makeCard("kc"));

		if (enteredAnswers.get(0) != null) {
			for (int i = 0; i < enteredAnswers.size(); i++) {
				fullAnswerName = Helpers.ResolveAnswers(enteredAnswers.get(i).getCardName());
				enteredAnswers.get(i).setCardName(fullAnswerName + ".png");
			}
		} else {
			enteredAnswers = createTestAnswers();
		}

		//Helpers.Score(cachedShuffledCardNames, enteredAnswers);

		return "redirect:/scoreAnswersTest";
	}

	public ArrayList<Card> createMasterCardList () {
		learningMasterCards = cardService.createCardLearningMasterList();
		ArrayList<Card> justCards = new ArrayList<Card>();

		for(int i=0;i<learningMasterCards.size();i++) {

			justCards.add(makeCard(learningMasterCards.get(i).getCardName()));

		}

		return justCards;
	}
	@RequestMapping(value = "/scoreAnswersTest", method = RequestMethod.GET)
	public String scoreAnswersTest(Model model) {



		testArray = Helpers.SimpleCompareArrays(createMasterCardList(), enteredAnswers);

		String finalScore = Helpers.CalcFinalScore(testArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", testArray);

		return "scores";

	}

	@RequestMapping(value = "/scoreAnswers", method = RequestMethod.GET)
	public String scoreAnswers(Model model) {

		testArray = Helpers.SimpleCompareArrays(cachedShuffledCardNames, enteredAnswers);
		String finalScore = Helpers.CalcFinalScore(testArray);
		model.addAttribute("finalScore", finalScore);
		model.addAttribute("scores", testArray);

		return "scores";

	}


	//Create a random deck and tie to learningRandomCards (people/object/action)
	@RequestMapping(value = "/masterCardLearningRandomList")
	public String createLearningDeck(Model model) {

		cachedRandomLearningCards = CreateRandomLearningDeck();
		model.addAttribute("cards", cachedRandomLearningCards);

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



//    @RequestMapping(value = "/nextOneLearnRandomCards", method = RequestMethod.POST)
//    public String processRandomLearningAnswer(@RequestParam(value="cardVisible") String cardVisible,
//    @RequestParam(value="firstTime", required = false) String firstTime, Model model) {
//
//
//            if(firstTime ==null) {
//
//            model.addAttribute(getNextRandomLearningCard(counter, false));
//
//            if (cardVisible.equals("true")) {
//                model.addAttribute("cardVisible", "true");
//            } else {
//                model.addAttribute("cardVisible", "false");
//            }
//
//        } else {
//            model.addAttribute(getNextRandomLearningCard(0, true));
//            if (cardVisible.equals("true")) {
//                model.addAttribute("cardVisible", "true");
//            } else {
//                model.addAttribute("cardVisible", "false");
//            }
//
//
//        }
//
//        if(firstTime==null && counter!=0) {
//            model.addAttribute("previousVisible", "true");
//        } else {
//            model.addAttribute("previousVisible", "false");
//        }
//
//
//        if(counter!= 51) {
//            model.addAttribute("nextVisible", "true");
//        } else {
//            model.addAttribute("nextVisible", "false");
//        }
//
//
//
//        model.addAttribute("counter", counter);
//
//        return "learning/nextOneLearnRandomCards";
//    }

	@RequestMapping(value = "/nextOneLearnMasterCards", method = RequestMethod.GET)
	public String getNextMasterLearningCard(@RequestParam(value = "cardVisible") String cardVisible,
														 @RequestParam(value = "firstTime", required = false) String firstTime, Model model) {

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

	protected String makeCardString(String cardName) {

		if (cardName.indexOf(".png") == -1) {
			return cardName + ".png";
		}

		return cardName;
	}

	private Card makeCard(String cardName) {

		if (cardName.indexOf(".png") == -1) {
			Card card = new Card();
			card.setCardName(cardName + ".png");
			return card;
		}

		return null;
	}

	private CardInfo getNextRandomLearningCard(Integer id, Boolean firstTime) {


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

//TODO:Work on counter going backwards

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
	public String getMasterLearningList(Model model) {

		learningMasterCards = cardService.createCardLearningMasterList();


		model.addAttribute("cards", learningMasterCards);

		return "learning/masterCardLearningMasterList";

	}

	private ArrayList<CardInfo> CreateRandomLearningDeck() {

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
