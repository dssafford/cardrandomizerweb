package com.doug.repositories;

import com.doug.domain.ComplexCardTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by doug on 3/5/17.
 */
@Repository
public interface ComplexCardTestRepository extends JpaRepository<ComplexCardTest, Integer> {
}
