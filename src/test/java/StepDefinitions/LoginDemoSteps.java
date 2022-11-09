package StepDefinitions;

import Pages.LoginPage;
import Pages.ResolvePage;
import Utils.ConfigurationReader;
import Utils.Driver;
import Utils.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginDemoSteps extends BaseClass{
	
	LoginPage loginPage = new LoginPage();
	ResolvePage resolvePage = new ResolvePage();
	
	
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


		@Given("User is on Login Page {string}")
		public void user_is_on_Login_Page(String string) {

		Driver.getDriver().get(string);
		
}

	@When("user prints table")
	public void user_prints_table() {
		String str = resolvePage.table.getText();
		System.out.println(str);
		Assert.assertTrue(str.contains("jsmith@gmail.com"));

		//get all headers size
		int size = resolvePage.allHeaders.size();

		for ( WebElement each: resolvePage.allHeaders){
			System.out.println("each.getText() = " + each.getText());
		}

		//get all rows numbers// @FindBy(xpath="//table[@id='table1' ]/tbody/tr")
		int numRows=getNumberOfRows();
		System.out.println("numRows = " + numRows);//4

		//get all columns numbers/ @FindBy(xpath="//table[@id='table1']//tr/th")
		int numColumn = getNumberOfColumns();
		System.out.println("numColumn = " + numColumn);//6

		//iterate each row in the table1 !
		for (int i= 1 ; i<=numRows; i++){

			for (int j =1 ; j<=numColumn; j++){
			
				String xpath = "//table[@id='table1']//tr[" +i + "]/td[" +j + "]";
				WebElement cell =driver.findElement(By.xpath(xpath));
				System.out.println( cell.getText());
			}

		}
		//iterate each row in the table2 !
		for (int i= 1 ; i<=numRows; i++){

			for (int j =1 ; j<=numColumn; j++){

				String xpath = "//table[@id='table2']//tr[" +i + "]/td[" +j + "]";
				WebElement cell =driver.findElement(By.xpath(xpath));
				System.out.println( cell.getText());
			}

		}


	}


	public int getNumberOfRows(){

		return resolvePage.allRows.size();
	}

	public int getNumberOfColumns(){

		return resolvePage.allColumns.size();
	}
//getCssValue();rgba //getCssValue();rgba (0, 0, 0, 0) - means black
	@Then("user gets backround color")
	public void user_gets_backround_color() {

		String xpath = "//a[@class='cell']";
		WebElement cell = driver.findElement(By.xpath(xpath));
		System.out.println("cell.getCssValue() = " + cell.getCssValue("background-color"));
	}


	@And("user enters username and password")
	public void user_enters_username_and_password() {
			wait.until(ExpectedConditions.visibilityOf(loginPage.userName));
		  	wait.until(ExpectedConditions.visibilityOf(loginPage.userName));
			loginPage.userName.sendKeys(ConfigurationReader.get("userName"));
	 		loginPage.password.sendKeys(ConfigurationReader.get("password"));

	 
	}
	//parameterization
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password)  {
		  loginPage.userName.sendKeys(username);

		 loginPage.password.sendKeys(password);

		 
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
