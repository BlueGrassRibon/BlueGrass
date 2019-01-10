package testHomePage;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
public static WebDriver driver= null;
@Before
public void startup(){
    System.getProperty("webdriver.chrome.driver", "..\\Generic\\browserDriver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.officedepot.com/");
}
@Test
public void aTest(){
}
@After
public void close(){
    driver.quit();
}
}
