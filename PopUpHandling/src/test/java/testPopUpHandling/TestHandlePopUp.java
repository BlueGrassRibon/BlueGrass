package testPopUpHandling;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import popUpHandaling.HandlePopUp;
import reporting.TestLogger;

public class TestHandlePopUp extends HandlePopUp {

    HandlePopUp handlePopUp;

    @Test
    public void testPopUp()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        handlePopUp= PageFactory.initElements(driver, HandlePopUp.class);
        handlePopUp.handlePopUpWindowBeforeLogin(driver);
    }
}
