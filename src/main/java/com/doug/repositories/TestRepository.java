package com.doug.repositories;

import com.doug.domain.SimpleCardTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/25/17.
 */
public interface TestRepository extends JpaRepository<SimpleCardTest, Integer> {




}
