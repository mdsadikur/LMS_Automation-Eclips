package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Virtual_Class;
import base.DriverSetup;

public class TC_Virtual_Class extends DriverSetup{
	
	@Test
	public void TC_Virtual_class() throws InterruptedException {
		
		POM_Virtual_Class cbox = new POM_Virtual_Class(driver);
		
		cbox.clickVirtual_classButton();
		Thread.sleep(1000);
	}

}
