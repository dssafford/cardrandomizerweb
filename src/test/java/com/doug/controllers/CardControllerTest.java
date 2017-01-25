package com.doug.controllers;


import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
	public class CardControllerTest {

		private MockMvc mockMvc;

//		private CardController cardController;
//
//		@Before
//		public void setup(){
//			cardController = new CardController();
//				  mockMvc = MockMvcBuilders.standaloneSetup(cardController).build();
//				  }
		@Test
		public void testlocationMasterListView() throws Exception{
				  mockMvc.perform(get("/locationMasterList"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("learning/locationMasterList"));
		}

		@Test
		public void testStudyListView() throws Exception{
			mockMvc.perform(get("/studyList"))
					.andExpect(status().isOk())
					.andExpect(view().name("learning/studyList"));
		}

//		@Test
//		public void testMasterListView() throws Exception{
//			mockMvc.perform(get("/masterList"))
//					.andExpect(status().isOk())
//					.andExpect(view().name("masterList"));
//		}


}