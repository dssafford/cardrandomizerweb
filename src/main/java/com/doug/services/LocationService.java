package com.doug.services;

import com.doug.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

/**
 * Created by Doug on 2/12/17.
 */

public interface LocationService  {

	Iterable<Location> listAllLocations();

	Location getLocationById(Integer id);

	Location saveOrUpdateLocation(Location location);

	void deleteLocation(Integer id);

	Page<Location> listAllByPage(@PageableDefault(size = 10) Pageable pageable, String sortColumn, String sortDirection);

	Page<Location> listAllByPage(@PageableDefault(size = 10) Pageable pageable);

//    Iterable<Journal> findByProjectLike(String projectName);

}
