package com.doug.domain;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

/**
 * Created by Doug on 1/8/17.
 */
public class Score {

	@Id
	private Integer userid;

	private Integer timestamp;
	private ArrayList masterList;
	private ArrayList answerList;
	private ArrayList scoreList;
	private String comments;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public ArrayList getMasterList() {
		return masterList;
	}

	public void setMasterList(ArrayList masterList) {
		this.masterList = masterList;
	}

	public ArrayList getAnswerList() {
		return answerList;
	}

	public void setAnswerList(ArrayList answerList) {
		this.answerList = answerList;
	}

	public ArrayList getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList scoreList) {
		this.scoreList = scoreList;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
