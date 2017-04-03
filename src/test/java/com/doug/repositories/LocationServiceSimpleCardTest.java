package com.doug.repositories;

import com.doug.domain.Location;
import com.doug.services.LocationServiceImpl;
import org.springframework.ui.Model;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by doug on 3/13/17.
 */
public class LocationServiceSimpleCardTest {

//	@Autowired
//	LocationService locationServiceImpl;

//
//	@Autowired
//	LocationRepository locationRepository;

	@Mock
	Model model;

	@Mock
	LocationRepository locationRepository;

	@InjectMocks
	private LocationServiceImpl locationService;

	@Before
	public void setUp() {
		initMocks(this);

//		locationServiceImpl = new LocationServiceImpl();

	}

	@Test
	public void CreatePartialLocationListTest() {
		int limit = 8;

		List<Location> locationList = new ArrayList<>();

		locationList.add(new Location("one"));
		locationList.add(new Location("two"));
		locationList.add(new Location("three"));
		locationList.add(new Location("four"));
		locationList.add(new Location("five"));
		locationList.add(new Location("six"));
		locationList.add(new Location("seven"));
		locationList.add(new Location("eight"));
		locationList.add(new Location("nine"));
		locationList.add(new Location("ten"));

		List<Location> testLocationList = new ArrayList<>();


		for (int i = 0; i < limit; i++) {
			testLocationList.add(locationList.get(i));
		}
		Collections.shuffle(testLocationList);
		for (int i = 0; i < testLocationList.size(); i++) {
			System.out.println("Hey, here is your list - " + testLocationList.get(i).getLocationNumber() + " - " + testLocationList.get(i).getLocationName());
		}

		assertEquals(testLocationList.size(), limit);
	}

	@Test
	public void locationRepository_findOne_test() throws Exception {

		when(locationRepository.findOne(1)).thenReturn(new Location());

		locationService.getLocationById(1);

		Mockito.verify(locationRepository,atLeastOnce()).findOne(1);

	}

	@Test
	public void locationRepository_findAll_test() throws Exception {

		when(locationRepository.findAll()).thenReturn(Collections.emptyList());

		locationService.listAllLocations();

		Mockito.verify(locationRepository, atLeastOnce()).findAll();
	}

}
