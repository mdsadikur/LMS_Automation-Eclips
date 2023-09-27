package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_ReferralSettings {
	
	WebDriver d;
	
	@FindBy(xpath="//span[contains(text(),'Referral Setting')]")
	WebElement referralSettings;
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/button[1]")
	WebElement selectButton;
	
	@FindBy(xpath="//*[@id=\"lms_table\"]/tbody/tr/td[7]/div/div/a")
	WebElement editButton;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement updateButton;
	
	public POM_ReferralSettings(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void referralSettings() throws InterruptedException {
		
		System.out.println("Entered at Referral Setting");
		
		referralSettings.click();
		Thread.sleep(1000);
		
		selectButton.click();
		Thread.sleep(1000);
		
		editButton.click();
		Thread.sleep(1000);
		
		updateButton.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Referral Settings");
	}

}
