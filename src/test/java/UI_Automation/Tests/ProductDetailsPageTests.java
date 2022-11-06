package UI_Automation.Tests;

import UI_Automation.Base.BaseSetup;
import UI_Automation.Pages.ProductDetailsPage;
import Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductDetailsPageTests extends BaseSetup {
    ProductDetailsPage productDetailsPage;

    @Test(priority = 12)
    public void testIsFullPageLoaded(){
        productDetailsPage = new ProductDetailsPage(getDriver());
        assertTrue(productDetailsPage.isFullPageLoaded(),"failed page did not load");
    }

    @Test(priority = 13)
    public void testIsNavPathVisible(){
        assertTrue(productDetailsPage.isNavPathVisible(), "failed nav path not visible");
    }

    @Test(priority = 14)
    public void testIsProductAreaVisible(){
        assertTrue(productDetailsPage.isProductAreaVisible(),"failed product area not visible");
    }

    @Test(priority = 15)
    public void testIsProductNameVisible(){
        assertTrue(productDetailsPage.isProductNameVisible(), "Failed product are not visible");
    }

    @Test(priority = 16)
    public void testIsProductPriceVisible(){
        assertTrue(productDetailsPage.isProductPriceVisible());
    }

    @Test(priority = 17)
    public void testIsProductImageVisible(){
        assertTrue(productDetailsPage.isProductImageVisible(),"failed product image not visible");
    }

    @Test(priority = 18)
    public void testClickBtnAddToCart(){
        assertTrue(productDetailsPage.clickBtnAddToCart(Constants.EXPLICIT_WAIT,Constants.WAIT),"failed to click add to cart btn");
    }

    @Test(priority = 19)
    public void testIsSuccessIconVisible(){
        assertTrue(productDetailsPage.isSuccessIconVisible(Constants.EXPLICIT_WAIT,Constants.WAIT),"failed: success icon could not be validated");
    }
    @Test(priority = 20)
    public void testIsProductCountMessageVisible(){
        assertTrue(productDetailsPage.isProductCountMessageVisible(),"failed: prod count message not found");
    }
    @Test(priority = 21)
    public void testClickBtnCross(){
        assertTrue(productDetailsPage.clickBtnCross(Constants.WAIT), "failed to click cross btn");
    }
    @Test(priority = 22)
    public void testHoverOverCartAndClickCheckOut(){
        assertTrue(productDetailsPage.hoverOverCartAndClickCheckOut(Constants.EXPLICIT_WAIT,Constants.WAIT), "failed to hover over cart");
    }
}
