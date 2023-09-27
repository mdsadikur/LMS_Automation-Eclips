package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Instructor;
import base.DriverStudent;

public class TC_Instructor extends DriverStudent{
	
	
	@Test
	public void instruction() throws InterruptedException {
		
		POM_Instructor ins = new POM_Instructor(driver);
		
		ins.instructor();
		Thread.sleep(1000);
		

	}

}
