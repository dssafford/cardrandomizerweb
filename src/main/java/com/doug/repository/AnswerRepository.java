package com.doug.repository;


import com.doug.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/14/17.
 */
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
