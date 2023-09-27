package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_CourseEnroll;
import base.DriverStudent;


public class TC_CourseEnroll extends DriverStudent{
	
	
	@Test
	public void course() throws InterruptedException {
		
		POM_CourseEnroll ce = new POM_CourseEnroll(driver);
		
		ce.enrollCourse();
		Thread.sleep(1000);
	}

}
