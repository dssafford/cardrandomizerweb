package com.doug.controllers;

import com.doug.domain.LocationTest;
import com.doug.repositories.LocationRepository;
import com.doug.repositories.LocationTestRepository;
import com.doug.repositories.TestRepository;
import com.doug.services.LocationServiceImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by Doug on 2/26/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LocationControllerIntegrationSimpleCardTest {

	private LocationServiceImpl locationServiceImpl;
	private MockMvc mockMvc;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	LocationTestRepository locationTestRepository;

	@Autowired
	TestRepository testRepository;


	@Autowired
	LocationController locationController;

	@Before
	public void setupMock() {
		initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(locationController)
				  .build();
	}

	private void loadLocationTests(){

//		loadTest1();
//		loadTest2();

		List<LocationTest> mylist = locationTestRepository.findByTest(1);
		List<LocationTest> mylist1 = locationTestRepository.findByTest(2);
		String dude = "hey";


	}

//	private void loadTest1() {
//		SimpleCardTest simpleCardTest = new SimpleCardTest("Location", new BigDecimal(89.0), "comments here");
//
//		Location place = new Location(1, "mailbox");
//		Location place1 = new Location(2, "driveway");
//		Location place2 = new Location(3 , "garage");
//		Location place3 = new Location(4, "sidewalk");
//		Location place4 = new Location(5, "well");
//
//		LocationTest placeTest = new LocationTest(1,1, "mailbox", "driveway", false, 1);
//		LocationTest placeTest1 = new LocationTest(2,5, "well", "well", true, 1);
//		LocationTest placeTest2 = new LocationTest(3,2, "driveway", "driveway", true, 1);
//		locationRepository.save(place);
//		locationRepository.save(place1);
//		locationRepository.save(place2);
//		locationRepository.save(place3);
//		locationRepository.save(place4);
//
//		locationTestRepository.save(placeTest);
//		locationTestRepository.save(placeTest1);
//		locationTestRepository.save(placeTest2);
//
//
//		testRepository.save(simpleCardTest);
//	}

//	private void loadTest2() {
//		SimpleCardTest simpleCardTest = new SimpleCardTest("Location", new BigDecimal(89.0), "comments here");
//
//		Location place = new Location(1, "mailbox");
//		Location place1 = new Location(2, "driveway");
//		Location place2 = new Location(3, "garage");
//		Location place3 = new Location(4, "sidewalk");
//		Location place4 = new Location(5, "well");
//
//		LocationTest placeTest = new LocationTest(1, 1, "mailbox", "driveway", false, 2);
//		LocationTest placeTest1 = new LocationTest(2, 5, "well", "well", true, 2);
//		LocationTest placeTest2 = new LocationTest(3, 2, "driveway", "driveway", true, 2);
//		LocationTest placeTest3 = new LocationTest(4, 10, "door", "camera", false, 2);
//		LocationTest placeTest4 = new LocationTest(5, 6, "porch", "porch", true, 2);
//		LocationTest placeTest5 = new LocationTest(6, 9, "storm door", "porch", false, 2);
//		LocationTest placeTest6 = new LocationTest(7, 8, "camera", "camera", true, 2);
//
//		locationRepository.save(place);
//		locationRepository.save(place1);
//		locationRepository.save(place2);
//		locationRepository.save(place3);
//		locationRepository.save(place4);
//
//		locationTestRepository.save(placeTest);
//		locationTestRepository.save(placeTest1);
//		locationTestRepository.save(placeTest2);
//		locationTestRepository.save(placeTest3);
//		locationTestRepository.save(placeTest4);
//		locationTestRepository.save(placeTest5);
//		locationTestRepository.save(placeTest6);
//
//		testRepository.save(simpleCardTest);
//	}


//	MvcResult response = mockMvc
//			  .perform(post("/some/super/secret/url") //
//						 .param("someparam1", "somevalue") //
//						 .param("someparam2", "somevalue") //
//						 .contentType(MediaType.APPLICATION_FORM_URLENCODED) //
//						 .accept(MediaType.APPLICATION_JSON)) //
//			  .andExpect(status().isOk()) //
//			  .andReturn();
//
//	@SimpleCardTest
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
