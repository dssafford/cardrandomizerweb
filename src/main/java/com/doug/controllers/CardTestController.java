package com.doug.controllers;

import com.doug.domain.Card;
import com.doug.domain.CardInfo;

import com.doug.domain.SingleCardScore;
import com.doug.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by doug on 1/24/17.
 */
@Controller
public class CardTestController {

    @Autowired
    CardService cardService;

    @Autowired
    private LearnCardController learnCardController;

    private Integer deckIndex;
    private ArrayList<CardInfo> cachedRandomLearningCards;


    @RequestMapping(value="/singleCardTest", method = RequestMethod.GET)
    public String getSingleCardTest(HttpSession session, Model model){
        //Create master random list and put in session


       if(session.getAttribute("randomLearningDeck") == null){
           cachedRandomLearningCards = learnCardController.CreateRandomLearningDeck();
           session.setAttribute("randomLearningDeck", cachedRandomLearningCards);
           deckIndex=0;
           session.setAttribute("randomLearningDeckIndex", deckIndex);
       } else {
           cachedRandomLearningCards= (ArrayList<CardInfo>)session.getAttribute("randomLearningDeck");
           deckIndex = (Integer)session.getAttribute("randomLearningDeckIndex")+1;
       }


        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardName(cachedRandomLearningCards.get(deckIndex).getCardName());
//        cardInfo.setAction("action");
//        cardInfo.setCategorySuit("diamonds");
//        cardInfo.setObject("object");
//        cardInfo.setPersonName("person");

        model.addAttribute("cardInfo", cardInfo);

        return "answer/enterAnswerSingle";
    }

    @RequestMapping(value="/singleCardTest", method = RequestMethod.POST)
    public String scoreSingleCardTest(HttpSession session, CardInfo cardInfo, Model model){

        SingleCardScore singleCardScore = new SingleCardScore();

        CardInfo singleCardEnteredAnswer = cardInfo;

        ArrayList<CardInfo> masterCardList = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

        //Go get answer
        Boolean foundCard = cardService.ScoreSingleCard(cardInfo.getCardName(), masterCardList);

        singleCardScore.setCardName(cardInfo.getCardName());
        singleCardScore.setCardNameCorrect(foundCard);

        //Add to score
        ArrayList<SingleCardScore> singleCardScoreArrayList =
                (ArrayList<SingleCardScore>)session.getAttribute("scoreSoFar");

        //if first one then createSingleCardScoreArrayList
        if(singleCardScoreArrayList == null){

            singleCardScoreArrayList = new ArrayList<SingleCardScore>();
        }

        singleCardScoreArrayList.add(singleCardScore);

        //Set back to Session
        session.setAttribute("scoreSoFar", singleCardScoreArrayList);




        //Then go to next card, get from masterRandomList
        cachedRandomLearningCards = (ArrayList<CardInfo>)session.getAttribute("randomLearningDeck");
        session.getAttribute("randomLearningDeckIndex");


        cardInfo.setCardName(cachedRandomLearningCards.get(deckIndex).getCardName());
        cardInfo.setactionName("action");
        cardInfo.setCategorySuit("diamonds");
        cardInfo.setobjectName("object");
        cardInfo.setPersonName("person");

        model.addAttribute("cardInfo", cardInfo);

        return "answer/enterAnswerSingle";
    }




}
