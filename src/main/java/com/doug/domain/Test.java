package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Doug on 12/20/16.
 */

@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String testType;
	private String comments;
	private BigDecimal finalScore;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String masterCardName;
	private String answerCardName;
	private boolean correct;

	public Test(String testType, BigDecimal finalScore, String comments){
		this.testType=testType;
		this.finalScore=finalScore;
		this.comments=comments;
	}

	public String getTestType() {
		return testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(BigDecimal finalScore) {
		this.finalScore = finalScore;
	}

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
