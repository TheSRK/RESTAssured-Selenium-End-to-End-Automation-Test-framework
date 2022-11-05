package Utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Commons {

    /**
     * perform web element click
     * @param element
     */
    public void click(WebElement element){
        element.click();
    }

    /**
     * Get element text
     * @param element
     * @return
     */
    public String getText(WebElement element){
        return element.getText();
    }

    /**
     * Get current page title
     * @param driver
     * @return
     */
    public String getTitle(WebDriver driver){
        return driver.getTitle();
    }

    /**
     * This method inserts user inputs
     * @param element
     * @param inputString
     * @return
     */
    public boolean sendKeys(WebElement element, String inputString){
        element.sendKeys(inputString);
        return true;
    }

    /**
     * This method hits Enter button on element from keyboard
     * @param element
     * @return
     */
    public boolean sendKeysEnter(WebElement element){
        element.sendKeys(Keys.ENTER);
        return true;
    }

    /**
     * this method checks if element is displayed
     * @param element
     * @return
     */
    public boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }

    /**
     * this method checks if element is enabled
     * @param element
     * @return
     */
    public boolean isEnabled(WebElement element){
        return element.isEnabled();
    }
}
