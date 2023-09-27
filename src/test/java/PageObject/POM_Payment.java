package PageObject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Payment {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="//span[contains(text(),'Payments')]")
	WebElement payments;
	
	//payment Received Online
	
	@FindBy(xpath="//a[contains(text(),' Payment Received Online')]")
	WebElement paymentReceivedOnline;
	
	// offline Payment
	
	@FindBy(xpath="//a[contains(text(),' Offline Payment')]")
	WebElement  offlinePayment;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/ul/li[1]/a")             //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]
	WebElement  instructor; 
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/ul/li[2]/a")             //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]
	WebElement  student; 
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")             //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[13]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]
	WebElement  action; 
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[1]")  
	WebElement addFund;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement amountAddFund;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement saveAmountAddFund;
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[2]")
	WebElement deductFund;
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement amountDeductFund; 
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	WebElement saveAmountDeductFund;
	
	
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[3]")
	WebElement fundHistory;
	
	
	// Bank Payment
	
	@FindBy(xpath="//a[contains(text(), ' Bank Payment')]")
	WebElement bankPayment;
	
	
	
	
	
	
	public POM_Payment(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void paymentRecievedOnline() throws InterruptedException {
		
		
		payments.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Payment Recieve Online");
		
		paymentReceivedOnline.click();
		Thread.sleep(1000);
		
		cm.scroll();
		
		System.out.println("Checkout from Payment Receive Online");
		
	}
	
	//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]
	//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]
	public void offlinePayment() throws InterruptedException {
		
//		payments.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at offline Payment");
		
		offlinePayment.click();
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td")).size();
		System.out.println(size);
		
		int length= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div")).size();
		System.out.println("Div size is " + length);
		if (size==1) {
			
			//Add Fund 
			
//			d.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/ul/li[2]/a")).click();
//			Thread.sleep(1000);    
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"2\"]/td[5]/div/div/a[1]")).click();
			Thread.sleep(1000);
			
//			d.getWindowHandle();
//			Thread.sleep(1000);
			
			d.findElement(By.name("amount")).sendKeys("10");
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]")).click();
			Thread.sleep(1000);
			
			
			//deduct fund
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"2\"]/td[5]/div/div/a[2]")).click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("(//*[@id=\"fund_amount\"])[2]")).sendKeys("10");
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[2]")).click();
			Thread.sleep(1000);
			
			//fund history
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"2\"]/td[5]/div/div/a[3]")).click();
			Thread.sleep(1000);
		
			
		}
		
		else {
			
			//Action
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);    
		
			// Add Fund
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[1]")).click();
			Thread.sleep(1000);
	
			
			d.getWindowHandle();
			Thread.sleep(1000);
			int divLen=d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).size();
			System.out.println(divLen);
			
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+(divLen-3)+"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10");
			Thread.sleep(1000);     //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[109]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]  
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+(divLen-3)+"]/div[1]/div[1]/div[2]/div[2]/button[2]")).click();
			Thread.sleep(1000);
			

			//Action
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			// Deduct Fund
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[2]")).click();
			Thread.sleep(1000);   

			
			
			d.getWindowHandle();
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+(divLen-2)+"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).sendKeys("10");
			Thread.sleep(1000);    //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[110]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]
			
			
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+(divLen-2)+"]/div[1]/div[1]/div[2]/div[2]/button[2]")).click();
			Thread.sleep(1000);
			
			
			//Action
			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/button[1]")).click();
			Thread.sleep(1000);
			
			// Fund History
 			d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+length+"]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/a[3]")).click();
			Thread.sleep(1000);   
			

		}
		
		System.out.println("Checkout from Offline Payment");
		
	}
	
	
	public void bankPayment() throws InterruptedException {
		
//		payments.click();
//		Thread.sleep(1000);
		
		bankPayment.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Bank Payment");
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div")).size();
		
		System.out.println( "Button Size " + size);
		
		
		int td= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr[1]/td")).size();
		
		
		if(td==1) {
			
			
			bankPayment.click();
		}
		
		else {
			
			
			int i=1;
			
			int pending=0;
			int approved=0;
			
			
			
			while(i<=size-2) {
				
				String text=d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[9]/div[1]")).getText();
				System.out.println(text);
				
				if(text.equals("PENDING") && pending==0) {
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
					Thread.sleep(1000);
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[1]")).click();
					Thread.sleep(1000);
					
					ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
					d.switchTo().window(tabs2.get(1));
					
					Thread.sleep(1000);
					
					d.close();
					
					Thread.sleep(1000);
					
					ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
					d.switchTo().window(tabs1.get(0));
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
					Thread.sleep(1000);
					
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/button[1]")).click();
					Thread.sleep(1000);
					
					d.getWindowHandle();
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]")).click();
					Thread.sleep(1000);
					
					pending = 1;
					
				}
				
				else if(text.equals("APPROVED") && approved==0) {
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/button[1]")).click();
					Thread.sleep(1000);
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div["+size+"]/table[1]/tbody[1]/tr["+i+"]/td[10]/div[1]/div[1]/a[1]")).click();
					Thread.sleep(1000);
					
					ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
					d.switchTo().window(tabs2.get(1));
					
					Thread.sleep(1000);
					
					d.close();
					
					Thread.sleep(1000);
					
					ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
					d.switchTo().window(tabs1.get(0));
					
					Thread.sleep(1000);
					
					approved=1;
					
				}
				
				else {
					
					
					break;
				}
				
				i++;
				
			}
			
		}
		
		System.out.println("Checkout from Bank Payment");
		
		

	}
		
		
}
	


