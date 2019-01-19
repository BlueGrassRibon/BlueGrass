package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class HandlePopUp {

    @FindBy(css = ".bx-group.bx-group-default.bx-group-752704-jm7tQao bx-group-jm7tQao")
    public WebElement officeDepotPopUpWindowWebElement;

    @FindBy(css = ".bx-close-xsvg")
    public WebElement officeDepotPopUpCloseWindowWebElement;



    public WebElement getOfficeDepotPopUpWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return officeDepotPopUpWindowWebElement;
    }

    public void setOfficeDepotPopUpWindowWebElement(WebElement officeDepotPopUpWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.officeDepotPopUpWindowWebElement = officeDepotPopUpWindowWebElement;
    }

    public WebElement getOfficeDepotPopUpCloseWindowWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return officeDepotPopUpCloseWindowWebElement;
    }

    public void setOfficeDepotPopUpCloseWindowWebElement(WebElement officeDepotPopUpCloseWindowWebElement) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        this.officeDepotPopUpCloseWindowWebElement = officeDepotPopUpCloseWindowWebElement;
    }

    public boolean isOfficeDepotPopUpWindowWebElementDisplayed(WebDriver driver, String locator){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean value = BaseUtil.isPopUpWindowDisplayed(driver, locator);
        return value;
    }
    public void closePopUpWindow(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        setOfficeDepotPopUpCloseWindowWebElement(officeDepotPopUpCloseWindowWebElement);
        getOfficeDepotPopUpCloseWindowWebElement().click();
    }
    public void handlePopUpWndowBeforeLogin(WebDriver driver)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BaseUtil.sleepFor(2);
        if(isOfficeDepotPopUpWindowWebElementDisplayed(driver,".bx-group.bx-group-default.bx-group-752704-jm7tQao.bx-group-jm7tQao"));
        TestLogger.log("Yes, displayed. Handle it now.");
        closePopUpWindow();
        TestLogger.log("Sleep for 2 sec");
        BaseUtil.sleepFor(2);

    }






}
