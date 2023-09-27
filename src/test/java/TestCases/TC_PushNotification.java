package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_PushNotification;
import base.DriverSetup;

public class TC_PushNotification extends DriverSetup {
	@Test
	
	public void TC_pushNotification() throws InterruptedException {
		POM_PushNotification cbox = new POM_PushNotification(driver);
		
		cbox.pushnotification();
	}

}
