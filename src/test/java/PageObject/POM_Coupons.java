package PageObject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Coupons {
	
	WebDriver driver = null;
	
	public POM_Coupons(WebDriver driver) {
		this.driver = driver;
	}
	
	By Coupons = By.xpath("//span[contains(text(),'Coupons')]");
	
	By CouponList = By.xpath("//a[contains(text(),'Coupons List')]");
	
	By CouponList_CouponTitle = By.xpath("//*[@id=\"title\"]");
	
	By CouponList_CouponCode = By.xpath("//*[@id=\"code\"]");
	
	By CouponList_MinPurchase = By.xpath("//*[@id=\"number\"]");
	
	By CouponList_MaxDiscount = By.xpath("//*[@id=\"number2\"]");
	
	By CouponList_Amount = By.xpath("//*[@id=\"number3\"]");
	
	By CouponList_Type = By.xpath("//*[@id=\"coupon-form\"]/div/div[6]/div/div/span");
	
	By CouponList_Type_Fixed = By.xpath("//*[@id=\"coupon-form\"]/div/div[6]/div/div/ul/li[1]");
	
	By CouponList_Limit = By.xpath("//*[@id=\"number4\"]");
	
	By CouponList_SaveButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	By CouponList_Search = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By CouponList_ActionPlusButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/th");
	
	By CouponList_SelectButton = By.xpath("//tbody/tr[2]/td[1]/ul[1]/li[4]/span[2]/div[1]/button[1]");
	
	By CouponList_Edit = By.xpath("//tbody[1]/tr[2]/td[1]/ul[1]/li[4]/span[2]/div[1]/div[1]/a[1]");
	
	By CouponList_UpdateButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	public void testcouponsearch() throws InterruptedException {
		int size = driver.findElements(By.xpath("//*[@id=\"lms_table\"]/tbody/tr")).size();
		
		for(int i=1; i<=size; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"lms_table\"]/tbody/tr["+i+"]")).getText();
			
			if(text.matches("Test Copuon"));
			
			driver.findElement(CouponList_ActionPlusButton).click();
			Thread.sleep(2000);
			
		}
		
	}
	
	public void couponlist() throws InterruptedException {
		
		System.out.println("Entered at Couponlist");
		
		driver.findElement(Coupons).click();
		Thread.sleep(2000);
		
		driver.findElement(CouponList).click();
		Thread.sleep(2000);
		
		//Add Coupons
		
		driver.findElement(CouponList_CouponTitle).sendKeys("Test Coupon");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_CouponCode).sendKeys("123");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_MinPurchase).sendKeys("10");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_MaxDiscount).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_Amount).sendKeys("500");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_Type).click();
		Thread.sleep(2000);
		
		driver.findElement(CouponList_Type_Fixed).click();
		Thread.sleep(2000);
		
		driver.findElement(CouponList_Limit).sendKeys("100");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		testcouponsearch();
		Thread.sleep(2000);
		
