package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public PropertyFile pdata= new PropertyFile();
	public WebDriverUtilities utilities =new WebDriverUtilities();
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() throws IOException {
	WebDriverManager.edgedriver().setup();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(pdata.getpropertyData("url"));
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2) {
			photo p=new photo();
			p.getPhoto(driver, name);
			
		}
	}
	
	
	
	
	
	
	

}
