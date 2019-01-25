package testHomePage;

import homePage.AmazonBusinesses;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAmazonBusinesse extends AmazonBusinesses {
    AmazonBusinesses amazonBusinesses;
    @Test
    public void testAmazonMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonBusinesses.checkAmazonMusic();
    }
    @Test
    public void testAmazonBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonBusinesses.checkAmazonBusiness();
    }

}
