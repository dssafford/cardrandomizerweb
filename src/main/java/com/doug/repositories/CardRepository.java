package com.doug.repositories;

import com.doug.domain.CardInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Doug on 2/12/17.
 */
public interface CardRepository extends JpaRepository<CardInfo, Integer> {

	List<CardInfo> findByCardNameLike(String cardName);

//	ArrayList<CardInfo> findAll(Integer id);

//	CardInfo findOne(Integer id);

//	List<Person> findByAgeGreaterThan(int age);
//
//	List<Person> findByAgeGreaterThanOrderByNameAsc(int age);
//
//	List<Person> findByAgeGreaterThanOrAgeLessThan(int over, int under);
}
