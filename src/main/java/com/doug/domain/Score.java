package com.doug.domain;

/**
 * Created by Doug on 12/20/16.
 */
public class Score {

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String masterCardName;
	private String answerCardName;
	private boolean score;

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

	public boolean isScore() {
		return score;
	}

	public void setScore(boolean score) {
		this.score = score;
	}
}
