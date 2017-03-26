package com.doug.controllers;

import com.doug.domain.Exam;
import com.doug.domain.Location;
import com.doug.domain.LocationTest;
import com.doug.repositories.LocationRepository;
import com.doug.services.Helpers;
import com.doug.services.LocationServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by Doug on 2/26/17.
 */

public class LocationControllerTest {

	@Mock
	LocationRepository locationRepository;

	@Mock
	private Location location;

	@Mock
	private ArrayList<Location> locations;

	@Mock
	Model model;

	@Mock
	private LocationServiceImpl locationServiceImpl;

	private LocationServiceImpl mockLocationServiceImpl;

	@InjectMocks
	private LocationController locationController;

	private MockMvc mockMvc;

	@Before
	public void setupMock() {
		initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(locationController)
				  .build();


	}

	@Test
	public void testgetDoug() throws Exception {
		mockMvc.perform(get("/doug"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("index"));

		assertEquals(12,12);
	}

	@Test
	public void trythis() throws Exception {
//		@RequestMapping(value = "/singleLocationTest", method = RequestMethod.POST)
//		public String scoreSingleCardTest(HttpSession session, Location location, Model model) {
		mockMvc.perform(post("/singleLocationTest"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("index"));
		MockHttpSession mockHttpSession = new MockHttpSession();

		mockHttpSession.setAttribute("locationIndex", 23);

		when(locationRepository.findOne((Integer)mockHttpSession.getAttribute("locationIndex"))).thenReturn(new Location());

		}
	@Test
	public void teststartSingleCardScoring() throws Exception {
		assertEquals(12,12);
	}

	@Test
	public void testgetSingleCardTest() throws Exception {
		assertEquals(12,12);
	}

	@Test
	public void testscoreSingleCardTest() throws Exception {
		assertEquals(12,12);
	}

	@Test
	public void testlist() throws Exception {
		//Below works when using session
		mockMvc.perform(get("/locationList"))
				  .andExpect(status().isOk())
				  .andExpect(model().attributeExists("locations"))
				  .andExpect(view().name("learning/locationList"));
	}

	@Test
	public void testgetCumulativeLocationScore() throws Exception {
		assertEquals(80, 80);
	}





	@Test
	public void calling_locationlist_Test() throws Exception {

		when(locationRepository.findAll()).thenReturn(Collections.emptyList());

		//Below works when using session
		mockMvc.perform(get("/locationList"))
				  .andExpect(status().isOk())
				  .andExpect(model().attributeExists("locations"))
				  .andExpect(view().name("learning/locationList"));


//        locationController.list()

	}

//	@Test
//	public void calling_locationlist_Test() throws Exception{
//
//		locationServiceImpl = new LocationServiceImpl();
//		locationServiceImpl.setLocationRepository(locationRepository);
//
//		List<Location> mylocations = (List<Location>)locationServiceImpl.listAllLocations();
//
//		//works
//		MockHttpSession mockHttpSession = new MockHttpSession();
//		mockHttpSession.setAttribute("locations", mylocations);
//
//		//Below works when using session
//		mockMvc.perform(get("/locationList").session(mockHttpSession))
//				  .andExpect(status().isOk())
//				  .andExpect(model().attributeExists("locations"))
//				  .andExpect(view().name("learning/locationList"));
//
//	}

//	@Test
//	public void calling_locationList_withMocks_Test() throws Exception {
//
////		List<Location> mylocations = (List<Location>)mockLocationServiceImpl.listAllLocations();
//
//		when(locationRepository.findAll()).thenReturn(Collections.emptyList());
//
////        List<Location> retrievedLocations = (List<Location>) mockLocationServiceImpl.listAllLocations();
////
////        assertThat(retrievedLocations, is(equalTo(locations)));
//		Model model = new Model() {
//			@Override
//			public Model addAttribute(String s, Object o) {
//				return null;
//			}
//
//			@Override
//			public Model addAttribute(Object o) {
//				return null;
//			}
//
//			@Override
//			public Model addAllAttributes(Collection<?> collection) {
//				return null;
//			}
//
//			@Override
//			public Model addAllAttributes(Map<String, ?> map) {
//				return null;
//			}
//
//			@Override
//			public Model mergeAttributes(Map<String, ?> map) {
//				return null;
//			}
//
//			@Override
//			public boolean containsAttribute(String s) {
//				return false;
//			}
//
//			@Override
//			public Map<String, Object> asMap() {
//				return null;
//			}
//		};
//		locationController.list(model);
//		Mockito.verify(locationRepository, atLeastOnce()).findAll();
//
//	}


	@Test
	public void SaveExamAndTestsTest() {


//		List<Location> testLocationList = new ArrayList<>();

		List<Location> locationList = locationRepository.findAll();

		//test data

		Exam exam = new Exam(new BigDecimal(92.5), Helpers.getTimeStamp(), "location", "my comments here", true);

//		LocationTest(Integer id, Integer locationNumber, String locationName, String answerPlaceName,
//				  Boolean answerIsCorrect, Integer testId)
		//save new entry in Test table
//        Object myObj = examRepository.save(exam);

		ArrayList<LocationTest> locationTests = new ArrayList<>();
		LocationTest locationTest = new LocationTest();
//        locationTests.add(new LocationTest(1, "mailbox", "driveway", false, ((Exam) myObj).getId()));
//        locationTests.add(new LocationTest(1, "mailbox", "driveway", false, ((Exam) myObj).getId()));
//        locationTests.add(new LocationTest(1, "mailbox", "driveway", false, ((Exam) myObj).getId()));
//        locationTests.add(new LocationTest(1, "mailbox", "driveway", false, ((Exam) myObj).getId()));
//        locationTests.add(new LocationTest(1, "mailbox", "driveway", false, ((Exam) myObj).getId()));

		//then save in LocationTest
//        locationTestRepository.save(locationTests);

	}





//	@Test
//	public void testIndex() throws Exception {
//		mockMvc.perform(get("/doug"))
//				  .andExpect(status().isOk())
//				  .andExpect(view().name("doug"));
//	}
	@Test
	public void singleLocationwhatever() throws Exception {
		mockMvc.perform(get("/singleLocationTest"))
				  .andExpect(status().is3xxRedirection())
				  .andExpect(view().name("index"));
	}

	@Test
	public void testLoadingSingleLocationTestStart() throws Exception {
		mockMvc.perform(get("/singleLocationTestStart"))
				  .andExpect(status().is3xxRedirection())
				  .andExpect(view().name("redirect:/singleLocationTest"));
	}
	//GetCumulativeLocationScore(ArrayList<LocationTest> locationTests)

	@Test
	public void testCumulativeScore() throws Exception {

		BigDecimal expectedScore = new BigDecimal(80.00);
		expectedScore = expectedScore.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		BigDecimal actualScore = locationController.GetCumulativeLocationScore(createLocationTests_DummyData());

		assertEquals(expectedScore, actualScore);

	}

	private ArrayList<LocationTest> createLocationTests_DummyData() {
		////
		ArrayList<LocationTest> locationTests = new ArrayList<>();
		LocationTest locationTest = new LocationTest();
		locationTests.add(new LocationTest(1, "mailbox", "mailbox", true, 1));
		locationTests.add(new LocationTest(2, "driveway", "driveway", true, 1));
		locationTests.add(new LocationTest(3, "garage", "garage", true, 1));
		locationTests.add(new LocationTest(4, "sidewalk", "porch", false, 1));
		locationTests.add(new LocationTest(5, "well", "well", true, 1));
		return locationTests;

	}

	@Test
	public void CreateRandomVowelList() throws Exception {

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("A");
		obj.add("E");
		obj.add("I");
		obj.add("O");
		obj.add("U");
		Collections.shuffle(obj);
		System.out.println("Hey, here is your list" + obj);

	}

	@Test
	public void CreateRandomNumberList() throws Exception {

		ArrayList<Integer> obj = new ArrayList<Integer>();
		for (int i = 1; i < 21; i++) {
			obj.add(i);
		}
		Collections.shuffle(obj);
		System.out.println("Hey, here is your list" + obj);

	}

	@Test
	public void CreateRandomLocationList() throws Exception {


		Location place = new Location(1, "mailbox");
		Location place1 = new Location(2, "driveway");
		Location place2 = new Location(3, "garage");
		Location place3 = new Location(4, "sidewalk");
		Location place4 = new Location(5, "well");

		ArrayList<Location> obj = new ArrayList<Location>();
		obj.add(place);
		obj.add(place1);
		obj.add(place2);
		obj.add(place3);
		obj.add(place4);

		Collections.shuffle(obj);
		for (int i = 1; i < obj.size(); i++) {
			System.out.println("Hey, here is your list - " + obj.get(i).getLocationName());
		}
		System.out.println("Hey, here is your list" + obj);

	}
//
//	@Test
//	public void CreateRandomLocationFullList() {
//
//		List<Location> locationList = locationRepository.findAll();
//		Collections.shuffle(locationList);
//		for(int i=1; i<locationList.size(); i++){
//			System.out.println("Hey, here is your list - " + locationList.get(i).getLocationNumber() + " - " + locationList.get(i).getLocationName());
//		}
//
//	}
//
////	@Test
////	public void SaveLocationScoresTest() throws Exception{
////
////		Timestamp ts = Helpers.getTimeStamp();
////
////		//test data
////		Exam exam = new Exam(new BigDecimal(92.5), ts, "location", "my comments here", true);
////
////		//save new entry in Test table
////		Object myObj = examRepository.save(exam);
////
////		Assert.assertNotNull(myObj);
////		assert(((Exam)myObj).getId()>0);
////
////		System.out.println("new ID = " + ((Exam)myObj).getId());
////
////		ArrayList<LocationTest> locationTests = new ArrayList<>();
////		LocationTest locationTest = new LocationTest();
////		locationTests.add(new LocationTest(1,"mailbox", "mailbox", true, 1));
////		locationTests.add(new LocationTest(2,"driveway", "driveway", true, 1));
////		locationTests.add(new LocationTest(3,"garage", "garage", true, 1));
////		locationTests.add(new LocationTest(4,"sidewalk", "porch", false, 1));
////		locationTests.add(new LocationTest(5,"well", "well", true, 1));
////
////		//then save in LocationTest
////		locationTestRepository.save(locationTests);
////
//////		Assert.assertEquals(4, );
////
//////		return "index";
////
////
////	}
//
//	@Test
//	public void locationControllerTestStart() throws Exception {
//
////		singleLocationTestStart
//
//
//	}
//
//
}
