package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;
import com.doug.domain.DeckAnswer;
import com.doug.domain.Score;
import com.doug.services.CardService;
import com.doug.services.Helpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/learnCards")
    public String createLearningDeck(Model model) {

        cachedRandomLearningCards = CreateRandomLearningDeck();
        model.addAttribute("cards", cachedRandomLearningCards);

        return "masterCardLearningList";

    }

    @RequestMapping(value = "/nextOneLearnCards", method = RequestMethod.GET)
    public String getNextLearningCard(Model model) {

        model.addAttribute(getNextLearningCard(counter));
        model.addAttribute("counter", counter);
        return "nextOneLearnCards";
    }

    @RequestMapping(value = "/nextOneLearnCards", method = RequestMethod.POST)
    public String processLearningAnswer(Model model, CardInfo cardInfo) {

        model.addAttribute(getNextLearningCard(counter));
        model.addAttribute("counter", counter);

        return "nextOneLearnCards";
    }

    protected String makeCardString(String cardName){

        return cardName+".png";

    }

    private Card makeCard(String cardName) {
        Card card = new Card();
        card.setCardName(cardName + ".png");

        return card;
    }

    private CardInfo getNextLearningCard(Integer id) {
        CardInfo myCard = cachedRandomLearningCards.get(id);

        myCard.setCardName(makeCardString(myCard.getCardName()));

        this.counter=id+1;

        return myCard;
    }

    @RequestMapping(value="/getRandomLearningList")
    public String getRandomLearningList(Model model) {

        learningCards = CreateRandomLearningDeck();



        model.addAttribute("cards", learningCards);

        return "masterCardLearningList";

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
