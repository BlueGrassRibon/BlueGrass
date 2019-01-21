package testAmazonDropdown;

    import amazonDropdown.FetchDropDown;
    import org.openqa.selenium.support.PageFactory;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Test;
    import reporting.TestLogger;

    import static base.CommonAPI.convertToString;

public class TestFetchDropDown extends FetchDropDown {

    FetchDropDown fetchDropDown;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + " : " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown = PageFactory.initElements(driver, FetchDropDown.class);
    }

    @Test
    public void testDropDownAllOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown.checkDropDownAllOption();
    }
    @Test
    public void testDropDownSingleOption (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        fetchDropDown.checkDropDownSingleOption();
    }
}
