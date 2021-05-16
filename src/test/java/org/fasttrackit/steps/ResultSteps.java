package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ResultPage;
import org.junit.Assert;

public class ResultSteps {

    private ResultPage resultPage;
    private ProductPage productPage;

    @Step
    public void clickOnViewDetailsOfTheFirstProductButton(){
        resultPage.clickOnViewDetailsOfTheFirstProduct();
    }

    @Step
    public void checkClickedItem(String text){
        Assert.assertEquals(text, productPage.getSelectedItemName());
    }

}
