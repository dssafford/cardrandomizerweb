package com.doug.repositories;

import com.doug.domain.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 * Created by doug on 3/3/17.
 */
public interface ExamRepository extends CrudRepository<Exam, Integer> {

	ArrayList<Exam> findByTesttype(String testType);

}
