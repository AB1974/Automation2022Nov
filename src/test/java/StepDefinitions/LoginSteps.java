package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Utils.ConfigurationReader;
import Utils.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {

		LoginPage loginPage = new LoginPage();

		String url =ConfigurationReader.get("url");
		System.out.println("Url====="+ url);
		
		Driver.getDriver().get(url);
		loginPage.googleSearch.sendKeys("HelloWorld");
		Driver.closeDriver();


	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("auylin");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("auylin");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("auylin");
	}


}
