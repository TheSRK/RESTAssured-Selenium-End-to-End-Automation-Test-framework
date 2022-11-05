package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UI_Automation.Base.BaseSetup.getDriver;
import static org.testng.Assert.assertEquals;

public class HomePageTests extends BaseSetup {
    HomePage homePage;

    @Test
    public void testPageTitle(){
        homePage = new HomePage(getDriver());
        //verify page title
        assertEquals(homePage.getPageTitle(), "My Store");
        assertEquals(homePage.getLinkTextPopular().toLowerCase(), "Popular".toLowerCase());

    }

}
