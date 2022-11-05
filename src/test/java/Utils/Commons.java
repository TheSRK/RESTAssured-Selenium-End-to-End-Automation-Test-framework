package Utils;

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
    public String getElementText(WebElement element){
        return element.getText();
    }

    /**
     * Get current page title
     * @param driver
     * @return
     */
    public String getCurrentPageTitle(WebDriver driver){
        return driver.getTitle();
    }
}
