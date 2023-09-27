package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Sidebar;
import base.DriverSetup;

public class TC_sideBar extends DriverSetup{
	
	
	@Test
	public void sidebar() throws InterruptedException {
		
		POM_Sidebar side = new POM_Sidebar(driver); 
			
		side.sideBar();
		Thread.sleep(1000);
			
		
		
	}

}
