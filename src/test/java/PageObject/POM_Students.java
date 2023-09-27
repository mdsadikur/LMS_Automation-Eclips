package PageObject;

import java.awt.AWTException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;

public class POM_Students {
	WebDriver driver = null;
	String email;

	public POM_Students(WebDriver driver) {
		this.driver = driver;
		this.email = this.name();
	}

	By Students = By.xpath("//span[contains(text(),'Students')]");

//Students List

	By StudentsList = By.xpath("//a[contains(text(),' Student List')]");

	By StudentsList_AddStudent = By.xpath("//*[@id=\"add_student_btn\"]");

	By StudentsList_AddName = By.xpath("//*[@id=\"addName\"]");

	By StudentsList_DOB = By.xpath("//*[@id=\"startDate\"]");

	By StudentsList_Phone = By.xpath("//*[@id=\"addPhone\"]");

	By StudentsList_Email = By.xpath("//*[@id=\"addEmail\"]");

	By StudentsList_Gender1 = By.xpath("//*[@id=\"add_student\"]/div/div/div[2]/form/div[4]/div[2]/div/div/span");

	By StudentsList_Gender2 = By.xpath("//*[@id=\"add_student\"]/div/div/div[2]/form/div[4]/div[2]/div/div/ul/li[2]");

	By StudentsList_Password = By.xpath("//*[@id=\"addPassword\"]");

	By StudentsList_ConfirmPassword = By.xpath("//*[@id=\"addCpassword\"]");

	By StudentsList_SaveStudentButton = By.xpath("//*[@id=\"save_button_parent\"]");

//Edit
	By StudentsList_Searchbar = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");

	By StudentsList_ActionButton = By.xpath("(//button[@class='btn btn-secondary dropdown-toggle'])[1]");

	By StudentsList_EditButton = By.xpath(
			"/html/body/div[3]/div/section[2]/div/div/div[2]/div/div/div/div/table/tbody/tr/td[11]/div/div/button[1]");

	By StudentsList_UpdateStudentButton = By
			.xpath("/html/body/div[3]/div/section[2]/div/div/div[4]/div/div/div[2]/form/div[8]/div/button");

//Secret Login

	By StudentsList_SecretLogin = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[11]/div/div/a[1]");

	By StudentsList_ExitNowButton = By.xpath("/html/body/div[2]/a");

//Course
	By StudentList_Course = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td[11]/div/div/a[2]");
	

//Delete Student
	By StudentsList_Delete1 = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[11]/div/div/button[2]");

	By StudentsList_Delete2 = By
			.xpath("/html/body/div[3]/div/section[2]/div/div/div[5]/div/div/div[2]/form/div[2]/button[2]");
	
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}

	public void StudentList() throws InterruptedException {

		driver.findElement(Students).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in students");

		driver.findElement(StudentsList).click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in students list");

		// Add Student
		driver.findElement(StudentsList_AddStudent).click();
		Thread.sleep(1000);

		driver.getWindowHandles();
		driver.findElement(StudentsList_AddName).sendKeys("Tonmoy Halder");
		Thread.sleep(1000);

		driver.findElement(StudentsList_DOB).sendKeys("1/1/1997");
		Thread.sleep(1000);

//		driver.findElement(StudentsList_Phone).sendKeys("12345678");
//		Thread.sleep(1000);

		driver.findElement(StudentsList_Email).sendKeys("test" + email + "@gmail.com");
		Thread.sleep(1000);

		driver.findElement(StudentsList_Gender1).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_Gender2).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_Password).sendKeys("12345678");
		Thread.sleep(1000);

		driver.findElement(StudentsList_ConfirmPassword).sendKeys("12345678");
		Thread.sleep(1000);

		driver.findElement(StudentsList_SaveStudentButton).click();
		Thread.sleep(1000);
		System.out.println("Successfully saved students");

		// Edit

		driver.findElement(StudentsList_Searchbar).sendKeys("Tonmoy Halder");
		Thread.sleep(2000);

		driver.findElement(StudentsList_ActionButton).click();
		Thread.sleep(2000);

		driver.findElement(StudentsList_EditButton).click();
		Thread.sleep(1000);

		driver.getWindowHandle();
		driver.findElement(StudentsList_UpdateStudentButton).click();
		Thread.sleep(1000);
		System.out.println("Successfully update students");

		// Secret Login

		driver.findElement(StudentsList_Searchbar).sendKeys("Tonmoy Halder");
		Thread.sleep(2000);

		driver.findElement(StudentsList_ActionButton).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_SecretLogin).click();
		Thread.sleep(3000);
		System.out.println("Successfully secret login to student");

		driver.findElement(StudentsList_ExitNowButton).click();
		Thread.sleep(2000);
		System.out.println("Successfully exit secret login from student");

		// Course

		driver.findElement(Students).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_Searchbar).sendKeys("Tonmoy Halder");
		Thread.sleep(3000);

		driver.findElement(StudentsList_ActionButton).click();
		Thread.sleep(3000);

		driver.findElement(StudentList_Course).click();
		Thread.sleep(2000);

		// driver.navigate().back();

		// Delete

