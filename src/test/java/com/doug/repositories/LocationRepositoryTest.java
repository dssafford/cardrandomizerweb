package com.doug.repositories;

import com.doug.domain.Location;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by doug on 3/13/17.
 */
@DataJpaTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LocationRepositoryTest {

	@Autowired
	LocationRepository locationRepository;

	@Before
	public void setUp(){
//		TODO: add test profile and bootstrap data

//		private Integer id;
//
//		private Integer locationNumber;
//		private String locationName;
//		private String comments;
//		private Integer isActive;

		List<Location> locationList = new ArrayList<>();
		locationList.add(new Location("mailbox"));
		locationList.add(new Location("garage"));
		locationList.add(new Location("well"));
		locationList.add(new Location("porch"));
		locationRepository.save(locationList);

    }

	@Test
	public void verifyLocationListTest(){

		List<Location> mylist = locationRepository.findAll();

		assertEquals(4, mylist.size());

	}
	@Test
	public void getAllLocations_test() {


		List<Location> locationList = (List<Location>)locationRepository.findAll();

		assertEquals(4, locationList.size());
	}

	@Test
	public void getOneLocation_test() {

		Location location = locationRepository.findByLocationName("mailbox");
//		Location location = locationRepository.findOne(10);
		assertEquals("mailbox", location.getLocationName());
	}

}
