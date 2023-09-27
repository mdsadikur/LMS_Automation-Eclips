package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_ClassEnroll;
import base.DriverStudent;



public class TC_ClassEnroll extends DriverStudent{
	
	
	@Test
	public void classSubMenu() throws InterruptedException {
		
		POM_ClassEnroll ce= new POM_ClassEnroll(driver);
		
		ce.enrollClass();
		Thread.sleep(1000);
		
		
		
		
	}

}
