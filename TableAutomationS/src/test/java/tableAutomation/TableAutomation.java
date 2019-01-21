package tableAutomation;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;
public class TableAutomation extends CommonAPI {


    @Test(enabled = true, priority = 1)
    public void readTable(){
        String table =getTextByCss(".general_table.product_table.responsive_table");
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(table);}
    @Test(enabled = true, priority = 2)
    public void readAnyRowOfTable(){
        String row = getTextByCss(".general_table.product_table.responsive_table th:nth-child(3)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(row);
    }
    @Test(enabled = true, priority = 3)
    public void readCellOfARowOfATable(){
        String cell = getTextByCss(".general_table.product_table.responsive_table td:nth-child(4)");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(cell);
    }

    @Test(enabled=true, priority = 4)
    public void readAllRowOfTable(){
        List<WebElement>LisOfWebElement=getListOfWebElementsByCss(".general_table.product_table.responsive_table tr");
        List<String>rows=getListOfString(LisOfWebElement);
        for(String st:rows){
            System.out.println(st);
        }
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(rows);
    }
}