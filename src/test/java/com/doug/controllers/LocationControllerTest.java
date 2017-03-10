package com.doug.controllers;

import com.doug.domain.Location;
import com.doug.repositories.ExamRepository;
import com.doug.repositories.LocationRepository;
import com.doug.repositories.LocationTestRepository;
import com.doug.services.LocationServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by Doug on 2/26/17.
 */

@SpringBootTest
public class LocationControllerTest {

//	@Mock
//	private LocationRepository locationRepository;

//	LocationRepository locationRepository;

	@Mock
	LocationRepository locationRepository;

	@Mock
	private Location location;

	@Mock
	private ArrayList<Location> locations;


	private LocationServiceImpl locationServiceImpl;

//	@Mock

	@Autowired
	ExamRepository examRepository;

	@Autowired
	LocationTestRepository locationTestRepository;

	private LocationController locationController;

	private MockMvc mockMvc;


	@Before
	public void setupMock(){
		MockitoAnnotations.initMocks(this);

		locationController = new LocationController();

	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/templates");

	mockMvc = MockMvcBuilders.standaloneSetup(locationController)
			  .setViewResolvers(viewResolver)
				  .build();

		locationServiceImpl = new LocationServiceImpl();
		locationServiceImpl.setLocationRepository(locationRepository);


	}

//	@Test
//	public void CreateRandomLocationPartialList() {
//
//		Integer limit = 15;
//
////		when(locationRepository.findAll()).thenReturn(locations);
////		ArrayList<Location> retrievedLocations = (ArrayList<Location>)locationServiceImpl.listAllLocations();
////		assertThat(retrievedLocations, is(equalTo(locations)));
//
////		List<Location> testLocationList = new ArrayList<>();
//
////		List<Location> locationList = locationRepository.findAll();
//		//test data
//
//		Exam exam = new Exam(new BigDecimal(92.5),Helpers.getTimeStamp(), "location",  "my comments here", true);
//
////		LocationTest(Integer id, Integer locationNumber, String locationName, String answerPlaceName,
////				  Boolean answerIsCorrect, Integer testId)
//		//save new entry in Test table
//		Object myObj = examRepository.save(exam);
//
//		ArrayList<LocationTest> locationTests = new ArrayList<>();
//		LocationTest locationTest = new LocationTest();
//		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, 1));
//		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, 1));
//		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, 1));
//		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, 1));
//		locationTests.add(new LocationTest(1,"mailbox", "driveway", false, 1));
//
//		//then save in LocationTest
//		locationTestRepository.save(locationTests);
//
//
//		for (int i = 0; i < limit; i++) {
//			testLocationList.add(locationList.get(i));
//		}
//		Collections.shuffle(testLocationList);
//		for (int i = 0; i < testLocationList.size(); i++) {
//			System.out.println("Hey, here is your list - " + testLocationList.get(i).getLocationNumber() + " - " + testLocationList.get(i).getLocationName());
//		}
//	}


	@Test
	public void mockLocationRepository() throws Exception{
		when(locationRepository.findOne(1)).thenReturn(location);
		Location retrievedLocation = locationServiceImpl.getLocationById(1);
		assertThat(retrievedLocation, is(equalTo(location)));
	}

	@Test
	public void findAllLocationsTest() throws Exception{
		when(locationRepository.findAll()).thenReturn(locations);
		ArrayList<Location> retrievedLocations = (ArrayList<Location>)locationServiceImpl.listAllLocations();
		assertThat(retrievedLocations, is(equalTo(locations)));
	}

	@Test
	public void testIndex() throws Exception{
		mockMvc.perform(get("/doug"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("doug"));
	}

	@Test
	public void testDude() throws Exception{
		mockMvc.perform(get("/dude"))
				  .andExpect(status().isOk())
				  .andExpect(view().name("dude"));
	}

	@Test
	public void testLoadingSingleLocationTestStart() throws Exception{
		mockMvc.perform(get("/singleLocationTestStart"))
				  .andExpect(status().is3xxRedirection())
//				  .andExpect(model().attributeExists("randomLocationList"))
//				  .andExpect(model().attributeExists("scoreSoFar"))
				  .andExpect(model().attributeExists("score"))
				  .andExpect(view().name("redirect:/singleLocationTest"));
	}

	@Test
	public void testLoadingSingleLocationTest() throws Exception{
		mockMvc.perform(get("/singleLocationTest"))
				  .andExpect(status().isOk())
				  .andExpect(model().attributeExists("locationIndex"))
				  .andExpect(model().attributeExists("locationInfo"))
				  .andExpect(model().attributeExists("score"))
				  .andExpect(view().name("answer/enterLocationAnswerSingle"));
	}


	@Test
	public void testLoadingSingleLocationTestPost() throws Exception{
		mockMvc.perform(post("/singleLocationTest"))
				  .andExpect(status().is3xxRedirection())
				  .andExpect(model().attributeExists("locationIndex"))
				  .andExpect(model().attributeExists("locationInfo"))
				  .andExpect(model().attributeExists("score"))
				  .andExpect(view().name("redirect:/singleLocationTest"));
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
		for(int i=1; i<21; i++){
			obj.add(i);
		}
		Collections.shuffle(obj);
		System.out.println("Hey, here is your list" + obj);

	}

	@Test
	public void CreateRandomLocationList() throws Exception {


		Location place = new Location(1, "mailbox");
		Location place1 = new Location(2, "driveway");
		Location place2 = new Location(3 , "garage");
		Location place3 = new Location(4, "sidewalk");
		Location place4 = new Location(5, "well");

		ArrayList<Location> obj = new ArrayList<Location>();
		obj.add(place);
		obj.add(place1);
		obj.add(place2);
		obj.add(place3);
		obj.add(place4);

		Collections.shuffle(obj);
		for(int i=1; i<obj.size(); i++){
			System.out.println("Hey, here is your list - " + obj.get(i).getLocationName());
		}
		//System.out.println("Hey, here is your list" + obj);

	}

	@Test
	public void CreateRandomLocationFullList() {

		List<Location> locationList = locationRepository.findAll();
		Collections.shuffle(locationList);
		for(int i=1; i<locationList.size(); i++){
			System.out.println("Hey, here is your list - " + locationList.get(i).getLocationNumber() + " - " + locationList.get(i).getLocationName());
		}

	}

//	@Test
//	public void SaveLocationScoresTest() throws Exception{
//
//		Timestamp ts = Helpers.getTimeStamp();
//
//		//test data
//		Exam exam = new Exam(new BigDecimal(92.5), ts, "location", "my comments here", true);
//
//		//save new entry in Test table
//		Object myObj = examRepository.save(exam);
//
//		Assert.assertNotNull(myObj);
//		assert(((Exam)myObj).getId()>0);
//
//		System.out.println("new ID = " + ((Exam)myObj).getId());
//
//		ArrayList<LocationTest> locationTests = new ArrayList<>();
//		LocationTest locationTest = new LocationTest();
//		locationTests.add(new LocationTest(1,"mailbox", "mailbox", true, 1));
//		locationTests.add(new LocationTest(2,"driveway", "driveway", true, 1));
//		locationTests.add(new LocationTest(3,"garage", "garage", true, 1));
//		locationTests.add(new LocationTest(4,"sidewalk", "porch", false, 1));
//		locationTests.add(new LocationTest(5,"well", "well", true, 1));
//
//		//then save in LocationTest
//		locationTestRepository.save(locationTests);
//
////		Assert.assertEquals(4, );
//
////		return "index";
//
//
//	}

	@Test
	public void locationControllerTestStart() throws Exception {

//		singleLocationTestStart


	}


}
