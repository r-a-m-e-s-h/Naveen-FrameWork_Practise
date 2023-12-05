package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	
	Properties properties;
	
	public readConfig()
	{
		File floc = new File("./src/test/java/utilites/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(floc);
			properties = new Properties();
			properties.load(fis);
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getpassWord()
	{
		String pwd = properties.getProperty("passWord");
		return pwd;
	}
	public String getBaseUrl()
	{
		String url = properties.getProperty("BaseURL");
		return url;
	}
	public String getBrowserName()
	{
		String browser = properties.getProperty("BrowserName");
		return browser;
	}
	
	
	

}
