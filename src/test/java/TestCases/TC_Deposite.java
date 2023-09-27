package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_Deposite;
import base.DriverStudent;


public class TC_Deposite extends DriverStudent{
	
	
	@Test
	
	public void deposite() throws InterruptedException, AWTException {
		
		POM_Deposite deposite = new POM_Deposite(driver);
		
		deposite.deposite();
		Thread.sleep(1000);
	}

}
