package UI_Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
    WebDriver driver;

    @FindBy(xpath = "//span[@class='navigation_page'][contains(text(),'Search')]")
    WebElement navSearch;
    @FindBy(className = "lighter")
    WebElement txaSearchValue;
    @FindBy(xpath = "//span[@class='heading-counter']")
    WebElement txaTotalSearchResult;
    @FindBy(xpath = "//ul[@class='product_list grid row']/li//a[contains(text(), 'Print')]")
    WebElement txaSearchedProductNames;


    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
