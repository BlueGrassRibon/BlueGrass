package popUpHandaling;

import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;


public class SignInAndPopUpHandling extends BaseUtil {
    @FindBy(xpath = "//a[text()='Login or Register']")
    public static WebElement logInKey;
    @FindBy(xpath = "//input[@name='loginName']")
    public static WebElement emailAddressOrLogIn;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement passwordField;
    @FindBy(xpath = "//input[@class='btn rounded w100 primary js_loginBtn']")
    public static WebElement signInSubmitButton;
    @FindBy(css = ".bx-group.bx-group-default.bx-group-752704-jm7tQao bx-group-jm7tQao")
    public WebElement officeDepotPopUpWindowWebElement;
    @FindBy(css = ".bx-close-xsvg")
    public WebElement officeDepotPopUpCloseWindowWebElement;
    public void checkLogInKey() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logInKey.click();
    }
    public void checkEmailAddress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        emailAddressOrLogIn.click();
    }
    public void checkPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        passwordField.click();
    }
    public void checkSubmitButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInSubmitButton.click();
    }
    public static void waitToBeVisible(){
        TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logInKey.click();
        wait.until(ExpectedConditions.visibilityOf(emailAddressOrLogIn));
    }
    public void checkSignInBySubmitButton(String email, String password) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }
    public void checkSignInByENTERKeyword(String email, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password, Keys.ENTER);
    }
    public void checkSignInByUsingMethodFromBaseUtil(String email, String password) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        //waitUntilClickAble(By.xpath("//a[text()='Login or Register']"));
        waitUntilClickAble(logInKey);
        waitUntilVisible(By.xpath("//input[@name='loginName']"));
        waitToBeVisible();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }
    public void popUpHandling()throws InterruptedException{
      /*  String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        subWindowHandler = iterator.next();
        driver.switchTo().window(subWindowHandler);*/
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(officeDepotPopUpCloseWindowWebElement));
        officeDepotPopUpCloseWindowWebElement.click();
        // driver.switchTo().window(parentWindowHandler);
    }
}