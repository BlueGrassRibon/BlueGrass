package testSearch;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import search.SearchBook;
import search.SingleSearch;

import java.io.IOException;

public class TestMultipleSearch extends SearchBook {
    SearchBook searchBook;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBook =PageFactory.initElements(driver, SearchBook.class);
    }
    @Test
    public void testSearchMovies()throws IOException{
        searchBook = PageFactory.initElements(driver, SearchBook.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBook.searchBookBySubmitButton();
    }
    @Test
    public void testSearchMoviesByENTERKeyword() throws IOException, InterruptedException {
        searchBook = PageFactory.initElements(driver, SearchBook.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBook.searchBookByENTERKeyword();
    }
}