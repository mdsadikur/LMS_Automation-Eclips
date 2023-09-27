package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Reports;
import base.DriverSetup;

public class TC_Report extends DriverSetup{
	
	
	@Test
	public void reports() throws InterruptedException {
		
		POM_Reports report = new POM_Reports(driver);
		
		report.adminRevenue();
		Thread.sleep(1000);
		
		report.instructorRevenue();
		Thread.sleep(1000);
		
		report.courseStatistices();
		Thread.sleep(1000);
	}

}
