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

    @Test (enabled = true, priority = 1)
    public void testDropDown (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown.checkDropDown();
    }
    @Test (enabled = true, priority = 2)
    public void testDropDownSingleOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown.checkDropDownSingleOption();
    }
}
