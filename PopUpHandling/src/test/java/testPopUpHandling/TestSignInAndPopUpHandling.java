package testPopUpHandling;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import popUpHandaling.HandlePopUp;
import popUpHandaling.SignInAndPopUpHandling;
import reporting.TestLogger;

public class TestSignInAndPopUpHandling extends SignInAndPopUpHandling {

    SignInAndPopUpHandling signInAndPopUpHandling;
    HandlePopUp handlePopUp;

    @BeforeMethod
    public void initialize(){
        signInAndPopUpHandling = PageFactory.initElements(driver, SignInAndPopUpHandling.class);
    }
    @Test(enabled = false, priority = 1)
    public void testLogInKey() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        signInAndPopUpHandling.checkLogInKey();
    }
    @Test(enabled = false, priority = 2)
    public void testEmailAddress() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.checkLogInKey();
        signInAndPopUpHandling.checkEmailAddress();
    }
    @Test(enabled = false, priority = 3)
    public void testPassword () throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        signInAndPopUpHandling.checkLogInKey();
        signInAndPopUpHandling.checkEmailAddress();
        signInAndPopUpHandling.checkPassword();
    }
    @Test(enabled = false, priority = 4)
    public void testSignInSubmitButton() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        signInAndPopUpHandling.waitToBeVisible();
        signInAndPopUpHandling.checkSubmitButton();
    }
    @Test(enabled = false, priority = 5)
    public void testSignInENTERKeyword() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        checkSignInByENTERKeyword("tofael483@gmail.com","Nabeeha19");
    }
    @Test(enabled = false, priority = 6)
    public void testSignInBySubmitButton() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        checkSignInBySubmitButton("tofael483@gmail.com","Nabeeha19");
    }
    @Test(enabled = false, priority = 7)
    public void testSignInByUsingMethodFromBaseUtil() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        checkSignInByUsingMethodFromBaseUtil("tofael483@gmail.com","Nabeeha19");
    }
    @Test(enabled = true)
    public void testPopUp() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInAndPopUpHandling.popUpHandling();
        Thread.sleep(5000);

    }

}
