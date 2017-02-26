package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/25/17.
 */
@Entity
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//	private PlaceTest placeTest;

	private Integer placeNumber;
	private String placeName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public Place(PlaceTest placeTest, Integer placeNumber, String placeName) {
////		this.placeTest = placeTest;
//		this.placeNumber = placeNumber;
//		this.placeName = placeName;
//	}

	public Integer getPlaceNumber() {
		return placeNumber;
	}

	public void setPlaceNumber(Integer placeNumber) {
		this.placeNumber = placeNumber;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Place(){}

	public Place(Integer placeNumber, String placeName){
		this.placeNumber=placeNumber;
		this.placeName=placeName;
	}
}
