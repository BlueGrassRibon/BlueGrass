package popUpHandaling;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


public class HandlePopUp extends BaseUtil {

    @FindBy(css = ".ModalDialog_1o3CoV.rclModal")
    public WebElement bedBathBeyondPopUpWindowWebElement;

    @FindBy(css = ".rclCloseBtnWrapper.rclTopRight")
    public WebElement bedBathBeyondPopUpCloseWindowWebElement;
    public WebElement getbedBathBeyondPopUpWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return bedBathBeyondPopUpWindowWebElement;
    }
    public void setbedBathBeyondPopUpWindowWebElement(WebElement bedBathBeyondPopUpWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.bedBathBeyondPopUpWindowWebElement = bedBathBeyondPopUpWindowWebElement;
    }
    public WebElement getBedBathBeyondPopUpCloseWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return bedBathBeyondPopUpWindowWebElement;
    }

    public void setBedBathBeyondPopUpCloseWindowWebElement(WebElement bedBathBeyondPopUpCloseWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.bedBathBeyondPopUpCloseWindowWebElement = bedBathBeyondPopUpCloseWindowWebElement;
    }
    public boolean isBedBathBeyondPopUpWindowWebElementDisplayed(WebDriver driver, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = BaseUtil.isPopUpWindowDisplayed(driver, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setBedBathBeyondPopUpCloseWindowWebElement(bedBathBeyondPopUpCloseWindowWebElement);
        bedBathBeyondPopUpCloseWindowWebElement.click();
    }
    public void handlePopUpWindowBeforeLogin(WebDriver driver)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BaseUtil.sleepFor(2);
        if(isBedBathBeyondPopUpWindowWebElementDisplayed(driver,".ModalDialog_1o3CoV.rclModal"));
        TestLogger.log("Yes, displayed. Handle it now.");
        closePopUpWindow();
        TestLogger.log("Sleep for 2 sec");
        BaseUtil.sleepFor(2);
    }
}