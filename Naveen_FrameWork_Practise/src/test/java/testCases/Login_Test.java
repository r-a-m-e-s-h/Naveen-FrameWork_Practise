package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;

public class Login_Test extends BaseClass {
	
	Loginpage lp;
	HomePage hp;
	
	
	@Test
	public void logintest() throws InterruptedException
	{
		 lp = new Loginpage();
		
		System.out.println(lp.validateLogo());
		
		Thread.sleep(3000);
		
		System.out.println(lp.validatePageTitle());
		//lp.validatePageTitle();
		Thread.sleep(3000);
		
		hp = lp.Login(userName, passWord);
	}

}
