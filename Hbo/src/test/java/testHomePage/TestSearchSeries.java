package testHomePage;

import homePage.SearchSeries;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class TestSearchSeries extends SearchSeries {
    SearchSeries searchSeries;
    @Test
    public void testSearchSeriesBySubmitButton()throws IOException{
        searchSeries = PageFactory.initElements(driver, SearchSeries.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchSeries.searchSeriesBySubmitButton();
    }
    @Test
    public void testSearchSeriesByENTERKeyword() throws IOException, InterruptedException {
        searchSeries = PageFactory.initElements(driver, SearchSeries.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchSeries.searchSeriesByENTERKeyword();
    }
}

