package tests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogInTest {

    WebDriver driver = Base.getChromeDriver();

    @Test
    public void loginUsingValidCreds(){
        HomePage hm = new HomePage(driver);
        hm.enterUsername("BawlatMayuri");
        hm.enterPassword("yediMayuri");
        hm.clickLoginButton();
    }
}
