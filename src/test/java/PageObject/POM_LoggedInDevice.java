package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Common_Method.CommonMethod;

public class POM_LoggedInDevice {
	
	
	WebDriver driver;
	
	public POM_LoggedInDevice(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
	}
	CommonMethod upload = new CommonMethod();
	//logged in device
	@FindBy(xpath = "//span[contains(text(),'Logged In Devices')]")
	WebElement loggedInDevices;
	
	//Logout
	@FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[6]/a")
	WebElement Logout;
	
	//password
	@FindBy(name = "password")
	WebElement password;
	
	//Logout confirm
	@FindBy(xpath = "(//button[@class='link_value theme_btn small_btn4'])[1]")
	WebElement logout_confirm;
	
	/*
	 * 
	 * 
	 */
	public void clickLoggedInDeviceButton() throws InterruptedException {
		
		//loggedInDevices
		loggedInDevices.click();
		Thread.sleep(2000);
		System.out.println("Successfully enter logged in device");
		
		//Logout
		Logout.click();
		Thread.sleep(2000);
		
		//password
		password.sendKeys("12345678");
		Thread.sleep(2000);
		
		//logout_confirm
		logout_confirm.click();
		Thread.sleep(2000);
		System.out.println("Successfully logged out from device");
	}

}
