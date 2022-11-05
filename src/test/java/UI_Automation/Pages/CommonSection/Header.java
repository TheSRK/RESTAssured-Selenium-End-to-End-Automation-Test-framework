package UI_Automation.Pages.CommonSection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    WebDriver driver;
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
}
