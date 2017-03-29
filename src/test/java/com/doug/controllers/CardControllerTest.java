package com.doug.controllers;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;

/**
 * Created by Doug on 12/19/16.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
	public class CardControllerTest {

		private MockMvc mockMvc;

		@Test
	public void simple() {
			assertEquals("one", "one");
		}

//		private CardController cardController;
//
//		@Before
//		public void setup(){
//			cardController = new CardController();
//				  mockMvc = MockMvcBuilders.standaloneSetup(cardController).build();
//				  }

//		@Ignore
//		@Test
//		public void testlocationMasterListView() throws Exception{
//				  mockMvc.perform(get("/locationMasterList"))
//				  .andExpect(status().isOk())
//				  .andExpect(view().name("learning/locationMasterList"));
//		}
//
//
//
//		@Ignore
//		@Test
//		public void testStudyListView() throws Exception{
//			mockMvc.perform(get("/studyList"))
//					.andExpect(status().isOk())
//					.andExpect(view().name("learning/studyList"));
//		}

//		@Test
//		public void testMasterListView() throws Exception{
//			mockMvc.perform(get("/masterList"))
//					.andExpect(status().isOk())
//					.andExpect(view().name("masterList"));
//		}


}