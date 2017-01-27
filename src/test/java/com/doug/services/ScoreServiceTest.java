package com.doug.services;

import com.doug.domain.CardInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by doug on 1/26/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ScoreServiceTest {

    @Autowired
    ScoreService scoreService;

    @Autowired
    CardService cardService;

    CardInfo testCardInfo;
    ArrayList<CardInfo> masterDeckList;


    @Before
    public void SetUp() {
//        cardInfo = new CardInfo("ace_of_spades", "odd people", "sportsmen",
//                "spades", "Dennis Rodman", "diving into", "cameraman");
        masterDeckList = cardService.createCardLearningMasterList();

        testCardInfo = new CardInfo();
        testCardInfo.setCardName("ace_of_spades");
        testCardInfo.setPersonName("Dennis Rodman");
        testCardInfo.setactionName("diving into");
        testCardInfo.setobjectName("cameraman");


    }

    @Test
    public void getScoreServiceTest() throws Exception {
        scoreService = new ScoreServiceImpl();
        assertNotNull(scoreService);
    }

    @Test
    public void findCardTest() throws Exception {

        assertEquals(scoreService.GetCardInfoFromCardName("ace_of_spades", masterDeckList).getCardName(),
                testCardInfo.getCardName());
    }
    @Test
    public void getScoreCardNameTest() throws Exception {

        assertTrue(scoreService.ScoreCardName(testCardInfo, masterDeckList));
    }

    @Test
    public void getScoreCardPersonNameTest() throws Exception {

        assertTrue(scoreService.ScoreCardPersonName(testCardInfo, masterDeckList));
    }

    @Test
    public void getScoreCardObjectNameTest() throws Exception {

        assertTrue(scoreService.ScoreCardObjectName(testCardInfo, masterDeckList));
    }

    @Test
    public void getScoreCardActionNameTest() throws Exception {

        assertTrue(scoreService.ScoreCardActionName(testCardInfo, masterDeckList));
    }

}
