package testHomePage;

import homePage.LetUsHelpYou;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLetUsHelpYou extends LetUsHelpYou {
    LetUsHelpYou letUsHelpYou;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou = PageFactory.initElements(driver, LetUsHelpYou.class);
    }
    @Test
    public void testYourAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkYourAccount();
    }
    @Test
    public void testYourOrders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkYourOrders();
    }
    @Test
    public void testShippingRatesAndPolicies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkShippingRatesAndPolicies();
    }
    @Test
    public void testAmazonPrime() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkAmazonPrime();
    }
    @Test
    public void testReturnsAndReplacements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkReturnsAndReplacements();
    }
    @Test
    public void testManageYourContentAndDevices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkManageYourContentAndDevices();
    }
    @Test
    public void testAmazonAssistant() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        letUsHelpYou.checkAmazonAssistant();
    }
}
