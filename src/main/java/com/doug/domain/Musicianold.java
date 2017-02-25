package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Doug on 2/18/17.
 */
@Entity
public class Musicianold {

	@Id
	@GeneratedValue
	private Integer id;

	protected String firstName;

	protected String lastName;

	protected String bio;

	protected Date dateOfBirth;

	protected Integer age;

	private String preferredInstrument;

	public Musicianold(){}

	public Musicianold(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPreferredInstrument() {
		return preferredInstrument;
	}

	public void setPreferredInstrument(String preferredInstrument) {
		this.preferredInstrument = preferredInstrument;
	}
}
