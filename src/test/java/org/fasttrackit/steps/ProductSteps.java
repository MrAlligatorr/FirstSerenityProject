package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class ProductSteps {

    private ProductPage productPage;
    private CartPage cartPage;


    @Step
    public void clickOnProductCharacteristicsButtons() {
        productPage.open();
        productPage.clickOnTheColorOfTheProduct();
        productPage.clickOnTheSizeOfTheProduct();
    }

    @Step
    public void clickOnAddToCartButton() {
        productPage.clickOnAddToCart();
    }

    @Step
    public void checkSelectedProduct(String productName) {
        Assert.assertEquals(productName, productPage.getSelectedItemName());
    }

    @Step
    public void checkProductAddedSuccessfulInTheCartMessage(String text) {
        Assert.assertEquals(text, cartPage.getAddedToCartSuccessfulMessage());
    }
}
