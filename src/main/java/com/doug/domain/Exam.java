package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

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
	private Date timestamp;
	private String test_type;



	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getTesttype() {
		return test_type;
	}

	public void setTesttype(String test_type) {
		this.test_type = test_type;
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

	public Exam() {
	}

	public Exam(String comments) {
		this.comments = comments;
	}

	public Exam(BigDecimal finalScore, String comments) {
		this.comments = comments;
		this.finalScore = finalScore;
	}

}
