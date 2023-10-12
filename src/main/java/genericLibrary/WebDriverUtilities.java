package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	//1.handling Dropdowns
	
	public void dropDowns(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}

	//2.RightClick
	 public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions (driver);
		a.contextClick(ele).perform();
		
		}
	 
	//3.double click
		 public void doubleClick(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions (driver);
			a.doubleClick().perform();
			
			}
		 
		//4.mouse over
		 public void mouseover(WebDriver driver,WebElement ele)
		{
			Actions a=new Actions (driver);
			a.moveToElement(ele).perform();
			
			}
		 
		 
			//5.drag and drop
			 public void dragAdndDrop(WebDriver driver,WebElement ele,WebElement ele2)
			{
				Actions a=new Actions (driver);
				a.dragAndDrop(ele, ele2).perform();
				
				}
			 
			//6. alter pop up
			 public void alterpopup(WebDriver driver)
			{
			
				 driver.switchTo().alert().accept();
				
				}
			 
			//7.Handling child browser
			 public void childBrowser(WebDriver driver,WebElement ele)
			{
				Set<String> child = driver.getWindowHandles();
				for(String b:child) {
					driver.switchTo().window(b);
				}
			}
				
				 
				//8. scrolling using get location
					 public void ScrollBar(WebDriver driver,int x,int y)
					{
						JavascriptExecutor js =(JavascriptExecutor)driver;
						js.executeScript("window.scrollBy("+x+","+y+")");
								
						
						}
					 
					 
			//9.scrolling with webElement
							 public void ScrollBar(WebDriver driver,WebElement ele)
							{
								JavascriptExecutor js =(JavascriptExecutor)driver;
								js.executeScript("arguments[0].scrollIntoview();",ele);
										
								
								}
							 

			//10.for click using javaScript executer
									 public void clicking(WebDriver driver,WebElement ele)
									{
										JavascriptExecutor js =(JavascriptExecutor)driver;
										js.executeScript("arguments[0].click;",ele);
												
										
										}
					
			
					 
					 
					 
					 
					 
					 
				}
		 
		 
	

