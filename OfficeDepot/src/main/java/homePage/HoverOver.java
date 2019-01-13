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

    public void checkDeals() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + " " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //already USED IN BASEUTIL
        WebElement deals = driver.findElement(By.id("navGroup12"));
        Thread.sleep(2000);
        builder.moveToElement(deals).build().perform();
        Thread.sleep(2000);
        System.out.println(deals.getText());
    }
   public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement deals = driver.findElement(By.id("navGroup12"));
        Thread.sleep(2000);
        builder.moveToElement(deals).build().perform();
        Thread.sleep(2000);
        System.out.println(deals.getText());
        List<WebElement> list = driver.findElements(By.id("navGroup12")); // you have to know about it
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }

   public List<String> checkListOfHoverOverReturnMethod() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement deals = driver.findElement(By.id("navGroup12"));
        Thread.sleep(2000);
        builder.moveToElement(deals).build().perform();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.id("navGroup12"));
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

        expectedList.add("On Sale");
        expectedList.add("Coupons");
        expectedList.add("Weekly Ads");
        expectedList.add("Rewards Offers");

        Assert.assertEquals(stringList,expectedList);
        return stringList;
    }
}