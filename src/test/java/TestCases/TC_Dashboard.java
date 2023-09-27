package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Dashboard;
import base.DriverSetup;

public class TC_Dashboard extends DriverSetup{
	
	@Test
	public void TC_dashboard() throws InterruptedException {
		
		POM_Dashboard cbox = new POM_Dashboard(driver);
		
		//clickDashboard
		cbox.clickDashboard();
		Thread.sleep(2000);
	}

}
