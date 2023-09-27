package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_NewsLetter;
import base.DriverSetup;

public class TC_NewsLetter extends DriverSetup{
	
	
	@Test
	public void newsLetter() throws InterruptedException {
		
		POM_NewsLetter news = new POM_NewsLetter(driver);
		
		news.settings();
		Thread.sleep(1000);
		
		news.mailChimpSettings();
		Thread.sleep(1000);
		
		news.getResponseSettings();
		Thread.sleep(1000);
		
		news.acelle();
		Thread.sleep(1000);
		
		news.subscriber();
		Thread.sleep(1000);
		
		
		
	}

}
