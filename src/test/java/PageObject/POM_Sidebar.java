package PageObject;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Sidebar {
	
	WebDriver d;
	
	CommonMethod cm= new CommonMethod();
	
	
	
	@FindBy(xpath="//span[contains(text(),'Sidebar Manager')]")
	WebElement sidebarManager;
	
	@FindBy(xpath="//*[@id=\"headingOne\"]/h5")
	WebElement addSection;
	
	@FindBy(xpath="//*[@id=\"elementen\"]/div/div/div/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"addSectionBtn\"]")
	WebElement saveName;
	
	
	@FindBy(xpath="//*[@id=\"accordion\"]/div/div/span/a/i")
	WebElement subMenuAdd;
	
	@FindBy(xpath="//*[@id=\"element2en\"]/div/div/div/input")
	WebElement subMenuName;
	
	@FindBy(xpath="//*[@id=\"sectionUpdate\"]")
	WebElement subMenuSave;
	
	@FindBy(xpath="//*[@id=\"accordion\"]/div/div/i[1]")
	WebElement subMenuDelete;
	
	@FindBy(xpath="//*[@id=\"heading_1\"]/div[2]/div/i")
	WebElement cross;
	
	@FindBy(xpath="//*[@id=\"resetMenu\"]")
	WebElement defaultButton;
	
	
	
	
	
	public POM_Sidebar(WebDriver driver) {
		
		d= driver;
		PageFactory.initElements(d, this);
	}
	
	public void sideBar() throws InterruptedException {
		
		sidebarManager.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Sidebar");
		
		addSection.click();
		Thread.sleep(1000);
		
		String menuName= RandomStringUtils.randomAlphanumeric(4);
		
		name.sendKeys(menuName);
		Thread.sleep(1000);
		
		saveName.click();
		Thread.sleep(3000);

		
	
		cross.click();
		Thread.sleep(2000);
		
		defaultButton.click();
		Thread.sleep(3000);
		
		
		System.out.println("Checkout from Sidebar");
		
//		cm.scroll();
//		Thread.sleep(2000);
		
//		subMenuAdd.click();
//		Thread.sleep(2000);
//		System.out.println("Click on Add");
//		
//		d.getWindowHandle();
//		
//		subMenuName.clear();
//		subMenuName.sendKeys("Test");
//		Thread.sleep(2000);
//		
//		System.out.println("Edited");
//		
//		subMenuSave.click();
//		Thread.sleep(2000);
//		
//		System.out.println("save");
//		
//		subMenuDelete.click();
//		Thread.sleep(2000);
//		
//		System.out.println("Click on Delete");
		
		
	}

}
