package com.doug.controllers;

import com.doug.domain.CardInfo;
import com.doug.domain.SingleCardScore;
import com.doug.services.CardService;
import com.doug.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by doug on 1/24/17.
 */
@Controller
public class CardTestController {

    @Autowired
    CardService cardService;

    @Autowired
    ScoreService scoreService;

    @Autowired
    private LearnCardController learnCardController;

    private Integer deckIndex;
    private ArrayList<CardInfo> cachedRandomLearningCards;

    @RequestMapping(value = "/singleCardTestStart", method = RequestMethod.GET)
    public String startSingleCardScoring(HttpSession session) {
        session.setAttribute("randomLearningDeck", null);
        session.setAttribute("scoreSoFar", null);

        return "redirect:/singleCardTest";

    }

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
        cardInfo.setActionName("");
        cardInfo.setObjectName("");
        cardInfo.setPersonName("");

        model.addAttribute("cardInfo", cardInfo);
        model.addAttribute("cardNumber", deckIndex.toString());

        return "answer/enterAnswerSingle";
    }

    @RequestMapping(value="/singleCardTest", method = RequestMethod.POST)
    public String scoreSingleCardTest(HttpSession session, CardInfo cardInfo, Model model){
        ArrayList<CardInfo> masterCardDeck;

        masterCardDeck = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

        //create master list if it doesn't exist
        if(masterCardDeck == null){
            masterCardDeck = cardService.createCardLearningMasterList();
            session.setAttribute("masterCardDeck", masterCardDeck);
        }


        SingleCardScore singleCardScore = scoreService.ScoreSingleCard(cardInfo, masterCardDeck);

        //Add to score
        ArrayList<SingleCardScore> singleCardScoreArrayList =
                (ArrayList<SingleCardScore>)session.getAttribute("scoreSoFar");

        //if first one then createSingleCardScoreArrayList
        if(deckIndex==0){

            singleCardScoreArrayList = new ArrayList<SingleCardScore>();
        }

        singleCardScoreArrayList.add(singleCardScore);

        //Set back to Session
        session.setAttribute("scoreSoFar", singleCardScoreArrayList);

        BigDecimal cumulativeScore = scoreService.GetCumulativeScore(singleCardScoreArrayList);

        //Then go to next card, get from masterRandomList
        cachedRandomLearningCards = (ArrayList<CardInfo>)session.getAttribute("randomLearningDeck");
        session.getAttribute("randomLearningDeckIndex");

        deckIndex = deckIndex+1;
        cardInfo.setCardName(cachedRandomLearningCards.get(deckIndex).getCardName());
        cardInfo.setActionName("");
        cardInfo.setCategorySuit("");
        cardInfo.setObjectName("");
        cardInfo.setPersonName("");

        model.addAttribute("cardInfo", cardInfo);
        model.addAttribute("cardNumber", deckIndex.toString());


//        TODO: Get to one decimal point


        model.addAttribute("score", cumulativeScore + "%");

        //Update score just for show
        System.out.println("number of cards in score = " + singleCardScoreArrayList.size());
        System.out.println("Card Name = " + singleCardScore.getCardName());
        System.out.println("Card Person = " + singleCardScore.getPersonName() + "- " + singleCardScore.getPersonNameCorrect().toString());
        System.out.println("Card Action = " + singleCardScore.getActionName()+ "- " +  singleCardScore.getActionNameCorrect().toString());
        System.out.println("Card Object = " + singleCardScore.getObjectName() + "- " +  singleCardScore.getObjectNameCorrect().toString());
        System.out.println("out of " + deckIndex + " cards, " + deckIndex*3 + " possible answers. Score = " + cumulativeScore + "%");

        return "answer/enterAnswerSingle";
    }




}
