package testHomePage;

import homePage.AmazonAssociates;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAmazonAssociates extends AmazonAssociates {
    AmazonAssociates amazonAssociates;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates = PageFactory.initElements(driver, AmazonAssociates.class);
    }
    @Test
    public void testAmazonAssociates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkAmazonAssociates();
    }
    @Test
    public void testJoin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkJoin();
    }
    @Test
    public void testAdvertise() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkAdvertise();
    }
    @Test
    public void testEarn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkEarn();
    }
    @Test
    public void testAdvertisingFees() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkAdvertisingFees();
    }
    @Test
    public void testJoinNowForFree() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkJoinNowForFree();
    }
    @Test
    public void testLogin() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkLogin();
    }
    @Test
    public void testLocale() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkLocale();
    }
    @Test
    public void testLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkLearnMore();
    }
    @Test
    public void testCustomerSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkCustomerSupport();
    }
    @Test
    public void testLegal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkLegal();
    }
    @Test
    public void testNativeShoppingAds() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkNativeShoppingAds();
    }
    @Test
    public void testResourceCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkResourceCenter();
    }
    @Test
    public void testHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkHelp();
    }
    @Test
    public void testGlossary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkGlossary();
    }
    @Test
    public void testContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssociates.checkContactUs();
    }
}