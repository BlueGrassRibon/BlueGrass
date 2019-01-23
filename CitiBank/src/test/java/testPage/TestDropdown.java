package testPage;

import homePage.Dropdown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropdown extends Dropdown {

    Dropdown DropDown;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        DropDown = PageFactory.initElements(driver, Dropdown.class);
    }

    @Test (enabled = true, priority = 1)
    public void testDropDownAllOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        DropDown.checkDropDownAllOption();
    }
    @Test (enabled = true, priority = 2)
    public void testDropDownSingleOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        DropDown.checkDropDownSingleOption();
    }
}
