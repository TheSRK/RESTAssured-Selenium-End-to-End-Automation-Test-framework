package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseSetup {
    HomePage homePage;

    @Test(priority = 0)
    public void testIsFullPageLoaded(){
        homePage = new HomePage(getDriver());
        //verify if ful page loaded
        assertTrue(homePage.isFullPageLoaded(),"failed: full page not loaded");
    }


    @Test(priority = 1)
    public void testGetPageTitle(){
        //verify page title
        assertEquals(homePage.getPageTitle(), "My Store");
    }

    @Test( priority = 2)
    public void testGetTextPopular(){
        //verify popular text is visible
        assertEquals(homePage.getLinkTextPopular().toLowerCase(), "Popular".toLowerCase());
    }

    @Test( priority = 3)
    public void testIsFeaturedProductsVisible(){
        //verify home featured products are visible
        assertTrue(homePage.isHomeFeaturedProductVisible(),"Failed: home featured products are not visible");
    }

    @Test(priority = 4)
    public void testClickMenuWomen(){
        assertTrue(homePage.clickWomen(),"failed: women menu click ");
    }


}
