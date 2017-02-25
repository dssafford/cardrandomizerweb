package com.doug.domain;

import javax.persistence.*;

/**
 * Created by Doug on 2/18/17.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item {

	@Id
	@GeneratedValue
	private Integer id;

	private String title;

	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	private Float unitCost;

	public Float calculateAmount(int quantity){
		return null;
	}

	public Item(){}


}
