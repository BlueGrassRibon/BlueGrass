package homePage;

import base.BaseUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import java.util.List;

public class LendingPage extends BaseUtil {
    @FindBy(how = How.LINK_TEXT, using = "Lending")
    public static WebElement lendingWebElement;
    public void mouseOverLending(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Actions actions = new Actions(driver);
        actions.moveToElement(lendingWebElement).perform();
        List<WebElement> list = driver.findElements(By.xpath("//li[@id=\"lendingLi\"]//a"));
        int total_count = list.size();
        for (int i = 0; i < total_count; i++){
            WebElement element = list.get(i);
            String text = element.getAttribute("innerHTML");
            System.out.println("Links name is: " + text);
        }
    }

    @FindBy(xpath = "//*[@id=\"dropdown_lending\"]/ul/li[1]/a")
    public static WebElement loansAndLines;

    public void personalLoansAndLines() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lendingWebElement.click();
        Thread.sleep(2000);
        loansAndLines.click();
    }

  /*  @FindBy(xpath = "//*[@id=\"lendingLi\"]/div/ul/li[2]")
    public static WebElement mortgage;

    @FindBy(xpath = "//*[@id=\"cmlink_mortgage_request_callback\"]")
    public static WebElement buyHome;

    public void mortgageTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lendingWebElement.click();
        Thread.sleep(2000);
        mortgage.click();
        buyHome.click();
    }*/
}
