package testHomePage;

import homePage.SearchSingle;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSearchSingle extends SearchSingle {

    public String keys = "Ocean's 8";

    SearchSingle searchSingle;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchSingle = PageFactory.initElements(driver, SearchSingle.class);
    }
    @Test
    public void testSearchENTERKeyword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByENTERKeyword(keys);
    }
    @Test
    public void testSearchBySubmitButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBySubmitButton(keys);
    }
}