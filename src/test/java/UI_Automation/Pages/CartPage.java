package UI_Automation.Pages;

import Utils.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {
    WebDriver driver;
    Commons commons = new Commons();
    int availableCartProductCount=0;

    //locator for cart summary header message
    @FindBy(xpath = "//table[@id='cart_summary']")
    WebElement tblCartProducts;
    //locators for cart product count message
    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    WebElement txaCartProductCount;
    @FindBy(xpath = "//p//a[@title='Proceed to checkout']")
    WebElement btnCheckout;
    //locator for cart product details row
    @FindAll({@FindBy(xpath = "//tbody/tr")})
    List<WebElement> lstCartProductRow;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //check if page loaded
    public boolean isFullPageLoaded(){
        return commons.isPageLoadComplete(driver);
    }

    //check checkout button is clickable
    public boolean isCheckoutBtnVisible(int seconds){
        commons.explicitlyWaitUntilElementToBeClickable(driver, seconds, btnCheckout);
        commons.isDisplayed(btnCheckout);
        commons.isEnabled(btnCheckout);
        return true;
    }

    //check cart table visible
    public boolean isCartHeaderVisible(){
        return commons.isDisplayed(tblCartProducts);
    }

    //check product count from message
    public int countProductFromMessage(){
        String productCountMessage= commons.getText(txaCartProductCount);
        availableCartProductCount = Integer.parseInt(productCountMessage.replaceAll("[^0-9]", ""));
        return availableCartProductCount;
    }

    //check list of product is visible in the table
    public boolean isProductVisibleInsideTable(){
        return commons.isListOfWebElementDisplayed(lstCartProductRow);
    }
}
