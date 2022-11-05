package UI_Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    WebDriver driver;
    //locator for navigation path for Women
    @FindBy(className = "navigation_page")
    WebElement navWomen;
    //locator for Dress checkbox category
    @FindBy(xpath = "//label/a[contains(text(), 'Dresses')]")
    WebElement chkDresses;
    //locator for Available Dress Count
    @FindBy(xpath = "//label/a[contains(text(), 'Dresses')]/span")
    WebElement txaDressesCount;
    //locator for color filter with Yellow
    @FindBy(xpath = "//label/a[contains(text(), 'Yellow')]")
    WebElement chkYellow;
    //locator for available Yellow color product count
    @FindBy(xpath = "//label/a[contains(text(), 'Yellow')]/span")
    WebElement txaYellowCount;
    //locator for header message containing total filtered product
    @FindBy(xpath = "//span[@class='heading-counter']/span")
    WebElement txaTotalProductCount;
    //locator for list of filtered product
    @FindBy(xpath = "//ul[@class='product_list grid row']/li")
    WebElement lstProductRow;


    public WomenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
