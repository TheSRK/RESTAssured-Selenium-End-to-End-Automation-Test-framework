package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.CartPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartPageTests extends BaseSetup {
    CartPage cartPage;

    @Test(priority = 23)
    public void testIsFullPageLoaded(){
        cartPage = new CartPage(getDriver());
        assertTrue(cartPage.isFullPageLoaded(),"failed: cart page could not load");
    }
    @Test(priority = 24)
    public void testIsCheckoutBtnVisible(){
        assertTrue(cartPage.isCheckoutBtnVisible(Constants.EXPLICIT_WAIT,Constants.WAIT),"failed: checkout btn not visible");
    }
    @Test(priority = 25)
    public void testIsCartHeaderVisible(){
        assertTrue(cartPage.isCartHeaderVisible(Constants.WAIT),"failed:cart header not visible");
    }
    @Test(priority = 26)
    public void testCountProductFromMessage(){
        assertTrue(cartPage.countProductFromMessage(Constants.WAIT),"failed:cart count message wrong");
    }
    @Test(priority = 27)
    public void testIsProductVisibleInsideTable(){
        assertTrue(cartPage.isProductVisibleInsideTable(Constants.WAIT),"failed: product not present in table");
    }
}
