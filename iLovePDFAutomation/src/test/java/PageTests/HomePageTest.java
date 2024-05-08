package PageTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclass.BaseTest;
import PageObjects.HomePage;

public class HomePageTest extends BaseTest {

	HomePage homepage;

	@BeforeTest
	void startUp() {
		setupDriver();
		homepage = new HomePage();
	}
	
	@AfterTest
	void tearDown() {
		driver.close();
		driver.quit();
	}

	@Test(priority = 1)
	void checkLoginButtonText() {
		String name = homepage.fetchButtonText();
		Assert.assertEquals(name, "Login");

	}
	@Test(priority = 2)
	void checkHeaderText() {
		String name = homepage.fetchHeaderText();
		Assert.assertEquals(name, "Every tool you need to work with PDFs in one place");

	}

	@Test(priority = 3)
	void clickOnLogin() {
		homepage.clickOnLogin();
	}
	
	@Test(priority = 4)
	void checkLogin() {
		homepage.enterCreds();
	}
	
	@Test(priority = 5)
	void checkLoginFuntion() {
		Assert.assertEquals(homepage.checkLoginFuntion(), "iLovePDF | Online PDF tools for PDF lovers");
		;
		
	}
	
	

}
