package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LetUsHelpYou extends BaseUtil {
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[1]/a")
    public static WebElement yourAccount;

    public void checkYourAccount () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        yourAccount.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[2]/a")
    public static WebElement yourOrders;

    public void checkYourOrders () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        yourOrders.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[3]/a")
    public static WebElement shippingRatesAndPolicies;

    public void checkShippingRatesAndPolicies () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shippingRatesAndPolicies.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[4]/a")
    public static WebElement amazonPrime;

    public void checkAmazonPrime () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonPrime.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[5]/a")
    public static WebElement returnsAndReplacements;

    public void checkReturnsAndReplacements () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        returnsAndReplacements.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[6]/a")
    public static WebElement manageYourContentAndDevices;

    public void checkManageYourContentAndDevices () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        manageYourContentAndDevices.click();
    }
    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[7]/a")
    public static WebElement amazonAssistant;

    public void checkAmazonAssistant () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        amazonAssistant.click();
    }
}