//		
//		driver.findElement(StudentsList_ActionButton).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(StudentsList_Delete1).click();
//		Thread.sleep(1000);
//		
//		driver.getWindowHandle();
//		driver.findElement(StudentsList_Delete2).click();
//		Thread.sleep(1000);
//		
	}
	
	/*
	 * 
	 */
	
	//regular student import

	By Regular_student_import = By.xpath("//a[contains(text(),' Regular Student Import')]");

	//student sample download
	By student_sample_download = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/a/button");

	//student browse
	By student_browse = By.xpath("(//label[contains(text(),'Browse ')])[2]");

	//import student
	By import_student = By.xpath("//button[@class='primary-btn fix-gr-bg']");

	CommonMethod upload = new CommonMethod();


	public void click_regularStudentImport_button() throws InterruptedException, AWTException {
		
//		driver.findElement(Students).click();
//		Thread.sleep(1000);
//		System.out.println("Successfully enter in students");
		
		//Regular_student_import
		driver.findElement(Regular_student_import).click();
		Thread.sleep(2000);
		System.out.println("Successfully enter regular student import");
		
		//student_sample_download
		driver.findElement(student_sample_download).click();
		Thread.sleep(2000);
		System.out.println("Successfully downloaded regular student import");
		
		//student_browse
		driver.findElement(student_browse).click();
		Thread.sleep(2000);
		
		String filePath=upload.getFilePath("sample-student.xlsx");
		upload.importstudentUpload(filePath);
		Thread.sleep(5000);
		
		//import_student
		driver.findElement(import_student).click();
		Thread.sleep(2000);
		System.out.println("Successfully imported regular student");
		
	}

//New Enroll

	By New_Enroll = By.xpath("(//a[contains(text(),' New Enroll')])");

	By New_Enroll_SelectStudent = By.xpath("//*[@id=\"ms-list-1\"]/button");

	By New_Enroll_SearchStudent = By.xpath("//*[@id=\"ms-list-1\"]/div/div/input");

	By New_Enroll_SelectStudentDropdown = By.xpath(
			"//*[@id=\"ms-list-1\"]/div/ul");

	By New_Enroll_SelectCourse = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div/span");

	By New_Enroll_SearchCourse = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div/div/input");

	By New_Enroll_SelectCourseDropdown = By.xpath(
			"//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div/ul/li[1]");

	By New_Enroll_EnrollNowButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div/div/div/form/div/div[2]/div/button");

	public void New_Enroll() throws InterruptedException {

//		driver.findElement(Students).click();
//		Thread.sleep(1000);

		driver.findElement(New_Enroll).click();
		Thread.sleep(1000);
		System.out.println("Successfully Enter New Enroll");

		driver.findElement(New_Enroll_SelectStudent).click();
		Thread.sleep(2000);

		driver.findElement(New_Enroll_SearchStudent).sendKeys("TONMOY HALDER");
		Thread.sleep(2000);

		driver.findElement(New_Enroll_SelectStudentDropdown).click();
		Thread.sleep(2000);
		
		System.out.println("Done");

		driver.findElement(New_Enroll_SelectCourse).click();
		Thread.sleep(2000);

		driver.findElement(New_Enroll_SearchCourse).sendKeys("TEST COURSE 1");
		Thread.sleep(2000);

		driver.findElement(New_Enroll_SelectCourseDropdown).click();
		Thread.sleep(1000);

		driver.findElement(New_Enroll_EnrollNowButton).click();
		Thread.sleep(1000);
		
		driver.findElement(Students).click();
		Thread.sleep(2000);
		
		System.out.println("Successfully Checkout from New Enroll");

	}

//Enrolled Student

	By Enrolled_Student = By.xpath("//a[contains(text(),' Enrolled Student')]");

	By Enrolled_Student_SelectCourse = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/form/div/div[1]/div[2]");

	By Enrolled_Student_SearchCourse = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/form/div/div[1]/div[2]/div/input");

	By Enrolled_Student_SelectCourse2 = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/form/div/div[1]/div[2]/ul/li[2]");

	By Enrolled_Student_StartDate = By.xpath("//*[@id=\"startDate\"]");

	By Enrolled_Student_EndDate = By.xpath("//*[@id=\"admissionDate\"]");

	By Enrolled_Student_FilterHistoryButton = By
			.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/form/div/div[4]/div/button");

	By Enrolled_Student_SearchStudent = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");

	By Enrolled_Student_ActionButton = By.xpath("//*[@id=\"dropdownMenu2\"]");

