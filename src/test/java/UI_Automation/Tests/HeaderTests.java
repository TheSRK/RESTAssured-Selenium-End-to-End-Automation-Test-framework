package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.CommonSection.Header;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HeaderTests extends BaseSetup {
    Header header;

    @Test (priority = 5)
    public void testSearchBoxVisibility(){
        header = new Header(getDriver());
        assertTrue(header.isSearchBoxInteractable(),"search box not interactable");
    }

    @Test (priority = 6)
    public void testCartOptionVisibility(){
        assertTrue(header.isCartInteractable(), "cart not interactable");
    }

    @Test (priority = 7)
    public void testInsertUserInputInSearchBox() throws InterruptedException {
        assertTrue(header.inputSearchString(Constants.SEARCH_STRING,Constants.EXPLICIT_WAIT),"user input was not inserted");
    }
}
