package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Notification;
import base.DriverSetup;

public class TC_Notification extends DriverSetup{
	
	
	@Test
	public void notification() throws InterruptedException {
		
		POM_Notification notification = new POM_Notification(driver);
		
		notification.notificationSetup();
		Thread.sleep(1000);
		
		notification.userNotificationSetup();
		Thread.sleep(1000);
	}

}
