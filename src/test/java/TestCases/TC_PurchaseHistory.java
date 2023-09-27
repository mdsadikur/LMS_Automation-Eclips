package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_PurchaseHistory;
import base.DriverStudent;

public class TC_PurchaseHistory extends DriverStudent{
	
	
	@Test
	public void purchase() throws InterruptedException {
		
		POM_PurchaseHistory ph= new POM_PurchaseHistory(driver);
		
		ph.purchase();
		Thread.sleep(1000);
	}

}
