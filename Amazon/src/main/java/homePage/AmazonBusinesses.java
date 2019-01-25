package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AmazonBusinesses extends BaseUtil {

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[1]/a")
    public static WebElement amazonMusic;

    public void checkAmazonMusic () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonMusic.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[1]/a")
    public static WebElement amazonBusiness;

    public void checkAmazonBusiness () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonBusiness.click();
    }
}
