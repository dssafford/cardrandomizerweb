package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/25/17.
 */

@Entity
public class CardTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String questionCardName;
	private String questionCardObject;
	private String questionCardAction;
	private String answerCardName;
	private String answerPersonName;
	private String answerPersonAction;
	private String answerPersonObject;
	private Boolean answerPersonNameCorrect;
	private Boolean answerPersonActionCorrect;
	private Boolean answerPersonObjectCorrect;
	private Integer testId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getQuestionCardName() {
		return questionCardName;
	}

	public void setQuestionCardName(String questionCardName) {
		this.questionCardName = questionCardName;
	}

	public String getQuestionCardObject() {
		return questionCardObject;
	}

	public void setQuestionCardObject(String questionCardObject) {
		this.questionCardObject = questionCardObject;
	}

	public String getQuestionCardAction() {
		return questionCardAction;
	}

	public void setQuestionCardAction(String questionCardAction) {
		this.questionCardAction = questionCardAction;
	}

	public String getAnswerCardName() {
		return answerCardName;
	}

	public void setAnswerCardName(String answerCardName) {
		this.answerCardName = answerCardName;
	}



	public Integer getTestid() {
		return testId;
	}

	public void setTestid(Integer testid) {
		this.testId = testid;
	}

	public String getAnswerPersonName() {
		return answerPersonName;
	}

	public void setAnswerPersonName(String answerPersonName) {
		this.answerPersonName = answerPersonName;
	}

	public String getAnswerPersonAction() {
		return answerPersonAction;
	}

	public void setAnswerPersonAction(String answerPersonAction) {
		this.answerPersonAction = answerPersonAction;
	}

	public String getAnswerPersonObject() {
		return answerPersonObject;
	}

	public void setAnswerPersonObject(String answerPersonObject) {
		this.answerPersonObject = answerPersonObject;
	}

	public Boolean getAnswerPersonNameCorrect() {
		return answerPersonNameCorrect;
	}

	public void setAnswerPersonNameCorrect(Boolean answerPersonNameCorrect) {
		this.answerPersonNameCorrect = answerPersonNameCorrect;
	}

	public Boolean getAnswerPersonActionCorrect() {
		return answerPersonActionCorrect;
	}

	public void setAnswerPersonActionCorrect(Boolean answerPersonActionCorrect) {
		this.answerPersonActionCorrect = answerPersonActionCorrect;
	}

	public Boolean getAnswerPersonObjectCorrect() {
		return answerPersonObjectCorrect;
	}

	public void setAnswerPersonObjectCorrect(Boolean answerPersonObjectCorrect) {
		this.answerPersonObjectCorrect = answerPersonObjectCorrect;
	}

	public CardTest() {
	}

	public CardTest(String answerPersonName, String answerPersonAction, String answerPersonObject) {
		this.answerPersonName = answerPersonName;
		this.answerPersonAction = answerPersonAction;
		this.answerPersonObject = answerPersonObject;
	}

	public CardTest(String answerPersonName, String answerPersonAction, String answerPersonObject, Boolean answerPersonNameCorrect,
						 Boolean answerPersonActionCorrect, Boolean answerPersonObjectCorrect, Integer testid) {
		this.answerPersonName = answerPersonName;
		this.answerPersonAction = answerPersonAction;
		this.answerPersonObject = answerPersonObject;
		this.answerPersonNameCorrect=answerPersonNameCorrect;
		this.answerPersonActionCorrect=answerPersonActionCorrect;
		this.answerPersonObjectCorrect=answerPersonObjectCorrect;
		this.testId=testid;

	}
}
