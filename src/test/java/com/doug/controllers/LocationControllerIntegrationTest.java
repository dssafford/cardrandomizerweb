package com.doug.controllers;

import com.doug.services.LocationServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Doug on 2/26/17.
 */
@SpringBootTest
public class LocationControllerIntegrationTest {

	private LocationServiceImpl locationServiceImpl;
	private MockMvc mockMvc;

	@Autowired
	LocationController locationController;

	@Before
	public void setupMock() {
		initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(locationController)
				  .build();
	}


	@Test
	public void callDude() throws Exception {

		mockMvc
				  .perform(post("/dude")
							 .param("one", "1")
							 .param("two", "2")
							 .param("three", "wow"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("index"))
				  .andReturn();


	}

//	MvcResult response = mockMvc
//			  .perform(post("/some/super/secret/url") //
//						 .param("someparam1", "somevalue") //
//						 .param("someparam2", "somevalue") //
//						 .contentType(MediaType.APPLICATION_FORM_URLENCODED) //
//						 .accept(MediaType.APPLICATION_JSON)) //
//			  .andExpect(status().isOk()) //
//			  .andReturn();
//
//	@Test
//	public void trythis() throws Exception {
////		@RequestMapping(value = "/singleLocationTest", method = RequestMethod.POST)
////		public String scoreSingleCardTest(HttpSession session, Location location, Model model) {
//
//
//		MockHttpSession mockHttpSession = new MockHttpSession();
//
//
//		mockHttpSession.setAttribute("locationIndex", 23);
//
//		when(mockHttpSession.getAttribute("locationIndex")).thenReturn("12");
//
//		locationController.scoreSingleCardTestPOST(mockHttpSession, location, model);
//
//
//		when(locationRepository.findOne((Integer)mockHttpSession.getAttribute("locationIndex"))).thenReturn(new Location());
//
//
//
//		mockMvc
//				  .perform(post("/singleLocationTestPOST"))
////				  .param("HttpSession", mockHttpSession))
//				  .andExpect(status().isOk())
//				  .andExpect(view().name("index"))
//				 .andReturn();
//
//
//
//
//
//
//		}
}
