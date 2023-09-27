package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_NotificationSetup {
	
	
	WebDriver d;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'Notification Setup')]")
	WebElement notificationSetup;
	
	
	@FindBy(xpath="//*[@id=\"notification_setup_form\"]/div[2]/button")
	WebElement saveButton;
	
	
	
	public POM_NotificationSetup(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void notificationSetup() throws InterruptedException {
		
		
		
		notificationSetup.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Notification Setup");
		
		d.findElement(By.xpath("//*[@id=\"notification_setup_form\"]/div[1]/table/tbody/tr[7]/td[2]/label")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"notification_setup_form\"]/div[1]/table/tbody/tr[7]/td[2]/label")).click();
		
		d.findElement(By.xpath("//*[@id=\"notification_setup_form\"]/div[1]/table/tbody/tr[13]/td[3]/label")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"notification_setup_form\"]/div[1]/table/tbody/tr[13]/td[3]/label")).click();
		
		saveButton.click();
		Thread.sleep(2000);
		
		System.out.println("Checkout at Notification Setup");
	}

}
