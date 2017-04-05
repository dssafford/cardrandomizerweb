package com.doug.repositories;

import com.doug.domain.SimpleCardTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by doug on 3/5/17.
 */

@Repository
public interface CardScoreRepository extends JpaRepository<SimpleCardTest, Integer> {

	ArrayList<SimpleCardTest> findByExamId(Integer id);
}
