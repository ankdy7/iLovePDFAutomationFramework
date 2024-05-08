package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseTest;

public class HomePage extends BaseTest {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	WebElement loginButton;

	@FindBy(xpath = "//h1[@class=\"home-title__title\"]")
	WebElement headerText;
	
	@FindBy(id = "loginEmail")
	WebElement email;
	
	@FindBy(id = "inputPasswordAuth")
	WebElement password;
	
	@FindBy(id = "loginBtn")
	WebElement loginButton2;
	
	

	public void clickOnLogin() {
		loginButton.click();
	}

	public String fetchButtonText() {
		String name = loginButton.getText();

		return name;
	}

	public String fetchHeaderText() {
		String name = headerText.getText();

		return name;
	}
	public void enterCreds() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("pass"));
		
	}
	
	public String checkLoginFuntion() {
		loginButton2.click();
		return driver.getTitle();
		
	}
	

}
