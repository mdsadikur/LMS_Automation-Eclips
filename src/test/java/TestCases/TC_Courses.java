package TestCases;
import java.awt.AWTException;
import org.testng.annotations.Test;

import PageObject.POM_Courses;
import base.DriverSetup;
public class TC_Courses extends DriverSetup{
	
	@Test
	public void TC_courses() throws InterruptedException, AWTException {
		
		POM_Courses cbox = new POM_Courses(driver);
		
		//clickCategoryButton
		cbox.clickCategoryButton();
		Thread.sleep(1000);
		
		//clickall_coursesButton
		cbox.clickall_coursesButton();
		Thread.sleep(1000);
		
		//click_CourseLevel_Button
		cbox.click_CourseLevel_Button();
		Thread.sleep(1000);
		
//		//click_addquiz_button
//		cbox.click_addquiz_button();
//		Thread.sleep(1000);
		
//		//click_course_setting_button
//		cbox.click_course_setting_button_seekbar();
//		Thread.sleep(1000);
//		
//		//click_course_setting_button_dripContent()
//		cbox.click_course_setting_button_dripContent();
//		Thread.sleep(1000);
//		
//		//click_course_setting_button_Hide_QA()
//		cbox.click_course_setting_button_Hide_QA();
//		Thread.sleep(1000);
//		
//		//click_course_setting_button_Hide_Review()
//		cbox.click_course_setting_button_Hide_Review();
//		Thread.sleep(1000);
		
	}
	

}
