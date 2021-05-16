package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css = "[title = 'Register']")
    private WebElementFacade registerLink;

    @FindBy(id = "search")
    private WebElementFacade searchBarField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchBarButton;


    public void clickAccountLink() {
        clickOn(accountLink);
    }

    public void clickLogInLink() {
        clickOn(logInLink);
    }

    public void clickRegisterLink() {
        clickOn(registerLink);
    }

    public void clickOnSearchBar(){
        clickOn(searchBarField);
    }

    public void setSearchBarField(String text) {
        typeInto(searchBarField, text);
    }

    public void clickSearchBarButton(){
        clickOn(searchBarButton);
    }
}
