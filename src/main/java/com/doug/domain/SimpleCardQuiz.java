package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 12/20/16.
 */

@Entity
public class SimpleCardQuiz{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String questionCardName;
	private String answerCardName;
	private boolean answerCardNameCorrect;
	private Integer examId;


	public SimpleCardQuiz(){}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public SimpleCardQuiz(String questionCardName, String answerCardName, boolean answerCardNameCorrect) {
		this.questionCardName = questionCardName;
		this.answerCardName = answerCardName;
		this.answerCardNameCorrect = answerCardNameCorrect;
	}

	public SimpleCardQuiz(String questionCardName, String answerCardName, boolean answerCardNameCorrect,
								 Integer examId) {
		this.questionCardName = questionCardName;
		this.answerCardName = answerCardName;
		this.answerCardNameCorrect = answerCardNameCorrect;
		this.examId = examId;
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

	public String getAnswerCardName() {
		return answerCardName;
	}

	public void setAnswerCardName(String answerCardName) {
		this.answerCardName = answerCardName;
	}

	public boolean isAnswerCardNameCorrect() {
		return answerCardNameCorrect;
	}

	public void setAnswerCardNameCorrect(boolean answerCardNameCorrect) {
		this.answerCardNameCorrect = answerCardNameCorrect;
	}
}
