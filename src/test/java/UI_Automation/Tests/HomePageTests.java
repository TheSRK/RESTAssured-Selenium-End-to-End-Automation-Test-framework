package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UI_Automation.Base.BaseSetup.getDriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseSetup {
    HomePage homePage;

    @Test(priority = 0)
    public void testPageTitle(){
        homePage = new HomePage(getDriver());

        //verify if ful page loaded
        assertTrue(homePage.isFullPageLoaded(),"failed: full page not loaded");
        //verify page title
        assertEquals(homePage.getPageTitle(), "My Store");
        assertEquals(homePage.getLinkTextPopular().toLowerCase(), "Popular".toLowerCase());

    }

}
