package com.doug.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

/**
 * Created by Doug on 12/19/16.
 */

@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
	public class CardControllerSimpleCardTest {

		private MockMvc mockMvc;

		@Test
		public void simple() {
			assertEquals("one", "one");
		}

		private DougController cardController;

		@Before
		public void setup(){
			cardController = new DougController();
				  mockMvc = MockMvcBuilders.standaloneSetup(cardController).build();
				  }


		@Test
		public void testStudyListView() throws Exception{
			mockMvc.perform(MockMvcRequestBuilders.get("/studyList"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.view().name("learning/studyList"));
		}

		@Test
		public void testMasterListView() throws Exception{
			mockMvc.perform(MockMvcRequestBuilders.get("/masterCardList"))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.view().name("learning/masterCardList"));
		}
		@Test
		public void testLocationMasterListView() throws Exception{
			mockMvc.perform(MockMvcRequestBuilders.get("/locationMasterCardList"))
				  .andExpect(MockMvcResultMatchers.status().isOk())
				  .andExpect(MockMvcResultMatchers.view().name("learning/locationMasterCardList"));
	}

}