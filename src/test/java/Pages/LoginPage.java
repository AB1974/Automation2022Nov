package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class LoginPage{

	//constructor
	public LoginPage() {
		//we put this line to be able to use @FindBy annotation
		//Page Factory simple implementation of Page Object Model in Selenium
		//POM has separation of Objects and tests
		PageFactory.initElements(Driver.getDriver(),this);

	}
//@CacheLookup is cache the element once its located 
	//next time it will not be searched over and over
	@FindBy(id="name")
	@CacheLookup
	public WebElement userName;

	@FindBy(id="password")
	public WebElement password;

	@FindBy(id="login")
	public WebElement login;

}
