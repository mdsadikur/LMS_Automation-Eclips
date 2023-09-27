package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Certificate {
	
	WebDriver driver;
	
	public POM_Certificate(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	
	CommonMethod upload = new CommonMethod();
	
	//Certificate
	@FindBy(xpath = "//span[contains(text(),'Certificate')]")
	WebElement certificate;
	
	//certificate list
	@FindBy(xpath = "//a[contains(text(),' Certificate List')]")
	WebElement certificate_list;
	
	//certificate select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement certificate_select;
	
	//certificate view
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement certificate_view;
	
	//certificate download
	@FindBy(xpath = "(//a[contains(text(),'Download')])[1]")
	WebElement certificate_download;
	
	//certificate Edit
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")
	WebElement certificate_Edit;
	
	//certificate update
	@FindBy(xpath = "(//button[@class='primary-btn fix-gr-bg'])")
	WebElement certificate_update;
	
	/*
	 * 
	 * Add certificate
	 * 
	 */
	
	//add certificate
	@FindBy(xpath = "//a[contains(text(),' Add Certificate')]")
	WebElement add_certificate;
	
	//certificate background
	@FindBy(xpath ="(//label[@class='primary-btn small fix-gr-bg'])[1]")
	WebElement certificate_background;
	
	//certificate title
	@FindBy(xpath = "(//input[@class='primary_input_field title change-input'])")
	WebElement certificate_title;
	
	//certificate text area
	@FindBy(xpath = "(//textarea[@class='change-input form-control'])")
	WebElement certificate_textarea;
	
	//certificate signature
	@FindBy(xpath ="(//label[@class='primary-btn small fix-gr-bg'])[1]")
	WebElement certificate_signature;
	
	//certificate title no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[2]/div[3]/label/span")
	WebElement certificate_title_no;
	
	//certificate title yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[2]/div[2]/label/span")
	WebElement certificate_title_yes;
	
	//certificate studentName no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[11]/div[3]/label/span")
	WebElement certificate_studentName_no;
	
	//certificate studentName yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[11]/div[2]/label/span")
	WebElement certificate_studentName_yes;
	
	//certificate studentImage no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[15]/div[3]/label/span")
	WebElement certificate_studentImage_no;
	
	//certificate studentImage yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[15]/div[2]/label/span")
	WebElement certificate_studentImage_yes;
	
	//certificate QR no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[18]/div[3]/label/span")
	WebElement certificate_QR_no;
	
	//certificate QR yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[18]/div[2]/label/span")
	WebElement certificate_QR_yes;
	
	//certificate number no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[21]/div[3]/label/span")
	WebElement certificate_number_no;
	
	//certificate number yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[21]/div[2]/label/span")
	WebElement certificate_number_yes;
	
	//certificate date no
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[25]/div[3]/label/span")
	WebElement certificate_date_no;
	
	//certificate date yes
	@FindBy(xpath = "//*[@id=\"question_bank\"]/div/div[1]/div[25]/div[2]/label/span")
	WebElement certificate_date_yes;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void certificate_select() throws InterruptedException {
		
		//certificate_select
		certificate_select.click();
		Thread.sleep(2000);
		
		//certificate_view
		certificate_view.click();
		Thread.sleep(3000);
		
		upload.switchnextWindow();
		driver.close();
		Thread.sleep(1000);
		
		upload.switchpreviousWindow();
		Thread.sleep(2000);
		
		//certificate_select
		certificate_select.click();
		Thread.sleep(2000);
		
		//certificate_download
		certificate_download.click();
		Thread.sleep(2000);
		
		//certificate_select
		certificate_select.click();
		Thread.sleep(2000);
		
		//certificate_Edit
		certificate_Edit.click();
		Thread.sleep(2000);
		
		//certificate_update
		certificate_update.click();
		Thread.sleep(2000);
		
	}
	
	public void clickcertificateButton() throws InterruptedException {
		
		//certificate
		certificate.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in certificate");
		
		//certificate_list
		certificate_list.click();
		Thread.sleep(1000);
		System.out.println("Successfully enter in certificate list");
		
		int size = driver.findElements(By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td")).size();
		System.out.println("Size is = "+size);
		
		if(size == 1) {
			
			add_certificate.click();
			Thread.sleep(1000);
			
		}
		
		else {
			
			certificate_select();
			Thread.sleep(1000);
		}
		System.out.println("Successfully checkout from certificate list");
	}
	
	public void clickadd_certificateButton() throws InterruptedException, AWTException {
		
//		//certificate
//		certificate.click();
//		Thread.sleep(1000);
		
		//add_certificate
		add_certificate.click();
		Thread.sleep(2000);
		
		//certificate_background
		certificate_background.click();
		Thread.sleep(2000);
		
		String filePath=upload.getFilePath("certificate background.png");
		upload.Certificatepload(filePath);
		Thread.sleep(5000);
		
		//certificate_title
		certificate_title.sendKeys("Test Certificate");
		Thread.sleep(2000);
		
		//certificate_textarea
		certificate_textarea.sendKeys("It is a long established fact that a reader will be distracted by the "
				+ "readable content of a page when looking at its layout. ");
		Thread.sleep(2000);
		
//		//certificate_signature
//		certificate_signature.click();
//		Thread.sleep(1000);
//		
//		upload.icon();
//		Thread.sleep(1000);
		
		//certificate_title_no
		certificate_title_no.click();
		Thread.sleep(4000);
		
		//certificate_title_yes
		certificate_title_yes.click();
		Thread.sleep(4000);
		
		//certificate_studentName_no
		certificate_studentName_no.click();
		Thread.sleep(4000);
		
		//certificate_studentName_yes
		certificate_studentName_yes.click();
		Thread.sleep(4000);
		
		//certificate_studentImage_no
		certificate_studentImage_no.click();
		Thread.sleep(4000);
		
		//certificate_studentImage_yes
		certificate_studentImage_yes.click();
		Thread.sleep(4000);
		
		//certificate_QR_no
		certificate_QR_no.click();
		Thread.sleep(4000);
		
		//certificate_QR_yes
		certificate_QR_yes.click();
		Thread.sleep(4000);
		
		//certificate_number_no
		certificate_number_no.click();
		Thread.sleep(4000);
		
		//certificate_number_yes
		certificate_number_yes.click();
		Thread.sleep(4000);
		
		//certificate_date_no
		certificate_date_no.click();
		Thread.sleep(4000);
		
		//certificate_date_yes
		certificate_date_yes.click();
		Thread.sleep(4000);
		
		//certificate_update
		certificate_update.click();
		Thread.sleep(2000);
		
		System.out.println("Successfully Saved certificate");
		System.out.println("Successfully checkout from certificate");
		
	}

}
