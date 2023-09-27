package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Referral {
	
	WebDriver d;
	
	@FindBy(xpath="//span[contains(text(),'Referral')]")
	WebElement referral;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div/div/div/div/div/div[2]/div/div/div/div/button")
	WebElement copyLink;
	
	
	
	public POM_Referral(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void referral() throws InterruptedException {
		
		System.out.println("Entered at Referral");
		
		referral.click();
		Thread.sleep(1000);
		
		copyLink.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Referral");
		
		
	}

}
