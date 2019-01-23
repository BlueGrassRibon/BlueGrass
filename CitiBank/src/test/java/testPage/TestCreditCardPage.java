package testPage;

import base.BaseUtil;
import homePage.CreditCardsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reporting.TestLogger;

//import static java.util.regex.Pattern.getClass;

public class TestCreditCardPage extends CreditCardsPage{
    CreditCardsPage objOfCreditCards;

    @Test
    public void Launching(){
        objOfCreditCards = PageFactory.initElements(driver,CreditCardsPage.class);
        //driver.get("https://www.citi.com/credit-cards/citi.action");
    }

    @Test
    public void testlogInByUaerInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfCreditCards.logInByUserInput();
    }

    @Test
    public void testSelectCardCatagory() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSelectCardCatagory();
    }

    @Test
    public void testCompareCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickCompareCards();
    }

    @Test
    public void testClickBankingTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickBankingTab();
    }
}
