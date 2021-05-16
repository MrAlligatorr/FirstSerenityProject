package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.pages.ResultPage;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.steps.ResultSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ResultTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private ResultSteps resultSteps;

    @Steps
    private ProductSteps productSteps;


    @Test
    public void selectAnItemFromTheSearchResults() {
        searchSteps.doSearch(Constants.PRODUCT_NAME);
        resultSteps.clickOnViewDetailsOfTheFirstProductButton();
        productSteps.checkSelectedProduct(Constants.PRODUCT_NAME);
    }

}
