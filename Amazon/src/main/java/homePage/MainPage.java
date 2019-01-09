package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import javax.xml.xpath.XPath;

public class MainPage extends BaseUtil {

    @FindBy(xpath = "//span[@class='nav-sprite nav-logo-base']")
    public static WebElement logo;

    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public static WebElement searchBox;

    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.click();
    }
    @FindBy(xpath = "//a[@class='nav-a' and@tabindex='48']")
    public static WebElement todaysDeal;

    public void checkTodaysDeal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        todaysDeal.click();
    }
    @FindBy(id = "nav-your-amazon")
    public static WebElement yourAmazonDotCom;

    public void checkYourAmazonDotCom() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        yourAmazonDotCom.click();
    }
    @FindBy(xpath = "//a[text()='Gift Cards']")
    public static WebElement giftCards;

    public void checkGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        giftCards.click();
    }
    @FindBy(xpath = "//div[@id='nav-xshop-container']//div[@id='nav-xshop']//a[contains(text(),'Whole Foods')]")
    public static WebElement wholeFoods;

    public void checkWholeFoods() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        wholeFoods.click();
    }
    @FindBy(xpath = "//div[@id='nav-xshop-container']//a[text()='Registry']")
    public static WebElement registry;

    public void checkRegistry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        registry.click();
    }
    @FindBy(xpath = "//*[@id=\"nav-orders\"]/span[2]")
    public static WebElement orders;

    public void checkOrders() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        orders.click();
    }
    @FindBy(xpath = "//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/div[1]/label")
    public static WebElement emailPhoneForMobileAccounts;

    public void checkEmailPhoneForMobileAccounts() {
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
      }.getClass().getEnclosingMethod().getName()));
        emailPhoneForMobileAccounts.click();
   }
   @FindBy(xpath = "//*[@id=\"navSwmHoliday\"]/a/img")
    public static WebElement newYear;

    public void checkNewYear() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newYear.click();
    }

//    @FindBy(xpath = "//*[@id=\"Nm8rplUpJniZBPxKXJgpQQ\"]/div[1]/h2")
//    public static WebElement signinForTheBestExperience;
//
//    public void checkSigninForTheBestExperience() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        signinForTheBestExperience.click();
   // }

//    @FindBy(xpath = "//*[@id=\"deals-shoveler-ns_7801NE5P88ZTP69YGMRC_4633_\"]/div[1]/h2/span")
//    public static WebElement todaysDealsUnder$25;
//
//    public void checkTodaysDealsUnder$25() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        TodaysDealsUnder$25.click();
//    }


//    @FindBy(xpath = "//*[@id=\"l5tjK2b8k9uTFVkaybvdaA\"]/div[1]/h2/span")
//    public static WebElement recommendedItemsOtherCustomersOftenBuyAgain;
//
//    public void checkRecommendedItemsOtherCustomersOftenBuyAgain() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        recommendedItemsOtherCustomersOftenBuyAgain.click();


//    @FindBy(xpath = "//*[@id=\"gbPnoMjJ3OmhrXSzg0nbVw\"]/a/img")
//    public static WebElement affordableApparel;
//
//    public void checkAffordableApparel() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        affordableApparel.click();
//    }


//    @FindBy(xpath = "//*[@id=\"OZ-pRCv-3uLm0tl0_uZQ6A\"]/div[1]/h2/span")
//    public static WebElement relatedToItemsYou'veViewed;
//
//    public void checkRelatedToItemsYou'veViewed() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        relatedToItemsYou'veViewed.click();
//    }


    @FindBy(xpath = "//*[@id=\"hY5QGRF5ZHWKLIhtLTPMsw\"]/a/img")
    public static WebElement newYearNewYouReinventYourself;

    public void checkNewYearNewYouReinventYourself() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newYearNewYouReinventYourself.click();
    }

    @FindBy(xpath = "//*[@id=\"qABOBOSPWXTGKvCy91Etwg\"]/div[1]/h2/span")
    public static WebElement newAndInnovativeProducts;

    public void checkNewAndInnovativeProducts() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newAndInnovativeProducts.click();
    }

    @FindBy(xpath = "//*[@id=\"qABOBOSPWXTGKvCy91Etwg\"]/div[1]/span/a")
    public static WebElement seeMore;

    public void checkSeeMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        seeMore.click();
    }

    @FindBy(xpath = "//*[@id=\"div-gpt-ad\"]/a/img")
    public static WebElement shopNow;

    public void checkShopNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shopNow.click();
    }


    @FindBy(xpath = "//*[@id=\"ad-feedback-text-desktop-ad-center-1\"]")
    public static WebElement adFeedback;

    public void checkAdFeedback() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        adFeedback.click();
    }


//    @FindBy(xpath = "//*[@id=\"e5XGsKVbEm6qyDhOh62tGA\"]/a/img"]")
//    public static WebElement getMovingWithFitnessTech;
//
//    public void checkGetMovingWithFitnessTech() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        getMovingWithFitnessTech.click();
//    }

    @FindBy(xpath = "//*[@id=\"GEIlGBZDQptQcsLjt37S_g\"]/a/img")
    public static WebElement trendsInLowPricedWatches;

    public void checkTrendsInLowPricedWatches() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        trendsInLowPricedWatches.click();
    }

    @FindBy(xpath = "//*[@id=\"Skm1Ym-Hbym-7pZOsvdN5A\"]/div[1]/h2/span")
    public static WebElement thisWeeksNewReleases;

    public void checkThisWeeksNewReleases() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        thisWeeksNewReleases.click();
        }

    @FindBy(xpath = "//*[@id=\"eY1CT0HlX9EKtJ3L7cIZ6g\"]/div[1]/h2/span")
    public static WebElement bargainItems;

    public void checkBargainItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        bargainItems.click();
        }

//    @FindBy(xpath = "//*[@id=\"eY1CT0HlX9EKtJ3L7cIZ6g\"]/div[1]/span/a")
//    public static WebElement seeMore;
//
//    public void checkSeeMore() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        seeMore.click();
//        }









}