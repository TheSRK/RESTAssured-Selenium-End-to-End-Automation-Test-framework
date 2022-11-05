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
    //locator for cart
    @FindBy(xpath = "//div[@class='shopping_cart']/a[@title='View my shopping cart']")
    WebElement lnkCartOption;


    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //check search box is interactable
    public boolean isSearchBoxInteractable(){
        commons.isDisplayed(cboSearchBox);
        commons.isEnabled(cboSearchBox);
        return true;
    }

    //input search string in search box
    public boolean inputSearchString(String searchString){
        return commons.sendKeys(cboSearchBox,searchString);
    }

    //check cart is displayed and enabled
    public boolean isCartInteractable(){
        commons.isDisplayed(lnkCartOption);
        commons.isEnabled(lnkCartOption);
        return true;
    }

}
