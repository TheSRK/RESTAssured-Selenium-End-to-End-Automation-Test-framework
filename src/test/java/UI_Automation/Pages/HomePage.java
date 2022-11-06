package UI_Automation.Pages;

import Utils.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    Commons commons = new Commons();

    //locator for Popular category
    @FindBy(xpath = "//a[contains(text(),'Popular')]")
    WebElement lnkPopularCategory;
    //locator for menu Women
    @FindBy(xpath = "//a[@title='Women']")
    WebElement mnuWomenCategory;
    //locator for home featured products
    @FindBy(id = "homefeatured")
    WebElement dgdHomeFeatured;
    //locator for popular product
    @FindBy(xpath = "//ul[@id='blockbestsellers']//a[@title='Faded Short Sleeve T-shirts'][@class='product_img_link']")
    WebElement lnkPopularProduct;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //check if page loaded
    public boolean isFullPageLoaded(){
        return commons.isPageLoadComplete(driver);
    }

    //get title of the page
    public String getPageTitle(){
        return commons.getTitle(driver);
    }
    //get Popular link text
    public String getLinkTextPopular(){
        commons.Scroll(driver, lnkPopularCategory);
        commons.isDisplayed(lnkPopularCategory);
        return commons.getText(lnkPopularCategory);
    }

    //click menu Women
    public boolean clickWomen(int wait){
        commons.Scroll(driver,mnuWomenCategory);
        commons.isDisplayed(lnkPopularCategory);
        commons.click(mnuWomenCategory);
        commons.waitToVisualize(wait);
        return true;
    }

    //check home featured products are visible
    public boolean isHomeFeaturedProductVisible(int wait){
        commons.Scroll(driver,dgdHomeFeatured);
        commons.waitToVisualize(wait);
        return commons.isDisplayed(dgdHomeFeatured);

    }

    //click popular product
    public boolean clickPopularProduct(int wait){
        commons.Scroll(driver, lnkPopularCategory);
        commons.click(lnkPopularCategory);
        commons.jsClick(driver,lnkPopularProduct);
        commons.waitToVisualize(wait);
        return true;
    }
}
