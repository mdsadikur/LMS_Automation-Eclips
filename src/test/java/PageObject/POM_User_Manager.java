package PageObject;

import java.awt.AWTException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_User_Manager {
	
	WebDriver driver;
	String staff_Name,email;
	
	public POM_User_Manager(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
		staff_Name = this.name();
		email = this.name();
	}
	
	CommonMethod upload = new CommonMethod();
	
	/*
	 * department
	 */
	
	//user manager
	@FindBy(xpath = "//span[contains(text(),'User manager')]")
	WebElement User_Manager;
	
	//department
	@FindBy(xpath = "//a[contains(text(),' Department')]")
	WebElement Department;
	
	//add department
	@FindBy(xpath = "//button[@class='primary-btn radius_30px mr-10 fix-gr-bg']")
	WebElement add_department;
	
	//department name
	@FindBy(xpath = "//input[@class='primary_input_field name'][@name='name']")
	WebElement department_name;
	
	//department details
	@FindBy(xpath = "//input[@class='primary_input_field name'][@name='details']")
	WebElement department_details;
	
	//save department
	@FindBy(xpath = "//button[@class='primary-btn semi_large2 fix-gr-bg']")
	WebElement save_department;

	//select button
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement department_select;
	
	//department edit
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")
	//*[@id="DataTables_Table_0"]/tbody/tr[1]/td[3]/div/div/a[1]
	WebElement department_edit;
	
	/*
	 * 
	 * Staff
	 * 
	 */
	
	//staff
	@FindBy(xpath ="(//a[contains(text(),' Staff')])[1]")
	WebElement staff;
	
	//add staff
	@FindBy(xpath = "//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/ul/li/a")
	WebElement add_staff;
	
	//staff name
	@FindBy(xpath = "(//input[@class='primary_input_field name'])[1]")
	WebElement staff_name;
	
	//staff email
	@FindBy(xpath = "(//input[@class='primary_input_field name'])[2]")
	WebElement staff_email;
	
	//staff password
	@FindBy(xpath = "(//input[@class='primary_input_field name'])[3]")
	WebElement staff_password;
	
	//save staff
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2 fix-gr-bg'])")
	WebElement save_staff;
	
	//select action
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement select_action;
	
	//staff edit
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/div/a[1]")
	WebElement staff_edit;
	
	//staff confirm password
	@FindBy(xpath = "(//input[@class='primary_input_field name'])[5]")
	WebElement staff_confirm_password;
	
	//staff view
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/div/a[2]")
	WebElement staff_view;
	
	//staff document
	@FindBy(xpath = "//a[contains(text(),'Documents')]")
	WebElement staff_document;
	
	//upload document
	@FindBy(xpath = "//button[@class='primary-btn tr-bg text-uppercase bord-rad']")
	WebElement upload_document;
	
	//document name
	@FindBy(xpath = "//input[@class='primary_input_field name']")
	WebElement document_name;
	
	//document browse
	@FindBy(xpath = "//label[@class='primary-btn small fix-gr-bg']")
	WebElement document_browse;
	
	//save document
	@FindBy(xpath = "//button[@class='primary-btn fix-gr-bg']")
	WebElement save_document;
	
	//document select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement document_select;
	
	//document download
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]/div/div/a[1]")
	WebElement document_download;
	
	//document delete
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]/div/div/a[2]")
	WebElement document_delete;
	
	//document delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement document_delete_confirm;
	
	
	
	//staff resume
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[8]/div/div/a[4]")
	WebElement staff_resume;
	
	//Staff resume cancel
	@FindBy(xpath = "//*[@id=\"resume_staff_modal\"]/div/div/div[1]/button/i")
	WebElement staff_resume_cancel;
	
	
	
	
	
	
	
	
	
	
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}
	
	public void clickUser_managerButton() throws InterruptedException {
	
	//User_Manager
	User_Manager.click();
	Thread.sleep(2000);
	
	System.out.println("Entered at User Manager Buttton");
	
	//Department
	Department.click();
	Thread.sleep(2000);
	
	//add_department
	add_department.click();
	Thread.sleep(2000);
	
	//department_name
	department_name.sendKeys("Accounts");
	Thread.sleep(2000);
	
	//department_details
	department_details.sendKeys("It is a long established fact that a reader will be distracted by"
			+ " the readable content of a page when looking at its layout.");
	Thread.sleep(2000);
	
	//save_department
	save_department.click();
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	//department_select
	department_select.click();
	Thread.sleep(2000);
	
	//department_edit
	department_edit.click();
	Thread.sleep(2000);
	
	//save_department
	save_department.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	System.out.println("Checkout from User Manager Button");
	
}
	public void clickstaffButton() throws InterruptedException, AWTException {
		
//		//User_Manager
//		User_Manager.click();
//		Thread.sleep(2000);
		
		//staff
		staff.click();
		Thread.sleep(2000);
		
		System.out.println("Entered at Staff Button");
		
		//add_staff
		add_staff.click();
		Thread.sleep(2000);
		
		//staff_name
		staff_name.sendKeys(staff_Name);
		Thread.sleep(2000);
		
		//staff_email
		staff_email.sendKeys("staff"+email+"@gmail.com");
		Thread.sleep(2000);
		
		//staff_password
		staff_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//save_staff
		save_staff.click();
		Thread.sleep(2000);
		
		//select_action
		select_action.click();
		Thread.sleep(2000);
		
		//staff_edit
		staff_edit.click();
		Thread.sleep(2000);
		
		//staff_confirm_password
		staff_confirm_password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//save_staff
		save_staff.click();
		Thread.sleep(2000);
		
		/*
		 * action staff
		 */
		
		//select_action
		select_action.click();
		Thread.sleep(2000);
		
		//staff_view
		staff_view.click();
		Thread.sleep(2000);
		
		//staff_document
		staff_document.click();
		Thread.sleep(2000);
		
		//upload_document
		upload_document.click();
		Thread.sleep(2000);
		
		//document_name
		document_name.sendKeys(email);
		Thread.sleep(2000);
		
		//document_browse
		document_browse.click();
		Thread.sleep(2000);
		String filePath=upload.getFilePath("Uploaded lesson file.txt");
		upload.textUpload(filePath);
		Thread.sleep(1000);
		
		//save_document
		save_document.click();
		Thread.sleep(2000);
		
		/*
		 * select document
		 */
		
		//staff_document
		staff_document.click();
		Thread.sleep(2000);
		
		//document_select
		document_select.click();
		Thread.sleep(2000);
		
		//document_download
		document_download.click();
		Thread.sleep(2000);
		
		//document_select
		document_select.click();
		Thread.sleep(2000);
		
		//document_delete
		document_delete.click();
		Thread.sleep(2000);
		
		//document_delete_confirm
		document_delete_confirm.click();
		Thread.sleep(2000);
		
		/*
		 * 
		 * action staff
		 * 
		 */
		
		//staff
		staff.click();
		Thread.sleep(2000);
		
		//select_action
		select_action.click();
		Thread.sleep(2000);
		
		//staff_resume
		staff_resume.click();
		Thread.sleep(2000);
		
		//staff_resume_cancel
		staff_resume_cancel.click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Staff Button");
		
	}

}
