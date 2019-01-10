package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[1]/span/a/svg")
    public static WebElement logo;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a")
    public static WebElement series;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[2]/div/a")
    public static WebElement movies;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[3]/div/a")
    public static WebElement specials;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div[1]/div[2]/div/div/ul/li[4]/div/a")
    public static WebElement sports;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a")
    public static WebElement kids;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div[2]/div[1]/input")
    public static WebElement search;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[1]/div/a")
    public static WebElement freeEpisodes;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[2]/div/a")
    public static WebElement schedule;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public static WebElement signIn;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
    public static WebElement getHbo;
    @FindBy(xpath = "/html/body/main/div[3]/div/div/div[1]/div/div/p")
    public static WebElement tonightOnHbo;
    @FindBy(xpath = "/html/body/main/div[3]/div/div/div[1]/div/div/div/a/span/span/span[1]")
    public static WebElement seeFullSchedule;
    @FindBy(xpath = "/html/body/main/div[4]/div/div/div[1]/div[1]/div/h2")
    public static WebElement inHboNews;
    @FindBy(xpath = "/html/body/main/div[5]/div/div/div[1]/div[1]/p[1]")
    public static WebElement movieCollection;
    @FindBy(xpath = "/html/body/main/div[7]/div/div/div[1]/div/a/div/div[2]/div/div[1]/div[1]")
    public static WebElement staffPick;
    @FindBy(xpath = "//span[contains(text(),'Get It Today')]")
    public static WebElement getItToday;
    @FindBy(xpath = "/html/body/main/div[10]/div/div/footer/div[1]/div/div/h2")
    public static WebElement followHbo;
    @FindBy(xpath = "/html/body/main/div[10]/div/div/footer/div[1]/div/div/ul/li[1]/a")
    public static WebElement facebook;
    @FindBy(xpath = "/html/body/main/div[15]/div/div/footer/div[1]/div/div/ul/li[3]/a/svg")
    public static WebElement instragram;
    @FindBy(xpath = "//a[contains(text(),'About')]")
    public static WebElement about;
    @FindBy(xpath = "//a[contains(text(),'Ways to Get')]")
    public static WebElement waysToGet;
    @FindBy(xpath = "//a[contains(text(),'Help')]")
    public static WebElement help;
    @FindBy(xpath = "/html[1]/body[1]/main[1]/div[10]/div[1]/div[1]/footer[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
    public static WebElement shop;
    @FindBy(xpath = "/html/body/main/div[10]/div/div/footer/div[2]/div/ul[1]/li[5]/a")
    public static WebElement careers;
    @FindBy(xpath = " /html/body/main/div[10]/div/div/footer/div[2]/div/ul[1]/li[6]/a ")
    public static WebElement hboInspires;
    @FindBy(xpath = " //a[contains(text(),'Privacy Policy')]")
    public static WebElement privacyPolicy;
    @FindBy(xpath = "//a[contains(text(),'Terms')]") //excellent, try to change above xpath, no need to increase test
    public static WebElement terms; //number, rather do dynamic xpath. when stuck, get them together and knock me
    @FindBy(xpath = "//a[contains(text(),'Ad Choices')]") //to fix them
    public static WebElement adcChoices;
    @FindBy(xpath = "//a[contains(text(),'Ad Choices')]")
    public static WebElement adChoices;
    @FindBy(xpath = "//p[contains(text(),'© 2019 Home Box Office, Inc. All Rights Reserved.')]")
    public static WebElement copyright;









    public void checkLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkSeries() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        series.click();
    }
    public void checkMovies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        movies.click();
    }
    public void checkSpecials() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        specials.click();
    }
    public void checkSports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sports.click();
    }
    public void checkKids() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        kids.click();
    }
    public void checkSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        search.click();
    }
    public void checkFreeEpisodes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        freeEpisodes.click();
    }
    public void checkSchedule () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        schedule.click();
    }
     public void checkSignIn () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.click();
    }
    public void checkGetHbo () {
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         getHbo.click();
    }
    public void checkTonightOnHbo () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        tonightOnHbo.click();
    }
    public void checkSeeFullSchedule () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        seeFullSchedule.click();
    }
    public void checkInHboNews () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        inHboNews.click();
    }
    public void checkMovieCollection () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        movieCollection.click();
    }

    public void checkStaffPick () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        staffPick.click();
    }
     public void checkGetItToday () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getItToday.click();
     }
    public void checkFollowHbo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        followHbo.click();
    }
     public void checkFacebook () {
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         facebook.click();
     }
     public void checkInstragram () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        instragram.click();
     }
    public void checkAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        about.click();
    }
   public void checkWaysToGet() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        waysToGet.click();
    }
    public void checkHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        help.click();
    }
    public void checkShop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shop.click();
    }
    public void checkCareers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        careers.click();
    }
    public void checkHboInspires(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hboInspires.click();
    }
    public void checkPrivacyPolicy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyPolicy.click();
    }
    public void checkTerms(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        terms.click();
    }
    public void checkAddChoices(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        adChoices.click();
    }
    public void checkCopyright () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        copyright.click();
     }
  }
