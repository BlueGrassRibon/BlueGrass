package homePage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

import static java.lang.Thread.*;

public class CreditCardsPage extends BaseUtil {
    @FindBy(how = How.XPATH, using = "//*[@id=\"cA-cardsUseridMasked\"]")
    public static WebElement inputUserIdWebElement;
    public void InputUserId() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputUserIdWebElement.sendKeys("pntselenium");
        Thread.sleep(3000);}

    @FindBy(how = How.XPATH, using = "//*[@id=\"PASSWORD\"]")
    public static WebElement inputPasswordWebElement;
    public void InputPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inputPasswordWebElement.sendKeys("selenium18");}

    @FindBy(how = How.XPATH, using = "//*[@id=\"logon\"]/div[6]/input")
    public static WebElement clickSignInWebElement;
    public void SignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSignInWebElement.click();}

    public void logInByUserInput() throws InterruptedException {
        driver.get("https://www.citi.com/credit-cards/citi.action");
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        InputUserId();
        InputPassword();
        SignIn();
    }

    @FindBy(xpath = "//*[@id=\"cA-DD-cardCategory\"]/div[1]/div/a")
    public static WebElement selectCardCatagory;
    public void clickSelectCardCatagory() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        selectCardCatagory.click();
        Thread.sleep(3000);
        List<WebElement> DD_Menu = driver.findElements(By.xpath("//div[@class=\"dropdown\"]//ul"));
        for (int i=0; i<DD_Menu.size();i++) {
            WebElement element = DD_Menu.get(i);
            String text = element.getAttribute("innerHTML");
            if (text.contentEquals("Travel Cards")){
                element.click();
            }
            boolean status = element.isEnabled();
            System.out.println("Values from dromdown is: " + text + "; and the link is: " + status);
        }
    }

    @FindBy(xpath = "//*[@id=\"compareWidget\"]/div[1]/a")
    public static WebElement compareCards;

    @FindBy(xpath = "//*[@id=\"compareWidget\"]/div[2]/div[1]/p/a")
    public static WebElement addCard;

    public void clickCompareCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        compareCards.click();
        addCard.click();
    }

    @FindBy(xpath = "//*[@id=\"banking\"]")
    public static WebElement bankingTab;
    public void clickBankingTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        bankingTab.click();
        Thread.sleep(3000);
        List<WebElement> DD_Menu = driver.findElements(By.xpath("//ul[@id=\"mm_banking\"]/div/li[1]/ul/li[2]/ul/li"));
        for (int i=0; i<DD_Menu.size();i++) {
            WebElement element = DD_Menu.get(i);
            String text = element.getAttribute("innerHTML");
            if (text.contentEquals("IRAs & Rollovers")){
                element.click();
            }
            boolean status = element.isEnabled();
            System.out.println("Values from dromdown is: " + text + "; and the link is: " + status);
        }
    }
}