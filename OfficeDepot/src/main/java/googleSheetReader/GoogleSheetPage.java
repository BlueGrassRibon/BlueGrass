package googleSheetReader;

import base.BaseUtil;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static base.BaseUtil.driver;
import static googleSheetReader.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage {

    @FindBy(xpath = "//li[@class='login_state']")
    public static WebElement logInKey;
    @FindBy(xpath = "//input[@name='loginName']")
    public static WebElement email;
    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;
    @FindBy(xpath = "//input[@class='btn rounded w100 primary js_loginBtn']")
    public static WebElement signInSubmitButton;


    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> valueInColumn = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();

        for (List row : valueInColumn) {
            Thread.sleep(3000);
            logInKey.click();
            //email.sendKeys(row.get(0).toString());
            inputValueInTextBoxByWebElement(email, row.get(0).toString());
            //password.sendKeys(row.get(1).toString(),Keys.ENTER);
            inputValueInTextBoxByWebElement(password, row.get(1).toString());
            WebDriverWait wait = new WebDriverWait(driver,3);
            wait.until(ExpectedConditions.elementToBeClickable(signInSubmitButton));
            signInSubmitButton.click();
            //actual.add(getCurrentPageTitle());
           // actual.add(getTextByWebElement(errorMsg));
            //System.out.println(getTextByWebElement(errorMsg));
        }
        return actual;
    }
    //checking fileds are taking input or not
    public void loginTest(String emailIn, String pass) throws Exception{
        Thread.sleep(3000);
        logInKey.click();
        email.sendKeys(emailIn);
        password.sendKeys(pass);
        signInSubmitButton.click();

    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value );
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}
