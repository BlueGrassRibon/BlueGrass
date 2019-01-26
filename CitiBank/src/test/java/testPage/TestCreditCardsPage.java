package testPage;
import homePage.CreditCardsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestCreditCardsPage extends CreditCardsPage{
    CreditCardsPage objOfCreditCards;
    @Test
    public void Launching(){
        objOfCreditCards = PageFactory.initElements(driver,CreditCardsPage.class);
        driver.get("https://www.citi.com/credit-cards/citi.action");
    }
}


