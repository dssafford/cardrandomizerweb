package com.doug.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by doug on 12/29/16.
 */

@Entity
@Table(name = "cardinfo")
public class CardInfo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String cardName;
    private String cardNumber;
    private String personName;
    private String actionName;
    private String objectName;
    private String comments;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
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

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CardInfo(String cardName, String mainCategoryName, String subCategoryName, String categorySuit, String personName, String actionName, String objectName) {

        this.cardName = cardName;
        this.personName = personName;
        this.actionName = actionName;
        this.objectName = objectName;
    }

    public CardInfo() {
    }
}
