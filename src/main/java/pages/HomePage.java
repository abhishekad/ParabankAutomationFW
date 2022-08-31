package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends Base {

//    static WebDriver driver ;

//    public HomePage(WebDriver driver){
//        this.driver = driver;
//    }

    private static By textbox_USERNAME = By.name("username");
    private static By textbox_PASSWORD = By.name("password");
    private static By button_SUBMIT = By.xpath("//input[@value='Log In']");




    // Methods
    public static void enterUsername(String usrName){
        driver.findElement(textbox_USERNAME).sendKeys(usrName);
    }

    public static void enterPassword(String pass){
        driver.findElement(textbox_PASSWORD).sendKeys(pass);
    }

    public static void clickLoginButton(){
        driver.findElement(button_SUBMIT).click();
    }





}
