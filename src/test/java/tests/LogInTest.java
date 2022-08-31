package tests;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class LogInTest {
    HomePage homePage = new HomePage();

    @Test
    public void loginUsingValidCreds(){
        homePage.enterUsername("Abhishek");
        homePage.enterPassword("Abhipass");
        homePage.clickLoginButton();

    }

    @Test
    public void loginUsingInvalidCreds(){
        homePage.enterUsername("Username");
        homePage.enterPassword("Password");
        homePage.clickLoginButton();
    }


}
