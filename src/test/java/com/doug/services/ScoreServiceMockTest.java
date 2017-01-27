package com.doug.services;

import com.doug.domain.CardInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by doug on 1/26/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ScoreServiceMockTest {

    @Mock
    private CardService cardService;
    @Mock
    private CardInfo cardInfo;

    @Mock
    private ArrayList<CardInfo> masterDeckList;

    private CardInfo testCardInfo;

    @Before
    public void setupMock() {
//        cardInfo = new CardInfo("ace_of_spades", "odd people", "sportsmen",
//                "spades", "Dennis Rodman", "diving into", "cameraman");

        MockitoAnnotations.initMocks(this);
//
//
//        masterDeckList = cardService.createCardLearningMasterList();
//
        testCardInfo = new CardInfo();
        testCardInfo.setCardName("ace_of_spades");
        testCardInfo.setPersonName("Dennis Rodman");
        testCardInfo.setactionName("diving into");
        testCardInfo.setobjectName("cameraman");


    }

    @Test
    public void testMockCreation() {
        assertNotNull(cardInfo);
        assertNotNull(cardService);
    }


    @Test
    public void testGetCardInfoFromCardName() {
        when(cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList )).thenReturn(testCardInfo);
        assertNotEquals("ace", cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList).getCardName());
        assertEquals("ace_of_spades", cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList).getCardName());


    }

}
