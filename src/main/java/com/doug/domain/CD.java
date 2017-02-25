package com.doug.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Doug on 2/19/17.
 */
@Entity
public class CD extends Item{

	@Id
	@GeneratedValue
	private Integer id;

	private Float totalDuration;
	private String genre;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public CD (){}
	public CD(String title){
		this.setTitle(title);
	}
}
