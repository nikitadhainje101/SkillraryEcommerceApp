package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryAppPage {

	@FindBy(id="course")
	private WebElement Coursebtn;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackBtn;
	
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	public DemoSkillraryAppPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
}
