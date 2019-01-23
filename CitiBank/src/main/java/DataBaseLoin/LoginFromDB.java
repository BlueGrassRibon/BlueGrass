package DataBaseLoin;

import databases.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginFromDB {
    @FindBy(xpath = "//input[@name='username']")
    public static WebElement userID;
    @FindBy(xpath = "//input[@class='form-control']")
    public static WebElement passwordField;
    @FindBy (id = "signInBtn")
    public static WebElement signOnSubmitButton;
    String email="";
    String password="";
    ArrayList<String>myData=new ArrayList<>();
    public ArrayList<String> dataBaseData(){
    myData.add(email);
    myData.add(password);
    return myData;}
    public void signUpFromDataBase()throws Exception{
        dataBaseData();
        ConnectToSqlDB connectToSqlDB= new ConnectToSqlDB();
        ConnectToSqlDB.connectToSqlDatabase();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(myData,"myTable","MyColumn");
        List<String> data =connectToSqlDB.readDataBase("myTable","MyColumn");
        userID.sendKeys(data.get(0), Keys.ENTER);
        passwordField.sendKeys(data.get(1),Keys.ENTER);
    }
}
