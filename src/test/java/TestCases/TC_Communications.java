package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Communications;
import base.DriverSetup;


public class TC_Communications extends DriverSetup{
	
	
	@Test
	public void communications() throws InterruptedException {
		
		POM_Communications com= new POM_Communications(driver);
		
		com.messages();
		Thread.sleep(1000);
	}

}
