package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Contact {
	
	WebDriver d;
	
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[2]/a[1]")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"mobile-menu\"]/li[6]/a")
	WebElement contactUs;
	
	
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div/div[1]/input[1]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div/div[1]/input[2]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div/div[1]/input[3]")
	WebElement subject;
	
	@FindBy(xpath="//*[@id=\"myForm\"]/div/div[2]/textarea")
	WebElement message;
	
	@FindBy(xpath="//button[@class='theme_btn small_btn submit-btn w-100 text-center']")
	WebElement send;
	
	
	
	public POM_Contact(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void contact() throws InterruptedException {
		
		Thread.sleep(5000);
		
		
		
		profileIcon.click();
		Thread.sleep(1000);
		
		home.click();
		Thread.sleep(1000);
		
		contactUs.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Contact Us");
		
		name.sendKeys("Tonmoy Halder");
		Thread.sleep(1000);
		
		email.sendKeys("tonmoy@gmail.com");
		Thread.sleep(1000);
		
		subject.sendKeys("Anything");
		Thread.sleep(1000);
		
		message.sendKeys("How are you?");
		Thread.sleep(1000);
		
		send.click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Contact us");
	}

}
