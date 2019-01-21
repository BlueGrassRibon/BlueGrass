package popupHandelingBedBathBeyond;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HandlePopUp extends CommonAPI{

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

    public WebElement getbedBathBeyondPopUpCloseWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return bedBathBeyondPopUpCloseWindowWebElement;
    }

    public void setbedBathBeyondPopUpCloseWindowWebElement(WebElement bedBathBeyondPopUpCloseWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.bedBathBeyondPopUpCloseWindowWebElement = bedBathBeyondPopUpCloseWindowWebElement;
    }

    public boolean isbedBathBeyondPopUpWindowWebElementDisplayed(WebDriver driver, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = CommonAPI.isPopUpWindowDisplayed(driver, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setbedBathBeyondPopUpCloseWindowWebElement(bedBathBeyondPopUpCloseWindowWebElement);
        getbedBathBeyondPopUpCloseWindowWebElement().click();
    }
    public void handlePopUpWndowBeforeLogin(WebDriver driver)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CommonAPI.sleepFor(2);
        if(isbedBathBeyondPopUpWindowWebElementDisplayed(driver,".ModalDialog_1o3CoV.rclModal"));
        TestLogger.log("Yes, displayed. Handle it now.");
        closePopUpWindow();
        TestLogger.log("Sleep for 2 sec");
        CommonAPI.sleepFor(2);

    }
}
