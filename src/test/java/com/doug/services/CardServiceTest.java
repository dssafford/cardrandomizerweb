package com.doug.services;

import com.doug.domain.CardInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by doug on 1/24/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CardServiceTest {

    @Autowired
    CardService cardService;

    ArrayList<CardInfo> masterCardList;

    @Before
    public void SetUp() {

        masterCardList = cardService.createCardLearningMasterList();

    }


    @Test
    public void getSingleCardInfoTest() throws Exception {

        CardInfo cardInfo = new CardInfo();

        cardInfo.setCardName("ace_of_spades.png");
        cardInfo.setAction("action");
        cardInfo.setCategorySuit("diamonds");
        cardInfo.setObject("object");
        cardInfo.setPersonName("person");

        CardInfo answerCard = cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterCardList);

        assertNotNull(answerCard);

    }

    @Test
    public void getCardInfo() throws Exception {
        CardInfo cardInfo = new CardInfo();

        cardInfo.setCardName("ace_of_spades");

        CardInfo answerCard = cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterCardList);

        assertEquals("ace_of_spades", answerCard.getCardName());

    }



}
