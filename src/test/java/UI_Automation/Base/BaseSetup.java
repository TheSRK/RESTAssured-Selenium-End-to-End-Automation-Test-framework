package UI_Automation.Base;

import Utils.BrowserManager;
import Utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Objects;

public class BaseSetup {

    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    private static WebDriver driver;

    @BeforeTest
    public void Setup(){

        if(Objects.isNull(driver)){

            driver = BrowserManager.setBrowser(Constants.BROWSER_NAME);
            threadLocalDriver.set(driver);
            getDriver().get("http://automationpractice.com/index.php");
        }
    }

    //Get threadLocal driver
    public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }

    private void setDriver(WebDriver driverRef){
        threadLocalDriver.set(driverRef);
    }



    @AfterTest
    public void tearDown(){
        getDriver().quit();
        threadLocalDriver.remove();
    }

}
