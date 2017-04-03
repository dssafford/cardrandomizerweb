package com.doug.domain;

/**
 * Created by Doug on 12/20/16.
 */

//@Entity
public class ComplexCardTest {

	//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String questionCardName;
	private String questionCardObject;
	private String questionCardAction;
	private String answerCardName;
	private String answerCardObject;
	private String answerCardAction;
	private boolean answerCardNameCorrect;
	private boolean answerCardObjectCorrect;
	private boolean answerCardActionCorrect;

	public ComplexCardTest(Integer id, String questionCardName, String questionCardObject, String questionCardAction,
								  String answerCardName, String answerCardObject, String answerCardAction,
								  boolean answerCardNameCorrect, boolean answerCardObjectCorrect,
								  boolean answerCardActionCorrect) {
		this.id = id;
		this.questionCardName = questionCardName;
		this.questionCardObject = questionCardObject;
		this.questionCardAction = questionCardAction;
		this.answerCardName = answerCardName;
		this.answerCardObject = answerCardObject;
		this.answerCardAction = answerCardAction;
		this.answerCardNameCorrect = answerCardNameCorrect;
		this.answerCardObjectCorrect = answerCardObjectCorrect;
		this.answerCardActionCorrect = answerCardActionCorrect;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAnswerCardObject() {
		return answerCardObject;
	}

	public void setAnswerCardObject(String answerCardObject) {
		this.answerCardObject = answerCardObject;
	}

	public String getAnswerCardAction() {
		return answerCardAction;
	}

	public void setAnswerCardAction(String answerCardAction) {
		this.answerCardAction = answerCardAction;
	}

	public boolean isAnswerCardNameCorrect() {
		return answerCardNameCorrect;
	}

	public void setAnswerCardNameCorrect(boolean answerCardNameCorrect) {
		this.answerCardNameCorrect = answerCardNameCorrect;
	}

	public boolean isAnswerCardObjectCorrect() {
		return answerCardObjectCorrect;
	}

	public void setAnswerCardObjectCorrect(boolean answerCardObjectCorrect) {
		this.answerCardObjectCorrect = answerCardObjectCorrect;
	}

	public boolean isAnswerCardActionCorrect() {
		return answerCardActionCorrect;
	}

	public void setAnswerCardActionCorrect(boolean answerCardActionCorrect) {
		this.answerCardActionCorrect = answerCardActionCorrect;
	}
}


