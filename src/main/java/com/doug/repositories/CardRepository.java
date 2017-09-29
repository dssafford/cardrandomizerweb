package com.doug.repositories;


import com.doug.domain.CardInfo;
import com.doug.domain.LocationQuiz;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CardRepository extends CrudRepository<CardInfo, Integer>{
    ArrayList<CardInfo> findAll();



//	ScoreList findOne(String id);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
