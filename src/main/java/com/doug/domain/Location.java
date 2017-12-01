package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/12/17.
 */

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer locationNumber;
	private String locationName;
	private String comments;
	private Integer isActive;

	public Integer getLocationNumber() {
		return locationNumber;
	}

	public void setLocationNumber(Integer locationNumber) {
		this.locationNumber = locationNumber;
	}

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "location_quiz", joinColumns = @JoinColumn(name = "location_id", referencedColumnName = "id"),
//			  inverseJoinColumns = @JoinColumn(name = "quiz_id", referencedColumnName = "id"))
//
//	private Set<Quiz> quizzes;

//	public Set<Quiz> getQuizzes() {
//		return quizzes;
//	}
//
//	public void setQuizzes(Set<Quiz> locationQuizs) {
//		this.quizzes = locationQuizs;
//	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Location(){}

	public Location(String locationName){
		this.locationName = locationName;
	}

	public Location(String locationName, Integer locationNumber){
		this.locationNumber = locationNumber;
		this.locationName = locationName;
	}

	public Location(Integer locationNumber, String locationName){
		this.locationNumber=locationNumber;
		this.locationName=locationName;
	}

//	public Location(String name, Set<Quiz> quizzes){
//		this.locationName = name;
//		this.quizzes = quizzes;
//	}

}
