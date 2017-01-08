package com.doug.repository;

import com.doug.domain.Score;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Doug on 9/10/16.
 */
public interface ScoreRepository extends MongoRepository<Score, String> {
//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
