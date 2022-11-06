package UI_Automation.Pages;

import Utils.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage {
    WebDriver driver;
    Commons commons = new Commons();

    //locator for search navigation path
    @FindBy(xpath = "//span[@class='navigation_page'][contains(text(),'Search')]")
    WebElement navSearch;
    //locator for search string
    @FindBy(className = "lighter")
    WebElement txaSearchValue;
    //locator for header message containing total number of searched result
    @FindBy(xpath = "//span[@class='heading-counter']")
    WebElement txaTotalSearchResult;
    //locator for entire searched product grid
    @FindBy(xpath = "//ul[@class='product_list grid row']")
    WebElement grdProducts;
    //locators for search product lists containing search string
    @FindAll({@FindBy(xpath = "//div[@class='right-block']/h5/a")})
    public List<WebElement> lstSearchedProductNames;

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //check if page loaded
    public boolean isFullPageLoaded(){
        return commons.isPageLoadComplete(driver);
    }

    //get search result text
    public String getTxtSearchValue(){
        commons.isDisplayed(txaSearchValue);
        return commons.getText(txaSearchValue);
    }

    //get message text containing total number of products
    public String getTxtTotalSearchResult(){
        commons.isDisplayed(txaTotalSearchResult);
        return commons.getText(txaTotalSearchResult);
    }

    //extract number from total number of search result header message
    public int getNumberFromText(){
        //get the whole message
        String message = getTxtTotalSearchResult();
        //extract only digit
        int totalNumberOfSearchResult= Integer.parseInt(message.replaceAll("[^0-9]",""));
        return totalNumberOfSearchResult;
    }

    //get matching searched text from search results
    public boolean isSearchStringVisibleOnProductNames(String userInput, int wait){
        commons.Scroll(driver,grdProducts);
        commons.waitToVisualize(wait);
        commons.getListOfWebElementTextMatch(lstSearchedProductNames, userInput);
        return true;
    }
}
