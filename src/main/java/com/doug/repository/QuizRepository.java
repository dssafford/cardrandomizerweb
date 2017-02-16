package com.doug.repository;

import com.doug.domain.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/14/17.
 */
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
}
