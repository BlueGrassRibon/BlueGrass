package search;


import base.BaseUtil;
import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

    public class SearchBook extends CommonAPI {

        @FindBy(how = How.XPATH, using ="//*[@id=\"nav-search-label\"]")
        private static WebElement searchField;
        @FindBy(how = How.XPATH, using ="//*[@id=\"nav-search\"]/form/div[2]/div/input")
        private static WebElement submitButton;

        public List<String> getBookList(){
            List<String> bookList = new ArrayList<String>();
            bookList.add("Cardiology");
            bookList.add("Genetics");
            bookList.add("Immunology");
            bookList.add("Dentistry");
            bookList.add("Opthalmology");
            return bookList;
        }
        public static WebElement getSearchField() {
            return searchField;
        }

        public static void setSearchField(WebElement searchField) {
            SearchBook.searchField = searchField;
        }

        public static WebElement getSubmitButton() {
            return submitButton;
        }

        public static void setSubmitButton(WebElement submitButton) {
            SearchBook.submitButton = submitButton;
        }

        public static void waitToBeVisible(){
            TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            wait.until(ExpectedConditions.visibilityOf(searchField));
        }
        public void searchBookBySubmitButton()throws IOException {
            List<String> departmentList = getBookList();
            for(int i=0; i<departmentList.size(); i++) {
                waitToBeVisible();
                getSearchField().sendKeys(departmentList.get(i));
                getSubmitButton().click();
                getSearchField().clear();
            }
        }
        public void searchBookByENTERKeyword()throws InterruptedException, IOException {
            List<String> departmentList = getBookList();
            for(String st: departmentList) {
                waitToBeVisible();
                getSearchField().sendKeys(st, Keys.ENTER);
                getSearchField().clear();
            }
        }
}
