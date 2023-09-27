package PageObject;

import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Blog {
	
	WebDriver d;
	
	Random rm= new Random();
	
	@FindBy(xpath="//span[contains(text(), 'Blogs')]")
	WebElement blogs;
	
	// category
	
	@FindBy(xpath="(//a[contains(text(), ' Category')])[2]")
	WebElement category;
					//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]
	@FindBy(name = "title[en]")
	WebElement categoryTitle;
					//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement saveCategory;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/button[1]")
	WebElement selectCategory;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/a[1]")
	WebElement editCategory;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement updateCategory;
	
	
	
	// post
	
	@FindBy(xpath="//a[contains(text(), ' Post')]")
	WebElement post;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/ul/li/a")
	WebElement addBlog;
	
	@FindBy(xpath="//*[@id=\"elementen\"]/div/div[1]/div/input")
	WebElement blogTitle;
	
	@FindBy(xpath="//*[@id=\"elementen\"]/div/div[2]/div/div/div[3]/div[2]/p")
	WebElement description;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section/div/div/div[2]/div/div/div/form/div[2]/div[2]/div/span")
	WebElement categorySelect;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/ul[1]/li[2]")
	WebElement categorySelection;
	

	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement saveBlog;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/button[1]")
	WebElement action;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/a[1]")
	WebElement viewBlog;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/div[1]/a[2]")
	WebElement editBlog;
	
	@FindBy(xpath="//*[@id=\"save_button_parent\"]")
	WebElement updateBlog;
	
	
	
	public POM_Blog(WebDriver driver) {
		
		d=driver;
		PageFactory.initElements(d, this);
		
		
	}
	
	public void category() throws InterruptedException {
		
		System.out.println("Entered at Category");
		
		blogs.click();
		Thread.sleep(1000);
		
		category.click();
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div/div[1]/div[1]/div[1]/input[1]")).size();

		System.out.println(size);
		
//		d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div["+(size-1)+"]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test Category");
//		Thread.sleep(1000);
		
		categoryTitle.sendKeys("Blog category 1");
		Thread.sleep(2000);
		
		saveCategory.click();
		Thread.sleep(1000);
		
		selectCategory.click();
		Thread.sleep(1000);
		
		editCategory.click();
		Thread.sleep(1000);
		
		updateCategory.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout From Category");
	}
	
	public void post() throws InterruptedException {
		
		System.out.println("Entered at Post");
		
		blogs.click();
		Thread.sleep(1000);
		
		post.click();
		Thread.sleep(1000);
		
		blogAdding();
		
		postActions();
		
		System.out.println("Checkout from Post");
		
		
	}
	
	
	public void blogAdding() throws InterruptedException {
		
		addBlog.click();
		Thread.sleep(1000);
		
		String name= RandomStringUtils.randomAlphanumeric(6);
		
		blogTitle.sendKeys(name); 
		Thread.sleep(1000);
		
		String para= RandomStringUtils.randomAlphanumeric(300);
		
		description.sendKeys(para);
		Thread.sleep(1000);
		
		categorySelect.click();
		Thread.sleep(1000);
		
		categorySelection.click();
		Thread.sleep(1000);
		
		saveBlog.click();
		Thread.sleep(1000);
	}
	
	
	public void postActions() throws InterruptedException {
		
		action.click();
		Thread.sleep(1000);
		
		viewBlog.click();
		Thread.sleep(1000);
		
		ArrayList<String> tabs2 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs2.get(1));
		
		Thread.sleep(1000);
		
		d.close();
		
		ArrayList<String> tabs1 = new ArrayList<String>(d.getWindowHandles());
		d.switchTo().window(tabs1.get(0));
		
		Thread.sleep(1000);
		
		action.click();
		Thread.sleep(1000);
		
		editBlog.click();
		Thread.sleep(1000);
		
		updateBlog.click();
		Thread.sleep(1000);
	}

}
