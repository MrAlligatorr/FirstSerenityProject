package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchBarTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;


    @Test
    public void navigateSearchAnItemWithSearchBar(){
        searchSteps.navigateToSearchBar();
        searchSteps.setSearchBarField(Constants.PRODUCT_NAME);
        searchSteps.clickOnTheSearchBarButton();
        searchSteps.checkSearchBarResultsText("SEARCH RESULTS FOR 'KHAKI BOWERY CHINO PANTS'");
    }
}
