package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import javax.xml.xpath.XPath;
public class AmazonAssociates extends BaseUtil {

    @FindBy(xpath = "//a[@title='Home']//span")
    public static WebElement amazonAssociates;

    public void checkAmazonAssociates () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
//        help.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Join')]")
    public static WebElement join;

    public void checkJoin () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
 //       join.click();
    }
    @FindBy(xpath = "//div[contains(text(),'Advertise')]")
    public static WebElement advertise;

    public void checkAdvertise () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
 //       advertise.click();
    }
    @FindBy(xpath = "//div[@class='ac-cms-h4 ac-cms-padding-top-10'][contains(text(),'Earn')]")
    public static WebElement earn;

    public void checkEarn () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  earn.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Advertising Fees »')]")
    public static WebElement advertisingFees;

    public void checkAdvertisingFees () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  advertisingFees.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Join Now for Free')]")
    public static WebElement joinNowForFree;

    public void checkJoinNowForFree () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   joinNowForFree.click();
    }
    @FindBy(xpath = "//button[@id='a-autoid-0-announce']")
    public static WebElement login;

    public void checkLogin () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   login.click();
    }
    @FindBy(xpath = "//span[@class='a-size-mini a-color-secondary']")
    public static WebElement locale;

    public void checkLocale () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   locale.click();
    }
    @FindBy(xpath = "//strong[contains(text(),'Learn More')]")
    public static WebElement learnMore;

    public void checkLearnMore () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  learnMore.click();
    }
    @FindBy(xpath = "//strong[contains(text(),'Customer Support')]")
    public static WebElement customerSupport;

    public void checkCustomerSupport () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   customerSupport.click();
    }
    @FindBy(xpath = "//strong[contains(text(),'Legal')]")
    public static WebElement legal;

    public void checkLegal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  legal.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Native Shopping Ads')]")
    public static WebElement nativeShoppingAds;

    public void checkNativeShoppingAds() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   nativeShoppingAds.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Resource Center')]")
    public static WebElement resourceCenter;

    public void checkResourceCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  resourceCenter.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement help;

    public void checkHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
     //   help.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Glossary')]")
    public static WebElement glossary;

    public void checkGlossary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    //    glossary.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Contact Us')]")
    public static WebElement contactUs;

    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
      //  contactUs.click();
    }
}
