package com.doug.controllers;

import com.doug.controllers.CardController;
import org.junit.Ignore;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by Doug on 12/19/16.
 */

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

	public class CardControllerTest {

		private MockMvc mockMvc;

		private CardController cardController;

		@Before
		public void setup(){
			cardController = new CardController();
				  mockMvc = MockMvcBuilders.standaloneSetup(cardController).build();
				  }
		@Ignore
		@Test
		public void testIndex() throws Exception{
				  mockMvc.perform(get("/"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("index"));
				  }
}