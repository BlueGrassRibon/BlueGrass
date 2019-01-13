//package testHomePage;
//
//import base.CommonAPI;
//import citiPages.SearchPage;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import reporting.TestLogger;
//
//import java.io.IOException;
//
//public class SearchPageTest extends SearchPage {
//    @BeforeMethod
//    public void Searching() {
//        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
//    }
//
//    @Test
//    public void SearchButton(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        HomeSearchButton();
//    }
//
//    @Test
//    public void searchInfo() throws IOException{
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
//        HomeSearchButton();
//        searchPage.searchItemsAndSubmitButton();
//    }
//}