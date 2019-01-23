package testPage;

import base.BaseUtil;
import homePage.BankingPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

class TestBankingPage extends BankingPage {
    BankingPage banking;
    @BeforeMethod
    public void AlertHandle(){
        //HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        banking = PageFactory.initElements(driver, BankingPage.class);
        //driver.get("https://online.citi.com/US/banking/citi.action?ID=banking-overview");
    }
    @Test
    public void handleAlert() throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    @Test
    public void learnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        LearnMore();
    }

    @Test
    public void CheckingTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Checking();
    }

    @Test
    public void singleItemSearchTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        singleItemSearch();
    }

}