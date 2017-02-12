package com.doug.domain;

import javax.persistence.Id;

/**
 * Created by Doug on 12/20/16.
 */
public class Test {

	@Id
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String masterCardName;
	private String answerCardName;
	private boolean correct;

	public Test(String masterCardName, String answerCardName, boolean correct) {
		this.masterCardName = masterCardName;
		this.answerCardName = answerCardName;
		this.correct = correct;
	}

	public Test(){};

	public String getMasterCardName() {
		return masterCardName;
	}

	public void setMasterCardName(String masterCardName) {
		this.masterCardName = masterCardName;
	}

	public String getAnswerCardName() {
		return answerCardName;
	}

	public void setAnswerCardName(String answerCardName) {
		this.answerCardName = answerCardName;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
}
