package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_ReferralSettings;
import base.DriverSetup;

public class TC_ReferralSettings extends DriverSetup{
	
	
	
	@Test
	public void referralSettings() throws InterruptedException {
		
		POM_ReferralSettings rs= new POM_ReferralSettings(driver);
		
		rs.referralSettings();
		Thread.sleep(1000);
	}

}
