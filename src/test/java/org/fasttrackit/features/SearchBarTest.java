package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.junit.Test;

public class SearchBarTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;


    @Test
    public void navigateSearchAnItemWithSearchBar(){
        searchSteps.navigateToSearchBar();
        searchSteps.setSearchBarField("KHAKI BOWERY CHINO PANTS");
        searchSteps.clickOnTheSearchBarButton();
        searchSteps.checkSearchBarResultsText("SEARCH RESULTS FOR 'KHAKI BOWERY CHINO PANTS'");
    }
}
