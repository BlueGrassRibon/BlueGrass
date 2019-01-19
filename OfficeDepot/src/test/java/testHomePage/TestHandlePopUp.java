package testHomePage;

import base.BaseUtil;
import homePage.HandlePopUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class TestHandlePopUp extends BaseUtil {

    HandlePopUp handlePopUp;

    @Test
    public void testPopUp()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        handlePopUp= PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWndowBeforeLogin(driver);
    }
}
