package dataProviderUtilityWithXlsReader;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends BaseUtil {

    @FindBy (xpath = "//input[@name='username']")
    public static WebElement userID;
    @FindBy(xpath = "//input[@class='form-control']")
    public static WebElement passwordField;
    @FindBy (id = "signInBtn")
    public static WebElement signOnSubmitButton;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        userID.sendKeys(email);
        passwordField.sendKeys(password);
        signOnSubmitButton.click();
    }

}