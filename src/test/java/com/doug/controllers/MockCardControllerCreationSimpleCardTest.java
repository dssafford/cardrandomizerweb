package com.doug.controllers;

/**
 * Created by Doug on 9/4/16.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MockCardControllerCreationSimpleCardTest {

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
//	@SimpleCardTest
//	public void testMockCreation(){
//		assertNotNull(card);
//		assertNotNull(cardController);
//	}

//	@SimpleCardTest
//	public void testMakeCard() throws Exception {
//		String dude =  realController.makeCardString("shit");
//
//		when(cardController.makeCardString("dude")).thenReturn("fuck");
//
//		assertEquals("fuck", cardController.makeCardString("dude"));
//
//	}
}
