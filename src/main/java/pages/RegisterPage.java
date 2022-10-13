package pages;

import base.Base;
import org.openqa.selenium.By;

public class RegisterPage extends Base {

    //WebElements

    private static By textbox_USERNAME = By.xpath("//input[@id='customer.firstName']");



    public void enterUsername(){
        driver.findElement(textbox_USERNAME).sendKeys("MAYURI CHAVAN");
    }
}
