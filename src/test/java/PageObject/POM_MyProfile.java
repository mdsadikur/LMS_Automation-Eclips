package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_MyProfile {
	
	WebDriver d;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'My Profile')]")
	WebElement myProfile;
	
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div/div/div/div/div/div[2]/form/div[2]/div[5]/button")
	WebElement saveButton;
	
	public POM_MyProfile(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void myProfile() throws InterruptedException {
		
		
		
		myProfile.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at My Profile");
		
		saveButton.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from My Profile");
		
		
	}
	

}
