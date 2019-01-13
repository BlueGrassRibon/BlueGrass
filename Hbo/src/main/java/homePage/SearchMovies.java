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


public class SearchMovies extends CommonAPI {

    @FindBy(xpath = "//div[@class='bands/MainNavigation--topBar']//div[@class='bands/MainNavigation--searchIcon']")
    public static WebElement searchKey;
    @FindBy(xpath = "//input[@class='components/Search--searchInput']")
    public static WebElement searchField;
    @FindBy(xpath= "//span[@class='components/Search--submitIcon']")
    public static WebElement submitButton;

    public List<String> getMovieList(){
        List<String> movieList = new ArrayList<String>();
        movieList.add("17 Again");
        movieList.add("2500 km");
        movieList.add("5 Flights Up");
//        movieList.add("61*");
//        movieList.add("About Time");
//        movieList.add("Adam");
//        movieList.add("Agiants the Ropes");
//        movieList.add("Agiants the Wall");

        return movieList;
    }
    public void clickSearchKey(){
        searchKey.click();
    }
    public void putValueInSearchField(String value){
        searchField.sendKeys(value);
    }
    public void putValueInSearchFieldWithENTER(String value){
        searchField.sendKeys(value, Keys.ENTER);
    }
    public void submitSearchButton(){
        submitButton.click();
    }
//    public void clearInput(){
//        searchField.clear();
//    }
    public static void waitToBeVisible(){
       // TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchKey.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchMoviesBySubmitButton()throws IOException {
        List<String> movieList = getMovieList();
        for(int i=0; i<movieList.size(); i++) {//for loop
            //waitToBeVisible();  //need to be here
            clickSearchKey();  //no need, if given test failed
            putValueInSearchField(movieList.get(i));
            submitSearchButton();
            //clearInput();
        }
    }
    public void searchMoviesByENTERKeyword()throws InterruptedException, IOException {
        List<String> movieList = getMovieList();
        for(String st: movieList) {//for while loop
            waitToBeVisible();
            //clickSearchKey();  //no need
            //searchField.sendKeys(st, Keys.ENTER);
            putValueInSearchFieldWithENTER(st);  //ki hobe?
            //clearInput();
        }
    }
}
