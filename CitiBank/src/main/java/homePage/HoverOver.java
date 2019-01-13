package homePage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HoverOver extends BaseUtil {

    public void checkLending() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement lending = driver.findElement(By.xpath("//*[@id=\"lending\"]"));
        Thread.sleep(2000);
        builder.moveToElement(lending).build().perform();
        Thread.sleep(2000);
        System.out.println(lending.getText());
    }
    public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement lending = driver.findElement(By.xpath("//*[@id=\"lending\"]"));
        Thread.sleep(2000);
        builder.moveToElement(lending).build().perform();
        Thread.sleep(2000);
        System.out.println(lending.getText());
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sia-nav_submenu' and @data-item='lending' and @role = 'menubar']//a")); // see elements!
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }

    public List<String> checkListOfHoverOverReturnMethod() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement lending = driver.findElement(By.xpath("//*[@id=\\\"lending\\\"]\""));
        Thread.sleep(2000);
        builder.moveToElement(lending).build().perform();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sia-nav_submenu' and @data-item='lending' and @role = 'menubar']//a"));
        List<String> stringList = new ArrayList<>();
        for (WebElement e:list) {                   //for each loop
            stringList.add(e.getText());
            System.out.println(e.getText());
        }
        System.out.println(stringList);
        /*for(int i = 0; i<list.size();i++){        //for loop
        String se = list.get(i).getText();
        stringList.add(i,se);
        }*/
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Personal Loan & Lines of Credit");
        expectedList.add("Mortgage");
        expectedList.add("Home Equity");
        Assert.assertEquals(stringList,expectedList);
        return stringList;
    }

}