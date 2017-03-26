package com.doug.repositories;

import com.doug.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Doug on 2/12/17.
 */
public interface LocationRepository extends JpaRepository<Location, Integer> {

	Location findOne(Integer id);

	List<Location> findAll();

	Location findByLocationName(String locationName);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);

}
