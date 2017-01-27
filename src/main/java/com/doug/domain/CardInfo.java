package com.doug.domain;

import java.io.Serializable;

/**
 * Created by doug on 12/29/16.
 */
public class CardInfo implements Serializable{


    private String cardName;
    private String mainCategoryName;
    private String subCategoryName;
    private String categorySuit;
    private String personName;
    private String actionName;
    private String objectName;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getMainCategoryName() {
        return mainCategoryName;
    }

    public void setMainCategoryName(String mainCategoryName) {
        this.mainCategoryName = mainCategoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getCategorySuit() {
        return categorySuit;
    }

    public void setCategorySuit(String categorySuit) {
        this.categorySuit = categorySuit;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getactionName() {
        return actionName;
    }

    public void setactionName(String actionName) {
        this.actionName = actionName;
    }

    public String getobjectName() {
        return objectName;
    }

    public void setobjectName(String objectName) {
        this.objectName = objectName;
    }

    public CardInfo(String cardName, String mainCategoryName, String subCategoryName, String categorySuit, String personName, String actionName, String objectName) {

        this.cardName = cardName;
        this.mainCategoryName = mainCategoryName;
        this.subCategoryName = subCategoryName;
        this.categorySuit = categorySuit;
        this.personName = personName;
        this.actionName = actionName;
        this.objectName = objectName;
    }

    public CardInfo() {
    }
}
