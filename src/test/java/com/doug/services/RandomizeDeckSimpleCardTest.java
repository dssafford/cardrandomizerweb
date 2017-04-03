package com.doug.services;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

/**
 * Created by doug on 3/21/17.
 */
public class RandomizeDeckSimpleCardTest {

	RandomizeDeck randomizeDeck;

	@Before
	public void setUp() {
		randomizeDeck = new RandomizeDeck();
	}

	@Test
	public void randomize() throws Exception {
		ArrayList myList = randomizeDeck.Randomize();
		assertNotNull(myList);
	}

}