package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PurchaseHistory {
	
	WebDriver d;
	
	
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'Purchase History')]")
	WebElement purchaseHistory;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td[7]/a")
	WebElement viewButton;
	
	@FindBy(xpath="//button[contains(text(),'Download')]")
	WebElement downloadHistory;
	
	
	
	public POM_PurchaseHistory(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
		
	}
	
	public void purchase() throws InterruptedException {
		
		purchaseHistory.click();
		Thread.sleep(2000);
		
		System.out.println("Entered at Purchase History");
		
		int size= d.findElements(By.xpath("//body/div[2]/section/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td")).size();
		
		System.out.println(size);
		
		if(size==1) {
			
			POM_MyProfile profile= new POM_MyProfile(d);
			
			profile.myProfile();
			
		}
		
		else {
			purchaseHistory.click();
			Thread.sleep(2000);
			
			viewButton.click();
			Thread.sleep(1000);
			
			downloadHistory.click();
			Thread.sleep(1000);
			
		}
		
		
		
		System.out.println("Checkout from Purchase History");	
		
	}

}
