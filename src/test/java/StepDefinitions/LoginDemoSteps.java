package StepDefinitions;

import org.openqa.selenium.Keys;

import Pages.LoginPage;
import Utils.ConfigurationReader;
import Utils.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDemoSteps extends BaseClass{
	
	LoginPage loginPage = new LoginPage();
	
	
	@Given("Browser is open")
	public void browser_is_open() {
	Driver.getDriver();
	}

	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
	  String demoUrl= ConfigurationReader.get("demourl");
	  System.out.println("Demo url----"+demoUrl);
	  Driver.getDriver().get(demoUrl);
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
	  loginPage.userName.sendKeys(ConfigurationReader.get("userName"));
	  Thread.sleep(2000);
	 loginPage.password.sendKeys(ConfigurationReader.get("password"));
	 Thread.sleep(2000);
	 
	}
	//parameterization
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
		  loginPage.userName.sendKeys(username);
		  Thread.sleep(2000);
		 loginPage.password.sendKeys(password);
		 Thread.sleep(2000);
		 
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		 loginPage.login.click();
	}


	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	 driver.getPageSource().contains("logout");
	}



}
