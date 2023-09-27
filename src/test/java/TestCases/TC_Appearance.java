package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Appearance;
import base.DriverSetup;

public class TC_Appearance extends DriverSetup{
	
	@Test
	public void TC_appearance() throws InterruptedException {
		
		POM_Appearance cbox = new POM_Appearance(driver);
		
		//clickappearanceButton
		cbox.clickappearanceButton();
		Thread.sleep(2000);
		
	}

}
