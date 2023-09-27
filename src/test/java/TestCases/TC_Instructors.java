package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Instructors;
import base.DriverSetup;

public class TC_Instructors extends DriverSetup{
	
	@Test
	public void TC_instructors() throws InterruptedException {
		
		POM_Instructors cbox = new POM_Instructors(driver);
		
		//click_instructors_button
		cbox.click_instructors_button();
		Thread.sleep(2000);
		
		//ClickPayout_listButton
		cbox.ClickPayout_listButton();
		Thread.sleep(2000);
		
	}

}
