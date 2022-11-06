package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.HomePage;
import Utils.Constants;
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

    @Test(priority = 2)
    public void testGetTextPopular(){
        //verify popular text is visible
        assertEquals(homePage.getLinkTextPopular().toLowerCase(), "Popular".toLowerCase());
    }

    @Test(priority = 3)
    public void testIsFeaturedProductsVisible(){
        //verify home featured products are visible
        assertTrue(homePage.isHomeFeaturedProductVisible(Constants.WAIT),"Failed: home featured products are not visible");
    }

    @Test(priority = 4)
    public void testClickMenuWomen(){
        assertTrue(homePage.clickWomen(Constants.WAIT),"failed: women menu click ");
    }

    @Test(priority = 5)
    public void testClickPopularProduct(){
        assertTrue(homePage.clickPopularProduct(Constants.WAIT), "failed to click popular product");
    }


}
