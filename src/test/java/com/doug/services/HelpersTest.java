package com.doug.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Doug on 12/19/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HelpersTest {

	@Test
	public void resolveAnswers() throws Exception {

		Assert.assertEquals("10_of_diamonds",Helpers.ResolveAnswers("1d"));

		Assert.assertEquals("ace_of_spades",Helpers.ResolveAnswers("as"));

		Assert.assertEquals("king_of_clubs",Helpers.ResolveAnswers("kc"));

		Assert.assertEquals("jack_of_hearts",Helpers.ResolveAnswers("jh"));
	}

}