//package homePage;
//
//import base.CommonAPI;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import reporting.TestLogger;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SearchPage extends CommonAPI {
//    @FindBy(how = How.ID, using = "personetics-citi-menu")
//    public static WebElement searchButtonWebElement;
//    public void HomeSearchButton(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        searchButtonWebElement.click();}
//
//    @FindBy(how = How.XPATH, using = "//*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
//    public static WebElement searchInputWebElement;
//
//    @FindBy(how = How.XPATH, using = "//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
//    public static WebElement submitButtonWebElement;
//
//    public WebElement getSearchButtonWebElement() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        return searchButtonWebElement;
//    }
//
//    public WebElement getSearchInputWebElement() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        return searchInputWebElement;
//    }
//
//    public WebElement getSubmitButtonWebElement() {
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        return submitButtonWebElement;
//    }
//
//    public void searchFor(String value){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        getSearchInputWebElement().sendKeys(value);
//    }
//
//    public void submitSearchButton(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        getSubmitButtonWebElement().click();
//    }
//
//    public void clearInput(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        getSearchInputWebElement().clear();
//    }
//
//    public void searchItemsAndSubmitButton()throws IOException{
//        List<String> list = getItemValue();
//        for(int i=0; i<list.size(); i++) {
//            searchFor(list.get(i));
//            submitSearchButton();
//            clearInput();
//        }
//    }
//
//    public List<String> getItemValue(){
//        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        List<String> itemsList = new ArrayList<String>();
//        itemsList.add("Credit Cards");
//        itemsList.add("Home Equity");
//        itemsList.add("Loan");
//        itemsList.add("Investment");
//        itemsList.add("Mortgage");
//
//        return itemsList;
//    }
//
//}
