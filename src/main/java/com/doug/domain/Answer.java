package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Doug on 2/14/17.
 */
@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

//	@ManyToMany()
//	@JoinTable(name = "answer_quiz", joinColumns = @JoinColumn(name = "answer_id", referencedColumnName = "id"),
//			  inverseJoinColumns = @JoinColumn(name = "quiz_id", referencedColumnName = "id"))
//	private Set<Quiz> quizzes;

	private String questionCardName;
	private String questionCardObject;
	private String questionCardAction;

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

	private String answerCardName;
	private String answerPersonName;
	private String answerPersonAction;
	private String answerPersonObject;
	private Boolean answerPersonNameCorrect;
	private Boolean answerPersonActionCorrect;
	private Boolean answerPersonObjectCorrect;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Set<Quiz> getQuizzes() {
//		return quizzes;
//	}
//	public void setQuizzes(Set<Quiz> answerQuizs) {
//		this.quizzes = answerQuizs;
//	}

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

	public Answer(){}

	public Answer(String answerPersonName, String answerPersonAction, String answerPersonObject){
		this.answerPersonName = answerPersonName;
		this.answerPersonAction = answerPersonAction;
		this.answerPersonObject = answerPersonObject;


	}

//	@Override
//	public String toString(){
//		String info = "";
//		JSONObject jsonInfo = new JSONObject();
//		jsonInfo.put("answer person name",this.answerPersonName);
//
//		JSONArray subArray = new JSONArray();
//		this.quizzes.forEach(quiz->{
//			JSONObject subJson = new JSONObject();
//			subJson.put("Answer comments", quiz.getComments());
//			subArray.put(subJson);
//		});
//		jsonInfo.put("quizzes", subArray);
//		info = jsonInfo.toString();
//		return info;
//	}


}
