package homePage;

import base.BaseUtil;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy (css = "#headerLoka ogoLink")
    public static WebElement logo;
    @FindBy (xpath = "//a[text()='ATM / Branch']")
    public static WebElement atmBranch;
    @FindBy (xpath = " //a[contains(text(), 'Open an Account')]")
    public static WebElement openAnAccount;
    @FindBy (xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[3]/a")
    public static WebElement english;
    @FindBy ( xpath = "//img[@id='searchicon']") //start with " then // then htmltag [@id or class or name = 'paste id or class or name' ]"
    public static WebElement searchIcon;
    @FindBy (xpath = "//*[@id=\"creditCards\"]/a")
    public static WebElement creditCards;
    @FindBy (xpath = "//*[@id=\"banking\"]/a")
    public static WebElement banking;
    @FindBy (linkText = "sub_menu_dropdown has-drop subnav_inner-btn testLending")
    public static WebElement lending;
    @FindBy (css = ".sub_menu_dropdown has-drop subnav_inner-btn testLending")
    public static WebElement Investing;
    @FindBy (xpath = "sub_menu_dropdown has-drop subnav_inner-btn")
    public static WebElement citiGold;
    @FindBy (xpath = "//input[@id='username' and @class='form-control userMask' and @name='username']")
    public static WebElement userName;
    @FindBy (className = "form-control")
    public static WebElement password;
    @FindBy (id = "rememberUidLabel")
    public static WebElement rememberMyUserId;
    @FindBy (id = "signInBtn")
    public static WebElement signOn;
    @FindBy (partialLinkText = "btn btn-link removeMobilePadding request")
    public static WebElement forgotUserId;
    @FindBy (id = "activate_card")
    public static WebElement activateAId;
    @FindBy (className = "RequestUserIDReminder-mobile")
    public static WebElement forgotPassword;
    @FindBy (id = "activate_card")
    public static WebElement registerForOnlineAccess;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[1]/div/h3/a")
    public static WebElement noLateFeesEver;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[2]/div/h3/a")
    public static WebElement hollywoodSpendingSolutions;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[3]/div/h3/a")
    public static WebElement promoInterestRate;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[1]/a/img")
    public static WebElement citiSimplicityCard;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[2]/a")
    public static WebElement learnMore;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[3]/div/div[1]/a/img")
    public static WebElement image;
    @FindBy (xpath = "///*[@id=\"mm-container\"]/section[2]/div/div[2]/a")
    public static WebElement learnMore2;
    @FindBy (xpath = "//*[@id=\"mm-container\"]/section[3]/div/div[2]/a")
    public static WebElement learnMore3;
    @FindBy (xpath = "//*[@id=\"module-container\"]/section[1]/div/div/div/div/div[1]/div/a/img")
    public static WebElement image2;
    @FindBy (xpath = "//*[@id=\"module-container\"]/section[1]/div/div/div/div/div[1]/div/a/img")
    public static WebElement citilogo2;
    @FindBy (xpath = "//div[@class='module-copy']")
    public static WebElement experienceMore;
    @FindBy (xpath = "//a[@type='button']")
    public static WebElement learnMore4;
    @FindBy (xpath = "//a[@class='btn btn-primary']")
    public static WebElement healpfullTips;
    @FindBy (xpath = "//span[@class='appStoreImage_1px']")
    public static WebElement appleStoreTab;
    @FindBy (xpath = "//span[@class='googlePlayImage_1px']")
    public static WebElement googlePlayTab;
    @FindBy (xpath = "//*[@id=\"whyCiti\"]/h2/b")
    public static WebElement whyCiti;
    @FindBy (xpath = "//*[@id=\"whyCiti\"]/ul/li[1]/a")
    public static WebElement ourStory;

    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkAtmBranch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        atmBranch.click();
    }
    public void checkOpenAnAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openAnAccount.click();
    }
    public void checkEnglish(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        english.click();
    }
    public void checkSearchIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchIcon.click();
    }
    public void checkCreditCards(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        creditCards.click();
    }
    public void checkbanking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        banking.click();
    }
    public void checklending(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lending.click();
    }
    public void checkInvesting(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Investing.click();
    }
    public void checkCitiGold(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        citiGold.click();
    }
    public void checkUserName(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        userName.click();
    }
    public void checkPassWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        password.click();
    }
    public void checkRememberMyUserId(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        rememberMyUserId.click();
    }
    public void checkSignOn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signOn.click();
    }
    public void checkForgotUserId(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        forgotUserId.click();
    }
    public void checkActivateAId(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        activateAId.click();
    }
    public void checkForgotPassword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        forgotPassword.click();
    }
    public void checkRegisterForOnlineAccess(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registerForOnlineAccess.click();
    }
    public void checkNoLateFeesEver(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        noLateFeesEver.click();
    }
    public void checkHollywoodSpendingSolutions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hollywoodSpendingSolutions.click();
    }
    public void checkPromoInterestRate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        promoInterestRate.click();
    }
    public void checkCitiSimplicityCard(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        citiSimplicityCard.click();
    }
    public void checkLearnMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore.click();
    }
    public void checkImage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        image.click();
    }
    public void checkLearnMore3(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore2.click();
    }
    public void checkLearnMore2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore3.click();
    }
    public void checkImage2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        image2.click();
    }
    public void checkCitiLogo2(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        citilogo2.click();
    }
    public void checkExperienceMore(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        experienceMore.click();
    }
    public void checkLearnMore4(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore4.click();
    }
    public void checkHealpfulTips(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learnMore4.click();
    }
    public void checkAppleStoreTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appleStoreTab.click();
    }
    public void checkGooglePlayTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        googlePlayTab.click();
    }
    public void checkWhyCiti(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        googlePlayTab.click();
    }
    public void checkOurStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ourStory.click();
    }
}