package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.ReusableMethods;
import utilites.readConfig;

public class BaseClass {
	
	
	
	
	public static WebDriver driver;
	
	readConfig config = new readConfig();
	String baseUrl = config.getBaseUrl();
	String browserName = config.getBrowserName();
	String userName = config.getUserName();
	String passWord = config.getpassWord();
	
	
	
	@BeforeTest
	public void setUp()
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		}
		else
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ReusableMethods.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ReusableMethods.IMPLICIT_WAIT));
		
		driver.get(baseUrl);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
