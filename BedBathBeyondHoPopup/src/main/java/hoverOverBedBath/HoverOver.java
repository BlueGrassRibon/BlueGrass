package hoverOverBedBath;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HoverOver extends CommonAPI {

    public void checkProducts() throws InterruptedException {

//class='MenuList_7vBTvV MenuItem_5KLrJb'

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver); //
        WebElement products = driver.findElement(By.xpath("//span[text()='Products']"));
        Thread.sleep(2000);
        builder.moveToElement(products).build().perform();
        Thread.sleep(2000);
        System.out.println(products.getText());
    }
    public void checkListOfHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions builder = new Actions(driver);
        WebElement products = driver.findElement(By.xpath("//span[text()='Products']"));
        Thread.sleep(2000);
        builder.moveToElement(products).build().perform();
        Thread.sleep(2000);
        System.out.println(products.getText());
        List<WebElement> list = driver.findElements(By.xpath("//span[text()='Products']following-sibling::li[@class='MenuList_7vBTvV MenuItem_5KLrJb']//a"));
        int totalCount = list.size();
        System.out.println(totalCount);
        for (int i =0; i < totalCount;i++){
            System.out.println(list.get(i).getText());
        }
    }

    public List<String> checkListOfHoverOverReturnMethod() throws InterruptedException {
        Actions builder = new Actions(driver);
        WebElement products = driver.findElement(By.xpath("//span[text()='Products']"));
        Thread.sleep(2000);
        builder.moveToElement(products).build().perform();
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//span[text()='Products']following-sibling::li[@class='MenuList_7vBTvV MenuItem_5KLrJb']//a"));
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
        expectedList.add("Gifts");
        expectedList.add("Personalzied Gifts");
        expectedList.add("Beddings");
        expectedList.add("Bath");
        expectedList.add("Kitchen");
        expectedList.add("Dining");
        expectedList.add("Furniture");
        expectedList.add("Home Decore");
        expectedList.add("Curtains and Window");
        expectedList.add("Storage and Cleaning");
        expectedList.add("Smart Home & Home Improvement");
        expectedList.add("Outdoor");
        expectedList.add("Baby & Kids");
        expectedList.add("Health & Beauty");
        expectedList.add("Lauggage Pet & More ");
        Assert.assertEquals(stringList,expectedList);
        return stringList;
    }

}































