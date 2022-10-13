package tests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class LogInTest {
     HomePage homePage = new HomePage();
    RegisterPage rp = new RegisterPage();
   WebDriver driver = Base.getChromeDriver();

    @Test(enabled = true)
    public void loginUsingValidCreds(){
        HomePage.enterUsername("Abhishek");
        HomePage.enterPassword("Abhipass");
        HomePage.clickLoginButton();

    }

    @Test(enabled = true)
    public void loginUsingInvalidCreds(){
        HomePage.enterUsername("Username");
        HomePage.enterPassword("Password");
        HomePage.clickLoginButton();
    }

    @Test(enabled = true)
    public void enterValidUsername(){
        homePage.clickRegisterLink();
        rp.enterUsername();

    }


}
