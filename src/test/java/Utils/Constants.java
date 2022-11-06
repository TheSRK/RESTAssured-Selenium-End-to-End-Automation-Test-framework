package Utils;

public interface Constants {

    /**
     * Run your project : gradle clean test
     * Then generate allure by this command: allure generate allure-results --clean -o allure-report
     * Finally hit this command to view report: allure serve allure-results
     */

    //initiating PropertyManager instance
    PropertiesManager prop = new PropertiesManager("./src/test/resources/ui_config.properties");

    String BROWSER_NAME = prop.getProperty("browserName");
    String BASE_URL = prop.getProperty("baseUrl");
    String BROWSER_MODE = prop.getProperty("browserMode");
    String BROWSER_SIZE = prop.getProperty("browserSize");
    int IMPLICIT_WAIT = Integer.parseInt(prop.getProperty("implicitWait"));
    int EXPLICIT_WAIT = Integer.parseInt(prop.getProperty("explicitWait"));
    int WAIT = Integer.parseInt(prop.getProperty("wait"));


    /**
     * header section
     */
    String SEARCH_STRING = prop.getProperty("searchString");
}
