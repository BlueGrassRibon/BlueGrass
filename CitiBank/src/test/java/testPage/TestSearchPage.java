package testPage;

import homePage.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchPage extends SearchPage {

    public String keys = "Car loan ";

    SearchPage searchPage;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }
    @Test
    public void testSearchWithEnter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys);
    }
    @Test
    public void testSearchWithButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys);
    }
}