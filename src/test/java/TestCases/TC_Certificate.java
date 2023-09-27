package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_Certificate;
import base.DriverSetup;

public class TC_Certificate extends DriverSetup{
	
	@Test
	public void TC_certificate() throws InterruptedException, AWTException {
		
		POM_Certificate cbox = new POM_Certificate(driver);
		
		//clickcertificateButton
		cbox.clickcertificateButton();
		Thread.sleep(1000);
		
		//clickadd_certificateButton
		cbox.clickadd_certificateButton();
		Thread.sleep(1000);
		
	}

}
