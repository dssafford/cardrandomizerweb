package com.doug.repositories;


import com.doug.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Doug on 2/14/17.
 */
public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	List<Answer> findById(Integer id);

//	ArrayList<Answer> findAll(Iterable<ID> var1);
//
//	ArrayList<Answer> findAll();
}
