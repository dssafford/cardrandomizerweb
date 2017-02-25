package com.doug.domain;

import javax.persistence.Id;

/**
 * Created by Doug on 12/20/16.
 */
public class TestLocation {

	@Id
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String masterLocationName;
	private String answerLocationName;
	private boolean correct;

	public TestLocation(String masterLocationName, String answerLocationName, boolean correct) {
		this.masterLocationName = masterLocationName;
		this.answerLocationName = answerLocationName;
		this.correct = correct;
	}

	public TestLocation(){};

	public String getMasterLocationName() {
		return masterLocationName;
	}

	public void setMasterLocationName(String masterLocationName) {
		this.masterLocationName = masterLocationName;
	}

	public String getAnswerLocationName() {
		return answerLocationName;
	}

	public void setAnswerLocationName(String answerLocationName) {
		this.answerLocationName = answerLocationName;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
}
