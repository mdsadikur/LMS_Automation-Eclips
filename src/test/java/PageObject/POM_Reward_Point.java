package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Reward_Point {
	
	WebDriver driver;
	
	public POM_Reward_Point(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	
	//reward point
	@FindBy(xpath = "//span[contains(text(),'Reward Point')]")
	WebElement reward_point;
	
	//convert now
	@FindBy(xpath = "//a[contains(text(),'Convert Now')]")
	WebElement convert_now;
	
	//Browse Course
	@FindBy(xpath = "//a[contains(text(),'Browse Course')]")
	WebElement Browse_course;
	
	//confirm convert
	@FindBy(xpath = "//button[contains(text(),' Convert Now')]")
	WebElement confirm_convert;
	
	/*
	 * 
	 * 
	 */
	
	public void clickRewardPoint() throws InterruptedException {
		
		//reward_point
		reward_point.click();
		System.out.println("Successfully Enter Reward Point");
		
		int size = driver.findElements(By.xpath("/html/body/div[2]/section/div[2]/div[1]/div/div[2]/div[1]/div/div/div[2]/div/div[2]/a")).size();
		System.out.println("convert size is "+size);
		
		if(size > 0) {
			
			//Browse_course
			Browse_course.click();
			Thread.sleep(2000);
			driver.navigate().back();
			
			//convert_now
			convert_now.click();
			Thread.sleep(2000);
			
			//confirm_convert
			confirm_convert.click();
			Thread.sleep(2000);
			System.out.println("Successfully converted the point");
			System.out.println("Successfully check from reward point");
		}
	}

}
