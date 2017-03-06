package com.doug.repositories;

import com.doug.domain.CardTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by doug on 3/5/17.
 */

@Repository
public interface CardScoreRepository extends JpaRepository<CardTest, Integer> {

	ArrayList<CardTest> findByTestId(Integer id);
}
