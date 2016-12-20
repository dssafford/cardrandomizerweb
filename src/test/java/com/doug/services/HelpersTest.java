package com.doug.services;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Doug on 12/19/16.
 */
public class HelpersTest {
	@Test
	public void resolveAnswers() throws Exception {

		Assert.assertEquals("10_of_Diamonds",Helpers.ResolveAnswers("1d"));

		Assert.assertEquals("Ace_of_Spades",Helpers.ResolveAnswers("as"));

		Assert.assertEquals("King_of_Clubs",Helpers.ResolveAnswers("kc"));

		Assert.assertEquals("Jack_of_Hearts",Helpers.ResolveAnswers("jh"));
	}

}