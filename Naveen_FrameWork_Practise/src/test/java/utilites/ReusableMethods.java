package utilites;

import testCases.BaseClass;

public class ReusableMethods extends BaseClass {
	

	public static long PAGE_LOAD_TIMEOUT = 20;
	
	public static long IMPLICIT_WAIT = 10;
	
	public static void swicthToFrame()
	{
		driver.switchTo().frame("mainpanel");	
	}
	public static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
		
	}
}
