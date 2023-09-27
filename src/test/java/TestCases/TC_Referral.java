package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Referral;
import base.DriverStudent;

public class TC_Referral extends DriverStudent{
	
	
	
	@Test
	public void referral() throws InterruptedException {
		
		POM_Referral referral= new POM_Referral(driver);
		
		referral.referral();
		Thread.sleep(1000);
		
	}
	
	
	
	
	

}
