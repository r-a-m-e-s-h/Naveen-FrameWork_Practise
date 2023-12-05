package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;


public class Loginpage extends BaseClass{
	
	//public static WebDriver driver;
	
	public Loginpage()
	{
		//driver = rdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public static WebElement username;
	
	
	@FindBy(xpath="//*[@name=\"password\"]")
	public static WebElement pwd;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	public static WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	public static WebElement logo;
	
	
	
	public String validatePageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	public HomePage Login(String uname,String password) throws InterruptedException
	{
		username.sendKeys(uname);
		Thread.sleep(3000);
		pwd.sendKeys(password);
		Thread.sleep(3000);
		loginBtn.click();
		return new HomePage();
	}
}

//	public void enterPassWord(String txt)
//	{
//		pwd.sendKeys(txt);
//	}
//	public void clickLoginbtn()
//	{
//		loginBtn.click();
//	}
	

