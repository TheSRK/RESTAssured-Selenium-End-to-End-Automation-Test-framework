package UI_Automation.Pages;

import UI_Automation.Pages.CommonSection.Header;
import Utils.Commons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends Header {
    WebDriver driver;
    Commons commons = new Commons();

    //locator for navigation path
    @FindBy(css = ".breadcrumb.clearfix")
    WebElement navPath;
    //locator for product name
    @FindBy(xpath = "//h1[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement txaProductName;
    //locator for product image id
    @FindBy(id = "bigpic")
    WebElement imgProduct;
    //locator for whole product details area
    @FindBy(css = ".primary_block.row")
    WebElement dgdProductArea;
    //locator for product pice
    @FindBy(id = "our_price_display")
    WebElement txaProductPrice;
    //locator for Add to cart button
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(), 'Add to cart')]")
    WebElement btnAddToCart;
    //locator for pop up
    By dgdPopUp = By.xpath("//div[@id='layer_cart']/div[@class='clearfix']");
    //locator for success icon
    @FindBy(className = "icon-ok")
    WebElement imgSuccessIcon;
    //locator for text message containing number of product added in cart
    @FindBy(xpath = "//span[contains(text(),'There is 1 item in your cart.')]")
    WebElement txaProductCountInCart;
    //locator for cross button on popup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement btnCloseWindowPopUp;
    //locator for checkout button on product details page on mouse hover
    @FindBy(xpath = "//a[@id='button_order_cart']")
    WebElement btnCheckOut;

    public ProductDetailsPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //check if page loaded
    public boolean isFullPageLoaded() {
        return commons.isPageLoadComplete(driver);
    }

    //check if navigation path is visible
    public boolean isNavPathVisible(){
        return commons.isDisplayed(navPath);
    }

    //check if product area is visible
    public boolean isProductAreaVisible(){
        return commons.isDisplayed(dgdProductArea);
    }

    //check if product is visible
    public boolean isProductNameVisible(){
        return commons.isDisplayed(txaProductName);
    }

    //locator for product price
    public boolean isProductPriceVisible(){
        return commons.isDisplayed(txaProductPrice);
    }

    //check product image is visible
    public boolean isProductImageVisible(){
        return commons.isDisplayed(imgProduct);
    }

    //click add to cart
    public boolean clickBtnAddToCart(int seconds, int wait){
        commons.Scroll(driver, btnAddToCart);
        commons.waitToVisualize(wait);
        commons.click(btnAddToCart);
        commons.explicitlyWaitUntilElementToBeVisible(driver, seconds, dgdPopUp);
        return true;
    }

    //check success icon is visible
    public boolean isSuccessIconVisible(int seconds, int wait){
        commons.explicitlyWaitUntilElementToBeClickable(driver,seconds, imgSuccessIcon);
        commons.waitToVisualize(wait);
        return commons.isDisplayed(imgSuccessIcon);
    }

    //check product count message on popup
    public boolean isProductCountMessageVisible(){
        return commons.isDisplayed(txaProductCountInCart);
    }

    //click cross button
    public boolean clickBtnCross(int wait){
        commons.click(btnCloseWindowPopUp);
        commons.waitToVisualize(wait);
        return true;
    }

    //hover over cart and click checkout
    public boolean hoverOverCartAndClickCheckOut(int seconds, int wait){
        commons.Scroll(driver, lnkCartOption);
        commons.hover(driver, lnkCartOption);
        commons.explicitlyWaitUntilElementToBeClickable(driver,seconds, btnCheckOut);
        commons.click(btnCheckOut);
        commons.waitToVisualize(wait);
        return true;
    }





}
