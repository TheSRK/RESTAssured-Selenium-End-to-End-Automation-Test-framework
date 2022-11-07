package UI_Automation.Base;

import Utils.BrowserManager;
import Utils.Constants;
import Utils.SuiteListener;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.Objects;

public class BaseSetup {

    protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
    private static WebDriver driver;

    //set  WebDriver to threadLocalDriver
    @Parameters("browser")
    @BeforeTest
    public void Setup(String browser){
            driver = BrowserManager.setBrowser(browser);
            threadLocalDriver.set(driver);
            getDriver().get(Constants.BASE_URL);
    }

    //Get threadLocal driver
    public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }

    private void setDriver(WebDriver driverRef){
        threadLocalDriver.set(driverRef);
    }

    /**
     * this method takes screenshot upon failed test
     */
    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                SuiteListener suiteListener = new SuiteListener();
                suiteListener.onTestFailure(result);
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }

    //close browser and clean thread local driver
    @AfterTest
    public void tearDown(){
        threadLocalDriver.get().quit();
        threadLocalDriver.remove();
    }

}
