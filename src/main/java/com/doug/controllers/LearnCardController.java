package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.services.CardService;
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

    public ArrayList<CardInfo> learningCards = new ArrayList<CardInfo>();

    public ArrayList<CardInfo> cachedRandomLearningCards = new ArrayList<CardInfo>();

    public ArrayList<Card> cachedCards = new ArrayList<Card>();

    public Integer counter=0;

    private CardService cardService;

    @Autowired
    public void setCardService(CardService cardService) {
        this.cardService = cardService;
    }


    //Create a random deck and tie to learningCards (people/object/action)
    @RequestMapping(value = "/masterCardLearningRandomList")
    public String createLearningDeck(Model model) {

        cachedRandomLearningCards = CreateRandomLearningDeck();
        model.addAttribute("cards", cachedRandomLearningCards);

        return "learning/masterCardLearningRandomList";

    }

    @RequestMapping(value = "/nextOneLearnRandomCards", method = RequestMethod.GET)
    public String getNextRandomLearningCard(Model model) {


        model.addAttribute(getNextRandomLearningCard(counter));
        model.addAttribute("counter", counter);


        return "learning/nextOneLearnRandomCards";
    }

    @RequestMapping(value = "/previousOneLearnRandomCards", method = RequestMethod.GET)
    public String getPreviousRandomLearningCard(Model model) {

        model.addAttribute(getPreviousRandomLearningCard(counter));
        model.addAttribute("counter", counter);


        return "learning/nextOneLearnRandomCards";
    }

    @RequestMapping(value = "/nextOneLearnRandomCards", method = RequestMethod.POST)
    public String processRandomLearningAnswer(Model model, CardInfo cardInfo) {



        model.addAttribute(getNextRandomLearningCard(counter));
        model.addAttribute("counter", counter);

        return "learning/nextOneLearnRandomCards";
    }

    @RequestMapping(value = "/nextOneLearnMasterCards", method = RequestMethod.GET)
    public String getNextMasterLearningCard(@RequestParam(value="cardVisible") String myCard,
                                            @RequestParam(value="firstTime", required = false) String firstTime, Model model) {

        if(firstTime ==null) {

            model.addAttribute(getNextMasterLearningCard(counter, false));


            if (myCard.equals("true")) {
                model.addAttribute("cardVisible", "true");
            } else {
                model.addAttribute("cardVisible", "false");
            }

        } else {
            model.addAttribute(getNextMasterLearningCard(0, true));
            if (myCard.equals("true")) {
                model.addAttribute("cardVisible", "true");
            } else {
                model.addAttribute("cardVisible", "false");
            }
        }

        model.addAttribute("counter", counter);
        //model.addAttribute("cardVisible", "false");
        return "learning/nextOneLearnMasterCards";
    }




    @RequestMapping(value = "/previousOneLearnMasterCards", method = RequestMethod.GET)
    public String getPreviousMasterLearningCard(@RequestParam(value="cardVisible") String myCard, Model model) {


        model.addAttribute(getPreviousMasterLearningCard(counter));
        model.addAttribute("counter", counter);

        if(myCard.equals("true")) {
            model.addAttribute("cardVisible", "true");
        } else {
            model.addAttribute("cardVisible", "false");
        }


        return "learning/nextOneLearnMasterCards";
    }
//    @RequestMapping(value = "/nextOneLearnMasterCards", method = RequestMethod.POST)
//    public String processMasterLearningAnswer(Model model, CardInfo cardInfo) {
//
//        model.addAttribute(getNextMasterLearningCard(counter));
//        model.addAttribute("counter", counter);
//
//
//
//        return "learning/nextOneLearnMasterCards";
//    }

    protected String makeCardString(String cardName){

        if(cardName.indexOf(".png") == -1) {
            return cardName + ".png";
        }

        return cardName;
    }

    private Card makeCard(String cardName) {

        if(cardName.indexOf(".png") == 0) {
            Card card = new Card();
            card.setCardName(cardName + ".png");
            return card;
        }

        return null;
    }

    private CardInfo getNextRandomLearningCard(Integer id) {


        if(id != 51) {

            CardInfo myCard = cachedRandomLearningCards.get(id);

            myCard.setCardName(makeCardString(myCard.getCardName()));

            this.counter = id + 1;

            return myCard;
        }

        return null;
    }

    private CardInfo getPreviousRandomLearningCard(Integer id) {

//TODO:Work on counter going backwards

        if(id != 0) {
            CardInfo myCard = cachedRandomLearningCards.get(id);

            myCard.setCardName(makeCardString(myCard.getCardName()));

            this.counter = id - 1;
            return myCard;
        }

        return null;
    }

    private CardInfo getNextMasterLearningCard(Integer id, Boolean firstTime) {

        if(id != 51) {

            if(firstTime==false) {
                this.counter = id + 1;
            } else {
                counter=0;
            }
            CardInfo myCard = learningCards.get(counter);

            myCard.setCardName(makeCardString(myCard.getCardName()));



            return myCard;
        }
        return null;
    }

    private CardInfo getPreviousMasterLearningCard(Integer id) {

        if(counter != 0) {
            counter = id - 1;
            id=id-1;
            CardInfo myCard = learningCards.get(id);

            myCard.setCardName(makeCardString(myCard.getCardName()));



            return myCard;
        }
        return null;
    }

//    @RequestMapping(value="/getRandomLearningList")
//    public String getRandomLearningList(Model model) {
//
//        learningCards = CreateRandomLearningDeck();
//
//
//
//        model.addAttribute("cards", learningCards);
//
//        return "learning/masterCardLearningRandomList";
//
//    }

    @RequestMapping(value="/masterCardLearningMasterList", method = RequestMethod.GET)
    public String getMasterLearningList(Model model) {

        learningCards = cardService.createCardLearningMasterList();



        model.addAttribute("cards", learningCards);

        return "learning/masterCardLearningMasterList";

    }

    private ArrayList<CardInfo> CreateRandomLearningDeck() {

        ArrayList<CardInfo> workingLearningCards = new ArrayList<CardInfo>();

        //Create master CardInfo Arraylist
        learningCards = cardService.createCardLearningMasterList();

        //Get random deck
        cachedCards = cardService.listAllCards();


        //loop through random deck and get CardInfo information
        for(int i=0; i<cachedCards.size(); i++) {
            workingLearningCards.add(GetCardInfo(cachedCards.get(i).getCardName()));
        }

        return workingLearningCards;

    }

    private CardInfo GetCardInfo(String cardName) {
        //loop through CardInfo arraylist to find the same cardname
        //then return the CardInfo
        String cardNameNoSuffix = "";

        for(int i=0;i<learningCards.size();i++) {
            cardNameNoSuffix = cardName.substring(0, cardName.length()-4);

            System.out.println("CardNameNoSuffix :" + cardNameNoSuffix + " and learningCards.get : " + learningCards.get(i).getCardName());

            if(learningCards.get(i).getCardName().equals(cardNameNoSuffix)){
                System.out.println("*************** Found one *****************************************");
                return learningCards.get(i);
            }
        }

        return null;
    }

}
