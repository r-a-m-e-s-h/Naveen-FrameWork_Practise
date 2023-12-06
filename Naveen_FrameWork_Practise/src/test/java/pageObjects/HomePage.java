package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testCases.BaseClass;
import utilites.ReusableMethods;

public class HomePage extends BaseClass {
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(),'User: TomTester Smasher')]")
	WebElement userLabel;
	
	@FindBy(xpath="//a[contains(text(),\"Contacts\")]")
	WebElement contacts_Link;
	
	@FindBy(xpath="//a[contains(text(),\"Deals\")]")
	WebElement deals_Link;
	
	@FindBy(xpath="//a[contains(text(),\"Tasks\")]")
	WebElement tasks_links;
	
	public String verifyHomePageTitle()
	{
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO");
		System.out.println(homePageTitle);
		return homePageTitle;
	}
	public ContactsPage clickOnConatctLink()
	{
		contacts_Link.click();
		return new ContactsPage();
	}
	public DealsPage clickOnDealsLink()
	{
		deals_Link.click();
		return new DealsPage();
	}
	public TasksPage clickOnTasksLink()
	{
		tasks_links.click();
		return new TasksPage();
	}
	public boolean validateUserLabel()
	{
		ReusableMethods.swicthToFrame();
		boolean username = userLabel.isDisplayed();
		return username;
		
	}
	
	
	
	
	
	
	
}
