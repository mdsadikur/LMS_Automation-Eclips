package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_NotificationSetup;
import base.DriverStudent;

public class TC_NotificationSetup extends DriverStudent{
	
	
	@Test
	public void notificationSetup() throws InterruptedException {
		
		POM_NotificationSetup ns= new POM_NotificationSetup(driver);
		
		ns.notificationSetup();
		Thread.sleep(1000);
		
		
		
		
		
	}

}
