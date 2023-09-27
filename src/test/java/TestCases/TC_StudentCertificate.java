package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_StudentCertificate;
import base.DriverStudent;

public class TC_StudentCertificate extends DriverStudent{
	
	
	@Test
	public void Certificate() throws InterruptedException {
		
		POM_StudentCertificate Cbox = new POM_StudentCertificate(driver);
		
		Cbox.Click_StudentcertificateButton();
		Thread.sleep(1000);
		
		
	}

}
