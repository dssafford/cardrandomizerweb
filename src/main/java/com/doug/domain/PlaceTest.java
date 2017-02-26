package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/25/17.
 */
@Entity
public class PlaceTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@ManyToOne
//	@JoinColumn(name = "place_id")
//	private Place place;

//	@OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//	private Place place;

	private Integer placeId;
	private Integer placeNumber;
	private String placeName;
	private String answerPlaceName;
	private Boolean answerIsCorrect;
	private Integer testId;

	public Integer getPlaceId() {
		return placeId;
	}

	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getAnswerPlaceName() {
		return answerPlaceName;
	}

	public void setAnswerPlaceName(String answerPlaceName) {
		this.answerPlaceName = answerPlaceName;
	}

	public Boolean getAnswerIsCorrect() {
		return answerIsCorrect;
	}

	public void setAnswerIsCorrect(Boolean answerIsCorrect) {
		this.answerIsCorrect = answerIsCorrect;
	}

	public Integer getTestNumber() {
		return testId;
	}

	public void setTestNumber(Integer testId) {
		this.testId = testId;
	}

	public PlaceTest(){}

	public PlaceTest(Integer placeId, Integer placeNumber, String placeName, String answerPlaceName,
						  Boolean answerIsCorrect, Integer testId){
		this.placeNumber=placeNumber;
		this.placeName=placeName;
		this.answerPlaceName=answerPlaceName;
		this.answerIsCorrect=answerIsCorrect;
		this.testId=testId;
	}
	public PlaceTest(Integer placeNumber, String placeName){
		this.placeNumber=placeNumber;
		this.placeName=placeName;
	}



}