//Cancel Course

	By Enrolled_Student_CancelCourse_CancelStudentMenu = By.xpath("//a[contains(text(),' Canceled Student')]");
	By Enrolled_Student_CancelCourse_CancelCourse1 = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[8]/div/div/a[2]");
	By Enrolled_Student_CancelCourse_CancelCourse2 = By.xpath("/html/body/div[3]/div/div[3]/div/div/div[2]/div/div/a");
	By Enrolled_Student_CancelCourse_CancelledStudent = By.xpath("//*[@id=\"sidebar_menu\"]/li[3]/ul/li[6]/a");
	By Enrolled_Student_CancelCourse_SearchButton = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	By Enrolled_Student_CancelCourse_ActionButton = By.xpath("//*[@id=\"dropdownMenu2\"]");
	By Enrolled_Student_CancelCourse_RefundCourse = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td[9]/div/div/a");
	By Enrolled_Student_CancelCourse_RefundCourse2 = By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/a");

	public void enrolledtocancelled() throws InterruptedException {
//		driver.findElement(Enrolled_Student_SearchStudent).sendKeys("Tonmoy Halder");
//		Thread.sleep(2000);

		driver.findElement(Enrolled_Student_ActionButton).click();
		Thread.sleep(2000);

		driver.findElement(Enrolled_Student_CancelCourse_CancelCourse1).click();
		Thread.sleep(2000);

		driver.getWindowHandle();
		driver.findElement(Enrolled_Student_CancelCourse_CancelCourse2).click();
		Thread.sleep(2000);

		driver.findElement(Students).click();
		Thread.sleep(1000);
		
		driver.findElement(Enrolled_Student_CancelCourse_CancelStudentMenu).click();
		Thread.sleep(2000);

		driver.findElement(Enrolled_Student_CancelCourse_SearchButton).sendKeys("Tonmoy Halder");
		Thread.sleep(2000);

		driver.findElement(Enrolled_Student_CancelCourse_ActionButton).click();
		Thread.sleep(2000);

		driver.findElement(Enrolled_Student_CancelCourse_RefundCourse).click();
		Thread.sleep(2000);

		driver.getWindowHandle();
		driver.findElement(Enrolled_Student_CancelCourse_RefundCourse2).click();
		Thread.sleep(1000);
	}

//Enrolled_Student_Refund Course
	By Enrolled_Student_RefundCourse1 = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[8]/div/div/a[1]");

	By Enrolled_Student_RefundCourse2 = By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div/div/a");

	
	
	
	public void Enrolled_Student() throws InterruptedException {

		

		filterstudent();
		Thread.sleep(1000);

	}

	public void filterstudent() throws InterruptedException {
		
//		driver.findElement(Students).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(Enrolled_Student).click();
//		Thread.sleep(2000);
	
	boolean not_found = true;
	int i=2;
	
	while(not_found) {
		driver.findElement(Students).click();
		Thread.sleep(1000);

		driver.findElement(Enrolled_Student).click();
		Thread.sleep(2000);
		
		driver.findElement(Enrolled_Student_SelectCourse).click();
		Thread.sleep(1000);
		
		if(driver.findElements(By.xpath("/html/body/div[3]/div/section/div/div/div[1]/div/form/div/div[1]/div[2]/ul/li["+i+"]")).size()>0){
			
			driver.findElement(By.xpath("/html/body/div[3]/div/section/div/div/div[1]/div/form/div/div[1]/div[2]/ul/li["+i+"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys(Keys.DELETE);
			driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("1/1/2020");
			
			
			driver.findElement(By.xpath("//*[@id=\"admissionDate\"]")).sendKeys(Keys.CONTROL + "a");
			driver.findElement(By.xpath("//*[@id=\"admissionDate\"]")).sendKeys(Keys.DELETE);
			driver.findElement(By.xpath("//*[@id=\"admissionDate\"]")).sendKeys("1/1/2050");
			
//			driver.findElement(By.xpath("//*[@id=\"startDate\"]")).sendKeys("1/1/2020");
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//*[@id=\"admissionDate\"]")).sendKeys("1/1/2050");
//			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/form/div/div[4]/div/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"lms_table_filter\"]/label/input")).sendKeys("Tonmoy Halder");
			Thread.sleep(2000);
			
			
			
			int size2 = driver.findElements(By.xpath("/html/body/div[3]/div/section/div/div/div[3]/div/div/div/div/table/tbody/tr[1]/td")).size();
			
			
			if (size2==1) {
				
					
					System.out.println("Student not Found");
					i=i+1;
				} else {
					
					
					System.out.println("Student Found");
					not_found=false;
					
					enrolledtocancelled();
					Thread.sleep(2000);
			
				}
			} else {
				not_found=false;
			
			}
		
		}
		System.out.println("Successfully checkout from enrolled student");
	}

	public void studetndelete() throws InterruptedException {

		driver.findElement(Students).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_Searchbar).sendKeys("Tonmoy Halder");
		Thread.sleep(1000);

		driver.findElement(StudentsList_ActionButton).click();
		Thread.sleep(1000);

		driver.findElement(StudentsList_Delete1).click();
		Thread.sleep(1000);

		driver.getWindowHandle();
		driver.findElement(StudentsList_Delete2).click();
		Thread.sleep(1000);

	}




}
