package homePage;


import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class SearchSingle extends CommonAPI {

    @FindBy(xpath = "//div[@class='bands/MainNavigation--topBar']//div[@class='bands/MainNavigation--searchIcon']")
    public static WebElement searchKey;
    @FindBy(xpath = "//input[@class='components/Search--searchInput']")
    public static WebElement searchField;
    @FindBy(xpath= "//span[@class='components/Search--submitIcon']")
    public static WebElement submitButton;

    public static void waitToBeVisible(){
        TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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