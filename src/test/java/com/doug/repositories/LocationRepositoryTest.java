package com.doug.repositories;

import com.doug.domain.Location;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by doug on 3/13/17.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LocationRepositoryTest {

	@Autowired
	LocationRepository locationRepository;

	@Test
	public void getAllLocations_test() {


		List<Location> locationList = (List<Location>)locationRepository.findAll();

		assertEquals(52, locationList.size());
	}

	@Test
	public void getOneLocation_test() {


		Location location = locationRepository.findOne(1);
		assertEquals("mailbox", location.getLocationName());
	}

}
