package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LiveClass {
	
	WebDriver d;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'Live Classes')]")
	WebElement liveClass;
	
	@FindBy(xpath="//body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/h4[1]")
	WebElement classDetails;
	
	@FindBy(xpath="//*[@id=\"Curriculum-tab\"]")
	WebElement schedule;
	
	@FindBy(xpath="//*[@id=\"Instructor-tab\"]")
	WebElement instructor;
	
	
	
	public POM_LiveClass(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void liveClass() throws InterruptedException {
		
		
		
		liveClass.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Live Class");
		
		classDetails.click();
		Thread.sleep(1000);
		
		schedule.click();
		Thread.sleep(1000);
		
		instructor.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Chekout from Live Class");
		
		
		
	}

}
