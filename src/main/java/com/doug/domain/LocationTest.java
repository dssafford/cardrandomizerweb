package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/25/17.
 */
@Entity
public class LocationTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;


	private Integer locationNumber;
	private String locationName;
	private String answerPlaceName;
	private Boolean answerIsCorrect;
	private Integer testId;

	public Integer getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(Integer locationNumber) {
		this.locationNumber = locationNumber;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlaceNumber() {
		return locationNumber;
	}

	public void setPlaceNumber(Integer locationNumber) {
		this.locationNumber = locationNumber;
	}

	public String getPlaceName() {
		return locationName;
	}

	public void setPlaceName(String locationName) {
		this.locationName = locationName;
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

	public LocationTest(){}
	public LocationTest(Integer locationNumber, String locationName, String answerPlaceName,
							  Boolean answerIsCorrect){
		this.locationNumber=locationNumber;
		this.locationName=locationName;
		this.answerPlaceName=answerPlaceName;
		this.answerIsCorrect=answerIsCorrect;

	}
	public LocationTest(Integer id, Integer locationNumber, String locationName, String answerPlaceName,
						  Boolean answerIsCorrect, Integer testId){
		this.locationNumber=locationNumber;
		this.locationName=locationName;
		this.answerPlaceName=answerPlaceName;
		this.answerIsCorrect=answerIsCorrect;
		this.testId=testId;
	}
	public LocationTest(Integer locationNumber, String locationName){
		this.locationNumber=locationNumber;
		this.locationName=locationName;
	}



}
