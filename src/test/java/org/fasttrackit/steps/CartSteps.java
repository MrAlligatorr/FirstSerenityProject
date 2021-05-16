package org.fasttrackit.steps;

import org.fasttrackit.pages.CartPage;
import org.junit.Assert;

public class CartSteps {

    private CartPage cartPage;

    public void checkAddedToCartSuccessfulMessage(String text){
        Assert.assertEquals(text, cartPage.getAddedToCartSuccessfulMessage());
    }
}
