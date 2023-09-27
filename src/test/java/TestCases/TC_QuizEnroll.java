package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_QuizEnroll;
import base.DriverStudent;

public class TC_QuizEnroll extends DriverStudent{
	
	
	@Test
	public void quiz() throws InterruptedException {
		
		
		POM_QuizEnroll qe= new POM_QuizEnroll(driver);
		
		qe.enrollQUiz();
		Thread.sleep(1000);
	}

}
