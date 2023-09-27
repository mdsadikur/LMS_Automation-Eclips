package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Courses {
	
	WebDriver driver;
	
	public POM_Courses(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}

	CommonMethod upload = new CommonMethod();
	
	/*
	 * 
	 * Courses
	 * Category list
	 * 
	 */
	
	//courses
	@FindBy(xpath ="//span[contains(text(),'Courses')]")
	WebElement courses;
	
	//category list
	@FindBy(xpath = "//a[contains(text(),' Category List')]")
	WebElement categoryList;
	
	//category name
	@FindBy(name = "name[en]")
	WebElement category_name;
	
	//category description
	@FindBy(name = "description[en]")
	WebElement category_Description;
	
	//category icon browse
	@FindBy(xpath = "(//label[contains(text(), 'Browse')])[1]")
	WebElement category_iconBrowse;
	
	//category save
	@FindBy(xpath = "//button[@class='primary-btn semi_large fix-gr-bg']")
	WebElement category_save;
	
	//list expand
	@FindBy(xpath = "//td[@class='sorting_1']")
	WebElement categorylist_expand;
	
	//select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[2]")
	WebElement category_select;
	
	//edit
	@FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[3]")
	WebElement category_edit;
	
	/*
	 * all courses
	 */
	
	//all courses
	@FindBy(xpath = "(//a[contains(text(),'All Courses')])[1]")
	WebElement all_courses;
	
	//add courses
	@FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg']")
	WebElement add_courses;
	
	//course title
	@FindBy(name = "title[en]")
	WebElement course_title;
	
	//course requirement
	@FindBy(xpath = "(//div[@class='note-editable card-block'])[7]")
	WebElement Course_requirement;
	
	//course description
	@FindBy(xpath = "(//div[@class='note-editable card-block'])[8]")
	WebElement Course_description;
	
	//course outcomes
	@FindBy(xpath = "(//div[@class='note-editable card-block'])[9]")
	WebElement Course_outcomes;
	
	//course category
	@FindBy(xpath = "//span[contains(text(),'Select Category *')]")
	WebElement course_category;
	
	//course specific category
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/form/div[4]/div[1]/div/ul/li[2]")
	WebElement course_specific_category;
	
	//course level
	@FindBy(xpath = "//span[contains(text(),'Select Level *')]")
	WebElement course_level;
	
	//course specific level
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/form/div[4]/div[5]/div/ul/li[2]")
	WebElement course_specific_level;
	
	//course thumbnail
	@FindBy(xpath = "//label[@class='primary-btn small fix-gr-bg']")
	WebElement course_thumbnail;
	
	//add course
	@FindBy(xpath = "//button[@class='primary-btn semi_large2  fix-gr-bg']")
	WebElement add_courseButton;
	
	/*
	 * 
	 */
	
	//status mark
	@FindBy(xpath = "(//input[@class='status_enable_disable'])[1]")
	WebElement checking;
	//status check
	@FindBy(xpath = "(//i[@class='slider round'])[1]")
	WebElement course_statusCheck;
	
	//all course expend
	@FindBy(xpath = "(//td[@class='sorting_1'])[1]")
	WebElement allCourse_expand;
	
	//course action
	@FindBy(xpath ="(//button[@class='btn btn-secondary dropdown-toggle'])[2]")
	WebElement course_action;
	
	//course Frontend View
	@FindBy(xpath = "(//a[contains(text(),' Frontend View')])[2]")
	WebElement CourseFrontend_view;
	
	//add lesson
	@FindBy(xpath = "(//a[contains(text(),' Add Lesson')])[2]")
	WebElement add_Lesson;
	
	//course curriculum expand
	@FindBy(xpath = "(//i[@class='ti-plus m-0'])")
	WebElement course_curriculum_expand;
	
	//course chapter add
	@FindBy(id = "show_chapter_section")
	WebElement course_chapter_add;
	
	//course chapter name
	@FindBy(name = "chapter_name")
	WebElement course_chapterName;
	
	//course chapter save
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg'])[2]")
	WebElement Course_chapter_save;
	
	//course chapter expand
	@FindBy(xpath = "(//div[@class='arrow collapsed'])[1]")
	WebElement course_chapter_expand;
	
	//course lesson expand
	@FindBy(xpath = "(//i[@class='ti-plus'])[4]")
	WebElement course_lesson_expand;
	
	//course add lesson
	@FindBy(xpath = "(//button[@class='ellipsis btn btn-tertiary btn-block show_lesson_section_inside'])[1]")
	WebElement course_add_lesson;
	
	//course lesson name
	@FindBy(xpath = "(//input[@class='primary_input_field name'][@name='name'])[2]")
	WebElement course_lesson_name;
	
	//course lesson duration
	@FindBy(xpath = "(//input[@class='primary_input_field name'][@name='duration'])[2]")
	WebElement course_lesson_duration;
	
	//lesson_host
	@FindBy(xpath = "(//span[contains(text(),'Select Host')])[1]")
	WebElement lesson_host;
	
	//course lesson image
	@FindBy(xpath = "//*[@id=\"lesson_section0\"]/div[2]/form/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/ul/li[8]")
	WebElement course_lesson_image;
	
	//course lesson browse
	@FindBy(xpath = "(//span[contains(text(),'Browse')])[2]")
	WebElement course_lesson_browse;
	
	//course lesson description
	@FindBy(xpath = "(//textarea[@class='primary_textarea height_128'][@name='description'])[1]")
	WebElement course_lesson_description;
	
	//course lesson save
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg'])[5]")
	WebElement course_lesson_save;
	
	/*
	 * 
	 * for new chapter
	 * 
	 */
	
	//course chapter expand
		@FindBy(xpath = "(//div[@class='arrow collapsed'])[2]")
		WebElement course_chapter_expand2;
		
		//course lesson expand
		@FindBy(xpath = "(//i[@class='ti-plus'])[7]")
		WebElement course_lesson_expand2;
		
		//course add lesson
		@FindBy(xpath = "(//button[@class='ellipsis btn btn-tertiary btn-block show_lesson_section_inside'])[2]")
		WebElement course_add_lesson2;
		
		//course lesson name
		@FindBy(xpath = "(//input[@class='primary_input_field name'][@name='name'])[3]")
		WebElement course_lesson_name2;
		
		//course lesson duration
		@FindBy(xpath = "(//input[@class='primary_input_field name'][@name='duration'])[3]")
		WebElement course_lesson_duration2;
		
		//lesson_host
		@FindBy(xpath = "(//span[contains(text(),'Select Host')])[2]")
		WebElement lesson_host2;
		
		//course lesson video
		@FindBy(xpath = "//*[@id=\"lesson_section1\"]/div[2]/form/div/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/ul/li[5]")
		WebElement course_lesson_video;
		
		//course lesson browse
		@FindBy(xpath = "(//span[contains(text(),'Browse')])[3]")
		WebElement course_lesson_browse2;
		
		//course lesson description
		@FindBy(xpath = "(//textarea[@class='primary_textarea height_128'][@name='description'])[2]")
		WebElement course_lesson_description2;
		
		//course lesson save
		@FindBy(xpath = "//*[@id=\"lesson_section1\"]/div[2]/form/div/div/div[2]/div/button")
		WebElement course_lesson_save2;
	
	/*
	 * 
	 * 
	 */
	
	//course lesson name edit
	@FindBy(xpath = "(//i[@class='ti-pencil-alt'])[1]")
	WebElement course_lesson_nameEdit;
	
	//course lesson name update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg'])[6]")
	WebElement course_lessonName_update;
	
	//course exercise file
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[2]/ul/li[3]/a")
	WebElement course_exercise_file;
	
	//course exercise add 
	@FindBy(xpath = "//a[@class='primary-btn radius_30px  fix-gr-bg']")
	WebElement course_exercise_add;
	
	//course exercise browse
	@FindBy(xpath = "//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	WebElement course_exercise_browse;
	
	//course exercise file name
	@FindBy(name = "fileName")
	WebElement course_exercise_file_name;
	
	//course exercise file save
	@FindBy(xpath = "(//button[contains(text(),'Add')])")
	WebElement course_exercise_file_save;
	
	/*
	 * certificate
	 */
	
	//certificate
	@FindBy(xpath = "(//a[contains(text(),'Certificate')])[4]")
	WebElement certificate;
	
	//select certificate
	@FindBy(xpath = "(//span[contains(text(),'Select Certificate')])")
	WebElement select_certificate;
	
	//select specific certificate
	@FindBy(xpath = "//*[@id=\"certificate\"]/div/div/form/div[1]/div/div/ul/li[2]")
	WebElement select_specific_certificate;
	
	//save certificate
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2  fix-gr-bg'])[2]")
	WebElement save_certificate;
	
	/*
	 * 
	 */
	//course edit
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[2]")
	WebElement course_edit;
	
	//course view
	@FindBy(xpath = "(//a[contains(text(),'View')])[4]")
	WebElement course_view;
	
	//course student
	@FindBy(xpath = "(//a[contains(text(),'Students')])[2]")
	WebElement course_student;
	
	//course notify
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr/td[6]/a")
	WebElement course_notify;
	
	/*
	 * 
	 * Course Level
	 * 
	 */
	
	//course level
	@FindBy(xpath = "(//a[contains(text(),' Course level')])")
	WebElement course_Level;
	
	//course level name
	@FindBy(name = "title[en]")
	WebElement course_level_name;
	
	//course level save
	@FindBy(xpath = "(//button[@class='primary-btn semi_large fix-gr-bg'])[2]")
	WebElement course_level_save;
	
	//course level select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[5]")
	WebElement course_level_select;
	
	//course level edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[5]/td[3]/div/div/a[1]")
	WebElement course_level_edit;
	
	//course level delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[5]/td[3]/div/div/a[2]")
	WebElement course_level_delete;
	
	//course level delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")			
	WebElement course_level_delete_confirm;
	
	/*
	 * 
	 * Course setting
	 * 
	 */
	
	//course setting
	@FindBy(xpath = "(//a[contains(text(),' Course Setting')])")
	WebElement course_setting;
	
	/*
	 * seekbar player
	 */
	
	//seekbar in player
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[1]/div/div/span")
	WebElement seekbar_in_player;
	
	//course seekbar no
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[1]/div/div/ul/li[1]")
	WebElement course_seekbar_no;
	
	//course seekbar yes
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[1]/div/div/ul/li[2]")
	WebElement course_seekbar_yes;
	
	/*
	 * drip content
	 */
	
	//drip content
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[2]/div/div/span")
	WebElement drip_content;
	
	//drip show all
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[2]/div/div/ul/li[1]")
	WebElement drip_show_all;
	
	//drip show after unlock
	@FindBy(xpath = "//li[contains(text(),'Show After Unlock')]")
	WebElement drip_showAfterUnlock;
	
	/*
	 * Course approval
	 */
	
	//course approval by admin
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[3]/div/div/span")
	WebElement course_approval_ByAdmin;
	
	//course approval by admin yes
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[3]/div/div/ul/li[1]")
	WebElement course_approval_ByAdmin_yes;
	
	//course approval by admin no
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[3]/div/div/ul/li[2]")
	WebElement course_approval_ByAdmin_no;
	
	/*
	 * Course QA Hide
	 */
	
	//course QA Hide
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[4]/div/div/span")
	WebElement course_QA_hide;
	
	//course QA Hide no
	@FindBy(xpath ="//*[@id=\"coupon-form\"]/div[1]/div[4]/div/div/ul/li[1]")
	WebElement Couse_QA_hide_no;
	
	//course QA Hide yes
	@FindBy(xpath ="//*[@id=\"coupon-form\"]/div[1]/div[4]/div/div/ul/li[1]")
	WebElement Couse_QA_hide_yes;
	
	/*
	 * Hide review section
	 */
	
	//Course hide review
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[5]/div/div/span")
	WebElement Course_hide_review;
	
	//Course hide review no
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[5]/div/div/ul/li[1]")
	WebElement Course_hide_review_no;
	
	//Course hide review yes
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div[1]/div[5]/div/div/ul/li[2]")
	WebElement Course_hide_review_yes;
	
	//course setting update
	@FindBy(xpath = "//button[@class='primary-btn semi_large fix-gr-bg']")
	WebElement course_setting_update;
	
	/*
	 * Create Quiz
	 */
	
	//quiz
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/form/div[1]/div[1]/div/div/div[3]/label/span")
	WebElement quiz;
	
	//select quiz
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/form/div[4]/div[4]/div/span")
	WebElement select_quiz;
	
	//select specific quiz
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div[2]/form/div[4]/div[4]/div/ul/li[2]")
	WebElement select_specific_quiz;
	
	//quiz price
	@FindBy(xpath = "//*[@id=\"addPrice\"]")
	WebElement quiz_price;
	
	/*
	 * 
	 * 
	 */
	
	public void clickCategoryButton() throws InterruptedException, AWTException {
		
		//courses
		courses.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in Courses");
		
		//category list
		categoryList.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter in Courses");
		
		//category_name
		category_name.sendKeys("Category 1");
		Thread.sleep(1000);
		
		//category_Description
		category_Description.sendKeys("It is a long established fact that a reader will be distracted by "
				+ "the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		
		//category_iconBrowse
		category_iconBrowse.click();
		Thread.sleep(1000);
		//upload icon
		String filePath2=upload.getFilePath("php.png");
		upload.iconUpload(filePath2);
		
		//category_save
		category_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully saved course category");
		
		//categorylist_expand
		categorylist_expand.click();
		Thread.sleep(1000);
		
		//category_select
		category_select.click();
		Thread.sleep(1000);
		
		//category_edit
		category_edit.click();
		Thread.sleep(1000);
		
		//category_save
		category_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully Edited in Courses category");
		System.out.println("Successfully Checkout from in Courses category");
	}
	
	/*
	 * 
	 * all_courses
	 * 
	 */
	
	public void course_action() throws InterruptedException {
		
		//all_courses
		all_courses.click();
		Thread.sleep(1000);
		
		//allCourse_expand
		allCourse_expand.click();
		Thread.sleep(1000);
			
		//course_action	
		course_action.click();
		Thread.sleep(1000);
		
	}
	
	public void course_add_Course() throws InterruptedException, AWTException {
		
		//all_courses
		all_courses.click();
		Thread.sleep(2000);
		
		//add_courses
		add_courses.click();
		Thread.sleep(1000);
		
		//course_title
		course_title.sendKeys("Test Course 1");
		Thread.sleep(1000);
		
		//Course_requirement
//		Course_requirement.sendKeys("It is a long established fact that a reader will be distracted by "
//				+ "the readable content of a page when looking at its layout. ");
//		Thread.sleep(1000);
		
//		String filePath2=upload.getFilePath("SampleVideo.mp4");
//		upload.VideoLessonUpload(filePath2);
//		Thread.sleep(1000);
		
		//Course_description
//		Course_description.sendKeys("It is a long established fact that a reader will be distracted by "
//				+ "the readable content of a page when looking at its layout. ");
//		Thread.sleep(1000);
		
		//Course_outcomes
//		Course_outcomes.sendKeys("It is a long established fact that a reader will be distracted by "
//				+ "the readable content of a page when looking at its layout. ");
//		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(500,1000)");
		Thread.sleep(1000);
		
		//course_category
		course_category.click();
		Thread.sleep(1000);
		
		//course_specific_category
		course_specific_category.click();
		Thread.sleep(1000);
		
		//course_level
		course_level.click();
		Thread.sleep(1000);
		
		//course_specific_level
		course_specific_level.click();
		Thread.sleep(1000);
		
		js.executeScript("window.scroll(1000,1500)");
		Thread.sleep(1000);
		
		//course_thumbnail
		course_thumbnail.click();
		Thread.sleep(1000);
		//upload thumbnail
		String filePath=upload.getFilePath("Thumbnail.jpg");
		upload.thumbnailUpload(filePath);
		
		//add_courseButton
		add_courseButton.click();
		Thread.sleep(1000);
		System.out.println("Successfully created a courses");
		
		System.out.println("Successfully Add course in All Courses");
		
		if(checking.isSelected()) {
			
			all_courses.click();
			
		}
		
		else {
			course_statusCheck.click();
			Thread.sleep(3000);
		}
	
	}
	
	public void course_Frontend_view() throws InterruptedException {
		
		//allCourse_expand
		allCourse_expand.click();
		Thread.sleep(1000);
			
		//course_action	
		course_action.click();
		Thread.sleep(1000);
		
		//CourseFrontend_view
		CourseFrontend_view.click();
		Thread.sleep(10000);
		
		upload.switchnextWindow();
		Thread.sleep(1000);
		
		driver.close();
		Thread.sleep(1000);
		
		upload.switchpreviousWindow();
		System.out.println("Successfully viewed courses frontend view");
	}
	
	public void course_Add_lesson() throws InterruptedException, AWTException {
		
		//course_action	
		course_action.click();
		Thread.sleep(1000);
		
		//add_Lesson
		add_Lesson.click();
		Thread.sleep(1000);
		
		//course_curriculum_expand
		course_curriculum_expand.click();
		Thread.sleep(1000);
		
		//course_chapter_add
		course_chapter_add.click();
		Thread.sleep(1000);
		
		//course_chapterName
		course_chapterName.sendKeys("chapter 1");
		Thread.sleep(1000);
		
		//Course_chapter_save
		Course_chapter_save.click();
		Thread.sleep(1000);
		
		System.out.println("Successfully created a new chapter");
		
		//course_chapter_expand
		course_chapter_expand.click();
		Thread.sleep(1000);
		
		//course_lesson_expand
		course_lesson_expand.click();
		Thread.sleep(1000);
		
		//course_add_lesson
		course_add_lesson.click();
		Thread.sleep(1000);
		
		//course_lesson_name
		course_lesson_name.sendKeys("Lesson 1");
		Thread.sleep(1000);
		
		//course_lesson_duration
		course_lesson_duration.sendKeys("1");
		Thread.sleep(1000);
		
		//lesson_host
		lesson_host.click();
		Thread.sleep(1000);
		
		//course_lesson_image
		course_lesson_image.click();
		Thread.sleep(1000);
		
		//course_lesson_browse
		course_lesson_browse.click();
		Thread.sleep(1000);
		
		String filePath=upload.getFilePath("home-banner1.jpg");
		upload.JPEGUpload(filePath);
		Thread.sleep(5000);
		
		//course_lesson_description
		course_lesson_description.sendKeys("It is a long established fact that a reader will be distracted "
				+ "by the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		
		//course_lesson_save
		course_lesson_save.click();
		Thread.sleep(1000);
		
		System.out.println("Successfully created a new course lesson");
		
		/*
		 * 
		 *New chapter & Lesson 
		 * 
		 */
		
		//course_curriculum_expand
		course_curriculum_expand.click();
		Thread.sleep(1000);
		
		//course_chapter_add
		course_chapter_add.click();
		Thread.sleep(1000);
		
		//course_chapterName
		course_chapterName.sendKeys("chapter 2");
		Thread.sleep(1000);
		
		//Course_chapter_save
		Course_chapter_save.click();
		Thread.sleep(1000);
		
		System.out.println("Successfully created a new chapter");
		
		//course_chapter_expand
		course_chapter_expand2.click();
		Thread.sleep(1000);
		
		//course_lesson_expand
		course_lesson_expand2.click();
		Thread.sleep(1000);
		
		//course_add_lesson
		course_add_lesson2.click();
		Thread.sleep(1000);
		
		//course_lesson_name
		course_lesson_name2.sendKeys("Lesson 1");
		Thread.sleep(1000);
		
		//course_lesson_duration
		course_lesson_duration2.sendKeys("1");
		Thread.sleep(1000);
		
		upload.scrollhalf();
		
		//lesson_host
		lesson_host2.click();
		Thread.sleep(1000);
		
		//course_lesson_image
		course_lesson_video.click();
		Thread.sleep(1000);
		
		//course_lesson_browse
		course_lesson_browse2.click();
		Thread.sleep(1000);
		
		String filePath2=upload.getFilePath("SampleVideo.mp4");
		upload.VideoLessonUpload(filePath2);
		Thread.sleep(10000);
		
		//course_lesson_description
		course_lesson_description2.sendKeys("It is a long established fact that a reader will be distracted "
				+ "by the readable content of a page when looking at its layout. ");
		Thread.sleep(3000);
		
		//course_lesson_save
		course_lesson_save2.click();
		Thread.sleep(1000);
		
		System.out.println("Successfully created a new course chapter lesson");
		
		/*
		 * 
		 * 
		 */
		
		
		//course_lesson_nameEdit
		course_lesson_nameEdit.click();
		Thread.sleep(1000);
		
		//course_lessonName_update
		course_lessonName_update.click();
		Thread.sleep(1000);
		System.out.println("Successfully updated the chapter");
	}
	
	public void course_exercise_file() throws InterruptedException, AWTException {
		
		/*
		 * 
		 * Exercise file
		 * 
		 */
		
		//course_exercise_file
		course_exercise_file.click();
		Thread.sleep(1000);
		
		//course_exercise_add
		course_exercise_add.click();
		Thread.sleep(2000);
		
		driver.getWindowHandles();
//		driver.getWindowHandle();
		Thread.sleep(1000);
		
		//course_exercise_browse
		course_exercise_browse.click();
		Thread.sleep(1000);
		
		String filePath=upload.getFilePath("google_drive.pdf");
		upload.PDFUpload(filePath);
		Thread.sleep(5000);
		
		//course_exercise_file_name
		course_exercise_file_name.sendKeys("Exercise 1");
		Thread.sleep(1000);
		
		//course_exercise_file_save
		course_exercise_file_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully added course exercise file");
		
		//certificate
		certificate.click();
		Thread.sleep(2000);
		
		//select_certificate
		select_certificate.click();
		Thread.sleep(2000);
		
		int size = driver.findElements(By.xpath("//*[@id=\"certificate\"]/div/div/form/div[1]/div/div/ul/li")).size();
		System.out.println("Certificate size is "+size);
		
		if(size > 1) {
			
			//select_specific_certificate
			select_specific_certificate.click();
			Thread.sleep(2000);
			
			//save_certificate
			save_certificate.click();
			System.out.println("Successfully added certificate");
		}
		
		else {
			
			//select_certificate
			select_certificate.click();
			Thread.sleep(2000);
		}

	}
	
	
	
	
	public void clickall_coursesButton() throws InterruptedException, AWTException {
		
//		//courses
//		courses.click();
//		Thread.sleep(2000);
		
		//all_courses
		all_courses.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter in All Courses");
		
		//course_add_Course
		course_add_Course();
		System.out.println("Successfully Added course");
	
		//course_Frontend_view
		course_Frontend_view();
		System.out.println("Successfully Enter in Frontend view at course");
		
		//course_Add_lesson
		course_Add_lesson();
		System.out.println("Successfully Added course lesson");
		
//		/*
//		 * delete later
//		 */
//		//allCourse_expand
//		allCourse_expand.click();
//		Thread.sleep(1000);
//		
//		//course_action	
//		course_action.click();
//		Thread.sleep(1000);
//		
//		//add_Lesson
//		add_Lesson.click();
//		Thread.sleep(1000);
		/*
		 * 
		 */
		
		//course_exercise_file
		course_exercise_file();
		
		/*
		 * edit
		 */
		//course_action
		course_action();
		
		//course_edit
		course_edit.click();
		Thread.sleep(1000);
		
		//add_courseButton
		add_courseButton.click();
		Thread.sleep(1000);
		System.out.println("Successfully Update course");
		
		/*
		 * view
		 */
		//course_action
		course_action();
		
		//course_view
		course_view.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println("Successfully viewd course");
		
		/*
		 * Students
		 */
		//course_action
		course_action();
		
		//course_student
		course_student.click();
		Thread.sleep(1000);
		
		int size = driver.findElements(By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td")).size();
		
		System.out.println("Size is = "+size);
		
		if(size==1) {
			
			//all_courses
			all_courses.click();
			Thread.sleep(1000);
			
		}
		
		else {
			
			course_notify.click();
			System.out.println("Successfully notify course Student");
			
		}
		
		System.out.println("Successfully showing courses student");
		System.out.println("Successfully Checkout from course");
	}
	
	/*
	 * 
	 * Course Level
	 * 
	 */
	
	public void click_CourseLevel_Button() throws InterruptedException {
		
//		//courses
//		courses.click();
//		Thread.sleep(1000);
		
		//course_Level
		course_Level.click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter course level");
		
		//course_level_name
		course_level_name.sendKeys("Test Level");
		Thread.sleep(1000);
		
		//course_level_save
		course_level_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully saved course level");
		
		//course_level_select
		course_level_select.click();
		Thread.sleep(1000);
		
		//course_level_edit
		course_level_edit.click();
		Thread.sleep(1000);
		
		//course_level_save
		course_level_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully update course level");
		
		//course_level_select
		course_level_select.click();
		Thread.sleep(1000);
		
		//course_level_delete
		course_level_delete.click();
		Thread.sleep(1000);
		
		//course_level_delete_confirm
		course_level_delete_confirm.click();
		Thread.sleep(1000);
		System.out.println("Successfully delete course level");
		System.out.println("Successfully checkout from course level");
		
	}
	
	/*
	 * 
	 * Course setting
	 * 
	 */
	public void click_course_setting_button_seekbar() throws InterruptedException {
		
		/*
		 * 
		 * For seekbar in player
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//seekbar_in_player
		seekbar_in_player.click();
		Thread.sleep(1000);
		
		//course_seekbar_yes
		course_seekbar_yes.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * 
		 * Update upcomming
		 * 
		 * 
		 * 
		 */
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//seekbar_in_player
		seekbar_in_player.click();
		Thread.sleep(1000);
		
		//course_seekbar_no
		course_seekbar_no.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
	}
	
	public void click_course_setting_button_dripContent() throws InterruptedException {
		
		/*
		 * 
		 * drip content
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//drip_content
		drip_content.click();
		Thread.sleep(1000);
		
		//drip_showAfterUnlock
		drip_showAfterUnlock.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * 
		 * Up coming
		 * 
		 * 
		 * 
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//drip_content
		drip_content.click();
		Thread.sleep(1000);
		
		//drip_show_all
		drip_show_all.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
	}
		/*
		 * 
		 * 
		 * Hide QA
		 * 
		 * 
		 */
	public void click_course_setting_button_Hide_QA() throws InterruptedException {
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//course_QA_hide
		course_QA_hide.click();
		Thread.sleep(1000);
		
		//Couse_QA_hide_yes
		Couse_QA_hide_yes.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Up coming
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//course_QA_hide
		course_QA_hide.click();
		Thread.sleep(1000);
		
		//Couse_QA_hide_no
		Couse_QA_hide_no.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
	}
	
	public void click_course_setting_button_Hide_Review() throws InterruptedException {
		/*
		 * 
		 * Hide review section
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//Course_hide_review
		Course_hide_review.click();
		Thread.sleep(1000);
		
		//Course_hide_review_yes
		Course_hide_review_yes.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Up coming
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		//courses
		courses.click();
		Thread.sleep(1000);
		
		//course_setting
		course_setting.click();
		Thread.sleep(1000);
		
		//Course_hide_review
		Course_hide_review.click();
		Thread.sleep(1000);
		
		//Course_hide_review_no
		Course_hide_review_no.click();
		Thread.sleep(1000);
		
		//course_setting_update
		course_setting_update.click();
		Thread.sleep(1000);
	}
	
	/*
	 * 
	 * add quiz
	 * 
	 */
	
	public void click_addquiz_button() throws InterruptedException, AWTException {
		
		//courses
		courses.click();
		Thread.sleep(2000);
		
		//all_courses
		all_courses.click();
		Thread.sleep(2000);
		
		//add_courses
		add_courses.click();
		Thread.sleep(1000);
		
		//quiz
		quiz.click();
		Thread.sleep(2000);
		
		//course_title
		course_title.sendKeys("Test Quiz");
		Thread.sleep(2000);
		
		
		/*
		
		//Course_requirement
		Course_requirement.sendKeys("It is a long established fact that a reader will be distracted by "
				+ "the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		
		upload.scrollhalf();
		Thread.sleep(1000);
		
		//Course_description
		Course_description.sendKeys("It is a long established fact that a reader will be distracted by "
				+ "the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		
		//Course_outcomes
		Course_outcomes.sendKeys("It is a long established fact that a reader will be distracted by "
				+ "the readable content of a page when looking at its layout. ");
		Thread.sleep(1000);
		*/
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(500,1000)");
		
		//select_quiz
		select_quiz.click();
		Thread.sleep(2000);
		
		//select_specific_quiz
		select_specific_quiz.click();
		Thread.sleep(2000);
		
		//course_level
		course_level.click();
		Thread.sleep(1000);
		
		//course_specific_level
		course_specific_level.click();
		Thread.sleep(1000);
		
		//quiz_price
		quiz_price.sendKeys("23");
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(1000,1500)");
		Thread.sleep(1000);
		
		//course_thumbnail
		course_thumbnail.click();
		Thread.sleep(1000);
		//upload thumbnail
		String filePath=upload.getFilePath("Thumbnail.jpg");
		upload.thumbnailUpload(filePath);
		
		//add_courseButton
		add_courseButton.click();
		Thread.sleep(1000);
		System.out.println("Successfully created a Quiz");
		
		if(checking.isSelected()) {
			
			all_courses.click();
			
		}
		
		else {
			course_statusCheck.click();
		}

		//To see frontend view
		course_Frontend_view();
		Thread.sleep(2000);
		upload.scrollhalf();
		Thread.sleep(4000);
		
		/*
		 * edit
		 */
		//course_action
		course_action();
		
		//course_edit
		course_edit.click();
		Thread.sleep(1000);
		
		//add_courseButton
		add_courseButton.click();
		Thread.sleep(1000);
		System.out.println("Successfully Update Quiz");
		
		/*
		 * view
		 */
		//course_action
		course_action();
		
		//course_view
		course_view.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println("Successfully viewd Quiz");
	
	}
		
	}


