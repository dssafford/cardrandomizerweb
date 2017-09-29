package com.doug.repositories;

import com.doug.domain.ComplexCardQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by doug on 3/5/17.
 */
@Repository
public interface ComplexCardQuizRepository extends CrudRepository<ComplexCardQuiz, Integer> {
}
