package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_Students;
import base.DriverSetup;

public class TC_Student extends DriverSetup {
	@Test
	
	public void TC_student() throws InterruptedException, AWTException{

		POM_Students cbox = new POM_Students(driver);
		
		cbox.StudentList();
		Thread.sleep(2000);
		
		cbox.click_regularStudentImport_button();
		Thread.sleep(2000);
		
		cbox.New_Enroll();
		Thread.sleep(2000);
		
		cbox.Enrolled_Student();
		Thread.sleep(2000);
	}

}
