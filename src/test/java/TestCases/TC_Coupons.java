package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Coupons;
import base.DriverSetup;

public class TC_Coupons extends DriverSetup {
	@Test
	
	public void TC_coupons() throws InterruptedException {
		POM_Coupons cbox = new POM_Coupons(driver);
		
		cbox.couponlist();
		Thread.sleep(1000);
		
		cbox.commoncoupons();
		Thread.sleep(2000);
		
		cbox.singlecoupon();
		Thread.sleep(2000);
		
		cbox.personalizedcoupons();
		Thread.sleep(1000);
	}

}
