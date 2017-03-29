package com.doug.controllers;

/**
 * Created by Doug on 9/4/16.
 */

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class MockCardControllerCreationTest {

	@Test
	public void simple() {
		assertEquals("one", "one");
	}

//	@Autowired
//	private CardController realController;
//
//	private CardController cardController;
//
//	private Card card;
//
//
//	@Before
//	public void setupMock() {
//		card = mock(Card.class);
//		cardController = mock(CardController.class);
//		realController = new CardController();
//
//	}
//	@Test
//	public void testMockCreation(){
//		assertNotNull(card);
//		assertNotNull(cardController);
//	}

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
