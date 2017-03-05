package com.doug.repositories;

import com.doug.domain.CardTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by doug on 3/5/17.
 */
public interface CardTestRepository extends JpaRepository<CardTest, Integer> {
}
