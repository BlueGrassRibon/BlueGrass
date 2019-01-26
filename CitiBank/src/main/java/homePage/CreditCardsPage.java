package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class CreditCardsPage extends BaseUtil {
    @FindBy(how = How.XPATH, using = "//*[@id=\"cA-cardsUseridMasked\"]")
    public static WebElement inputUserIdWebElement;

    public void InputUserId() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputUserIdWebElement.sendKeys("pntselenium");
        Thread.sleep(3000);
    }

}


