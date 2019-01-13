package testHomePage;


import homePage.LoanList;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestLoanList extends LoanList {
    LoanList loanList;
    @Test
    public void testSearchLoanBySubmitButton()throws IOException{
        loanList = PageFactory.initElements(driver, LoanList.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loanList.searchLoanBySubmitButton();
    }
    @Test
    public void testSearchLoanByENTERKeyword() throws IOException, InterruptedException {
        loanList = PageFactory.initElements(driver, LoanList.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        loanList.searchLoanByENTERKeyword();
    }
}
