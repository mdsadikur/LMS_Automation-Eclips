package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_LoggedInDevice;
import base.DriverStudent;

public class TC_LoggedInDevice extends DriverStudent{
	
	@Test
	public void TC_LoggedinDevice() throws InterruptedException {
		
		POM_LoggedInDevice cbox = new POM_LoggedInDevice(driver);
		
		//clickLoggedInDeviceButton
		cbox.clickLoggedInDeviceButton();
		Thread.sleep(2000);
		
	}

}
