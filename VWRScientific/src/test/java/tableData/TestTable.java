package tableData;

import base.BaseUtil;
import homePage.MainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestTable extends BaseUtil {

    @Test(enabled = true, priority = 1)
    public void readCell1(){
        String cell = getTextByCss(".stiboGridTable");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test(enabled = true, priority = 2)
    public void readCell2(){
        String cell = getTextByCss("#stiboGridTable tr:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test(enabled = true, priority = 3)
    public void readCell3(){
        String cell = getTextByCss("#stiboGridTable tr:nth-child(3) td:nth-child(2)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }
    @Test(enabled = true, priority = 4)
    public void readCell4(){
        List<WebElement>listOfWebElement=getListOfWebElementsByCss("#stiboGridTable tr");
        List<String>cells = getListOfString(listOfWebElement);
        for(String st: cells){
        System.out.println(st);
        }
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cells); //question: why all are in single line
        }
}
