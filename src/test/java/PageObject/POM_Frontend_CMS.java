package PageObject;

import java.awt.AWTException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Frontend_CMS {
	
	WebDriver driver;
	String Slider_title,Testimonial_name,Testimonial_author,Sponsor_title;
	
	public POM_Frontend_CMS(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
		Slider_title = this.name();
		Testimonial_name = this.name();
		Testimonial_author = this.name();
		Sponsor_title = this.name();
	}
	CommonMethod upload = new CommonMethod();
	
	//Frontend CMS
	@FindBy(xpath = "//span[contains(text(),'Frontend CMS')]")
	WebElement frontend_cms;
	
	//header menu
	@FindBy(xpath = "//a[contains(text(),' Header menu')]")
	WebElement header_menu;
	
	//header menu home
	@FindBy(xpath = "(//i[@class='ti-settings settingBtn'])[1]")
	WebElement headermenu_home;
	
	//header menu home save
	@FindBy(xpath = "(//button[@class='editBtn primary-btn fix-gr-bg'])[1]")
	WebElement header_menu_home_save;
	
	/*
	 * menu setting
	 */
	
	//menu setting
	@FindBy(xpath = "//a[contains(text(),' Menu Setting')]")
	WebElement menu_setting;
	
	//menu setting save
	@FindBy(xpath = "(//button[@class='primary_btn_large'])")
	WebElement menu_setting_save;
	
	/*
	 * slider
	 */
	
	//slider
	@FindBy(xpath = "//a[contains(text(),' Slider')]")
	WebElement slider;
	
	//slider title
	@FindBy(xpath = "//input[@class='primary_input_field name '][@name='title']")
	WebElement slider_title;
	
	//slider image
	@FindBy(xpath = "(//label[@class='primary-btn small fix-gr-bg'])[1]")
	WebElement slider_image;
	
	//slider save
	@FindBy(xpath = "(//button[@class='primary-btn semi_large fix-gr-bg'])")
	WebElement slider_save;
	
	//slider select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement slider_select;
	
	//slider edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr/td[13]/div/div/a[1]")
	WebElement slider_edit;
	
	//slider delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr/td[13]/div/div/a[2]")
	WebElement slider_delete;
	
	//slider delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement slider_delete_confirm;
	
	/*
	 * banner/slider setting
	 */
	
	//banner_slider setting
	@FindBy(xpath = "//a[contains(text(),' Banner/Slider Setting')]")
	WebElement banner_slider_setting;
	
	//menu search box
	@FindBy(xpath = "//*[@id=\"Activation\"]/div/form/div[1]/div[1]/div[3]/div/label")
	WebElement menu_search_box;
	
	//banner search box
	@FindBy(xpath = "//*[@id=\"Activation\"]/div/form/div[1]/div[1]/div[4]/div/label")
	WebElement banner_search_box;
	
	//banner setting save
	@FindBy(xpath = "(//button[@class='primary-btn small fix-gr-bg'])")
	WebElement banner_setting_save;
	
	/*
	 * 
	 */
	
	//testimonial
	@FindBy(xpath = "//a[contains(text(),' Testimonial')]")
	WebElement testimonial;
	
	//testimonial name
	@FindBy(name = "body[en]")
	WebElement testimonial_name;
	
	//testimonial author
	@FindBy(name = "author[en]")
	WebElement testimonial_author;
	
	//testimonial professon
	@FindBy(name = "profession[en]")
	WebElement testimonial_professon;
	
	//testimonial image browse
	@FindBy(xpath = "//label[@class=\"primary-btn small fix-gr-bg\"]")
	WebElement testimonial_image_browse;
	
	//save testimonial
	@FindBy(xpath = "//button[@class=\"primary-btn semi_large fix-gr-bg\"]")
	WebElement save_testimonial;
	
	//testimonial select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement testimonial_select;
	
	//testimonial edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[8]/div/div/a[1]")
	WebElement testimonial_edit;
	
	//testimonial delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[8]/div/div/a[2]")
	WebElement testimonial_delete;
	
	//testimonial delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement testimonial_delete_confirm;
	
	/*
	 * Social login
	 */
	
	//social setting
	@FindBy(xpath = "//a[contains(text(),' Social Setting')]")
	WebElement social_setting;
	
	//social icon
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div/div[1]/div/div/span")
	WebElement social_icon;
	
	//social specific icon
	@FindBy(xpath = "//*[@id=\"coupon-form\"]/div/div[1]/div/div/ul/li[1]")
	WebElement specific_icon;
	
	//social link
	@FindBy(name = "btn_link")
	WebElement social_link;
	
	//social name
	@FindBy(name = "name")
	WebElement social_name;
	
	//social setting save
	@FindBy(xpath = "//button[@class='primary-btn semi_large fix-gr-bg']")
	WebElement social_setting_save;
	
	//social setting select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement social_setting_select;
	
	//social setting edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[5]/div/div/a[1]")
	WebElement social_setting_edit;
	
	//social setting delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[5]/div/div/a[2]")
	WebElement social_setting_delete;
	
	//social setting delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement social_setting_delete_confirm;
	
	//aora pagebuilder
	@FindBy(xpath = "//a[contains(text(),' Aora PageBuilder')]")
	WebElement aora_pagebuilder;
	
	//become instructor
	@FindBy(xpath = "//a[contains(text(),' Become Instructor')]")
	WebElement become_instructor;
	
	//instructor preview
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div[1]/a")
	WebElement instructor_preview;
	
	/*
	 * Sponsor
	 */
	
	//sponsor
	@FindBy(xpath = "//a[contains(text(),' Sponsor')]")
	WebElement sponsor;
	
	//sponsor title
	@FindBy(name = "title[en]")
	WebElement sponsor_title;
	
	//sponsor browse
	@FindBy(xpath = "//label[@class='primary-btn small fix-gr-bg']")
	WebElement sponsor_browse;
	
	//sponsor save
	@FindBy(xpath = "//button[@class='primary-btn semi_large fix-gr-bg']")
	WebElement sponsor_save;
	
	//sponsor select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement sponsor_select;
	
	//sponsor edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[4]/div/div/a[1]")
	WebElement sponsor_edit;
	
	//sponsor delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[4]/div/div/a[2]")
	WebElement sponsor_delete;
	
	//sponsor delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement sponsor_delete_confirm;
	
	/*
	 * popup_content
	 */
	
	//page content
	@FindBy (xpath = "//a[contains(text(),' Popup Content')]")
	WebElement popup_content;
	
	//popup link
	@FindBy(xpath="//*[@id=\"formData\"]/div[3]/div[2]/div/input")
	WebElement popup_link;
	
	//show in frontend no;
	@FindBy(xpath = "//*[@id=\"no\"]")
	WebElement show_in_frontend_no;
	
	//popup save
	@FindBy(xpath = "//button[@class='primary-btn semi_large2  fix-gr-bg mr-1']")
	WebElement popup_save;
	
	/*
	 * Footer setting
	 */
	
	//footer setting
	@FindBy(xpath = "//a[contains(text(),' Footer Setting')]")
	WebElement footer_setting;
	
	//copyright update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[1]")
	WebElement copyright_update;
	
	//about text
	@FindBy(xpath = "//a[contains(text(),'About Text')]")
	WebElement about_text;
	
	//about text section update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[2]")
	WebElement about_text_section_update;
	
	//about text update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[3]")
	WebElement about_text_update;
	
	/*
	 * support zone
	 */
	
	//support zone
	@FindBy(xpath = "//a[contains(text(),'Support Zone')]")
	WebElement support_zone;
	
	//support zone update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[4]")
	WebElement support_zone_update;
	
	//add new page
	@FindBy(xpath = "(//a[@class='primary-btn addWidget small fix-gr-bg mb-2'])[1]")
	WebElement supportZone_newPage;
	
	//support zone page name
	@FindBy(name = "name[en]")
	WebElement SupportZone_pageName;
	
	//support select page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/span")
	WebElement support_select_page;
	
	//support select specific page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/ul/li[2]")
	WebElement support_select_specific_page;
	
	//support page save
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[1]")
	WebElement support_page_save;
	
	//support page select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[6]")
	WebElement support_page_select;
	
	//support page edit
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[6]/td[4]/div/div/a[1]")
	WebElement support_page_edit;
	
	//support page update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[2]")
	WebElement support_page_update;
	
	//support page delete
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[6]/td[4]/div/div/a[2]")
	WebElement support_page_delete;
	
	//support page delete confirm
	@FindBy(xpath = "//*[@id=\"deleteBtn\"]")
	WebElement support_page_delete_confirm;
	
	/*
	 * company info
	 */
	
	//company info
	@FindBy(xpath = "//a[contains(text(),'Company Info')]")
	WebElement company_info;
	
	/*
	 * 
	 */
	//companyInfo service update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[5]")
	WebElement companyInfo_update;
	
	//add new pageS
	@FindBy(xpath = "(//a[@class='primary-btn addWidget small fix-gr-bg mb-2'])[2]")
	WebElement companyInfo_newPage;
	
	//companyInfo zone page name
	@FindBy(name = "name[en]")
	WebElement companyInfo_pageName;
	
	//companyInfo select page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/span")
	WebElement companyInfo_select_page;
	
	//companyInfo select specific page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/ul/li[2]")
	WebElement companyInfo_select_specific_page;
	
	//companyInfo page save
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[1]")
	WebElement companyInfo_page_save;
	
	//companyInfo page select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[11]")
	WebElement companyInfo_page_select;
	
	//companyInfo page edit
	@FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[6]/td[4]/div/div/a[1]")
	WebElement companyInfo_page_edit;
	
	//companyInfo page update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[2]")
	WebElement companyInfo_page_update;
	
	//companyInfo page delete
	@FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[6]/td[4]/div/div/a[2]")
	WebElement companyInfo_page_delete;
	
	//companyInfo page delete confirm
	@FindBy(xpath = "//*[@id=\"deleteBtn\"]")
	WebElement companyInfo_page_delete_confirm;
	
	/*
	 * 
	 */
	
	/*
	 * explore service
	 */
	
	//explore service
	@FindBy(xpath = "//a[contains(text(),'Explore Services')]")
	WebElement explore_service;
	
	/*
	 * 
	 */
	//explore service update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper  text-nowrap'])[6]")
	WebElement explore_service_update;
	
	//add new page
	@FindBy(xpath = "(//a[@class='primary-btn addWidget small fix-gr-bg mb-2'])[3]")
	WebElement exploreService_newPage;
	
	//exploreService zone page name
	@FindBy(name = "name[en]")
	WebElement exploreService_pageName;
	
	//companyInfo select page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/span")
	WebElement exploreService_select_page;
	
	//companyInfo select specific page
	@FindBy(xpath = "//*[@id=\"CreateModal\"]/div/div/form/div/div[3]/div[2]/div/div/ul/li[2]")
	WebElement exploreService_select_specific_page;
	
	//companyInfo page save
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[1]")
	WebElement exploreService_page_save;
	
	//companyInfo page select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[17]")
	WebElement exploreService_page_select;
	
	//companyInfo page edit
	@FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[33]")
	//*[@id="DataTables_Table_2"]/tbody/tr[7]/td[4]/div/div/a[1]
	WebElement exploreService_page_edit;
	
	//companyInfo page update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg tooltip-wrapper '])[2]")
	WebElement exploreService_page_update;
	
	//companyInfo page delete
	@FindBy(xpath = "(//a[@class='dropdown-item edit_brand'])[34]")
	WebElement exploreService_page_delete;
	
	//companyInfo page delete confirm
	@FindBy(xpath = "//*[@id=\"deleteBtn\"]")
	WebElement exploreService_page_delete_confirm;
	
	//website frontend
	@FindBy(xpath = " (//a[@class='primary-btn white mr-10'])")
	WebElement webste_frontend;
	
	/*
	 * Login & Registration
	 */
	
	//login & Registration
	@FindBy(xpath = "//a[contains(text(),' Login & Registration')]")
	WebElement login_registration;
	
	//login page banner
	@FindBy(xpath = "(//button[@class='primary-btn small fix-gr-bg'])[1]")
	WebElement login_page_banner;
	
	//login banner save
	@FindBy(xpath = "(//button[@class='primary_btn_large'])[1]")
	WebElement login_banner_save;
	
	//registration page banner
	@FindBy(xpath = "(//button[@class='primary-btn small fix-gr-bg'])[2]")
	WebElement registration_page_banner;
	
	//registration page save
	@FindBy(xpath = "(//button[@class='primary_btn_large'])[2]")
	WebElement registration_page_save;
	
	//forget password banner
	@FindBy(xpath = "(//button[@class='primary-btn small fix-gr-bg'])[3]")
	WebElement forget_password_banner;
	
	//forget password Save
	@FindBy(xpath = "(//button[@class='primary_btn_large'])[3]")
	WebElement forget_password_save;
	
	/*
	 * FAQ
	 */
	
	//FAQ
	@FindBy(xpath = "//a[contains(text(),' FAQ')]")
	WebElement FAQ;
	
	//add faq
	@FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg']")
	WebElement add_faq;
	
	//faq question
	@FindBy(name = "question[en]")
	WebElement faq_question;
	
	//faq answer
	@FindBy(xpath = "//*[@id=\"element_add_en\"]/div[2]/div/div/div/div[3]/div[2]")
	WebElement faq_answer;
	
	//faq save
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2  fix-gr-bg'])[1]")
	WebElement FAQ_save;
	
	//FAQ select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement FAQ_select;
	
	//FAQ edit
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[5]/div/div/button[1]")
	WebElement FAQ_edit;
	
	//FAQ update
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2  fix-gr-bg'])[2]")
	WebElement FAQ_update;
	
	//FAQ delete
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[5]/div/div/button[2]")
	WebElement FAQ_delete;
	
	//FAQA delete complete
	@FindBy(xpath = "//*[@id=\"deletefaq\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement FAQ_delete_complete;
	
	
	/*
	 * 
	 * 
	 */
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}
	
	public void clickfrontend_cmsButton() throws InterruptedException, AWTException {
		
		//frontend_cms
		frontend_cms.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Frontend CMS");
		
		//header_menu
		header_menu.click();  
		Thread.sleep(2000);
		System.out.println("Successfully Enter Header menu");
		
		//headermenu_home
		headermenu_home.click();
		Thread.sleep(2000);
		
		//header_menu_home_save
		header_menu_home_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved header menu");
		
		/*
		 * menu setting
		 */
		
		//menu_setting
		menu_setting.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter communication");
		
		//menu_setting_save
		menu_setting_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved menu setting");
		
		/*
		 * slider
		 */
		
		//slider
		slider.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter slider");
		
		//slider_title
		slider_title.sendKeys(Slider_title);
		Thread.sleep(2000);
		
		//slider_image
		slider_image.click();
		Thread.sleep(2000);
		String filePath=upload.getFilePath("slider image.jpg");
		upload.sliderUpload(filePath);
		Thread.sleep(1000);
		
		//slider_save
		slider_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully Saved Slider");
		
		//slider_select
		slider_select.click();
		Thread.sleep(2000);
		
		//slider_edit
		slider_edit.click();
		Thread.sleep(2000);
		
		//slider_save
		slider_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully update slider");
		
		//slider_select
		slider_select.click();
		Thread.sleep(2000);
		
		//slider_delete
		slider_delete.click();
		Thread.sleep(2000);
		
		//slider_delete_confirm
		slider_delete_confirm.click();
		Thread.sleep(2000);
		System.out.println("Successfully deleted slider");  
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		/*
		 * banner_slider_setting
		 */
		
		//banner_slider_setting
		banner_slider_setting.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter banner slider setting");
		
		if(driver.findElement(By.xpath("//*[@id=\"show_menu_search_box\"]")).isSelected()){
			
		//homepage
		driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
		Thread.sleep(5000);
		upload.switchnextWindow();
		Thread.sleep(1000);
		driver.close();
		
		upload.switchpreviousWindow();
		
		}
		
		else {
			
			//menu_search_box
			menu_search_box.click();
			Thread.sleep(2000);
			
			//banner_setting_save
			banner_setting_save.click();
			Thread.sleep(2000);
			
			//homepage
			driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
			Thread.sleep(5000);
			
			upload.switchnextWindow();
			Thread.sleep(1000);
			
			driver.close();
			upload.switchpreviousWindow();
			
		}
		
		/*
		 * 
		 * Banner search box
		 * 
		 */
		
		if(driver.findElement(By.xpath("//*[@id=\"show_banner_search_box\"]")).isSelected()) {
			//homepage
			driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
			Thread.sleep(5000);
			
			upload.switchnextWindow();
			Thread.sleep(2000);
			driver.close();
			upload.switchpreviousWindow();
			
		}
		
		else {
			
			//banner_search_box
			banner_search_box.click();
			Thread.sleep(2000);
			
			//banner_setting_save
			banner_setting_save.click();
			Thread.sleep(2000);
			
			//homepage
			driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
			Thread.sleep(5000);
			upload.switchnextWindow();
			Thread.sleep(2000);
			driver.close();
			
			upload.switchpreviousWindow();
			
			
		}
		System.out.println("Successfully checkout from slider banner setting");
	}
		
		/*
		 * testimonial
		 */

		public void clickTestimonialButton() throws InterruptedException, AWTException {

//		// frontend_cms
//		frontend_cms.click();
//		Thread.sleep(2000);	
			
		//testimonial
		testimonial.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter testimonial");
		
		//testimonial_name
		testimonial_name.sendKeys(Testimonial_name);
		Thread.sleep(2000);
		
		//testimonial_author
		testimonial_author.sendKeys(Testimonial_author);
		Thread.sleep(2000);
		
		//testimonial_professon
		testimonial_professon.sendKeys("Director");
		Thread.sleep(2000);
		
		//testimonial_image_browse
		testimonial_image_browse.click();
		Thread.sleep(2000);
		String filePath=upload.getFilePath("1.jpg");
		upload.profileUpload(filePath);
		
		//save_testimonial
		save_testimonial.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved testimonial");
		
		//testimonial_select
		testimonial_select.click();
		Thread.sleep(2000);
		
		//testimonial_edit
		testimonial_edit.click();
		Thread.sleep(2000);
		
		//save_testimonial
		save_testimonial.click();
		Thread.sleep(2000);
		System.out.println("Successfully update testimonial");
		
		//testimonial_select
		testimonial_select.click();
		Thread.sleep(2000);
		
		//testimonial_delete
		testimonial_delete.click();
		Thread.sleep(2000);
		
		//testimonial_delete_confirm
		testimonial_delete_confirm.click();
		Thread.sleep(2000);
		System.out.println("Successfully deleted testimonial");
	}
		public void clickSocial_settingButton() throws InterruptedException {
			
			//social_setting
			social_setting.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter social setting");
			
			//social_icon
			social_icon.click();
			Thread.sleep(2000);
			
			//specific_icon
			specific_icon.click();
			Thread.sleep(2000);
			
			//social_link
			social_link.sendKeys("www.facebook.com");
			Thread.sleep(2000);
			
			//social_name
			social_name.sendKeys("facebook");
			Thread.sleep(2000);
			
			//social_setting_save
			social_setting_save.click();
			Thread.sleep(2000);
			System.out.println("Successfully saved social setting");
			
			//social_setting_select
			social_setting_select.click();
			Thread.sleep(2000);
			
			//social_setting_edit
			social_setting_edit.click();
			Thread.sleep(2000);
			
			//social_setting_save
			social_setting_save.click();
			Thread.sleep(2000);
			
			//social_setting_select
			social_setting_select.click();
			Thread.sleep(2000);
			System.out.println("Successfully update social setting");
			
			//social_setting_delete
			social_setting_delete.click();
			Thread.sleep(2000);
			
			//social_setting_delete_confirm
			social_setting_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Successfully deleted social setting");
			
			//aora_pagebuilder
			aora_pagebuilder.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter Aora PageBuilder");
			
			//become_instructor
			become_instructor.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter become instructor");
			
			//instructor_preview
			instructor_preview.click();
			Thread.sleep(2000);
			
			upload.switchnextWindow();
			Thread.sleep(2000);
			
			driver.close();
			
			upload.switchpreviousWindow();
			Thread.sleep(2000);
			
		}
		
		/*
		 * 
		 * sponsor
		 * 
		 */
		
		public void clicksponsorButton() throws InterruptedException, AWTException {
			
			
	
			
			//sponsor
			sponsor.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter sponsor");
			
			//sponsor_title
			sponsor_title.sendKeys(Sponsor_title);
			Thread.sleep(2000);
			
			//sponsor_browse
			sponsor_browse.click();
			Thread.sleep(2000);
			String filePath=upload.getFilePath("Pizza_Hut_logo.png");
			upload.sponsorUpload(filePath);
			
			//sponsor_save
			sponsor_save.click();
			Thread.sleep(2000);
			System.out.println("Successfully saved sponsor");
			
			//sponsor_select
			sponsor_select.click();
			Thread.sleep(2000);
			
			//sponsor_edit
			sponsor_edit.click();
			Thread.sleep(2000);
			
			//sponsor_save
			sponsor_save.click();
			Thread.sleep(2000);
			System.out.println("Successfully Update Sponsor");
			
			//sponsor_select
			sponsor_select.click();
			Thread.sleep(2000);
			
			//sponsor_delete
			sponsor_delete.click();
			Thread.sleep(2000);
			
			//sponsor_delete_confirm
			sponsor_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Successfully Deleted Sponsor");
		}
		
		/*
		 * 
		 * page_contentL
		 * 
		 */
		
		public void clickpopup_contentLButton() throws InterruptedException {
			
//			// frontend_cms
//			frontend_cms.click();
//			Thread.sleep(2000);	
			
			//popup_content
			popup_content.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter page content");
			
			// popup_link
			popup_link.clear();
			popup_link.sendKeys("https://spondan.com/spn19/production/qa");
			Thread.sleep(2000);

			if (driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).isSelected()) {  

				// homepage
				driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
				Thread.sleep(5000);
				upload.switchnextWindow();
				Thread.sleep(2000);
				
				driver.close();
				
				upload.switchpreviousWindow();
				Thread.sleep(2000);
				
				}
			else if(driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).isSelected()) {
				
				// homepage
				driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
				Thread.sleep(5000);
				upload.switchnextWindow();
				Thread.sleep(2000);
				
				driver.close();
				
				upload.switchpreviousWindow();
				Thread.sleep(2000);
				}
			
			else {
				
				//show_in_frontend_no
				show_in_frontend_no.click();
				Thread.sleep(2000);
				
				//popup_save
				popup_save.click();
				Thread.sleep(2000);
				
				// homepage
				driver.findElement(By.xpath("//a[@class=\"primary-btn white mr-10\"]")).click();
				Thread.sleep(5000);
				upload.switchnextWindow();
				Thread.sleep(2000);
				
				driver.close();
				
				upload.switchpreviousWindow();
				Thread.sleep(2000);
			
				}
		}
		
		/*
		 * 
		 * footer_setting
		 * 
		 */
		
		public void clickfooter_settingButton() throws InterruptedException {
			
//			// frontend_cms
//			frontend_cms.click();
//			Thread.sleep(2000);	
			
			//footer_setting
			footer_setting.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully Enter Footer setting");
			
			//copyright_update
			copyright_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update copyright text");
			
			//about_text
			about_text.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully Enter About Text");
			
			//about_text_section_update
			about_text_section_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update About section");
			
			//about_text_update
			about_text_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update About Text");
			/*
			 * support_zone
			 */
			
			//support_zone
			support_zone.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully enter support zone");
			
			//support_zone_update
			support_zone_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update support zone");
			
			//supportZone_newPage
			supportZone_newPage.click();
			Thread.sleep(2000);
			
			//SupportZone_pageName
			SupportZone_pageName.sendKeys("test");
			Thread.sleep(2000);
			
			//support_select_page
			support_select_page.click();
			Thread.sleep(2000);
			
			//support_select_specific_page
			support_select_specific_page.click();
			Thread.sleep(2000);
			
			//support_page_save
			support_page_save.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully save support zone new page");
			
			//webste_frontend
			webste_frontend.click();
			Thread.sleep(5000);
			upload.scroll();
			Thread.sleep(10000);
			upload.switchnextWindow();
			Thread.sleep(2000);
			
			driver.close();
			
			upload.switchpreviousWindow();
			Thread.sleep(2000);
			
			//support_zone
			support_zone.click();
			Thread.sleep(2000);
			
			//support_page_select
			support_page_select.click();
			Thread.sleep(2000);
			
			//support_page_edit
			support_page_edit.click();
			Thread.sleep(2000);
			
			//support_page_update
			support_page_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update support zone new page");
			
			//support_zone
			support_zone.click();
			Thread.sleep(2000);
			
			//support_page_select
			support_page_select.click();
			Thread.sleep(2000);
			
			//support_page_delete
			support_page_delete.click();
			Thread.sleep(2000);
			
			//support_page_delete_confirm
			support_page_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully delete support zone new page");
			
			/*
			 * company info
			 */
			
			//company_info
			company_info.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully enter company info");
			
			//companyInfo_update
			companyInfo_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update cimpany info");
			
			//companyInfo_newPage
			companyInfo_newPage.click();
			Thread.sleep(2000);
			
			//companyInfo_pageName
			companyInfo_pageName.sendKeys("test");
			Thread.sleep(2000);
			
			//companyInfo_select_page
			companyInfo_select_page.click();
			Thread.sleep(2000);
			
			//companyInfo_select_specific_page
			companyInfo_select_specific_page.click();
			Thread.sleep(2000);
			
			//companyInfo_page_save
			companyInfo_page_save.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully save company info new page");
			
			//company_info
			company_info.click();
			Thread.sleep(2000);
			
			//companyInfo_page_select
			companyInfo_page_select.click();
			Thread.sleep(2000);
			
			//companyInfo_page_edit
			companyInfo_page_edit.click();
			Thread.sleep(2000);
			
			//companyInfo_page_update
			companyInfo_page_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update company info new page");
			
			//company_info
			company_info.click();
			Thread.sleep(2000);
			
			//companyInfo_page_select
			companyInfo_page_select.click();
			Thread.sleep(2000);
			
			//companyInfo_page_delete
			companyInfo_page_delete.click();
			Thread.sleep(2000);
			
			//companyInfo_page_delete_confirm
			companyInfo_page_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully delete company info new page");
			
			/*
			 * explore services
			 */
			
			//explore_service
			explore_service.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully enter explore service");
			
			//explore_service_update
			explore_service_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update explore service");
			
			//exploreService_newPage
			exploreService_newPage.click();
			Thread.sleep(2000);
			
			//exploreService_pageName
			exploreService_pageName.sendKeys("Test");
			Thread.sleep(2000);
			
			//exploreService_select_page
			exploreService_select_page.click();
			Thread.sleep(2000);
			
			//exploreService_select_specific_page
			exploreService_select_specific_page.click();
			Thread.sleep(2000);
			
			//exploreService_page_save
			exploreService_page_save.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully saved explore service new page");
			
			//explore_service
			explore_service.click();
			Thread.sleep(2000);
			
			//exploreService_page_select
			exploreService_page_select.click();
			Thread.sleep(2000);
			
			//exploreService_page_edit
			exploreService_page_edit.click();
			Thread.sleep(2000);
			
			//exploreService_page_update
			exploreService_page_update.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully update explore service new page");
			
			//explore_service
			explore_service.click();
			Thread.sleep(2000);
			
			//exploreService_page_select
			exploreService_page_select.click();
			Thread.sleep(2000);
			
			//exploreService_page_delete
			exploreService_page_delete.click();
			Thread.sleep(2000);
			
			//exploreService_page_delete_confirm
			exploreService_page_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Succedssfully delete explore service new page");
			System.out.println("Succedssfully checkout from explore service");
		}
		
		/*
		 * 
		 * login_registration
		 * 
		 */
		
		public void clicklogin_registrationButton() throws InterruptedException, AWTException {
			

			
			//login_registration
			login_registration.click();
			Thread.sleep(2000);
			
			//login_page_banner
			login_page_banner.click();
			Thread.sleep(2000);
			String filePath=upload.getFilePath("global.png");
			upload.loginUpload(filePath);
			Thread.sleep(1000);
			
			//login_banner_save
			login_banner_save.click();
			Thread.sleep(2000);
			
			//registration_page_banner
			registration_page_banner.click();
			Thread.sleep(2000);
			String filePath2=upload.getFilePath("global.png");
			upload.loginUpload(filePath2);
			Thread.sleep(1000);
			
			//registration_page_save
			registration_page_save.click();
			Thread.sleep(2000);
			
			//forget_password_banner
			forget_password_banner.click();
			Thread.sleep(2000);
			String filePath3=upload.getFilePath("global.png");
			upload.loginUpload(filePath3);
			Thread.sleep(1000);
			
			//forget_password_save
			forget_password_save.click();
			Thread.sleep(2000);
		}
		
		/*
		 * 
		 * FAQ
		 * 
		 */
		
		public void clickFAQButton() throws InterruptedException {
			
//			// frontend_cms
//			frontend_cms.click();
//			Thread.sleep(2000);	
			
			//FAQ
			FAQ.click();
			Thread.sleep(2000);
			System.out.println("Successfully Enter FAQ");
			
			//add_faq
			add_faq.click();
			Thread.sleep(2000);
			
			//faq_question
			faq_question.sendKeys("Where is your location");
			Thread.sleep(2000);
			
			//faq_answer
			faq_answer.sendKeys("panthapath");
			Thread.sleep(2000);
			
			//FAQ_save
			FAQ_save.click();
			Thread.sleep(2000);
			System.out.println("Successfully Saved FAQ");
			
			//FAQ_select
			FAQ_select.click();
			Thread.sleep(2000);
			
			//FAQ_edit
			FAQ_edit.click();
			Thread.sleep(2000);
			
			//FAQ_update
			FAQ_update.click();
			Thread.sleep(2000);
			System.out.println("Successfully update FAQ");
			
			//FAQ_select
			FAQ_select.click();
			Thread.sleep(2000);
			
			//FAQ_delete
			FAQ_delete.click();
			Thread.sleep(2000);
			
			//FAQ_delete_complete
			FAQ_delete_complete.click();
			Thread.sleep(2000);
			System.out.println("Successfully Deleted FAQ");
			System.out.println("Successfully Checkout from Frontend CMS");
		}
		

}
