package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Doug on 2/14/17.
 */

@Entity
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String comments;
	private BigDecimal finalScore;
	private Timestamp timestamp;
	private String testtype;
	private Boolean isActive;

	public Boolean getActive() {
		return isActive;
	}

	public void setActive(Boolean active) {
		isActive = active;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getTesttype() {
		return testtype;
	}

	public void setTesttype(String test_type) {
		this.testtype = test_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(BigDecimal finalScore) {
		this.finalScore = finalScore;
	}

	public String getTest_type() {
		return testtype;
	}

	public void setTest_type(String test_type) {
		this.testtype = test_type;
	}


	public Exam() {
	}

	public Exam(String comments) {
		this.comments = comments;
	}

	public Exam(BigDecimal finalScore, String comments) {
		this.comments = comments;
		this.finalScore = finalScore;
	}

	public Exam(BigDecimal finalScore, Timestamp timestamp, String testtype, String comments, Boolean isActive){
		this.finalScore=finalScore;
		this.timestamp= timestamp;
		this.testtype=testtype;
		this.comments=comments;
		this.isActive=isActive;
	}

}
