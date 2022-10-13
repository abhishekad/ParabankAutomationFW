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
    private static By link_SOLUTION = By.xpath("//li[contains(text(),'Solutions')]");
    private static By link_ABOUT_US = By.xpath("//a[contains(text(),'About Us')]");
    private static By link_Services = By.xpath("//a[contains(text(),'Services')]");
    private static By link_Products = By.xpath("//a[contains(text(),'Products')]");
    private static By link_Location = By.xpath("//a[contains(text(),'Location')]");
    private static By link_Admin_Page = By.xpath("//a[contains(text(),'Admin Page')]");
    private static By link_Register = By.xpath(("//a[contains(text(),'Register')]"));



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

    public  void clickRegisterLink(){
        driver.findElement(link_Register).click();
    }





}
