package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.SearchResultPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchResultPageTests extends BaseSetup {
    SearchResultPage searchResultPage;

    @Test(priority =9)
    public void testFullPageLoad(){
        searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.isFullPageLoaded();

    }
    @Test(priority = 10)
    public void testMatchProductNamesWithSearchString(){
        assertTrue(searchResultPage.isSearchStringVisibleOnProductNames(Constants.SEARCH_STRING));
    }

}
