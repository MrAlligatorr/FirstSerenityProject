package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ResultPage extends PageObject {

    @FindBy(css = "li:nth-child(1) [title='View Details']")
    private WebElementFacade viewDetailsOfTheFirstItem;

    @FindBy(css = ".col-main h1")
    private WebElementFacade checkSearchResultText;


    public void clickOnViewDetailsOfTheFirstProduct(){
        clickOn(viewDetailsOfTheFirstItem);
    }

    public String getSearchResultsText(){
        return checkSearchResultText.getText();
    }


}
