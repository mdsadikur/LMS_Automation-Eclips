package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Contact;
import base.DriverStudent;


public class TC_Contact extends DriverStudent{
	
	
	@Test
	public void contact() throws InterruptedException {
		
		POM_Contact contact= new POM_Contact(driver);
		
		contact.contact();
		Thread.sleep(1000);
		
	}

}
