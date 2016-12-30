package com.doug.controllers;

/**
 * Created by Doug on 9/4/16.
 */

import com.doug.domain.Card;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockCardControllerCreationTest {

	@Autowired
	private CardController realController;

	private CardController cardController;

	private Card card;


	@Before
	public void setupMock() {
		card = mock(Card.class);
		cardController = mock(CardController.class);
		realController = new CardController();

	}
	@Test
	public void testMockCreation(){
		assertNotNull(card);
		assertNotNull(cardController);
	}

//	@Test
//	public void testMakeCard() throws Exception {
//		String dude =  realController.makeCardString("shit");
//
//		when(cardController.makeCardString("dude")).thenReturn("fuck");
//
//		assertEquals("fuck", cardController.makeCardString("dude"));
//
//	}
}
