package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObject.POM_Frontend_CMS;
import base.DriverSetup;

public class TC_Frontend_CMS extends DriverSetup{
	
	@Test
	public void TC_FrontendCMS() throws InterruptedException, AWTException {
		
		POM_Frontend_CMS cbox = new POM_Frontend_CMS(driver);
		
		//clickfrontend_cmsButton
		cbox.clickfrontend_cmsButton();
		Thread.sleep(2000);
		
		//clickTestimonialButton
		cbox.clickTestimonialButton();
		Thread.sleep(2000);
		
		//clickSocial_settingButton
		cbox.clickSocial_settingButton();
		Thread.sleep(2000);
		
		//clicksponsorButton
		cbox.clicksponsorButton();
		Thread.sleep(2000);
		
		//clickpopup_contentLButton
		cbox.clickpopup_contentLButton();
		Thread.sleep(2000);
		
		//clickfooter_settingButton
		cbox.clickfooter_settingButton();
		Thread.sleep(2000);
		
		//clicklogin_registrationButton
		cbox.clicklogin_registrationButton();
		Thread.sleep(2000);
		
		//clickFAQButton
		cbox.clickFAQButton();
		Thread.sleep(2000);
		
	}

}
