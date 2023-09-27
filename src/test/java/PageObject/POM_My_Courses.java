package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_My_Courses {
	
	WebDriver driver;
	
	public POM_My_Courses(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//body/div[3]/div[1]/header/div/div/div/div[1]/div/div[3]/div/div[1]/span")
	WebElement profileIcon;
	
	
	@FindBy(xpath="//body/div[3]/div[1]/header/div/div/div/div[1]/div/div[3]/div/div[2]/a[1]")
	WebElement dashboard;
	
	//My courses
	@FindBy(xpath = "//span[contains(text(),'My Courses')]")
	WebElement My_courses;
	
	//enter course
	@FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/a/h4")
	WebElement enter_course;
	
	//video play
	@FindBy(id = "video-id_fluid_state_button")
	WebElement video_play;
	
	//mark as complete
	@FindBy(xpath = "//button[contains(text(),' Mark as Complete')]")
	WebElement mark_as_complete;
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public void click_My_courses_button() throws InterruptedException {
		
		Thread.sleep(5000);
//		
//		
		profileIcon.click();
		Thread.sleep(1000);
		
		dashboard.click();
		Thread.sleep(100);
//		
		System.out.println("Entered at My course");
		
		
		//My_courses
		My_courses.click();
		Thread.sleep(2000);
		
		//enter_course
		enter_course.click();
		Thread.sleep(2000);
		
		int size = driver.findElements(By.xpath("//body[1]/div[3]/div[1]/div[3]/div[1]/div")).size();
		System.out.println("Chapter size is "+size);
		int i =1;
			
		
		while(i<=size) {

				
				
				
				int size2 = driver.findElements(By.xpath("//body[1]/div[3]/div[1]/div[3]/div[1]/div["+i+"]/div[2]/div[1]/div[1]/div/a[1]/div[1]/span[1]")).size();
			    System.out.println("Lesson size is "+size2);
				
				for(int j=1;j<=size2;j++) {
					
					
					System.out.println(j);
					int complete = driver.findElements(By.xpath("/html/body/div[3]/button")).size();
					System.out.println("Button size is "+complete);
					
				
						if(complete==1){
							Thread.sleep(5000);
							mark_as_complete.click();
							Thread.sleep(2000);

							}
						
						
						else {
							
			
								video_play.click();
								Thread.sleep(7000);
		                         
								
							
						}

		            }
				
			i++;
			Thread.sleep(3000);	
				
			
		
		}
		
		int buttonSize= driver.findElements(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/a")).size();
		
		if(buttonSize==1) {
			
			driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			
		}
		
		else {
			
			
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		
		
		
			
//			int certificate = driver.findElements(By.xpath("//a[@class='theme_btn certificate_btn mt-5']")).size();
//			System.out.println("certificate button size is "+ certificate);
//			
//			if(certificate == 1) {
//				
//				driver.findElement(By.xpath("//a[@class='theme_btn certificate_btn mt-5']")).click();
//				Thread.sleep(2000);
//				
//			}
//			
//			else {
//				
//				//home
//				driver.findElement(By.xpath("//*[@id=\"sticky-header\"]/div/div/div/div/div[1]/div[1]/a/img")).click();
//				Thread.sleep(2000);
//				
//				//dashboard
//				driver.findElement(By.xpath("//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[1]/span")).click();
//				Thread.sleep(2000);
//				
//				//dashboard
//				driver.findElement(By.xpath("//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[3]/div/div[2]/a[1]")).click();
//				Thread.sleep(2000);
//			}
		System.out.println("Checkout from My Course");	
	}
}
	



