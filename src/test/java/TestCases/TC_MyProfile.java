package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_MyProfile;
import base.DriverStudent;

public class TC_MyProfile extends DriverStudent{
	
	
	@Test
	public void myProfile() throws InterruptedException {
		
		POM_MyProfile profile = new POM_MyProfile(driver);
		
		profile.myProfile();
		Thread.sleep(1000);
	}

}
