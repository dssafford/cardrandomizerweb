package com.doug.repositories;

import com.doug.domain.CDold;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/18/17.
 */
public interface CDRepository extends JpaRepository<CDold, Integer> {

}
