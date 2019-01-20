package dataProviderUtilityWithXlsReader;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

public class LogInByXls extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"IDToken1\"]")
    public static WebElement userId;
    @FindBy(xpath = "//*[@id=\"IDToken2\"]")
    public static WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"tvloginsignin\"]")
    public static WebElement signInSubmitButton;

    @FindBy(xpath = "//img[@title='Verizon FiOS']")
    public static WebElement hboFios;

    @DataProvider
    public Iterator<Object[]> supplyDataExcel(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ArrayList<Object[]> testDataExcel = XlsDataReaderUtil.getDataFromExcel();
        return testDataExcel.iterator();
    }
    public void signInByDataProvider(String email, String password) throws Exception{
        Thread.sleep(3000);
        userId.click();
        hboFios.sendKeys(email);
        passwordField.sendKeys(password);
        signInSubmitButton.click();
    }

}