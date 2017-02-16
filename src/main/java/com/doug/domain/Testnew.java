package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


/**
 * Created by Doug on 2/14/17.
 */
@Entity
public class Testnew {

	@Id
	private int id;

	private BigDecimal score;

	private String comments;


	public void Testnew(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}


//	@OneToMany(mappedBy = "testnew", cascade = CascadeType.ALL)
//	public Set<Location> getLocations() {
//		return locations;
//	}



}

