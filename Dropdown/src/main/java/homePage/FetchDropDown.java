package homePage;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.List;

public class FetchDropDown extends BaseUtil {

    public void checkDropDownAllOption (){
        List<WebElement> element = getListOfWebElementsByCss(".gh-sb.gh-sprRetina option");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
    public void checkDropDownSingleOption (){
        List<WebElement> element = getListOfWebElementsByCss(".gh-sb.gh-sprRetina option:nth-child(3)");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText, expectedMenu);
    }
}