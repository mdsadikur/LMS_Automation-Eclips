package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_SystemSettings;
import base.DriverSetup;



public class TC_SystemSettings extends DriverSetup {
	@Test
	
	public void TC_SystemSettings() throws InterruptedException, AWTException {
		POM_SystemSettings cbox = new POM_SystemSettings(driver);
		
		cbox.activation();
		Thread.sleep(2000);
		
		cbox.generalsettings();
		Thread.sleep(2000);
		
		cbox.commission();
		Thread.sleep(2000);
		
		cbox.instructorsetup();
		Thread.sleep(2000);
		
		cbox.emailsettings();
		Thread.sleep(2000);
		
		cbox.emailtemplate();
		Thread.sleep(2000);
		
		cbox.paymentmethodsettings();
		Thread.sleep(1000);
		
		cbox.apisettings();
		Thread.sleep(2000);
		
		cbox.vimeoconfig();
		Thread.sleep(1000);
		
		cbox.vdocipher();
		Thread.sleep(1000);
		
		cbox.gDrive();
		Thread.sleep(1000);
		
		cbox.HomepageSeoSetup();
		Thread.sleep(1000);
		
		cbox.language();
		Thread.sleep(1000);
		
		cbox.currency();
		Thread.sleep(1000);
		
		cbox.timezone();
		Thread.sleep(1000);
		
		cbox.modulemanager();
		Thread.sleep(1000);
		
		cbox.aboutupdate();
		Thread.sleep(1000);
		
		cbox.city();
		Thread.sleep(1000);
		
		cbox.cookiessetings();
		Thread.sleep(1000);
		
		cbox.cachesetting();
		Thread.sleep(1000);
		
		cbox.queuesetting();
		Thread.sleep(1000);
		
		cbox.cronjob();
		Thread.sleep(1000);
//		
		cbox.recaptcha();
		Thread.sleep(1000);
		
	}
	
	
	

}
