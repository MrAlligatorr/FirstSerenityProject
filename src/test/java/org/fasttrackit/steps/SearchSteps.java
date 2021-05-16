package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ResultPage;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private ResultPage resultPage;

    @Step
    public void clickOnSearchBarField() {
        homePage.clickOnSearchBar();
    }

    @Step
    public void navigateToSearchBar() {
        homePage.open();
        homePage.clickOnSearchBar();
    }

    @Step
    public void setSearchBarField(String text) {
        homePage.setSearchBarField(text);
    }

    @Step
    public void clickOnTheSearchBarButton() {
        homePage.clickSearchBarButton();
    }

    @Step
    public void checkSearchBarResultsText(String text) {
        Assert.assertEquals(text, resultPage.getSearchResultsText());
    }

    @Step
    public void doSearch(String item){
        navigateToSearchBar();
        setSearchBarField(item);
        clickOnTheSearchBarButton();
    }
}
