package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Reports {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="//span[contains(text(), 'Report')]")
	WebElement report;
	
	//admin revenue
	
	@FindBy(xpath="//a[contains(text(), ' Admin Revenue')]")
	WebElement adminRevenue;
	
	@FindBy(xpath="//*[@id=\"lms_table\"]/tbody/tr[1]/td[6]/a")
	WebElement revenueButton;
	
	@FindBy(xpath="//a[contains(text(), ' Instructor Revenue')]")
	WebElement instructorRevenue;
	
	@FindBy(xpath="//a[contains(text(), ' Course Statistics')]")
	WebElement courseStatistics;
	
	public POM_Reports(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void adminRevenue() throws InterruptedException {
		
		
		
		report.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Admin Revenue");
		
		adminRevenue.click();
		Thread.sleep(1000);
		
		revenueButton.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Admin Revenue");
		
		
	}
	
	public void instructorRevenue() throws InterruptedException {
		
		System.out.println("Entered at Instructor Revenue");
		
		instructorRevenue.click();
		Thread.sleep(1000);
		
		cm.scroll();
		
		System.out.println("Checkout from Instructor Revenue");
	}
	
	public void courseStatistices() throws InterruptedException {
		
		courseStatistics.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Course Statistics");
		System.out.println("Checkout  from Course Statistics");
	}

}
