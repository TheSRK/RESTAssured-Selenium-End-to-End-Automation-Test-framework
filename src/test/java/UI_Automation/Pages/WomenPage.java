package UI_Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    WebDriver driver;

    @FindBy(className = "navigation_page")
    WebElement navWomen;
    @FindBy(xpath = "//label/a[contains(text(), 'Dresses')]")
    WebElement chkDresses;
    @FindBy(xpath = "//label/a[contains(text(), 'Dresses')]/span")
    WebElement txaDressesCount;
    @FindBy(xpath = "//label/a[contains(text(), 'Yellow')]")
    WebElement chkYellow;
    @FindBy(xpath = "//label/a[contains(text(), 'Yellow')]/span")
    WebElement txaYellowCount;
    @FindBy(xpath = "//span[@class='heading-counter']/span")
    WebElement txaTotalProductCount;
    @FindBy(xpath = "//ul[@class='product_list grid row']/li")
    WebElement lstProductRow;


    public WomenPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
