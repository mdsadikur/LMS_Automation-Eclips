package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Instructor {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[2]/a[1]")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"mobile-menu\"]/li[5]/a")
	WebElement instructor;
	
	@FindBy(xpath="//*[@id=\"content-area\"]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/a[1]")
	WebElement instructorName;
	
	
	
	
	public POM_Instructor(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void instructor() throws InterruptedException {
		
		Thread.sleep(5000);
		
		
//		
//		profileIcon.click();
//		Thread.sleep(1000);
//		
//		home.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Instructor");
		
		instructor.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Instructor");
		
//		instructorName.click();
//		Thread.sleep(4000);
//		
//		d.navigate().back();
//		Thread.sleep(1000);
		
		
	}

}
