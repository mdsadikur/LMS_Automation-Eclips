package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_My_Courses;
import base.DriverStudent;

public class TC_My_Courses extends DriverStudent{
	
	@Test
	public void TC_My_courses() throws InterruptedException {
		
		POM_My_Courses cbox = new POM_My_Courses(driver);
		
		//click_My_courses_button
		cbox.click_My_courses_button();
		Thread.sleep(2000);
	}

}
