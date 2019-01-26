package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(css = "#headerLoka ogoLink")
    public static WebElement logo;
    @FindBy(xpath = "//a[text()='ATM / Branch']")
    public static WebElement atmBranch;
    @FindBy(xpath = " //a[contains(text(), 'Open an Account')]")
    public static WebElement openAnAccount;
    @FindBy(linkText = "Español")
    public static WebElement english;
    @FindBy(xpath = "//img[@id='searchicon']")
    public static WebElement searchIcon;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[1]/a")
    public static WebElement ourStory;
    @FindBy(id = "citi-autocomplete-content-searchbox-livesearch")
    public static WebElement searchField;
    @FindBy(className = "citi-autocomplete-content-searchbox-go")
    public static WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"banking\"]/a")
    public static WebElement banking;
    @FindBy(xpath = "//a[@id='lending']")
    public static WebElement lending;
    @FindBy(xpath = "//a[@id='investing']")
    public static WebElement Investing;
    @FindBy(xpath = "//div[@class='accordionSubMenu']//a[text()='Citigold']")
    public static WebElement citiGold;
    @FindBy(xpath = "//input[@name='username']")
    public static WebElement userName;
    @FindBy(xpath = "//input[@class='form-control']")
    public static WebElement password;
    @FindBy(id = "rememberUidLabel")
    public static WebElement rememberMyUserId;
    @FindBy(id = "signInBtn")
    public static WebElement signOn;
    @FindBy(partialLinkText = "btn btn-link removeMobilePadding request")
    public static WebElement forgotUserId;
    @FindBy(id = "activate_card")
    public static WebElement activateAId;
    @FindBy(className = "RequestUserIDReminder-mobile")
    public static WebElement forgotPassword;
    @FindBy(id = "activate_card")
    public static WebElement registerForOnlineAccess;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/h3/a")
    public static WebElement noLateFeesEver;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/h3/a")
    public static WebElement hollywoodSpendingSolutions;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/h3/a")
    public static WebElement promoInterestRate;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[1]/a/img")
    public static WebElement citiSimplicityCard;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[2]/a")
    public static WebElement learnMore;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/div[1]/a/img")
    public static WebElement image;
    @FindBy(xpath = "///*[@id=\"mm-container\"]/section[2]/div/div[2]/a")
    public static WebElement learnMore2;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/div[2]/a")
    public static WebElement learnMore3;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[1]/div/div/div/div/div[1]/div/a/img")
    public static WebElement image2;
    @FindBy(xpath = "//div[@class='brandingLogo-footer pull-left']")
    public static WebElement citilogo2;
    @FindBy(xpath = "//div[@class='module-copy']")
    public static WebElement experienceMore;
    @FindBy(xpath = "//a[@type='button']")
    public static WebElement learnMore4;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public static WebElement healpfullTips;
    @FindBy(xpath = "//span[@class='appStoreImage_1px']")
    public static WebElement appleStoreTab;
    @FindBy(xpath = "//span[@class='googlePlayImage_1px']")
    public static WebElement googlePlayTab;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/h2/b")
    public static WebElement whyCiti;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[1]/a")
    public static WebElement getOurStory;
    @FindBy(xpath = "//*[@id=\"\"]/ul/li[2]/a")
    public static WebElement getCareer;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[3]/a")
    public static WebElement benefitsAndServices;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[4]/a")
    public static WebElement rewards;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/h2/b")
    public static WebElement relationshipBanking;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[1]/a")
    public static WebElement citiPriority;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[1]/a")
    public static WebElement citiPrivateBank;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[1]/a")
    public static WebElement businessBanking;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[3]/ul/li[1]/a")
    public static WebElement smallBusinessAccount;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[3]/ul/li[2]/a")
    public static WebElement commercialAccount;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/h2/b")
    public static WebElement rates;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[1]/a")
    public static WebElement personalBanking;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[1]/a")
    public static WebElement hereToHelp;
    @FindBy(xpath = "//*[@id=\"maincontent\"//*[@id=\"maincontent\"]/div[1]/div[2]/section/div/div[2]/div/div[2]/h2")
    public static WebElement creditcardForYou;
    @FindBy(xpath= " //*[@id=\"maincontent\"]/div[1]/div[2]/section/div/div[2]/div/div[2]/p")
    public static WebElement cashBack;
    @FindBy(id = "rememberUidLabel")
    public static WebElement bankingMadeEasy;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/h3/a")
    public static WebElement newLowRate;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/h3/a")
    public static WebElement earnCashBack;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[1]/div/div/div/div/div[2]/div/h2")
    public static WebElement experienceMore2;
    @FindBy(xpath = "//*[@id=\"outage-alert-span\"]/a")
    public static WebElement securityUpdate;
    @FindBy(linkText = "Explore Citi")
    public static WebElement exploreCiti;
    @FindBy(linkText = "Earn $600")
    public static WebElement earn600;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[1]/a/img")
    public static WebElement doubleCash;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/div[1]/a/img")
    public static WebElement pointsCard;
    @FindBy(xpath = "//*[@id=\"footerAccordionPanel1-c\"]/ul/li[1]/a")
    public static WebElement businessAccount;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/h2/b")
    public static WebElement helpAndSupport;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[1]/a")
    public static WebElement contactUs;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[2]/a")
    public static WebElement helpAndFaqs;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[3]/a")
    public static WebElement securityCenter;
    @FindBy(xpath = "//*[@id=\"copyrightDate\"]/span")
    public static WebElement citiGroupInc;
    @FindBy(partialLinkText = "Terms & Conditions")
    public static WebElement terms;
    @FindBy(xpath = "/html/body/footer/div/div[3]/ul/li[2]/a")
    public static WebElement privacy;
    @FindBy(xpath = "/html/body/footer/div/div[3]/ul/li[3]/a")
    public static WebElement accessibility;
    @FindBy(id = "countrySpan")
    public static WebElement country;
    @FindBy(id = "feedbackLink")
    public static WebElement feedback;
    @FindBy(linkText = "International Personal Banking")
    public static WebElement internationalBanking;
    @FindBy(linkText = "Global Executive Banking")
    public static WebElement globallExclusiveBanking;
    @FindBy(id = "fdicSprite")
    public static WebElement fdicMember;
    @FindBy(id = "homeSprite")
    public static WebElement homeIcon;
    @FindBy(linkText = "PROTECT YOUR FAMILY ONLINE")
    public static WebElement protectfamily;
    @FindBy(id = "facebookSprite")
    public static WebElement facebookIcon;
    @FindBy(id = "twitterSprite")
    public static WebElement twitterIcon;
    @FindBy(id = "youtubeSprite")
    public static WebElement youtubeIcon;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[6]/h2/b")
    public static WebElement citiMobileApp;
    @FindBy(linkText = "Citi Easy Deals")
    public static WebElement citiEasyDeals;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[6]/a")
    public static WebElement citiPrivatePass;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[6]/a")
    public static WebElement specialOffer;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[2]/div/div/div/div/div[2]/div/h4")
    public static WebElement lifeAndMoney;
    @FindBy(id = "outage-alert-span")
    public static WebElement protectCustomer;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/section/div/div[2]/div/div[2]/p")
    public static WebElement greatReward;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/h3/a")
    public static WebElement newPointsCard;
    @FindBy(xpath = "///*[@id=\"mm-container\"]/section[3]/div/div[2]/p")
    public static WebElement checkingAndSaving;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[2]/p")
    public static WebElement lowApr;
    @FindBy(id = "relevant-alert-span")
    public static WebElement citiHelp;
    @FindBy(xpath = "/html/body/footer/div/div[4]/p[1]/small")
    public static WebElement info;
    @FindBy(partialLinkText = "Family Cyber Safety")
    public static WebElement cyberSafety;
    @FindBy(xpath = "/html/body/footer/div/div[4]/p[3]/small/a[1]")
    public static WebElement privateClient;
    @FindBy(xpath = "/html/body/footer/div/div[4]/p[3]/small/a[2]")
    public static WebElement citiGoldInternational;

    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkAtmBranch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        atmBranch.click();
    }
    public void checkOpenAnAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        openAnAccount.click();
    }
    public void checkEnglish() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        english.click();
    }
    public void checkSearchIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchIcon.click();
    }

    public void checkSearchField() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchField.click();
    }

    public void checkSubmitButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        submitButton.click();
    }
    public void checkCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkbanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        banking.click();
    }

    public void checklending() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lending.click();
    }

    public void checkInvesting() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Investing.click();
    }
    public void checkCitiGold() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiGold.click();
    }
    public void checkUserName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        userName.click();
    }
    public void checkPassWord() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        password.click();
    }

    public void checkRememberMyUserId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        rememberMyUserId.click();
    }

    public void checkSignOn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signOn.click();
    }
    public void checkForgotUserId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotUserId.click();
    }
    public void checkActivateAId() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        activateAId.click();
    }

    public void checkForgotPassword() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotPassword.click();
    }

    public void checkRegisterForOnlineAccess() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registerForOnlineAccess.click();
    }
    public void checkNoLateFeesEver() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        noLateFeesEver.click();
    }
    public void checkHollywoodSpendingSolutions() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hollywoodSpendingSolutions.click();
    }
    public void checkPromoInterestRate() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        promoInterestRate.click();
    }
    public void checkCitiSimplicityCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiSimplicityCard.click();
    }
    public void checkLearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore.click();
    }
    public void checkImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        image.click();
    }
    public void checkLearnMore3() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore2.click();
    }
    public void checkLearnMore2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore3.click();
    }
    public void checkImage2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        image2.click();
    }
    public void checkCitiLogo2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citilogo2.click();
    }
    public void checkExperienceMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        experienceMore.click();
    }
    public void checkLearnMore4() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore4.click();
    }
    public void checkHealpfulTips() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        learnMore4.click();
    }
    public void checkAppleStoreTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        appleStoreTab.click();
    }
    public void checkGooglePlayTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        googlePlayTab.click();
    }
    public void checkWhyCiti() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        googlePlayTab.click();
    }
    public void checkOurStory() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ourStory.click();
    }
    public void checkBenefitsAndServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        benefitsAndServices.click();
    }
    public void checkCareer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getCareer.click();
    }
    public void checkRewards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        rewards.click();
    }
    public void checkrelationshipBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        relationshipBanking.click();
    }
    public void checkCitiPriority() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiPriority.click();
    }
    public void checkCitiPrivateBank() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiPrivateBank.click();
    }
    public void checkBusinessBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businessBanking.click();
    }
    public void checkSmallBusinessAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        smallBusinessAccount.click();
    }
    public void checkCommercialAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        commercialAccount.click();
    }
    public void checkRates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        rates.click();
    }
    public void checkPersonalBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        personalBanking.click();
    }
    public void checkHereToHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hereToHelp.click();
    }
    public void checkCreditcardForYou() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        creditcardForYou.click();
    }
    public void checkCashBack() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cashBack.click();
    }
    public void checkBankingMadeEasy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bankingMadeEasy.click();
    }
    public void checkNewLowRate() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newLowRate.click();
    }
    public void checkEarnCashBack() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        earnCashBack.click();
    }
    public void checkExperienceMore2() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        experienceMore2.click();
    }
    public void checkSecurityUpdate() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        securityUpdate.click();
    }
    public void checkExploreCiti() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreCiti.click();
    }
    public void checkEarn600() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        earn600.click();
    }
    public void checkDoubleCash() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        doubleCash.click();
    }
    public void checkpointsCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pointsCard.click();
    }
    public void checkBusinessAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businessAccount.click();
    }
    public void checkHelpAndSupport() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndSupport.click();
    }
    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        contactUs.click();
    }
    public void checkHelpAndFaqs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpAndFaqs.click();
    }
    public void checkSecurityCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        securityCenter.click();
    }
    public void checkCitiGroupInc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiGroupInc.click();
    }
    public void checkTerms() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        terms.click();
    }
    public void checkPrivacy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacy.click();
    }
    public void checkAccessibility() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accessibility.click();
    }
    public void checkCountry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        country.click();
    }
    public void checkFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        feedback.click();
    }
    public void checkInternationalBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        internationalBanking.click();
    }
    public void checkGlobalExclusiveBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        globallExclusiveBanking.click();
    }
    public void checkFdicmember() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fdicMember.click();
    }
    public void checkHomeIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homeIcon.click();
    }
    public void checkProtectFamily() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        protectfamily.click();
    }
    public void checkFacebookIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebookIcon.click();
    }
    public void checkTwitterIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        twitterIcon.click();
    }
    public void checkYoutubeIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        youtubeIcon.click();
    }
    public void checkCitiMobileApp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiMobileApp.click();
    }
    public void checkCitiEasyDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiEasyDeals.click();
    }
    public void checkCitiPrivatePass() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiPrivatePass.click();
    }
    public void checkSpecialOffer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        specialOffer.click();
    }
    public void checkLifeAndMoney() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lifeAndMoney.click();
    }
    public void checkProtectCustomer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        protectCustomer.click();
    }
    public void checkGreatReward() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        greatReward.click();
    }
    public void checkNewPointsCard() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newPointsCard.click();
    }
    public void checkCheckingAndSaving() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        checkingAndSaving.click();
    }
    public void checkLowApr() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        lowApr.click();
    }
    public void checkCitiHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiHelp.click();
    }
    public void checkInfo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        info.click();
    }
    public void checkCyberSafety() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cyberSafety.click();
    }
    public void checkPrivateClient() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privateClient.click();
    }
    public void checkCitiGoldInternational() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        citiGoldInternational.click();
    }
}