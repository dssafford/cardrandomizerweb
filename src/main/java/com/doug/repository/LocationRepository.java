package com.doug.repository;

import com.doug.domain.Location;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Doug on 2/12/17.
 */
public interface LocationRepository extends CrudRepository<Location, Integer> {

	Location findOne(Integer id);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
