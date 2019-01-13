package homePage;

import base.BaseUtil;
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

public class LoanList extends BaseUtil {

        @FindBy(how = How.XPATH, using ="//*[@id=\"searchicon\"]")
        private static WebElement searchKey;
        @FindBy(how = How.XPATH, using ="///*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
        private static WebElement searchField;
        @FindBy(how = How.XPATH, using ="//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
        private static WebElement submitButton;

        public List<String> getLoanList(){
            List<String> loanList = new ArrayList<String>();
            loanList.add("CarLoan");
            loanList.add("HouseLoan");
            loanList.add("BusinessLoan");
            return loanList;
        }

        public static WebElement getSearchKey() {
            return searchKey;
        }
        public static void setSearchKey(WebElement searchKey) { LoanList.searchKey = searchKey; }
        public static WebElement getSearchField() {
            return searchField;
        }
        public static void setSearchField(WebElement searchField) {
            LoanList.searchField = searchField;
        }
        public static WebElement getSubmitButton() {
            return submitButton;
        }
        public static void setSubmitButton(WebElement submitButton) {
            LoanList.submitButton = submitButton;
        }

        public static void waitToBeVisible(){
            TestLogger.log(Sheets.Spreadsheets.DeveloperMetadata.Search.class.getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            searchKey.click();
            wait.until(ExpectedConditions.visibilityOf(searchField));
        }
        public void searchLoanBySubmitButton()throws IOException {
            List<String> loanList = getLoanList();
            for(int i=0; i<loanList.size(); i++) {
                //waitToBeVisible();
                getSearchKey().click();
                getSearchField().sendKeys(loanList.get(i));
                getSubmitButton().click();
                getSearchField().clear();
            }
        }
        public void searchLoanByENTERKeyword()throws InterruptedException, IOException {
            List<String> departmentList = getLoanList();
            for(String st: getLoanList()) {
                //waitToBeVisible();
                getSearchKey().click();
                getSearchField().sendKeys(st, Keys.ENTER);
                getSearchField().clear();
            }
        }
    }

