package homePage;

import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//button[@id='signInBtn']")
    public static WebElement signInKey;
    @FindBy(xpath = "//input[@id='clubLoginEmail']")
    public static WebElement emailAddress;
    @FindBy(xpath = "//input[@id='clubLoginPwd']")
    public static WebElement passwordField;
    //@FindBy(xpath = "//button[text()='Sign In' and @class='my-cvs']")
    @FindBy(xpath = "//div[@class='signin-button']")
    public static WebElement signInSubmitButton;


    public void checkSignInKey() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInKey.click();
    }
    public void checkEmailAddress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        emailAddress.click();
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
        signInKey.click();
        wait.until(ExpectedConditions.visibilityOf(emailAddress));
    }
    public void checkSignInBySubmitButton(String email, String password) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        emailAddress.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }
    public void checkSignInByENTERKeyword(String email, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        emailAddress.sendKeys(email);
        passwordField.sendKeys(password, Keys.ENTER);
    }
}