package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class LoginPage {

	//constructor

	public LoginPage() {
		//we put this line to be able to use @FindBy annotation
		PageFactory.initElements(Driver.getDriver(),this);

	}
	
	@FindBy(xpath="//input[@class ='gLFyf gsfi']")
	public WebElement googleSearch;

}
