package com.doug.domain;

/**
 * Created by Doug on 12/17/16.
 */
public class Card {

	private Integer id;
	private String CardName;
	private Integer counter;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCardName() {
		return CardName;
	}

	public void setCardName(String cardName) {
		CardName = cardName;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Card(Integer id, String cardName, Integer counter) {
		this.id = id;
		CardName = cardName;
		this.counter = counter;
	}

	public Card() {}
}
