package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Doug on 2/14/17.
 */

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String comments;
	private BigDecimal finalScore;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

//	@ManyToMany(mappedBy = "quizzes")
//	private Set<Location> locations;
//
//	@ManyToMany(mappedBy = "quizzes")
//	private Set<Answer> answers;

//	public Set<Answer> getAnswers() {
//		return answers;
//	}
//
//	public void setAnswers(Set<Answer> answers) {
//		this.answers = answers;
//	}

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

//	public Set<Location> getLocations() {
//		return locations;
//	}
//
//	public void setLocations(Set<Location> locations) {
//		this.locations = locations;
//	}

	public Quiz() {
	}

	public Quiz(String comments) {
		this.comments = comments;
	}

	public Quiz(BigDecimal finalScore, String comments) {
		this.comments = comments;
		this.finalScore = finalScore;
	}

//	@Override
//	public String toString() {
//		String info = "";
//		JSONObject jsonInfo = new JSONObject();
//		jsonInfo.put("quiz comments", this.getComments());
//		JSONArray locationArray = new JSONArray();
//		if (this.locations != null && locations.size() > 0) {
//			this.locations.forEach(location -> {
//				JSONObject subJson = new JSONObject();
//				subJson.put("location name", location.getLocationName());
//				locationArray.put(subJson);
//			});
//		}
//		jsonInfo.put("locations", locationArray);
//		info = jsonInfo.toString();
//		return info;
//	}
}
