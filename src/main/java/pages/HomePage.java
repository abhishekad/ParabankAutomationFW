package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    By textbox_USERNAME = By.name("username");
    By textbox_PASSWORD = By.name("password");
    By button_SUBMIT = By.xpath("//input[@value='Log In']");




    // Methods
    public void enterUsername(String usrName){
        driver.findElement(textbox_USERNAME).sendKeys(usrName);
    }

    public void enterPassword(String pass){
        driver.findElement(textbox_PASSWORD).sendKeys(pass);
    }

    public void clickLoginButton(){
        driver.findElement(button_SUBMIT).click();
    }





}
