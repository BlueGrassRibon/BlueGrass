package testXls;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import xlsReader.AmazonSignIn;
import xlsReader.XlsDataReaderUtil;

import java.util.ArrayList;
import java.util.Iterator;

public class TestXlsReader extends AmazonSignIn {
    AmazonSignIn amazonSignIn;

    @BeforeMethod
    public void init(){
        amazonSignIn = PageFactory.initElements(driver, AmazonSignIn.class);
    }

    @DataProvider
    public Iterator<Object[]> supplyData(){
        ArrayList<Object[]> testData =
                XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "supplyData", enabled = true)
    public void signIn(String email, String pass, String message)  {
        TestLogger.log("email: " + email);
        TestLogger.log("password: " + pass);
        TestLogger.log("message: " + message);

        TestLogger.log("In Sign In Page");
        amazonSignIn.signIn(email,pass,message);
        TestLogger.log("Test Passed");
        String invertedMsg = amazonSignIn.errorMsg.getText();
        Assert.assertEquals(invertedMsg,message);
    }
    @Test(enabled = false)
    public void signInHard(){
        amazonSignIn.signIn("aaabbbcc","akdkjdk", "There was a problem");
    }
}
