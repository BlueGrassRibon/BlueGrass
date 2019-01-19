package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//div[@class='brandLogo defaultLogo  ']")
    public static WebElement logo;
    @FindBy(xpath = "//input[@id='mainSearchField']")
    public static WebElement searchField;
    @FindBy(id = "hploc__sel-text-hosp")
    public static WebElement submitButton;


    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkSearchField() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchField.click();
    }
    public void checkSubmitButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        submitButton.click();
    }
}