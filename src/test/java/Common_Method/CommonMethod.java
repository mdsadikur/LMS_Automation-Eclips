package Common_Method;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;

import base.DriverSetup;


public class CommonMethod extends DriverSetup{
	
	public String fileUpload(String fileLocation) throws AWTException, InterruptedException {
		
		// using robot class 
		Robot rb= new Robot(); 
		rb.delay(2000);

		// put path to file in a clipboard 
		StringSelection ss= new StringSelection(fileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// ctrl v 
		rb.keyPress(KeyEvent.VK_CONTROL);// press on control key
		rb.keyPress(KeyEvent.VK_V);// press on v

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// enter key 
		rb.keyPress(KeyEvent.VK_ENTER);// press on enter key
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		return fileLocation;	

	}
	
	public String getFilePath(String file) {
		
		
		File filepath=new File("src/test/File/" + file);
		//WebElement fileobj = driver.findElement(By.name("toplogoupload"));
		//fileobj.sendKeys("\ntwinelogin.jpg");
		String Filepath=filepath.getAbsolutePath();
		return Filepath.trim();
	}
	
	//For going homepage
	public void homepage() throws AWTException, InterruptedException{
		
		driver.get("https://spondan.com/spn19/production/qa/");
	
	}
	
	//For video lesson
	public String VideoLessonUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For icon
	public String iconUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For course_thumbnail
	public String thumbnailUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For JPEG file
	public String JPEGUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For PDF File
	public String PDFUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For Certificate File
	public String Certificatepload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For Text File
	public String textUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For slider image
	public String sliderUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For profile image
	public String profileUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For sponsor image
	public String sponsorUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	//For login image
	public String loginUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}
	
	
	//for scrolling
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	/*
	 * 
	 */
	//scrolling
	public void scrollhalf() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)");
	}
	
	/*
	 * 
	 */
	//for switch previous window
	public void switchpreviousWindow() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));     //switch to new tab
	}
	
	public void switchnextWindow() {
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));     //switch to new tab
	}
	
	//For login image
	public String importstudentUpload(String profile_image) throws AWTException, InterruptedException {

		return fileUpload(profile_image);
	
	}

}
