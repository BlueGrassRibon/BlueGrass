package testSearch;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.SingleSearch;

public class TestSingleSearch extends SingleSearch {

    public String keys = "Honey";
    SingleSearch singleSearch;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        singleSearch = PageFactory.initElements(driver, SingleSearch.class);
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