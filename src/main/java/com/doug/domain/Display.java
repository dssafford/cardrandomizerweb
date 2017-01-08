package com.doug.domain;

/**
 * Created by Doug on 1/8/17.
 */
public class Display {

	private Integer id;
	private String masterCardName;
	private String answerCardName;
	private Boolean answerCorrect;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Boolean getAnswerCorrect() {
		return answerCorrect;
	}

	public void setAnswerCorrect(Boolean answerCorrect) {
		this.answerCorrect = answerCorrect;
	}

	public Display() {};

	public Display(Integer id, String masterCardName, String answerCardName, Boolean answerCorrect) {
		this.id = id;
		this.masterCardName = masterCardName;
		this.answerCardName = answerCardName;
		this.answerCorrect = answerCorrect;
	}
}
