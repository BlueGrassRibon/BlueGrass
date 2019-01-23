package testPage;

import base.BaseUtil;
import homePage.LendingPage;
import testPage.TestCreditCardPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public class TestLendingPage extends LendingPage {
    LendingPage lendingPage;
    @BeforeMethod
    public void Navigating() throws IOException {
        lendingPage = PageFactory.initElements(driver, LendingPage.class);
    }

    @Test
    public void mouseOverLendingTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseOverLending();
    }

    @Test
    public void testLoansAndLines() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        personalLoansAndLines();
    }

    @Test
    public void testMortgage() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mortgageTab();
    }
}