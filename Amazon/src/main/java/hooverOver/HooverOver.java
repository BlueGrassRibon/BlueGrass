package hooverOver;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HooverOver extends BaseUtil {
    @FindBy (css = "#nav-link-accountList")
    public static WebElement accountsAndLists;

    public void hooverTest(){
        Actions action = new Actions(driver);
        action.moveToElement(accountsAndLists).build().perform();
    }

}
