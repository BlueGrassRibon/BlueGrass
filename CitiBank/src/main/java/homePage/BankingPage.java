package homePage;

import base.BaseUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class BankingPage extends BaseUtil {
    @FindBy(how = How.LINK_TEXT, using = "Banking")
    public static WebElement bankingWebElement;
    public void clickBanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bankingWebElement.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"hero-a-2-card\"]/section/div[2]/div/div/div/div/div[2]/div/div/div[2]/button")
    public static WebElement learnMoreWebElement;
    public void LearnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMoreWebElement.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"inpagenav-1-1-a-Tab\"]/span")
    public static WebElement checkingWebElement;
    public void Checking(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        checkingWebElement.click();
    }

    @FindBy(xpath = "//*[@id=\"searchicon\"]")
    public static WebElement searchIcon;
    public void clickSearchIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchIcon.click();
    }

    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
    public static WebElement searchBar;
    public void inputInSearchBar(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.sendKeys("investment");
    }

    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
    public static WebElement searchButton;
    public void clickSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchButton.click();
    }

    public void singleItemSearch() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + BaseUtil.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickBanking();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        clickSearchIcon();
        Thread.sleep(2000);
        inputInSearchBar();
        Thread.sleep(2000);
        clickSearchButton();
    }
}
