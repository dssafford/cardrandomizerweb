package com.doug.repositories;

import com.doug.domain.PlaceTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Doug on 2/25/17.
 */
@Repository
public interface PlaceTestRepository extends JpaRepository<PlaceTest, Integer> {

	@Query(value = "Select * "
		+ "FROM PLACE_TEST pt, TEST t WHERE "
		+ " pt.TEST_ID = t.ID "
		+ " AND t.ID = :id", nativeQuery = true)
	public List<PlaceTest> findByTest(@Param("id") Integer testId);
}
