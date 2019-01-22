package testHooverOver;

import hooverOver.HooverOver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHooverOver extends HooverOver {
    HooverOver hooverOver;
    @BeforeMethod
    public void init(){
        hooverOver = PageFactory.initElements(driver, HooverOver.class);
    }
    @Test
    public void testHooverOver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hooverOver.hooverTest();
    }
}
