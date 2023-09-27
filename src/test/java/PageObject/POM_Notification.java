package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Notification {
	
	WebDriver d ;
	
	@FindBy(xpath="(//span[contains(text(),'Notification')])[1]")
	WebElement notification;
	
	// notification setup
	
	@FindBy(xpath="(//a[contains(text(),' Notification Setup')])[1]")
	WebElement notificationSetup;
	
	
	@FindBy(xpath="//*[@id=\"notification_setup_form\"]/div[2]/button")
	WebElement updateNotification;  //*[@id="group_email_sms"]/div/form/div[2]/button
	
	// user notification setup
	
	@FindBy(xpath="//a[contains(text(),' User Notification Setup')]")
	WebElement userNotificationSetup;
	
	@FindBy(xpath="//*[@id=\"group_email_sms\"]/div/form/div[2]/button")
	WebElement updateUserNotification;
	
	
	
	
	
	
	
	public POM_Notification(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d,this);
	}
	
	public void notificationSetup() throws InterruptedException {
		
		
		notification.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Notification Setup");
		
		notificationSetup.click();
		Thread.sleep(1000);
		
		updateNotification.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Notification Setup");
	}
	
	public void userNotificationSetup() throws InterruptedException {
		
//		notification.click();
//		Thread.sleep(1000);
		
		
		System.out.println("Entered at User Notification Setup");
		userNotificationSetup.click();
		Thread.sleep(1000);
		
		updateUserNotification.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from User Notification Setup");
	}
	
	

}
