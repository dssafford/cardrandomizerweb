package com.doug.domain;

import java.io.Serializable;

/**
 * Created by Doug on 1/25/17.
 */
public class SingleCardScore implements Serializable {
	private String cardName;
	private String personName;
	private String actionName;
	private String objectName;
	private Boolean cardNameCorrect;
	private Boolean personNameCorrect;
	private Boolean actionNameCorrect;

	public Boolean getCardNameCorrect() {
		return cardNameCorrect;
	}

	public void setCardNameCorrect(Boolean cardNameCorrect) {
		this.cardNameCorrect = cardNameCorrect;
	}

	private Boolean objectNameCorrect;

	public SingleCardScore() {
	}


	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String action) {
		this.actionName = action;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String object) {
		this.objectName = object;
	}


	public String getCardName() {

		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Boolean getPersonNameCorrect() {
		return personNameCorrect;
	}

	public void setPersonNameCorrect(Boolean personNameCorrect) {
		this.personNameCorrect = personNameCorrect;
	}

	public Boolean getActionNameCorrect() {
		return actionNameCorrect;
	}

	public void setActionNameCorrect(Boolean actionNameCorrect) {
		this.actionNameCorrect = actionNameCorrect;
	}

	public Boolean getObjectNameCorrect() {
		return objectNameCorrect;
	}

	public void setObjectNameCorrect(Boolean objectNameCorrect) {
		this.objectNameCorrect = objectNameCorrect;
	}
}
