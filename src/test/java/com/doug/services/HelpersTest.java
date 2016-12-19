package com.doug.services;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Doug on 12/19/16.
 */
public class HelpersTest {
	@Test
	public void resolveAnswers() throws Exception {
		Helpers helpers = new Helpers();

		Assert.assertEquals("10_of_Diamonds",helpers.ResolveAnswers("1d"));

		Assert.assertEquals("Ace_of_Spades",helpers.ResolveAnswers("as"));

		Assert.assertEquals("King_of_Clubs",helpers.ResolveAnswers("kc"));

		Assert.assertEquals("Jack_of_Hearts",helpers.ResolveAnswers("jh"));
	}

}