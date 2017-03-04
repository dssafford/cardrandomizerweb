package com.doug.repositories;

import com.doug.domain.LocationTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * Created by Doug on 9/10/16.
 */
public interface LocationScoreRepository extends JpaRepository<LocationTest, Integer> {

	ArrayList<LocationTest> findByTestId(Integer id);


//	ScoreList findOne(String id);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
