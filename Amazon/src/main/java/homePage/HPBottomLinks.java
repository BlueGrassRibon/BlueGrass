package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HPBottomLinks extends BaseUtil {
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[1]/a")
    public static WebElement amazonWebServices;

    public void checkAmazonWebServices () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonWebServices.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[1]/a")
    public static WebElement eastDane;

    public void checkEastDane () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        eastDane.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[1]/a")
    public static WebElement primeNow;

    public void checkPrimeNow () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        primeNow.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[3]/a")
    public static WebElement amazonAdvertising;

    public void checkAmazonAdvertising () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAdvertising.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[3]/a")
    public static WebElement amazonFresh;

    public void checkAmazonFresh () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonFresh.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[3]/a")
    public static WebElement audible;

    public void checkAudible () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        audible.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[3]/a")
    public static WebElement fabric;

    public void checkFabric () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fabric.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[3]/a")
    public static WebElement amazonPhotos;

    public void checkAmazonPhotos () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonPhotos.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[11]/td[3]/a")
    public static WebElement zappos;

    public void checkZappos () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        zappos.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[5]/a")
    public static WebElement amazonDrive;

    public void checkAmazonDrive () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonDrive.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[5]/a")
    public static WebElement amazonGlobal;

    public void checkAmazonGlobal () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonGlobal.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[5]/a")
    public static WebElement bookDepository;

    public void checkBookDepository () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bookDepository.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[7]/td[5]/a")
    public static WebElement goodReads;

    public void checkGoodReads () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        goodReads.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[9]/td[5]/a")
    public static WebElement primeVideoDirect;

    public void checkPrimeVideoDirect () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        primeVideoDirect.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[3]/td[7]/a")
    public static WebElement homeServices;

    public void checkHomeServices () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeServices.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[5]/td[7]/a")
    public static WebElement boxOfficeMojo;

    public void checkBoxOfficeMojo () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeServices.click();
    }

}
