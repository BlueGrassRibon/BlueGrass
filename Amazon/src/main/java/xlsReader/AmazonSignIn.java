package xlsReader;

import base.BaseUtil;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSignIn extends CommonAPI {
    @FindBy(css = "#nav-link-accountList")
    public static WebElement accountsAndLists;
    @FindBy(xpath = "//input[@name='email']")
    public static WebElement emailInput;
    @FindBy(xpath= "//input[@name='password']")
    public static WebElement passwordInput;
    @FindBy(xpath = "//input[@id='signInSubmit']")
    public static WebElement submit;
    @FindBy(xpath = "//h4")
    public static WebElement errorMsg;

    public void signIn(String email, String pass, String message){
        accountsAndLists.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(pass);
        submit.click();
        emailInput.clear();
        passwordInput.clear();
    }
}
