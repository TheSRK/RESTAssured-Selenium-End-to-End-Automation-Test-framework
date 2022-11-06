package UI_Automation.Pages.CommonSection;

import Utils.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    WebDriver driver;
    Commons commons = new Commons();

    //locator for search box
    @FindBy(xpath = "//input[@id='search_query_top']")
    WebElement cboSearchBox;
    //locator for Search Suggestions
    @FindBy(xpath = "//div[@class='ac_results']")
    WebElement cboSearchSuggestion;
    //locator for search button
    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement btnSearchBox;
    //locator for cart
    @FindBy(xpath = "//div[@class='shopping_cart']/a[@title='View my shopping cart']")
    public WebElement lnkCartOption;


    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //check search box is interactable
    public boolean isSearchBoxInteractable(int wait){
        commons.waitToVisualize(wait);
        commons.isDisplayed(cboSearchBox);
        commons.isEnabled(cboSearchBox);
        return true;
    }

    //input search string in search box
    public boolean inputSearchString(String searchString, int seconds, int wait) throws InterruptedException {
        commons.Scroll(driver,cboSearchBox);
        commons.waitToVisualize(wait);
        commons.sendKeys(cboSearchBox,searchString);
        commons.explicitlyWaitUntilElementToBeClickable(driver,seconds,btnSearchBox);
        commons.click(btnSearchBox);
        return true;
    }

    //check cart is displayed and enabled
    public boolean isCartInteractable(){
        commons.isDisplayed(lnkCartOption);
        commons.isEnabled(lnkCartOption);
        return true;
    }

}
