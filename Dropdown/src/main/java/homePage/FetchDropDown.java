package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class FetchDropDown extends BaseUtil {

    public void checkDropDown (){
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
    public void checkDropDownSingleOption (){
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option:nth-child(3)");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}