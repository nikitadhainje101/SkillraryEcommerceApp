package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryAppPage;
import POM.SkillraryHomePage;
import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass {
	
	@Test 
	public void tc1() {
	SkillraryHomePage s=new SkillraryHomePage(driver);
	s.gearsbutton();
	//s.skillrarydemoapplink();
	utilities.childBrowser(driver, null);
	DemoSkillraryAppPage dS=new DemoSkillraryAppPage(driver);
	//utilities.dropDowns(dS.get, null);
	
	
	
	

	}
	
}
