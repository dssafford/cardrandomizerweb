package com.doug.repositories;

import com.doug.domain.LocationQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * Created by Doug on 9/10/16.
 */
public interface LocationScoreRepository extends JpaRepository<LocationQuiz, Integer> {

	ArrayList<LocationQuiz> findByTestId(Integer id);


//	ScoreList findOne(String id);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
