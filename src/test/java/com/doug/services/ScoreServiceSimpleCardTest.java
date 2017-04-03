package com.doug.services;

import com.doug.domain.CardInfo;
import com.doug.domain.SingleCardScore;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * Created by doug on 1/26/17.
 */

@SpringBootTest
public class ScoreServiceSimpleCardTest {

    @Autowired
    ScoreService scoreService;

    @Autowired
    CardService cardService;

    CardInfo testCardTrueInfo;
    CardInfo testCardFalseInfo;

    ArrayList<CardInfo> masterDeckList;

    private SingleCardScore singleCardTrueScore;
    private SingleCardScore singleCardFalseScore;

    @Before
    public void SetUp() {
//        cardInfo = new CardInfo("ace_of_spades", "odd people", "sportsmen",
//                "spades", "Dennis Rodman", "diving into", "cameraman");
        masterDeckList = cardService.createCardLearningMasterList();

        testCardTrueInfo = new CardInfo();
        testCardTrueInfo.setCardName("ace_of_spades");
        testCardTrueInfo.setPersonName("Dennis Rodman");
        testCardTrueInfo.setActionName("diving into");
        testCardTrueInfo.setObjectName("cameraman");

        singleCardTrueScore = scoreService.ScoreSingleCard(testCardTrueInfo, masterDeckList);

        testCardFalseInfo = new CardInfo();
        testCardFalseInfo.setCardName("ace_of_");
        testCardFalseInfo.setPersonName("Dennis Menace");
        testCardFalseInfo.setActionName("driving");
        testCardFalseInfo.setObjectName("camera");

        singleCardFalseScore = scoreService.ScoreSingleCard(testCardFalseInfo, masterDeckList);
    }

//    @SimpleCardTest
//    public void getScoreServiceImpl() throws Exception {
//        scoreService = new ScoreServiceImpl();
//        assertNotNull(scoreService);
//    }
//
//    @SimpleCardTest
//    public void findCardTrueTest() throws Exception {
//
//
//        assertEquals(scoreService.GetCardInfoFromCardName("ace_of_spades", masterDeckList).getCardName(),
//                testCardTrueInfo.getCardName());
//    }
//
//
//
//    @SimpleCardTest
//    public void getScoreCardNameTrueTest() throws Exception {
//
//        assertEquals(testCardTrueInfo.getCardName(), singleCardTrueScore.getCardName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardPersonNameTrueTest() throws Exception {
//
//        assertEquals(testCardTrueInfo.getPersonName(), singleCardTrueScore.getPersonName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardObjectNameTrueTest() throws Exception {
//
//        assertEquals(testCardTrueInfo.getObjectName(), singleCardTrueScore.getObjectName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardActionNameTrueTest() throws Exception {
//
//        assertEquals(testCardTrueInfo.getActionName(), singleCardTrueScore.getActionName());
//    }
//
//
//    @SimpleCardTest
//    public void findCardFalseTest() throws Exception {
//
//
//        assertNotEquals(scoreService.GetCardInfoFromCardName("ace_of_spades", masterDeckList).getCardName(),
//                testCardFalseInfo.getCardName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardNameFalseTest() throws Exception {
//
//        assertNotEquals(testCardFalseInfo.getCardName(), testCardTrueInfo.getCardName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardPersonNameFalseTest() throws Exception {
//
//        assertNotEquals(testCardFalseInfo, testCardTrueInfo.getPersonName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardObjectNameFalseTest() throws Exception {
//
//        assertNotEquals(testCardFalseInfo.getObjectName(), testCardTrueInfo.getObjectName());
//    }
//
//    @SimpleCardTest
//    public void getScoreCardActionNameFalseTest() throws Exception {
//
//        assertNotEquals(testCardFalseInfo.getActionName(), testCardTrueInfo.getActionName());
//    }

}
