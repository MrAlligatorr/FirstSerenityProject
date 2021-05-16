package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.steps.ResultSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Steps
    private ProductSteps productSteps;

    @Steps
    private ResultSteps resultSteps;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void addProductToCart() {
        searchSteps.doSearch(Constants.PRODUCT_NAME);
        resultSteps.clickOnViewDetailsOfTheFirstProductButton();
        productSteps.clickOnProductCharacteristicsButtons();
        productSteps.clickOnAddToCartButton();
        productSteps.checkProductAddedSuccessfulInTheCartMessage("Khaki Bowery Chino Pants was added to your shopping cart.");
    }


}
