package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement pluseIcon;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement AddToCart;
	//initialization
	public void AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	//utilization
	public WebElement getPlusIcon()
	{
		return pluseIcon;
	}

	public void addToCart()
	{
		AddToCart.click();
	}
}
