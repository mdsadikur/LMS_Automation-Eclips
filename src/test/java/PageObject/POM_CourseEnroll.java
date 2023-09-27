package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_CourseEnroll {
	
	WebDriver d;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[1]/div")
	WebElement profileIcon;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div[2]/div[2]/a[1]")
	WebElement home;
	
	// course enroll
	
	@FindBy(xpath="//*[@id=\"mobile-menu\"]/li[2]/a")
	WebElement course;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/a/div/img")
	WebElement cart;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div[2]/div[2]/div[2]/a[2]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"submitBtn\"]")
	WebElement placeOrder;

	// class enroll
	
	@FindBy(xpath="//*[@id=\"mobile-menu\"]/li[3]/a")
	WebElement classSubmenu;

	public POM_CourseEnroll(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
	}
	
	public void enrollCourse() throws InterruptedException {
		
		Thread.sleep(5000);
		
		profileIcon.click();
		Thread.sleep(1000);
		
		home.click();
		Thread.sleep(1000);
		
		course.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Enroll Course");
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		js.executeScript("window.scroll(0,400)");
		Thread.sleep(1000);
		
		int i=2;
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div/div[1]/a[1]/div[1]/div[1]")).size();
		System.out.println(size);
		
		while(i<=size+1) {
			
			int size2=d.findElements(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/div[1]/div[1]/a")).size();
			System.out.println(size2);
			
			if(size2==1) {
				
				
				String text= d.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/a[1]/div[1]/div[2]/span[1]/span[1]")).getText();
				System.out.println(text);
				
				if(text.equals("Free")) {
					
					d.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/div[1]/div[1]/a[1]")).click();
					Thread.sleep(1000);
					
					courseView();
					
					break;
					
				}
				
				else {
					
					
					coursePurchase(i);
					break;
					
				}
	
			}

			i++;
			
		}
		
		System.out.println("Checkout from Enroll Course");
	}
	
	

	
	
	public void courseView() throws InterruptedException {
		
		
		d.findElement(By.xpath("//*[@id=\"content-area\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/duv/div[2]/div/div/a/h4")).click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"Curriculum-tab\"]")).click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"Instructor-tab\"]")).click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"Reviews-tab\"]")).click();
		Thread.sleep(1000);
		
		int size3= d.findElements(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]/div[2]/div")).size();
		
		System.out.println(size3);
		
		if(size3 > 0) {
			
			d.findElement(By.xpath("//*[@id=\"QA-tab\"]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"mainComment\"]/form/div/div[2]/div/textarea")).sendKeys("How to purchase this course ?");
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"mainComment\"]/form/div/div[3]/button")).click();
			Thread.sleep(1000);
			
			
		}
		
		else {
			
			d.findElement(By.xpath("//*[@id=\"Reviews\"]/div/div[3]/div/div[2]/div/div/a/label[3]")).click();
			Thread.sleep(1000);
			
			d.getWindowHandle();
			
			d.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[1]/div/textarea")).sendKeys("Average");
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/div/button[2]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"QA-tab\"]")).click();
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"mainComment\"]/form/div/div[2]/div/textarea")).sendKeys("How to purchase this course ?");
			Thread.sleep(1000);
			
			d.findElement(By.xpath("//*[@id=\"mainComment\"]/form/div/div[3]/button")).click();
			Thread.sleep(1000);
			
			
			
			
		}
		
		
	}
	
	public void coursePurchase(int i) throws InterruptedException {
		
		d.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		
//		cart.click();
		Thread.sleep(3000);
		
		checkout.click();
		Thread.sleep(1000);
		
		placeOrder.click();
		Thread.sleep(1000);
		
		d.findElement(By.xpath("//*[@id=\"mainFormData\"]/div[1]/div[2]/div[2]/div/div/div/div/div[6]/div/form/div/a")).click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		d.findElement(By.xpath("//*[@id=\"infix_payment_form1\"]/div[2]/button[2]")).click();
		Thread.sleep(1000);
		
	
		
	}
	
	

}
