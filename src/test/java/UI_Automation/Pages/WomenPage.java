package UI_Automation.Pages;

import Utils.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
    WebDriver driver;
    Commons commons = new Commons();
    int availableCategoryProductCount = 0;
    int availableColorProductCount = 0;
    int totalProductCount = 0;

    //locator for navigation path for Women
    @FindBy(className = "navigation_page")
    WebElement navWomen;
    //locator for Dress checkbox category
    @FindBy(id = "layered_category_8")
    WebElement chkCategoryDresses;
    //locator for Available Dress Count
    @FindBy(xpath = "//label/a[contains(text(), 'Dresses')]/span")
    WebElement txaCategoryDressesCount;
    //locator for color filter with Yellow
    @FindBy(id = "layered_id_attribute_group_16")
    WebElement chkColorPink;
    //locator for available Yellow color product count
    @FindBy(xpath = "//label/a[contains(text(), 'Yellow')]/span")
    WebElement txaColorPinkCount;
    //locator for header message containing total filtered product
    @FindBy(xpath = "//span[@class='heading-counter']/span")
    WebElement txaTotalProductCount;
    //locator for list of filtered product
    @FindBy(xpath = "//ul[@class='product_list grid row']/li")
    WebElement lstProductRow;
    @FindBy(id = "color_43")
    WebElement lnkColorBox;


    public WomenPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //check if page loaded
    public boolean isFullPageLoaded() {
        return commons.isPageLoadComplete(driver);
    }

    //check if navigation path is visible
    public boolean isNavWomenVisible() {
        return commons.isDisplayed(navWomen);
    }

    //click category
    public boolean clickCategories() {
        commons.click(chkCategoryDresses);
        return true;
    }

    //click color pink
    public boolean clickColor() {
        commons.click(chkColorPink);
        return true;
    }

    //get clicked category's available product count
    public int getCategoryProductCount() {
        String categoryCount = commons.getText(txaCategoryDressesCount);
        availableCategoryProductCount = Integer.parseInt(categoryCount.replaceAll("[^0-9]", ""));
        return availableCategoryProductCount;
    }

    //get clicked color's available product count
    public int getColorProductCount() {
        String categoryCount = commons.getText(txaColorPinkCount);
        availableColorProductCount = Integer.parseInt(categoryCount.replaceAll("[^0-9]", ""));
        return availableColorProductCount;
    }

    //get header message available product count
    public int getHeaderMessageTotalProductCount() {
        String totalFilteredCount = commons.getText(txaTotalProductCount);
        totalProductCount = Integer.parseInt(totalFilteredCount.replaceAll("[^0-9]", ""));
        return totalProductCount;
    }

    //is category checkbox checked
    public boolean isCategoryCheckboxChecked() {
        return commons.isSelected(chkCategoryDresses);
    }

    //is color checkbox checked
    public boolean isColoCheckboxChecked() {
        return commons.isSelected(chkColorPink);
    }

    //check number of products showing with filters
    public boolean verifyHeaderMessageWithNumberOfFilteredProducts() {
        boolean flag = false;

        if (isColoCheckboxChecked() && getColorProductCount() == getHeaderMessageTotalProductCount()) {
            flag = true;
        }
        return flag;
    }

    //check color box on displayed product
    public boolean isSelectedColorDisplayed(int seconds) {
        commons.explicitlyWaitUntilElementToBeClickable(driver, seconds, lnkColorBox);
        return commons.isDisplayed(lnkColorBox);

    }


}
