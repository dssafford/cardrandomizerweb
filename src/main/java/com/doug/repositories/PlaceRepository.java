package com.doug.repositories;

import com.doug.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/25/17.
 */
public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
