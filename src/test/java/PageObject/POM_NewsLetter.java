package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_NewsLetter {
	
	WebDriver d;
	
	@FindBy(xpath="//span[contains(text(),'Newsletter')]")
	WebElement newsLetter;
	
	//settings
	
	@FindBy(xpath="(//a[contains(text(),' Setting')])[8]")
	WebElement settings;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement saveSettings;
	
	
	//mail chimp settings
	
	@FindBy(xpath="//a[contains(text(),' Mailchimp Setting')]")
	WebElement mailChimpsettings;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]/i")
	WebElement mailChimpSaveSettings;
	
	
	//get response Settings
	
	@FindBy(xpath="//a[contains(text(),' Get Response Setting')]")
	WebElement getResponsesettings;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]/i")
	WebElement getResponseSaveSettings;
	
	// Acelle
	
	@FindBy(xpath="//a[contains(text(),' Acelle')]")
	WebElement acelle;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement acelleSave; 
	
	// subscriber
	
	@FindBy(xpath="//a[contains(text(),' Subscriber')]")
	WebElement subscriber;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/button[1]")
	WebElement selectSubscriber;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/div[1]/a[1]")
	WebElement deleteSubscriber;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
	WebElement deleteSubscriberButton;
	
	
	
	
	public POM_NewsLetter(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void settings() throws InterruptedException {
		
		
		newsLetter.click();
		Thread.sleep(2000);

		
		System.out.println("Entered at Settings");
		
		
		settings.click();
		Thread.sleep(2000);
		
		saveSettings.click();
		Thread.sleep(2000);
		
		
		System.out.println("checkout from Settings");
		
	}
	
	public void mailChimpSettings() throws InterruptedException {
		
//		newsLetter.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Mail Chimp Settings");
		
		mailChimpsettings.click();
		Thread.sleep(1000);
		
		mailChimpSaveSettings.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Mail Chimp Settings");
		
	}
	
	public void getResponseSettings() throws InterruptedException {
		
//		newsLetter.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Get Response Settings");
		
		getResponsesettings.click();
		Thread.sleep(1000);
		
		getResponseSaveSettings.click();
		Thread.sleep(1000);
		
		System.out.println("checkout from Get Response Settings");
	}
	
	public void acelle() throws InterruptedException {
		
//		newsLetter.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Acelle");
		
		acelle.click();
		Thread.sleep(1000);
		
		acelleSave.click();
		Thread.sleep(1000);
		
		System.out.println("Checkot from Acelle");
	}
	
	public void subscriber() throws InterruptedException {
		
//		newsLetter.click();
//		Thread.sleep(1000);
		
		subscriber.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Subscriber");
		
		selectSubscriber.click();
		Thread.sleep(1000);
		
		deleteSubscriber.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		deleteSubscriberButton.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Subscriber");
	}
	
	

}
