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
        return commons.getText(lnkPopularCategory);
    }
}
