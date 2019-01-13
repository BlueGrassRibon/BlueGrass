package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class SearchPage extends BaseUtil {

    @FindBy(xpath = "//*[@id=\"searchicon\"]")
    public static WebElement searchKey;
    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
    public static WebElement searchField;
    @FindBy(xpath= "//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
    public static WebElement submitButton;

    public static void waitToBeVisible(){
        TestLogger.log(SearchPage.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchByENTERKeyword(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchBySubmitButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchField.sendKeys(searchKeys);
        submitButton.click();
    }
}