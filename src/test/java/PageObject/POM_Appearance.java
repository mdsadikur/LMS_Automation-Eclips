package PageObject;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Appearance {
	
	WebDriver driver;
	String theme_name;
	
	public POM_Appearance(WebDriver Driver) {
		
		driver= Driver;
		PageFactory.initElements(driver, this);
		theme_name = this.name();
	}
	
	//apprearance
	@FindBy(xpath = "//span[contains(text(),'Appearance')]")
	WebElement appearance;
	
	//themes
	@FindBy(xpath = "//a[contains(text(),' Themes')]")
	WebElement themes;
	
	//import demo data
	@FindBy(xpath = "//a[contains(text(),' Import Demo Data')]")
	WebElement import_demo_data;
	
	//Theme customize
	@FindBy(xpath = "//a[contains(text(),' Theme Customize')]")
	WebElement theme_customize;
	
	//add theme
	@FindBy(xpath = "//a[@class='primary-btn radius_30px mr-10 fix-gr-bg position_right']")
	WebElement add_theme;
	
	//theme name
	@FindBy(xpath = "//input[@class='primary_input_field']")
	WebElement Theme_name;
	
	//Save theme
	@FindBy(xpath = "(//button[@class='primary-btn semi_large2 fix-gr-bg'])[2]")
	WebElement save_theme;
	
	//select theme
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[2]")
	WebElement select_theme1;
	
	//edit theme
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[6]/div/div/a[1]")
	WebElement edit_theme;
	
	//clone theme
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[6]/div/div/a[2]")
	WebElement clone_theme;
	
	//select theme
	@FindBy(xpath = "(//button[@class='btn btn-secondary dropdown-toggle'])[1]")
	WebElement select_theme2;
	
	//theme delete
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/div/a[3]")
	WebElement themedelete2;
	
	//theme delete confirm
	@FindBy(xpath = "//*[@id=\"deletebackground_settingModal7\"]/div/div/div[2]/div[2]/button[2]")
	WebElement theme_delete_confirm2;
	
	//theme delete
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/div/div/a[3]")
	WebElement themedelete1;
	
	//theme delete confirm
	@FindBy(xpath = "(//button[contains(text(),'Delete')])[2]")
	WebElement theme_delete_confirm1;
	//*[@id="deletebackground_settingModal23"]/div/div/div[2]/div[2]/button[2]
	
	/*
	 * 
	 * 
	 */
	public String name() {
		
		
		return RandomStringUtils.randomAlphabetic(5); 
	}
	
	public void clickappearanceButton() throws InterruptedException {
		
		
		System.out.println("Entered at Appearance");
		
		//appearance
		appearance.click();
		Thread.sleep(2000);
		
		//themes
		themes.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter in Themes");
		
		//import_demo_data
		import_demo_data.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter in import_demo_data");
		
		//theme_customize
		theme_customize.click();
		Thread.sleep(2000);
		System.out.println("Successfully Enter in theme_customize");
		
		//add_theme
		add_theme.click();
		Thread.sleep(2000);
		
		//Theme_name
		Theme_name.sendKeys(theme_name);
		Thread.sleep(2000);
		
		//save_theme
		save_theme.click();
		Thread.sleep(2000);
		System.out.println("Successfully saved in theme");
		
		int i =1;
		int active = 0;
		int make_default = 0;
		
		int size = driver.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[5]")).size();
		System.out.println(size);
		
		while(i<=size) {
		String str = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+i+"]/td[5]")).getText().trim();
		//*[@id="DataTables_Table_0"]/tbody/tr[2]/td[5]/span
		System.out.println(str);
		
		if(str.matches("ACTIVE") && active == 0) {
			
			//theme_customize
			theme_customize.click();
			Thread.sleep(2000);
			active =1;
		}
		
		else if(str.matches("MAKE DEFAULT") && make_default == 0){
			
			driver.findElement(By.xpath("//tbody/tr["+i+"]/td[6]/div[1]/button[1]")).click();
			Thread.sleep(2000);
			
			//themedelete1
			driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr["+i+"]/td[6]/div/div/a[3]")).click();
			Thread.sleep(2000);
			
			//theme_delete_confirm1
			theme_delete_confirm1.click();
			Thread.sleep(2000);
			make_default = 1;
		}
		i++;
		}
		
		System.out.println("Successfully Checkout from Appearance");
		}
	
		
	
	}

		
		
	
	
	


