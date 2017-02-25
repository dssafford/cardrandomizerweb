package com.doug.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Doug on 2/18/17.
 */

@Entity
public class CDold {
	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String title;

	private String description;

	private Float unitCost;

	private Float totalDuration;

	private String genre;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Musicianold> musicianolds = new HashSet<Musicianold>();

	public CDold(){}
	public CDold(String title){
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
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

	public Set<Musicianold> getMusicianolds() {
		return musicianolds;
	}

	public void setMusicianolds(Set<Musicianold> musicianolds) {
		this.musicianolds = musicianolds;
	}
}
