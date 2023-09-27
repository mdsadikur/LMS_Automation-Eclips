package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;



public class POM_MyQuiz {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	@FindBy(xpath="//*[@id=\"mobile-menu\"]/li[4]/a")
	WebElement quiz;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'My Quizzes')]")
	WebElement myQuiz;
	
	@FindBy(xpath="/html/body/div[2]/section/div[2]/div/div/div/div/div[3]/div[1]/div/div/a/h4")
	WebElement quizDetails;  
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div/div/div[1]/div/div/div[2]/a")
	WebElement startQuiz;
	
	@FindBy(xpath="//*[@id=\"QuizStartBtn\"]")
	WebElement startQuizYes;
	
	// view History
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div/div/div[1]/div/div/div[2]/button")
	WebElement viewHistory;
	
	@FindBy(xpath="//*[@id=\"historyDiv\"]/table/tbody/tr[2]/td[5]/a")
	WebElement seeResult;
	
	
	
	
	
	
	
	public POM_MyQuiz(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void MyQuiz() throws InterruptedException {
		
//		Thread.sleep(5000);
//		
//		profileIcon.click();
//		Thread.sleep(1000);
//		
//		dashboard.click();
//		Thread.sleep(100);
		
		
		myQuiz.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at My Quiz");
		
		quizDetails.click();
		Thread.sleep(1000);
		
		startQuiz.click();
		Thread.sleep(1000);
		

		d.getWindowHandle();

		startQuizYes.click();
		Thread.sleep(1000);
		int i=1;
		int size= d.findElements(By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a")).size(); 
		System.out.println(size);		
		
		while(i<=size) {
			
			int sizeOfUI=d.findElements(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/ul")).size();
			System.out.println(sizeOfUI);
			if(sizeOfUI==1) {
				
				d.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/ul[1]/li[2]/label[1]")).click();
				Thread.sleep(1000);		//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/label[1]
				
				System.out.println(i);
				System.out.println("Before");
				d.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/div[3]/span[1]")).click();
				Thread.sleep(2000);  
				
				System.out.println("After");
				
			}
			
			else {
				
				d.findElement(By.xpath("//*[@id=\"pills-8\"]/div[3]/div/div[3]/div[2]")).sendKeys("This is the answer.");
				Thread.sleep(2000);  
				
				System.out.println(i);
				
				d.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div["+i+"]/div[4]/button[1]")).click();
				Thread.sleep(4000);  
				
				d.getWindowHandle();
				
				d.findElement(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[3]/div[1]/button[2]")).click();
				Thread.sleep(1000);
				
				
			}
	
			i++;
			
		}
		
		d.navigate().back();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("Checkout from My quiz");
		
	}
	
	public void viewResult() throws InterruptedException {
		
//		profileIcon.click();
//		Thread.sleep(1000);
//		
//		dashboard.click();
//		Thread.sleep(100);
		
//		myQuiz.click();
//		Thread.sleep(1000);
		
//		d.findElement(By.xpath("//body[1]/div[2]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/h4[1]")).click();
//		Thread.sleep(1000);
		
		viewHistory.click();
		Thread.sleep(1000);
		
		seeResult.click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/img[1]")).click();
		Thread.sleep(1000);
		
		d.get("https://spondan.com/spn19/production/qa/student-dashboard");
		Thread.sleep(1000);
		
	}
	
	
	
	

}
