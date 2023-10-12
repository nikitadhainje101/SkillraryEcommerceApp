package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//declaration
	//adress of facebook webelement
	@FindBy(xpath="//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	//initiallization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fbIconWebElement()
	{
		fbIcon.click();
	}
	
	
	
	

}
