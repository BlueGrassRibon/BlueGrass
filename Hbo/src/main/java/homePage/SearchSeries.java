package homePage;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchSeries extends CommonAPI {

    @FindBy(xpath = "//div[@class='bands/MainNavigation--topBar']//div[@class='bands/MainNavigation--searchIcon']")
    private static WebElement searchKey;
    @FindBy(xpath = "//input[@class='components/Search--searchInput']")
    private static WebElement searchField;
    @FindBy(xpath= "//span[@class='components/Search--submitIcon']")
    private static WebElement submitButton;

    public List<String> getSeriesList(){
        List<String> seriesList = new ArrayList<String>();
        seriesList.add("Alice");
        seriesList.add("Barry");
        seriesList.add("The Deuce");
        seriesList.add("Ballers");
        seriesList.add("Angry Boys");
        return seriesList;
    }

    public static WebElement getSearchKey() { return searchKey; }
    public static void setSearchKey(WebElement searchKey) { SearchSeries.searchKey = searchKey; }
    public static WebElement getSearchField() { return searchField; }
    public static void setSearchField(WebElement searchField) { SearchSeries.searchField = searchField; }
    public static WebElement getSubmitButton() { return submitButton; }
    public static void setSubmitButton(WebElement submitButton) { SearchSeries.submitButton = submitButton; }

    public static void waitToBeVisible(){
        TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchSeriesBySubmitButton()throws IOException {
        List<String> seriesList = getSeriesList();
        for(int i=0; i<seriesList.size(); i++) {
            //waitToBeVisible();
            getSearchKey().click();
            getSearchField().sendKeys(seriesList.get(i));
            getSubmitButton().click();
            //getSearchField().clear();
        }
    }
    public void searchSeriesByENTERKeyword()throws InterruptedException, IOException {
        List<String> seriesList = getSeriesList();
        for(String st: seriesList) {
            //waitToBeVisible();
            getSearchKey().click();
            getSearchField().sendKeys(st, Keys.ENTER);
            //getSearchField().clear();
        }
    }
}
