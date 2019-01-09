package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy(className = "hometag")
    public static WebElement officeSupplies;
    @FindBy(id = "navGroup2")
    public static WebElement paper;
    @FindBy(id = "navGroup12")
    public static WebElement deals;
    @FindBy(id = "inkNav")
    public static WebElement ink;
    @FindBy(id = "navGroup3")
    public static WebElement breakRoom;
    @FindBy(xpath = "//*[@id=\"navGroup4\"]")
    public static WebElement cleaning;
    @FindBy(id = "navGroup5")
    public static WebElement technology;
    @FindBy(id = "navGroup6")
    public static WebElement furniture;
    @FindBy(id = "navGroup7")
    public static WebElement schoolSupplies;
    @FindBy(id = "navGroup8")
    public static WebElement printPlusCopy;
    @FindBy(id = "navGroup9")
    public static WebElement services;
    @FindBy(xpath = "//span[@class='hicons accnt_hicon']")
    public static WebElement account;
    @FindBy(id = "headerIdeas")
    public static WebElement ideas;
    @FindBy(id = "headerStores")
    public static WebElement stores;
    @FindBy(id = "headerCart")
    public static WebElement cart;
    @FindBy(id = "global_ad1_wrapper")
    public static WebElement offer;
    @FindBy(className = "customerService")
    public static WebElement helpCenter;

    @FindBy(className = "section")
    public static WebElement faqs;

    @FindBy(className = "w20")
    public static WebElement returnAnItem;
    //id, class, name, css, xpath, linked text, partial linked text, tag
    @FindBy(xpath = "//a[text()='Contact Us']")
    public static WebElement contactUs;


    public void checkOfficeSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        officeSupplies.click();
    }

    public void checkPaper() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        paper.click();
    }

    public void checkDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deals.click();
    }

    public void checkInk() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ink.click();
    }

    public void checkBreakroom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        breakRoom.click();
    }

    public void checkCleaning() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cleaning.click();
    }

    public void checkTechnology() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        technology.click();
    }

    public void checkFurniture() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        furniture.click();
    }

    public void checkSchoolSupplies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        schoolSupplies.click();
    }

    public void checkPrintPlusCopy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        printPlusCopy.click();
    }

    public void checkServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        services.click();
    }

    public void checkAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        account.click();
    }

    public void checkIdeas() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ideas.click();
    }

    public void checkStores() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        stores.click();
    }

    public void checkCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cart.click();
    }

    public void checkOffer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        offer.click();
    }

    public void checkHelpCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpCenter.click();
    }

    public void checkFaqs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        faqs.click();
    }

    public void checkReturnAnItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        returnAnItem.click();
    }

    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUs.click();
    }
}