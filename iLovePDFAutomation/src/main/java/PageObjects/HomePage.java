package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseTest;

public class HomePage extends BaseTest {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String name;
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElement loginButton;

	@FindBy(xpath = "//h1[@class=\"home-title__title\"]")
	static WebElement headerText;
	
	@FindBy(id = "loginEmail")
	static WebElement email;
	
	@FindBy(id = "inputPasswordAuth")
	static WebElement password;
	
	@FindBy(id = "loginBtn")
	static WebElement loginButton2;
	
	

	public  String clickOnLogin() {
		loginButton.click();
		return driver.getTitle();
	}

	public  String fetchButtonText() {
		
		name = loginButton.getText();
		System.out.println(name);

		return name;
	}
	
	public void loginApplication(String email1,String password1) throws InterruptedException
	{
		email.sendKeys(email1);
		password.sendKeys(password1);
		
		Thread.sleep(3000);
		//loginButton2.click();
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

	}


	public  String fetchHeaderText() {
		String name = headerText.getText();

		return name;
	}
	public  void enterCreds() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("pass"));
		
	}
	
	public  String checkLoginFuntion() {
		loginButton2.click();
		return driver.getTitle();
		
	}
	

}
