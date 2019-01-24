package dataProviderUtilityWithXlsReader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends CommonAPI {

    @FindBy(xpath = "////a[@id='accountLink']")
    public static WebElement signIn;
    @FindBy(xpath = "//input[@id='signin-email']")
    public static WebElement emailAddressOrLogIn;
    @FindBy(xpath = "//*[@id='signin-password']")
    public static WebElement passwordField;
    @FindBy(xpath = " //*[@id='signin-submit']")
    public static WebElement signInSubmitButton;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        signIn.click();
        emailAddressOrLogIn.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }

}