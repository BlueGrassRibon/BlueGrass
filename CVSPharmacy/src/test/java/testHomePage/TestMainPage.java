package testHomePage;

import com.google.api.services.sheets.v4.Sheets;
import homePage.MainPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {

    MainPage mainPage;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object(){}.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName())); //implemented by Nasir
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test(enabled = false, priority = 1)
    public void testSignInKey(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSignInKey();
    }
    @Test(enabled = false, priority = 2)
    public void testEmailAddress(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSignInKey();
        mainPage.checkEmailAddress();
    }
    @Test(enabled = false, priority = 3)
    public void testPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkSignInKey();
        mainPage.checkEmailAddress();
        mainPage.checkPassword();
    }
    @Test(enabled = true, priority = 4)
    public void testSignInSubmitButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        mainPage.checkSubmitButton();
    }
    @Test(enabled = true, priority = 5)
    public void testSearchENTERKeyword() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkSignInByENTERKeyword("abc1234@gmail.com","cvsPharmacy");
    }
    @Test(enabled = true, priority = 6)
    public void testSearchBySubmitButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkSignInBySubmitButton("pqr1234@gmail.com","Pharmacy");
    }

}
