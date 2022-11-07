package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.Objects;

public class BrowserManager {

    public static WebDriver setBrowser(String browserName){
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();

            //Options for --headed and --headless
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(Constants.BROWSER_MODE);

            //enable this if test is running in --headless mode
            //chromeOptions.addArguments(Constants.BROWSER_SIZE);

            //initialize driver with Chromedriver
            driver = new ChromeDriver(chromeOptions);

            //maximize browser window
            driver.manage().window().maximize();

            //add implicit timeout
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
        }

        //firefox support
        else if (browserName.equalsIgnoreCase("firefox")){

            //setup firefox browser
            WebDriverManager.firefoxdriver().setup();
            //System.setProperty("webdriver.gecko.driver",Constants.firefoxDriverPath);

            //Add options for --headed or --headless browser launch
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(Constants.BROWSER_MODE);

            //initialize driver for firefox
            driver = new FirefoxDriver(firefoxOptions);

            //maximize window
            driver.manage().window().maximize();

            //add implicit timeout
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
        }

        return driver;

    }
}
