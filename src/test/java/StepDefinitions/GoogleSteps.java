package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.LoginPage;
import Pages.ResolvePage;
import Utils.ConfigurationReader;
import Utils.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSteps extends BaseClass{

	ResolvePage resolvePage = new ResolvePage();

	@Given("User is on Google search page")
	public void user_is_on_login_page() throws IOException {

		String url =ConfigurationReader.get("url");
		System.out.println("Url====="+ url);

		Driver.getDriver().get(url);
	}

	@And("User types Hello World")
	public void clicks_on_login_button() {
		resolvePage.search.sendKeys("Hello World"+Keys.ENTER);
	}

	@Then("User is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {

		Driver.getDriver().getPageSource().contains("Hello World");
	}

	@Then("User close browser")
	public void user_enters_username_and_password() {
		Driver.closeDriver();

	}



}
