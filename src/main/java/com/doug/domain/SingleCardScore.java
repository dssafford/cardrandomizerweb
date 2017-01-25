package com.doug.domain;

import java.io.Serializable;

/**
 * Created by Doug on 1/25/17.
 */
public class SingleCardScore implements Serializable{
	private String cardName;
	private Boolean correct;

	public SingleCardScore(){}

	public SingleCardScore(String cardName, Boolean correct) {
		this.cardName = cardName;
		this.correct = correct;
	}

	public String getCardName() {

		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Boolean getCorrect() {
		return correct;
	}

	public void setCorrect(Boolean correct) {
		this.correct = correct;
	}
}
