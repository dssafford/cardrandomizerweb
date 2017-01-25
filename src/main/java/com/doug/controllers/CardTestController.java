package com.doug.controllers;

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


    @RequestMapping(value="/singleCardTest", method = RequestMethod.GET)
    public String getSingleCardTest(Model model){
        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardName("ace_of_spades.png");
//        cardInfo.setAction("action");
//        cardInfo.setCategorySuit("diamonds");
//        cardInfo.setObject("object");
//        cardInfo.setPersonName("person");

        model.addAttribute("cardInfo", cardInfo);

        return "answer/enterAnswerSingle";
    }

    @RequestMapping(value="/singleCardTest", method = RequestMethod.POST)
    public String scoreSingleCardTest(HttpSession session, CardInfo cardinfo, Model model){

        SingleCardScore singleCardScore = new SingleCardScore();

        CardInfo singleCardEnteredAnswer = cardinfo;

        ArrayList<CardInfo> masterCardList = (ArrayList<CardInfo>)session.getAttribute("masterCardDeck");

        //Go get answer
        Boolean foundCard = cardService.ScoreSingleCard(cardinfo.getCardName(), masterCardList);

        singleCardScore.setCardName(cardinfo.getCardName());
        singleCardScore.setCorrect(foundCard);

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




        //Then go to next card
        

        CardInfo cardInfo = new CardInfo();
        cardInfo.setCardName("ace_of_spades.png");
        cardInfo.setAction("action");
        cardInfo.setCategorySuit("diamonds");
        cardInfo.setObject("object");
        cardInfo.setPersonName("person");

        model.addAttribute("cardInfo", cardInfo);

        return "answer/enterAnswerSingle";
    }




}
