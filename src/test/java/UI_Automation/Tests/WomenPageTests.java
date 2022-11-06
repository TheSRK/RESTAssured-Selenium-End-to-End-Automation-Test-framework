package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.WomenPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WomenPageTests extends BaseSetup {
    WomenPage womenPage;

    @Test(priority = 6)
    public void testIsFullPageLoaded(){
        womenPage = new WomenPage(getDriver());
        womenPage.isFullPageLoaded();
    }

    @Test(priority = 7)
    public void testIsNavWomenVisible(){
        assertTrue(womenPage.isNavWomenVisible(),"failed: nav women is not visible");
    }

    @Test(priority = 8)
    public void testClickCategories(){
        assertTrue(womenPage.clickCategories(Constants.EXPLICIT_WAIT),"failed category click");
    }

    @Test(priority = 9)
    public void testClickColor(){
        assertTrue(womenPage.isColorClicked(Constants.EXPLICIT_WAIT),"failed click color");
    }

    @Test(priority = 10)
    public void testVerifyMessageWithFilteredProductCount() {
        assertTrue(womenPage.verifyHeaderMessageWithNumberOfFilteredProducts(),"failed: mismatch in product count");
    }

    @Test(priority = 11)
    public void testIsSelectedColorBoxDisplayedOnProducts(){
        assertTrue(womenPage.isSelectedColorDisplayed(Constants.EXPLICIT_WAIT),"failed: color box not found on products");
    }
}
