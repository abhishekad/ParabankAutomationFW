package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Base {

	// This class holds the declaration for the webdrivers


	// Chromedriver

	static WebDriver driver;

	public static WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Dongare\\eclipse-workspace\\Parabank\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		return driver;
	}


	@AfterClass
	public void TearDownBrowser(){
		driver.quit();
	}

}
