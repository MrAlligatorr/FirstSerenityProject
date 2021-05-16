package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/khaki-bowery-chino-pants.html")
public class ProductPage extends PageObject {

    @FindBy (css = "#swatch17 img")
    private WebElementFacade selectColorOfTheProductButton;

    @FindBy(css = "#swatch67 .swatch-label")
    private WebElementFacade selectSizeOfTheProductButton;

    @FindBy(css = ".add-to-cart-buttons span span")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".h1")
    private WebElementFacade checkSelectedItem;

    public void clickOnTheColorOfTheProduct(){
        clickOn(selectColorOfTheProductButton);
    }

    public void clickOnTheSizeOfTheProduct(){
        clickOn(selectSizeOfTheProductButton);
    }

    public void clickOnAddToCart (){
        clickOn(addToCartButton);
    }

    public String getSelectedItemName(){
        return checkSelectedItem.getText();
    }
}
