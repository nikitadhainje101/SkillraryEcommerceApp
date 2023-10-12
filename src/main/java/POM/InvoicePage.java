package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {

	//declaration
	//adress of invoice Webelement
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement InvoiceBtn;
	public InvoicePage(WebDriver driver)
	{
	PageFactory.initElements( driver,this);	
	}
	public void InvoiceButton()
	{
		InvoiceBtn.click();
	}
}
