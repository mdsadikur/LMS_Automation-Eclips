package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Communications {
	
	WebDriver d;
	
	@FindBy(xpath="//span[contains(text(), 'Communications')]")
	WebElement communications;
	
	@FindBy(xpath="//a[contains(text(),' Private Message')]")
	WebElement messages;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/div[1]/div[2]")
	WebElement chatList;
	
	@FindBy(xpath="//*[@id=\"message\"]")
	WebElement writeText;
	
	@FindBy(xpath="//*[@id=\"submitMessage\"]")
	WebElement sendMessage;
	
	
	
	public POM_Communications(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void messages() throws InterruptedException {
		
		System.out.println("Entered at Communicate");
		
		communications.click();
		Thread.sleep(1000);
		
		messages.click();
		Thread.sleep(1000);
		
		chatList.click();
		Thread.sleep(1000);
		
		writeText.sendKeys("Hey. What's up");
		Thread.sleep(1000);
		
		sendMessage.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Communicate");
		
	}

}
