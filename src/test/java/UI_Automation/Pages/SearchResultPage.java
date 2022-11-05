package UI_Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    WebDriver driver;
    //locator for search navigation path
    @FindBy(xpath = "//span[@class='navigation_page'][contains(text(),'Search')]")
    WebElement navSearch;
    //locator for search string
    @FindBy(className = "lighter")
    WebElement txaSearchValue;
    //locator for header message containing total number of searched result
    @FindBy(xpath = "//span[@class='heading-counter']")
    WebElement txaTotalSearchResult;
    //locators for search product lists containing search string
    @FindBy(xpath = "//ul[@class='product_list grid row']/li//a[contains(text(), 'Print')]")
    WebElement txaSearchedProductNames;


    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
