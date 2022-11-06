package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.CommonSection.Header;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HeaderTests extends BaseSetup {
    Header header;

    @Test (priority = 6)
    public void testSearchBoxVisibility(){
        header = new Header(getDriver());
        assertTrue(header.isSearchBoxInteractable(Constants.WAIT),"search box not interactable");
    }

    @Test (priority = 7)
    public void testCartOptionVisibility(){
        assertTrue(header.isCartInteractable(), "cart not interactable");
    }

    @Test (priority = 8)
    public void testInsertUserInputInSearchBox() throws InterruptedException {
        assertTrue(header.inputSearchString(Constants.SEARCH_STRING,Constants.EXPLICIT_WAIT,Constants.WAIT),"user input was not inserted");
    }
}