//		driver.findElement(CouponList_ActionPlusButton).click();
//		Thread.sleep(2000);
//		
		driver.findElement(CouponList_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(CouponList_Edit).click();
		Thread.sleep(2000);
		
		driver.findElement(CouponList_UpdateButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Couponlist");
	}
	
	By CommonCoupons = By.xpath("//a[contains(text(),'Common Coupons')]");
	
	By CommonCoupons_SearchBar = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By CommonCoupons_ActionPlusButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/th");
	
	By CommonCoupons_SelectButton = By.xpath("/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td/ul/li[4]/span[2]/div/button");
	
	
	
	public void commoncoupons() throws InterruptedException {
		
//		driver.findElement(Coupons).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Common Coupons");
		
		driver.findElement(CommonCoupons).click();
		Thread.sleep(2000);
		
		driver.findElement(CommonCoupons_SearchBar).sendKeys("Test Coupon");
		Thread.sleep(2000);
		
		driver.findElement(CommonCoupons_ActionPlusButton).click();
		Thread.sleep(2000);
		
		driver.findElement(CommonCoupons_ActionPlusButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Common Coupon");
	}
	
	
	By SingleCoupons = By.xpath("//a[contains(text(),'Single Coupons')]");
	
	By SingleCoupons_SelectCategory = By.xpath("//*[@id=\"coupon-form\"]/div/div[1]/div/div/span");
	
	By SingleCoupons_SelectCategory1 = By.xpath("//*[@id=\"coupon-form\"]/div/div[1]/div/div/ul/li[2]");
	
	By SingleCoupons_SelectSubCategory = By.xpath("//*[@id=\"subCategoryDiv\"]/div/span");
	
	By SingleCoupons_SelectCourse = By.xpath("//*[@id=\"CourseDiv\"]/div/span");
	
	By SingleCoupons_SelectCourse1 = By.xpath("//*[@id=\"CourseDiv\"]/div/ul/li[2]");
	
	By SingleCoupons_CouponTitle = By.xpath("//*[@id=\"title\"]");
	
	By SingleCoupons_CouponCode = By.xpath("//*[@id=\"code\"]");
	
	By SingleCoupons_MinPurchase = By.xpath("//*[@id=\"number\"]");
	
	By SingleCoupons_Amount = By.xpath("//*[@id=\"number3\"]");
	
	By SingleCoupons_Type = By.xpath("//*[@id=\"coupon-form\"]/div/div[9]/div/div/span");
	
	By SingleCoupons_TypeFixed = By.xpath("//*[@id=\"coupon-form\"]/div/div[9]/div/div/ul/li[1]");
	
	By SingleCoupons_Limit = By.xpath("//*[@id=\"number4\"]");
	
	By SingleCoupons_SaveButton= By.xpath("//*[@id=\"coupon-form\"]/div/div[13]/div/button");
	
	//Edit
	By SingleCoupons_Search = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By SingleCoupons_ActionPlusButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/th");
	
	By SingleCoupons_SelectButton = By.xpath("/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td/ul/li[4]/span[2]/div/button");
	
	By SingleCoupons_EditButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[2]/td/ul/li[4]/span[2]/div/div/a[1]");
	
	By SingleCoupons_UpdateButton = By.xpath("//*[@id=\"coupon-form\"]/div/div[13]/div/button");
	
	
	
	
	public void singlecoupon() throws InterruptedException {
		
        Random rand = new Random();
        
        int rand_int1 = rand.nextInt(1000);
        
        String rand1 = Integer.toString(rand_int1);

		
//		driver.findElement(Coupons).click();
//		Thread.sleep(2000);
        
        
		
		driver.findElement(SingleCoupons).click();
		Thread.sleep(2000);
		
		System.out.println("Entered at Single Coupon");	
		
		driver.findElement(SingleCoupons_SelectCategory).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_SelectCategory1).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_SelectCourse).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_SelectCourse1).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_CouponTitle).sendKeys("Test Single Coupon");
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_CouponCode).sendKeys(rand1);
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_MinPurchase).sendKeys("10");
		Thread.sleep(2000);
		
		driver.findElement(CouponList_MaxDiscount).sendKeys("20");
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_Amount).sendKeys("50");
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_Type).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_TypeFixed).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_Limit).sendKeys("30");
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		
		driver.findElement(SingleCoupons_Search).sendKeys("Test Single Coupon");
		Thread.sleep(1000);
		
		driver.findElement(SingleCoupons_ActionPlusButton).click();
		Thread.sleep(1000);
		
		driver.findElement(SingleCoupons_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(SingleCoupons_EditButton).click();
		Thread.sleep(1000);
		
		driver.findElement(SingleCoupons_UpdateButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Single Coupon");
	
	}
	
	By PersonalizedCoupons = By.xpath("//a[contains(text(),'Personalized Coupons')]");
	
	By PersonalizedCoupons_CouponTitle = By.xpath("//*[@id=\"title\"]");
	
	By PersonalizedCoupons_CouponCode = By.xpath("//*[@id=\"code\"]");
	
	By PersonalizedCoupons_MinPurchase = By.xpath("//*[@id=\"number\"]");
	
	By PersonalizedCoupons_MaxDiscount = By.xpath("//*[@id=\"number2\"]");
	
	By PersonalizedCoupons_Amount = By.xpath("//*[@id=\"number3\"]");
	
	By PersonalizedCoupons_Type = By.xpath("//*[@id=\"coupon-form\"]/div/div[6]/div/div/span");
	
	By PersonalizedCoupons_TypeFixed = By.xpath("//*[@id=\"coupon-form\"]/div/div[6]/div/div/ul/li[1]");
	
	By PersonalizedCoupons_Limit = By.xpath("//*[@id=\"number4\"]");
	
	By PersonalizedCoupons_SaveButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	//Edit
	
	By PersonalizedCoupons_Search = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By PersonalizedCoupons_ActionPlusButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/th");
	
	By PersonalizedCoupons_SelectButton = By.xpath("/html/body/div[3]/div/section[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr[2]/td/ul/li[6]/span[2]/div/button");
	
	By PersonalizedCoupons_EditButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[2]/td/ul/li[6]/span[2]/div/div/a[1]");
	
	By PersonalizedCoupons_UpdateButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	
	
	public void personalizedcoupons() throws InterruptedException {
		
		Random rand = new Random();
        
        int rand_int1 = rand.nextInt(1000);
        
        String rand1 = Integer.toString(rand_int1);
		
//		driver.findElement(Coupons).click();
//		Thread.sleep(1000);
		
        System.out.println("Entered at Personalized Coupons");
        
		driver.findElement(PersonalizedCoupons).click();
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_CouponTitle).sendKeys("Test Personalized Coupons");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_CouponCode).sendKeys(rand1);
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_MinPurchase).sendKeys("10");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_MaxDiscount).sendKeys("5");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_Amount).sendKeys("250");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_Type).click();
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_TypeFixed).click();
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_Limit).sendKeys("10");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_SaveButton).click();
		Thread.sleep(1000);
		
		//Edit
		driver.findElement(PersonalizedCoupons_Search).sendKeys("Test Personalized Coupons");
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_ActionPlusButton).click();
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_SelectButton).click();
		Thread.sleep(1000);
		
		driver.findElement(PersonalizedCoupons_EditButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from personalized Coupon");
	}
	
	By InviteByCode = By.xpath("//*[@id=\"sidebar_menu\"]/li[12]/ul/li[5]/a");
	
	public void invitebycode() throws InterruptedException {
		driver.findElement(InviteByCode).click();
		Thread.sleep(2000);
	}
	
	

}
