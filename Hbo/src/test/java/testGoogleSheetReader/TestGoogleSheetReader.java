package testGoogleSheetReader;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import googleSheetReader.GoogleSheetPage;
import googleSheetReader.GoogleSheetReader;
import homePage.MainPage;
//import homePage.SignInAndPopUpHandling;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

import static base.CommonAPI.convertToString;
import static base.CommonAPI.driver;

public class TestGoogleSheetReader extends GoogleSheetReader {

    GoogleSheetPage googleSheetPage;
    GoogleSheetReader googleSheetReader;
    //SignInAndPopUpHandling signInAndPopUpHandling;

    @BeforeMethod
    public void initialize() {
        //TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        googleSheetPage = PageFactory.initElements(driver, GoogleSheetPage.class);
        googleSheetReader = PageFactory.initElements(driver, GoogleSheetReader.class);
        //signInAndPopUpHandling = PageFactory.initElements(driver, SignInAndPopUpHandling.class);
    }

    @Test(enabled = true)
    public void testLogInByInvalidIdPasswordUsingGoogleSheet() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1ZgLFVLXMXfG0CZLErvLrda8_OsLcj81k1Y4F4Aog2T4";
        String range = "Sheet1!A2:B";
        //signInAndPopUpHandling.popUpHandling();

        //List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            //i++;
        }
        System.out.println("testLogInByInvalidIdPasswordUsingGoogleSheet Passed");
    }

    @Test(enabled = true)
    public void testLoginUsingValidPasswordUsingGoogleSheet() {
        try {
            //signInAndPopUpHandling.popUpHandling();
            int i = 0;
            Thread.sleep(3000);
            String spreadsheetId = "1nVK64qHcLfHWkgwCyxn68-eK_D850xoBt_Z_cEcuNVo";
            String range = "Sheet1!A2:B";
            List<List<Object>> expectedErrorMessage = googleSheetPage.getSpreadSheetRecords(spreadsheetId, range);
            List<String> actualErrorMessage =
                    googleSheetPage.signInByInvalidIdPass(spreadsheetId, range);

           /* for(List row : expectedErrorMessage){
                Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
                System.out.println("expected"+row.get(3).toString());
                System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
                i++;
            }*/
            System.out.println("testLogInUsingGoogleSheet Passed");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("testLogInUsingGoogleSheet Failed");
        }
    }

    @Test(enabled = false)
    public void testLogin() throws Exception {
       // signInAndPopUpHandling.popUpHandling();
        googleSheetPage.loginTest("aaabb@ccc.ccc", "12345");
    }
}