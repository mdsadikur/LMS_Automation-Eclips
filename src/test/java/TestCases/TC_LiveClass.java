package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_LiveClass;
import base.DriverStudent;


public class TC_LiveClass extends DriverStudent{
	
	
	
	@Test
	public void liveClass() throws InterruptedException {
		
		
		POM_LiveClass lc= new POM_LiveClass(driver);
		
		lc.liveClass();
		Thread.sleep(1000);
		
	}

}
