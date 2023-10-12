package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {

	//declaration
	//adress of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//adress of search text field
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])")
	private WebElement skillrarydemoapp;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchchTF;
	
	@FindBy(xpath="//input[@value='go']")
	
	private WebElement searchicon;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement cookies;
	
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void gearsbutton()
	{
		skillrarydemoapp.click();
	}
	public void searchTextField(String data)
	{
		searchchTF.sendKeys(data);
	}
	public void serachIcon()
	{
		searchicon.click();
	}
	public void cookiesIcon()
	{
		cookies.click();
	}

	
	
	
}
