package Utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	//Singleton Design Pattern which contains Private WebDriver Object and 
	//private constructor  and also public getter method.By doing so I ensure that
	//there is going to be only a Single WebDriver Object  throughout the framework and 
	// none of the class will be able to create another WebDriver Object and this will provide  thread safety 


	private static WebDriver driver ; 

	//constructor
	private Driver (){}


	public static WebDriver getDriver() {

		if (driver==null) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\lib\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();

		}
		return driver;
	}



	public static void closeDriver() {
		if(driver !=null ) {
			driver.close();
			driver.quit();
		}
		driver=null;
	}






}

