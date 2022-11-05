package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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

        return driver;

    }
}
