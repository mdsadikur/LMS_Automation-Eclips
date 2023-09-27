package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Utilities;
import base.DriverSetup;

public class TC_Utilities extends DriverSetup{
	
	
	@Test
	public void utilities() throws InterruptedException {
		
		POM_Utilities utilities = new POM_Utilities(driver);
		
		utilities.preloaderSettings();
		Thread.sleep(1000);
		
		utilities.errorLog();
		Thread.sleep(1000);
		
		utilities.ipBlock();
		Thread.sleep(1000);

		utilities.geoLocation();
		Thread.sleep(1000);
		
		utilities.maintenance();
		Thread.sleep(1000);
		
		utilities.utilitiesSubmenu();
		Thread.sleep(1000);
	}

}
