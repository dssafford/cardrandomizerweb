package com.doug.services;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Doug on 12/19/16.
 */
public class HelpersTest {

	@Test
	public void resolveAnswers() throws Exception {

		Assert.assertEquals("10_of_diamonds",Helpers.ResolveAnswers("1d"));

		Assert.assertEquals("ace_of_spades",Helpers.ResolveAnswers("as"));

		Assert.assertEquals("king_of_clubs",Helpers.ResolveAnswers("kc"));

		Assert.assertEquals("jack_of_hearts",Helpers.ResolveAnswers("jh"));
	}

}