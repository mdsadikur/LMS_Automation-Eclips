package PageObject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Utilities {
	
	WebDriver d;
	
	Random rm = new Random();
	
	@FindBy(xpath="//span[contains(text(),'Utility')]")
	WebElement utilities;
	
	
	// preloader Settings
	
	@FindBy(xpath="//a[contains(text(),' Preloader Setting')]")
	WebElement preloaderSettings;
	
	@FindBy(xpath="//*[@id=\"general_info_sbmt_btn\"]")
	WebElement savePreloader;
	
	// error log
	
	@FindBy(xpath="//a[contains(text(),' Error Log')]")
	WebElement errorLog;
	
	@FindBy(xpath="//*[@id=\"emptyTable\"]")
	WebElement emptyTableLog;
	
	@FindBy(xpath="//*[@id=\"emptyTableModel\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement emptyTableConfirmationLog;
	
	
	
	//IP Block
	
	@FindBy(xpath="//a[contains(text(),' Ip Block')]")
	WebElement ipBlock;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/a")
	WebElement addIP;
	
	@FindBy(xpath="//*[@id=\"ipAddress\"]")
	WebElement deviceIP;
	
	@FindBy(xpath="//*[@id=\"add_new_ip\"]/div/div/div[2]/form/div[1]/div[2]/div/input")
	WebElement addReason;
	
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement saveIP;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/button[1]")
	WebElement action;
	
	@FindBy(xpath="//*[@id=\"lms_table\"]/tbody/tr[1]/td[3]/div/div/a")
	WebElement delete;
	
	@FindBy(xpath="//*[@id=\"delete_block_ip\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement ok;
	
	// geo location
	
	@FindBy(xpath="//a[contains(text(),' Geo Location')]")
	WebElement geoLocation;
	
	@FindBy(xpath="//*[@id=\"emptyTable\"]")
	WebElement emptyTable;
	
	@FindBy(xpath="//*[@id=\"emptyTableModel\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement emptyTableConfirmation;
	
	// maintenance
	
	@FindBy(xpath="//a[contains(text(),' Maintenance')]")
	WebElement maintenance;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[2]/div/button")
	WebElement updateMaintenance;
	
	
	// Utilities
	
	@FindBy(xpath="//a[contains(text(),' Utilities')]")
	WebElement utilitiesSubMenu;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[2]/div/div/div[1]/a/div/h3")
	WebElement cacheClear;
	
	
	public POM_Utilities(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
		
		
	}
	
	public void preloaderSettings() throws InterruptedException {
		
		
		utilities.click();
		Thread.sleep(1000);
		
		System.out.print("Entered at Preloader Settings");
		
		preloaderSettings.click();
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/input[1]")).size();
		int i=1;
		System.out.println(size);
		
		while(i<=size) {
			
			if(d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div["+i+"]/input[1]")).isSelected()) {
				
				
				d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div["+(i+1)+"]/label[1]")).click();
				Thread.sleep(1000);
				
				break;
			}
			
			i++;
			
			
		}
		
		savePreloader.click();
		
		System.out.println("Checkout from Preloader Settings");
		
		
	}
	
	public void errorLog() throws InterruptedException {
		
//		utilities.click();
//		Thread.sleep(1000);
		
		errorLog.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Error log");
		
		emptyTableLog.click();
		Thread.sleep(1000);
		
		emptyTableConfirmationLog.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Error Log");
	}
	
	public void ipBlock() throws InterruptedException {
		
//		utilities.click();
//		Thread.sleep(1000);
		
		ipBlock.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at IP Block");
		
		
		addIP.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		int ip= rm.nextInt(255);
		
		String conIP= Integer.toString(ip);
		
		deviceIP.sendKeys(conIP + "." + conIP + "."+ conIP + "." + conIP );
		Thread.sleep(1000);
		
		addReason.sendKeys("Bad Manner");
		Thread.sleep(1000);
		
		saveIP.click();
		Thread.sleep(1000);
		
		action.click();
		Thread.sleep(1000);
		
		delete.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		ok.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from IP Block");
	}
	
	public void geoLocation() throws InterruptedException {
		
//		utilities.click();
//		Thread.sleep(1000);
		
		geoLocation.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Geo Location");
		
		
		emptyTable.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		emptyTableConfirmation.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Geo Location");
	}
	
	public void maintenance() throws InterruptedException {
		
//		utilities.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Maintinance");
		
		maintenance.click();
		Thread.sleep(1000);
		
		updateMaintenance.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Maintinance");
		
	}
	
	public void utilitiesSubmenu() throws InterruptedException {
		
//		utilities.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Utilities");
		
		utilitiesSubMenu.click();
		Thread.sleep(1000);
		
		cacheClear.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Utilities");
	}
	
	

}
