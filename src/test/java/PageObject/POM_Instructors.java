package PageObject;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Instructors {
	
	
	WebDriver driver;
	String instructor_Name,email;
	
	public POM_Instructors(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
		instructor_Name = this.name();
		email = this.name();
	}
	
	//instructors
	@FindBy(xpath = "//span[contains(text(),'Instructors')]")
	WebElement instructors;
	
	//all instructor
	@FindBy(xpath = "//a[contains(text(),' All Instructor')]")
	WebElement all_instructor;
	
	//add instructor
	@FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg']")
	WebElement add_instructor;
	
	//instructor_name
	@FindBy(xpath = "(//input[@class='primary_input_field'][@name='name'])[1]")
	WebElement instructor_name;
	
	//instructor description
	@FindBy(xpath = "(//div[@class='note-editable card-block'])[1]")
	WebElement instructor_description;
	
	//instructor email
	@FindBy(xpath = "(//input[@class='primary_input_field'][@name='email'])[1]")
	WebElement instructor_email;
	
	//instructor password
	@FindBy(xpath = "(//input[@class='form-control primary_input_field'])[1]")
	WebElement instructor_password;
	
	//instructor confirm password
	@FindBy(xpath = "(//input[@class='form-control primary_input_field'])[2]")
	WebElement instructor_confirm_password;
	
	//save instructor
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2  fix-gr-bg'])[1]")
	WebElement save_instructor;

	/*
	 * 
	 */
	
	//instructor select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement instructor_select;
	
	//instructor secret login
	@FindBy(xpath = "//*[@id=\"lms_table\"]/tbody/tr[1]/td[6]/div/div/a")
	WebElement instructor_secret_login;
	
	//instructor secret login exit
	@FindBy(xpath = "//a[contains(text(),'Exit Now')]")
	WebElement instructor_secret_login_exit;
	
	//instructor edit 
	@FindBy(xpath ="//*[@id=\"lms_table\"]/tbody/tr[1]/td[6]/div/div/button[1]")
	WebElement instructor_edit;
	
	//update_instructor password
	@FindBy(xpath = "(//input[@class='form-control primary_input_field'])[3]")
	WebElement update_instructor_password;
	
	//update_instructor confirm password
	@FindBy(xpath = "(//input[@class='form-control primary_input_field'])[4]")
	WebElement update_instructor_confirm_password;
	
	//update instructor
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2  fix-gr-bg'])[2]")
	WebElement update_instructor;
	
	/*
	 * 
	 * Payout list
	 * 
	 */
	
	//payout list
	@FindBy(xpath = "//a[contains(text(),' Payout List')]")
	WebElement payout_list;
	
	
	
	
	
	/*
	 * 
	 * 
	 */
	
public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}
	
	public void click_instructors_button() throws InterruptedException {
		
		//instructors
		instructors.click();
		Thread.sleep(2000);
		
		//all_instructor
		all_instructor.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter All Instructor");
		
		//add_instructor
		add_instructor.click();
		Thread.sleep(2000);
		
		//instructor_name
		instructor_name.sendKeys(instructor_Name);
		Thread.sleep(2000);
		
		//instructor_description
		instructor_description.sendKeys("It is a long established fact that a reader will be distracted "
				+ "by the readable content of a page when looking at its layout. ");
		Thread.sleep(2000);
		
		//instructor_email
		instructor_email.sendKeys("user"+email+"@gmail.com");
		Thread.sleep(2000);
		
		//instructor_password
		instructor_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//instructor_confirm_password
		instructor_confirm_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//save_instructor
		save_instructor.click();
		Thread.sleep(2000);
		System.out.println("Successfully Saved All Instructor");
		
		/*
		 * 
		 */
		
		//instructor_select
		instructor_select.click();
		Thread.sleep(2000);
		
		//instructor_secret_login
		instructor_secret_login.click();
		Thread.sleep(2000);
		
		//instructor_secret_login_exit
		instructor_secret_login_exit.click();
		Thread.sleep(2000);
		System.out.println("Successfully complete secret login");
		
		//instructors
		instructors.click();
		Thread.sleep(2000);
		
		//all_instructor
		all_instructor.click();
		Thread.sleep(2000);
		
		//instructor_select
		instructor_select.click();
		Thread.sleep(2000);
		
		//instructor_edit
		instructor_edit.click();
		Thread.sleep(2000);
		
		//update_instructor_password
		update_instructor_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//update_instructor_confirm_password
		update_instructor_confirm_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//update_instructor
		update_instructor.click();
		Thread.sleep(2000);
		System.out.println("Successfully Update All Instructor");
		
		/*
		 * 
		 * Payout list
		 * 
		 */
	}

	public void ClickPayout_listButton() throws InterruptedException {

//		// instructors
//		instructors.click();
//		Thread.sleep(2000);

		// payout_list
		payout_list.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Payout list");
		
		int size = driver.findElements(By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td")).size();
		
		System.out.println("Size is = "+size);
		
		if(size == 1) {
			
			//all_instructor
			all_instructor.click();
			Thread.sleep(2000);
			System.out.println("There is no data in payout list");

		}
		
		else {
			int i = 1;
			
			int paid = 0;
			
			String str = driver.findElement(By.xpath("//*[@id=\"lms_table\"]/tbody/tr["+i+"]/td[6]")).getText().trim();
			System.out.println(str);
			
			if (str.matches("Paid") && paid ==0){
				
				//all_instructor
				all_instructor.click();
				Thread.sleep(2000);
				paid = 1;
				System.out.println("All instructors payment is paid");
				
			}
			
		
			else {
			
			//select
			driver.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]")).click();
			Thread.sleep(2000);
			
			//make paid
			driver.findElement(By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[7]/div/div/a")).click();
			Thread.sleep(2000);
			
			//paid confirm
			driver.findElement(By.xpath("//*[@id=\"makeAsPay\"]/div/div/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(2000);
			System.out.println("Successfully paid the instructors payment");
			}
			
		}
		
	}
	

}
