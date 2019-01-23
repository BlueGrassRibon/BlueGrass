package testPage;


import homePage.SearchLoanList;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestSearchLoanList extends SearchLoanList {
    SearchLoanList searchLoanList;
    @Test
    public void testSearchLoanBySubmitButton()throws IOException{
        searchLoanList = PageFactory.initElements(driver, SearchLoanList.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchLoanList.searchLoanBySubmitButton();
    }
    @Test
    public void testSearchLoanByENTERKeyword() throws IOException, InterruptedException {
        searchLoanList = PageFactory.initElements(driver, SearchLoanList.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchLoanList.searchLoanByENTERKeyword();
    }
}
