package testHomePage;

import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestMainPage extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(convertToString(new Object() {
        }.getClass().getSimpleName()) + " : " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkLogo();
    }
    @Test
    public void testSeries() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSeries();
    }
    @Test
    public void testMovies() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkMovies();
    }
    @Test
    public void testSpecials() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSpecials();
    }
    @Test
    public void testSports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSports();
    }
    @Test
    public void testKids() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkKids();
    }
    @Test
    public void testSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSearch();
    }
    @Test
    public void testFreeEpisodes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkFreeEpisodes();
    }
    @Test
    public void testSchedule() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSchedule();
    }
    @Test
    public void testSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSignIn();
    }
    @Test
    public void testGetHbo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkGetHbo();
    }
    @Test
    public void testTonightOnHbo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkTonightOnHbo();
    }
    @Test
    public void testSeeFullSchedule() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkSeeFullSchedule();
    }
    @Test
    public void testInHboNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkInHboNews();
    }
    @Test
    public void testMovieCollection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkMovieCollection();
    }
    @Test
    public void testStaffPick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkStaffPick();
    }
    @Test
    public void testGetItToday() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkGetItToday();
    }
    @Test
    public void testFollowHbo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkFollowHbo();
    }
    @Test
    public void testFacebook() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkFacebook();
    }
    @Test
    public void testInstagram() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkInstagram();
    }
    @Test
    public void testAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAbout();
    }
    @Test
    public void testWaysToGet() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkWaysToGet();
    }
    @Test
    public void testHelp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkHelp();
    }
    @Test
    public void testShop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkShop();
    }
    @Test
    public void testCareers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkCareers();
    }
    @Test
    public void testHboInspires(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkHboInspires();
    }
    @Test
    public void testPrivacyPolicy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkPrivacyPolicy();
    }
    @Test
    public void testTerms(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkTerms();
    }
    @Test
    public void testAddChoices() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkAddChoices();
    }
    @Test
    public void testCopyright() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkCopyright();
    }
}
//updte