package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_PushNotification {
	
	WebDriver driver = null;
	
	public POM_PushNotification(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By PushNotification = By.xpath("(//span[contains(text(),'Push Notification')])");
	
	By Title = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div[1]/div/div[1]/div/input");
	
	By Details = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div[1]/div/div[2]/div/input");
	
	By Updatebutton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[2]/div/button");
	
	public void pushnotification() throws InterruptedException {
		
		
		
		driver.findElement(PushNotification).click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Push notification");
		
		driver.findElement(Title).click();
		Thread.sleep(1000);
		
		driver.findElement(Details).click();
		Thread.sleep(1000);
		
		driver.findElement(Updatebutton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Push Notification");
	}

}
