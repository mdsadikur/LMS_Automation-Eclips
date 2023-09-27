package TestCases;

import org.testng.annotations.Test;

import PageObject.POM_Blog;
import base.DriverSetup;


public class TC_Blog extends DriverSetup{
	
	
	@Test
	public void blogs() throws InterruptedException {
		
		POM_Blog blog= new POM_Blog(driver);
		
		blog.category();
		Thread.sleep(1000);
		
		blog.post();
		Thread.sleep(1000);
	}

}
