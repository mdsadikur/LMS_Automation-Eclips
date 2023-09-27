package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_StudentCertificate {
	
	WebDriver d ;
	
	@FindBy(xpath="//span[contains(text(),'Certificate')]")
	WebElement certificate;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[5]/a[1]")
	WebElement downloadCertificate;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[2]")
	WebElement viewCertificate;
	
	
	
	public POM_StudentCertificate(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void Click_StudentcertificateButton() throws InterruptedException {
		
		certificate.click();
		Thread.sleep(1000);
		
		System.out.println("Entered in Student Certificate");
		
		downloadCertificate.click();
		Thread.sleep(1000);
		
		viewCertificate.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		System.out.println("Checkout from  Student Certificate");
		
	}

}
