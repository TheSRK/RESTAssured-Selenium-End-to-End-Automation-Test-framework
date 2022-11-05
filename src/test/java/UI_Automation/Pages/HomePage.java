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

    public String getPageTitle(){
        return commons.getCurrentPageTitle(driver);
    }

    public String getLinkTextPopular(){
        return commons.getElementText(lnkPopularCategory);
    }
}
