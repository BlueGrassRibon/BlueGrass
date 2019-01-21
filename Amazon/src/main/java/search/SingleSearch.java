package search;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

public class SingleSearch extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    public static WebElement searchField;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[3]")
    public static WebElement submitButton;


    public static void waitToBeVisible(){
        //TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchField.click();
        wait.until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchByENTERKeyword(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchField.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchBySubmitButton(String searchKeys){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        waitToBeVisible();
        searchField.sendKeys(searchKeys);
        submitButton.click();
    }
}
