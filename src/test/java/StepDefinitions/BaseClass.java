package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Driver;

public class BaseClass {

	public WebDriver driver = Driver.getDriver();
	public WebDriverWait wait= new WebDriverWait (driver,20);

}
