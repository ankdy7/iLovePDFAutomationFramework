package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import Baseclass.BaseTest;
import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImplementation extends BaseTest {

	HomePage homepage = new HomePage();
	String name;

	@Given("I landed on the proper website of ILovePDF")
	public void I_landed_on_the_proper_website_of_ILovePDF() {
		setupDriver();
		
	}

	@Given("I am present on homepage")
	public void i_am_present_on_homepage() {

	}

	@When("I check text of the Login button")
	public void i_check_text_of_the_login_button() {
		// name = homepage.fetchButtonText();
	}

	@Then("I verify the text of the Login button is equal to {string}")
	public void i_verify_the_text_of_the_login_button_is_equal_to_login(String login) {
		
		Assert.assertEquals(driver.findElement(By.xpath("//a[@href='/login']")).getText(), login);
		
	}

	@Given("I am present on login page {string}")
	public void I_am_present_on_login_page(String string) {
		String s = homepage.clickOnLogin();
		Assert.assertEquals(s, string);
	}

	@When("I enter the {string} and {string} and click on login")
	public void I_enter_credentials(String username, String password) throws InterruptedException {
		homepage.loginApplication(username, password);
	}

	@Then("I should be logged in and redirected to the homepage")
	public void redirected_to_homepage() {
		
		Assert.assertEquals(homepage.checkLoginFuntion(), "iLovePDF | Online PDF tools for PDF lovers");
		
	}
}
