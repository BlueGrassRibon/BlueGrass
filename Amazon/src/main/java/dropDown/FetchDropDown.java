package dropDown;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FetchDropDown extends BaseUtil {

    public void checkDropDownAllOption (){
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
    public void checkDropDownSingleOption (){
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option:nth-child(6)");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}