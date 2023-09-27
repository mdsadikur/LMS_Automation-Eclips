package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Virtual_Class {
	
	WebDriver driver;
	
	public POM_Virtual_Class(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//virtual class
	@FindBy(xpath = "//span[contains(text(),'Zoom')]")
	WebElement zoom_class;
	
	//virtual class
	@FindBy(css = "a[href*='zoom/settings']")
	WebElement zoom_class_setting;
	
	//Zoom save
	@FindBy(xpath = "//button[@class='primary-btn fix-gr-bg']")
	WebElement zoom_update;
	
	//virtual class
	@FindBy(xpath = "//span[contains(text(),'Virtual Class')]")
	WebElement Virtual_class;
	
	//virtual class list
	@FindBy(xpath = "//a[contains(text(),' Virtual Class List')]")
	WebElement virtual_class_list;
	
	//virtual class title
	@FindBy(name = "title[en]")
	WebElement virtual_class_title;
	
	//virtual class description
	@FindBy(name = "description[en]")
	WebElement virtual_class_description;
	
	//virtual class duration
	@FindBy(name = "duration")
	WebElement virtual_class_duration;
	
	//virtual class category
	@FindBy(xpath = "//span[contains(text(),' Category *')]")
	WebElement virtual_class_category;
	
	//virtual class specific category
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div/div[6]/div/div/ul/li[2]")
	WebElement virtual_class_specific_class;
	
	//virtual class time
	@FindBy(name = "time")
	WebElement virtual_class_time;
	
	//virtual class save
	@FindBy(xpath ="(//button[@class='primary-btn fix-gr-bg'])[1]")
	WebElement virtual_class_save;
	
	/*
	 * 
	 */
	
	//virtual class select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement virtual_class_select;
	
	//virtual class details
	@FindBy(xpath = "(//a[contains(text(),'Details')])[1]")
	WebElement virtual_class_details;
	
	//virtual class edit
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")
	WebElement virtual_class_edit;
	
	//virtual class date
	@FindBy(xpath = "(//input[@class='primary_input_field primary-input date form-control  '])[3]")
	WebElement date_picker;
	
	
	
	/*
	 * 
	 * 
	 */
	
	public void clickVirtual_classButton() throws InterruptedException {
		
		
		//zoom_class
		zoom_class.click();
		Thread.sleep(2000);
		
		//zoom_class_setting
		zoom_class_setting.click();
		Thread.sleep(2000);
		
		//zoom_update
		zoom_update.click();
		Thread.sleep(2000);
		
	
		
		//Virtual_class
		Virtual_class.click();
		Thread.sleep(2000);
		
		//virtual_class_list
		virtual_class_list.click();
		Thread.sleep(2000);
		System.out.println("Successfully enter Virtual class list");
		
		//virtual_class_title
		virtual_class_title.sendKeys("Virtual test class");
		Thread.sleep(2000);
		
		//virtual_class_description
		virtual_class_description.sendKeys("It is a long established fact that a reader will be distracted by the"
				+ " readable content of a page when looking at its layout.");
		Thread.sleep(2000);
		
		//virtual_class_duration
		virtual_class_duration.sendKeys("10");
		Thread.sleep(2000);
		
		//virtual_class_category
		virtual_class_category.click();
		Thread.sleep(2000);
		
		//virtual_class_specific_class
		virtual_class_specific_class.click();
		Thread.sleep(2000);
		
		//virtual_class_time
		virtual_class_time.click();
		Thread.sleep(2000);
		
		//virtual_class_save
		virtual_class_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved Virtual class list");
		
		/*
		 * 
		 */
		
		//virtual_class_select
		virtual_class_select.click();
		Thread.sleep(1000);
		
		//virtual_class_details
		virtual_class_details.click();
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Successfully showing Virtual class list details");
		
		//virtual_class_select
		virtual_class_select.click();
		Thread.sleep(1000);
		
		//virtual_class_edit
		virtual_class_edit.click();
		Thread.sleep(1000);
		
		//start_date
		date_picker.click();
		Thread.sleep(1000);
		
		// Visitor pickdate
		int day = 20;
		driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/table[1]/tbody[1]/tr/td[contains(text()," + day + ")]")).click();
		Thread.sleep(1000);
		
		
		//virtual_class_save
		virtual_class_save.click();
		Thread.sleep(1000);
		System.out.println("Successfully update Virtual class list");
		System.out.println("Successfully Checkout Virtual class list");

		
		
	}
	

}
