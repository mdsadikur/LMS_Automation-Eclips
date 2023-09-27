package PageObject;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Deposite {
	
	WebDriver d;
	
	CommonMethod cm = new CommonMethod();
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'Deposit')]")
	WebElement deposite;
	
	@FindBy(xpath="//body/div[2]/section/div[2]/div[1]/div/div/div/div/div[2]/div/form/div/div/input")
	WebElement depositeAmount;
	
	@FindBy(xpath="//body/div[2]/section/div[2]/div[1]/div/div/div/div/div[2]/div/form/div/div/div/button")
	WebElement saveInfo;
	
	
	@FindBy(xpath="//a[contains(text(),'Bank Payment')]")
	WebElement bankPayment;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[2]/div[1]/input")
	WebElement bankName;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[3]/div[1]/input")
	WebElement bankAcNumber;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[4]/div[1]/div/span")
	WebElement bankAcType;
	
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[4]/div[1]/div/ul/li[2]")
	WebElement bankAcTypeSelect;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[2]/div[2]/input")
	WebElement branchName;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[1]/div/div[1]/div[3]/div[2]/input")
	WebElement AcHolder;
	
	@FindBy(xpath="//body[1]/div[2]/section[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/input[1]")
	WebElement fileChoose;
	
	@FindBy(xpath="//*[@id=\"bankModel\"]/div/div/form/div[2]/button[2]")
	WebElement saveBankAmount;
	
	
	
	
	public POM_Deposite(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
		
	}
	
public void deposite() throws InterruptedException, AWTException {
		
		System.out.println("Entered at Deposite");
		
		deposite.click();
		Thread.sleep(1000);
		
		depositeAmount.sendKeys("10");
		Thread.sleep(1000);
		
		saveInfo.click();
		Thread.sleep(1000);
		
		bankPayment.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		Thread.sleep(1000);
		
		addInfo();
		
		System.out.println("Checkout from Deposite");
		
		//cm.fileUpload(filePath); 
	}
	
	public void addInfo() throws InterruptedException {
		
		bankName.sendKeys("AB Bank");
		Thread.sleep(1000);
		
		bankAcNumber.sendKeys("12345");
		Thread.sleep(1000);
		
		bankAcType.click();
		Thread.sleep(1000);
		
		bankAcTypeSelect.click();
		Thread.sleep(1000);
		
		branchName.sendKeys("Panthapath");
		Thread.sleep(1000);
		
		AcHolder.sendKeys("Manik");
		Thread.sleep(3000);
		
		String filePath=cm.getFilePath("home-banner1.jpg");
		System.out.println(filePath);
		
		fileChoose.sendKeys(filePath);
		Thread.sleep(1000);
		
		
		saveBankAmount.click();
		Thread.sleep(1000);
		
	}

}



