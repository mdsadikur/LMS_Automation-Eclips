package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_User_Manager;
import base.DriverSetup;

public class TC_User_Manager extends DriverSetup{
	
	@Test
	public void TC_User_manager() throws InterruptedException, AWTException {
		
		POM_User_Manager cbox = new POM_User_Manager(driver);
		
		//clickUser_managerButton
		cbox.clickUser_managerButton();
		Thread.sleep(2000);
		
		//clickstaffButton
		cbox.clickstaffButton();
		Thread.sleep(2000);
		
	}

}
