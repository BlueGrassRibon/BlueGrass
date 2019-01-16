package testHomePage;

import homePage.FetchDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFetchDropDown extends FetchDropDown {

    FetchDropDown fetchDropDown;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown = PageFactory.initElements(driver, FetchDropDown.class);
    }

    @Test
    public void testDropDown (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown.dropDown();
    }
}
