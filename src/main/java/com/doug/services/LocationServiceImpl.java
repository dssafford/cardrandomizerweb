package com.doug.services;

import com.doug.domain.Location;
import com.doug.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

/**
 * Created by Doug on 2/12/17.
 */

@Service
public class LocationServiceImpl implements LocationService {

	private LocationRepository locationRepository;

//	@Autowired
//	LocationRepository locationRepository;

	@Autowired
	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public Iterable<Location> listAllLocations() {

		return locationRepository.findAll();
	}

	@Override
	public Location getLocationById(Integer id) {


		return locationRepository.findOne(id);
	}

	@Override
	public Location saveOrUpdateLocation(Location location) {
		return null;
	}

	@Override
	public void deleteLocation(Integer id) {

	}

	@Override
	public Page<Location> listAllByPage(@PageableDefault(size = 10) Pageable pageable, String sortColumn, String sortDirection) {
		return null;
	}

	@Override
	public Page<Location> listAllByPage(@PageableDefault(size = 10) Pageable pageable) {
		return null;
	}
}
