package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_MyQuiz;
import base.DriverStudent;

public class TC_MyQuiz extends DriverStudent{
	
	
	@Test
	public void myQuiz() throws InterruptedException {
		
		POM_MyQuiz quiz= new POM_MyQuiz(driver);
		
		
		
		quiz.MyQuiz();
		Thread.sleep(1000);
		
		quiz.viewResult();
		Thread.sleep(1000);
		
		
		
	}

}
