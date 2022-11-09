package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

import java.util.List;


public class ResolvePage {
	//constructor
		public ResolvePage() {
			//we put this line to be able to use @FindBy annotation
			PageFactory.initElements(Driver.getDriver(),this);

		}

		@FindBy(xpath="//input[@class ='gLFyf gsfi']")
		public WebElement search;

	@FindBy(id="table1")
	public WebElement table;

	@FindBy(xpath="(//table/thead)[1]")
	public List<WebElement> allHeaders;

	@FindBy(xpath="//table[@id='table1' ]/tbody/tr")
	public List<WebElement> allRows;

	@FindBy(xpath="//table[@id='table1']//tr/th")
	public List<WebElement> allColumns;
}
