package com.doug.services;

import com.doug.domain.CardInfo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by doug on 1/26/17.
 */

@SpringBootTest
public class ScoreServiceMockSimpleCardTest {

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
        testCardInfo = new CardInfo();
        testCardInfo.setCardName("ace_of_spades");
        testCardInfo.setPersonName("Dennis Rodman1");
        testCardInfo.setActionName("diving into");
        testCardInfo.setObjectName("cameraman");
    }

    @Test
    public void testMockCreation() {
        assertNotNull(cardInfo);
        assertNotNull(cardService);
        assertNotNull(masterDeckList);
    }


    @Test
    public void testGetCardInfoFromCardName() {
        when(cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList)).thenReturn(testCardInfo);
        assertNotEquals("ace", cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList).getCardName());
        assertEquals("ace_of_spades", cardService.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList).getCardName());


    }

//    @Test
//    public void testGetCardInfoFromCardNameTimes() {
//        Helpers.GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList);
//        verify(Helpers).GetCardInfoFromCardName(cardInfo.getCardName(), masterDeckList);
//    }
}
