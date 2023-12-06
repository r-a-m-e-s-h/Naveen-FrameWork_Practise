package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.ContactsPage;
import pageObjects.DealsPage;
import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.TasksPage;


public class HoemPage_Test extends BaseClass {
	
	HomePage hp;
	ContactsPage cp;
	DealsPage dp;
	TasksPage tp;
	
	
	
	
	@Test()
	public void verifyuserlabel() throws InterruptedException
	{
		Loginpage lp = new Loginpage();
		
		hp= lp.Login(userName, passWord);
		
		hp.verifyHomePageTitle();
		
		hp.validateUserLabel();
	}
		
	/*
	 * 
	 * cp = hp.clickOnConatctLink();
	 * 
	 * dp = hp.clickOnDealsLink();
	 * 
	 * tp = hp.clickOnTasksLink();
	 */
	}
	
	


