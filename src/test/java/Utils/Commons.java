package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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

    /**
     * Explicitly wait :- Element To Be Clickable
     * @param driver
     * @param seconds
     * @param element
     */

    public void explicitlyWaitUntilElementToBeClickable(WebDriver driver, int seconds, WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Explicitly wait :- Element To Be visible
     * @param driver
     * @param seconds
     * @param element
     */

    public void explicitlyWaitUntilElementToBeVisible(WebDriver driver, int seconds, By element){
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    /**
     * JavaScriptExecutor wait for full page to load
     * @param driver
     * @return
     */
    public boolean isPageLoadComplete(WebDriver driver)
    {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("loaded")
                || ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    /**
     * Scroll function - javaScript executor
     * @param driver
     * @param element
     */

    public void Scroll(WebDriver driver, WebElement element){
        ((JavascriptExecutor)driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * check text on List<WebElement> elements
     * @param elements
     * @param visibleText
     */
    public boolean getListOfWebElementTextMatch(List<WebElement> elements, String visibleText) {
        boolean flag = false;
        for (WebElement element: elements) {
            if (element.getText().contains(visibleText)) {
                System.out.println(element.getText());
                flag=true;
            }
            else {
                flag=false;
            }
        }
        return flag;
    }
    /**
     * check List<WebElement> elements is displayed
     * @param elements
     *
     */
    public boolean isListOfWebElementDisplayed(List<WebElement> elements) {
        boolean flag = false;
        for (WebElement element: elements) {
            if (element.isDisplayed()) {
                flag=true;
            }
            else {
                flag=false;
            }
        }
        return flag;
    }

    /**
     * Is checkbox checked
     */
    public boolean isSelected(WebElement element){
        return element.isSelected();
    }

    /**
     * hover over element
     */
    public boolean hover(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        return true;
    }
}
