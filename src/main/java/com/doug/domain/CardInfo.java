package com.doug.domain;

/**
 * Created by doug on 12/29/16.
 */
public class CardInfo {


    private String cardName;
    private String mainCategoryName;
    private String subCategoryName;
    private String categorySuit;
    private String personName;
    private String action;
    private String object;

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public CardInfo(String cardName, String mainCategoryName, String subCategoryName, String categorySuit, String personName, String action, String object) {

        this.cardName = cardName;
        this.mainCategoryName = mainCategoryName;
        this.subCategoryName = subCategoryName;
        this.categorySuit = categorySuit;
        this.personName = personName;
        this.action = action;
        this.object = object;
    }

    public CardInfo() {
    }
}
