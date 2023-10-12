package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getpropertyData(String key) throws IOException
	
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
		
		
	}

}
