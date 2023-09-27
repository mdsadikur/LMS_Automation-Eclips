package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;

public class POM_Dashboard {
	
	WebDriver driver;
	
	public POM_Dashboard(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	CommonMethod upload = new CommonMethod();
	
	//Dashboard
	@FindBy(xpath = "(//span[contains(text(),'Dashboard')])")
	WebElement Dashboard;
	
	//notification
	@FindBy(xpath = "//span[@class='pulse-ring notification_count_pulse']")
	WebElement notification;
	
	//see more notification
	@FindBy(xpath = "(//a[contains(text(),'See More')])")
	WebElement see_more_notification;
	
	//notification select
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement notification_select;
	
	//notification view
	@FindBy(xpath = "(//a[contains(text(),'View')])[1]")
	WebElement notification_view;
	
	//notification delete
	@FindBy(xpath = "(//a[contains(text(),'Delete')])[1]")
	WebElement notofication_delete;
	
	//notification delete confirm
	@FindBy(xpath = "//*[@id=\"delete_link\"]")
	WebElement notification_delete_confirm;
	
	//notification mark as read
	@FindBy(xpath = "(//a[contains(text(),'Mark As Read')])[1]")
	WebElement notification_mark_as_read;
	
	//communication
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/ul/li[2]/a/span")
	WebElement communication;
	
	//language
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div[1]/div/span")
	WebElement Language;
	
	//bangla language
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div[1]/div/ul/li[2]")
	WebElement bangla_language;
	
	//English language
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div[1]/div/ul/li[3]")
	WebElement english_language;
	
	
	
	//home button
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div[2]/div[1]")
	//*[@id="main-nav-for-chat"]/div/div/div/div[6]/div[2]/div[1]
	WebElement home_button;
	
	//view profile
	@FindBy(xpath = "//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div/div[2]/div[2]/a[1]/span")
	WebElement view_profile;
	
	//profile info save
	@FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div/div[2]/div/div[1]/form/div/div[19]/div/button")
	WebElement profile_info_save;
	
	//password update
	@FindBy(xpath = "//*[@id=\"main-content\"]/section/div/div/div[2]/div/div[2]/form/div/div[4]/div/button")
	WebElement password_update;
	
	//badge next button
	@FindBy(xpath = "//i[@class='fa fa-angle-right']")
	WebElement badge_next_button;
	
	//badge previous button
	@FindBy(xpath = "//i[@class='fa fa-angle-left']")
	WebElement badge_previous_button;
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public void clickDashboard() throws InterruptedException {
		
		//Dashboard
		Dashboard.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter Dashboard");
		
		//notification
		notification.click();
		Thread.sleep(2000);
		System.out.println("Successfully Showing notification");
		
	
		
		//see_more_notification
		see_more_notification.click();
		Thread.sleep(2000);
		
		
		
		//notification_select
		notification_select.click();
		Thread.sleep(2000);
		
		int size = driver.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]/div/div/a")).size();
		
		System.out.println(size);
		
		if(size == 1) {
			
			//notofication_delete
			notofication_delete.click();
			Thread.sleep(2000);
			
			//notification_delete_confirm
			notification_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Successfully deleted notification");
			
		}
		
		else {
			
			//notification_view
			notification_view.click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			System.out.println("Successfully viewd notification");
			
			//notification_select
			notification_select.click();
			Thread.sleep(2000);
			
			//notofication_delete
			notofication_delete.click();
			Thread.sleep(2000);
			
			//notification_delete_confirm
			notification_delete_confirm.click();
			Thread.sleep(2000);
			System.out.println("Successfully deleted notification");
			
		}
		
		
		
		//Dashboard
		Dashboard.click();
		Thread.sleep(2000);
		
		//notification
		notification.click();
		Thread.sleep(2000);
		
		//notification_mark_as_read
		notification_mark_as_read.click();
		Thread.sleep(10000);
		System.out.println("Successfully Enter notification_mark_as_read");
		
		//communication
		communication.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter communication");
		
		//Dashboard
		Dashboard.click();
		Thread.sleep(2000);
		
		//Language
		Language.click();
		Thread.sleep(2000);
		
		//bangla_language
		bangla_language.click();
		Thread.sleep(10000);
		
		//Language
		Language.click();
		Thread.sleep(2000);
		
		//english_language
		english_language.click();
		Thread.sleep(10000);
		
		//home_button
		home_button.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter home button");
		
		//view_profile
		view_profile.click();
		Thread.sleep(2000);
		
		upload.scroll();
		Thread.sleep(2000);
		
		//profile_info_save
		profile_info_save.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved profile info");
		
		//password_update
		password_update.click();
		Thread.sleep(2000);
		System.out.println("Successfully Update password");
		
		//Dashboard
		Dashboard.click();
		Thread.sleep(2000);
		
		upload.scroll();
		Thread.sleep(2000);
		
		//badge_next_button
		badge_next_button.click();
		Thread.sleep(2000);
		
		//badge_next_button
		badge_next_button.click();
		Thread.sleep(2000);
		
		//badge_next_button
		badge_next_button.click();
		Thread.sleep(2000);
		
		//badge_previous_button
		badge_previous_button.click();
		Thread.sleep(2000);
		
		//badge_previous_button
		badge_previous_button.click();
		Thread.sleep(2000);
		
		//badge_previous_button
		badge_previous_button.click();
		Thread.sleep(2000);
		System.out.println("Successfully Checkout from dashboard");
		
		
	}

}
