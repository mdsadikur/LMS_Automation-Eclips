package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_Quiz;
import base.DriverSetup;

public class TC_Quiz extends DriverSetup{
	
	
	@Test
	public void quiz() throws InterruptedException, AWTException {
		
		POM_Quiz quiz= new POM_Quiz(driver);
		
		quiz.questionGroup();
		Thread.sleep(1000);
		
		quiz.addQuestion();
		Thread.sleep(1000);
		
		quiz.questionBank();
		Thread.sleep(1000);
		
		quiz.questionImport();
		Thread.sleep(1000);
		
		quiz.addQuiz();
		Thread.sleep(1000);
		
		
		quiz.quizSetup();
		Thread.sleep(1000);
		
		
		quiz.quizReport();
		Thread.sleep(1000);
	}

}
