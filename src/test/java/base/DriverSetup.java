package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
public static WebDriver driver= null;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();		
//		driver = new FirefoxDriver();
		
//		String baseurl = "https://spondan.com/spn19/production/qa/login";
		String baseurl = "https://spondan.com/spn19/production/630/login";
		//String baseurl = "https://freeschoolsoftware.in/spn19/560/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//login
		driver.findElement(By.name("email")).sendKeys("spn19@spondonit.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='theme_btn text-center w-100']")).click();
	}
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
