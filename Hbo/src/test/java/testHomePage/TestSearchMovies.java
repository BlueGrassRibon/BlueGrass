package testHomePage;

import homePage.SearchMovies;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;
import java.io.IOException;

    public class TestSearchMovies extends SearchMovies {
        SearchMovies searchMovies;
        @Test
        public void testSearchMoviesBySubmitButton()throws IOException {
            searchMovies = PageFactory.initElements(driver, SearchMovies.class);
//            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            searchMovies.searchMoviesBySubmitButton();
        }
        @Test
        public void testSearchMoviesByENTERKeyword() throws IOException, InterruptedException {
            searchMovies = PageFactory.initElements(driver, SearchMovies.class);
            //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            searchMovies.searchMoviesByENTERKeyword();
        }
    }



