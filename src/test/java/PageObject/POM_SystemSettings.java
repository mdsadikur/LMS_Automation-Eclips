package PageObject;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Common_Method.CommonMethod;


public class POM_SystemSettings {
	WebDriver driver = null;
	CommonMethod cm = new CommonMethod();
	
	public POM_SystemSettings(WebDriver driver) {
		this.driver = driver;
	}
	
	By SystemSettings = By.xpath("//span[contains(text(),'System Setting')]");
	
	By WebsiteButton = By.xpath("//*[@id=\"main-nav-for-chat\"]/div/div/div/div[5]/ul/li/a");
	
	//Activation
	
	By Activation = By.xpath("//a[contains(text(),' Activation')]");
	
	By Activation_EmailVerification = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td[3]/label/i");
	
	By Activation_LanguageTranslation = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[2]/td[3]/label/i");
	
	By Activation_FrontendLanguageTranslation = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[3]/td[3]/label/i");
	
	By Activation_TranslationDropdown = By.xpath("//*[@id=\"sticky-header\"]/div/div/div[1]/div/div[1]/div[2]/div");
	
	public void activation() throws InterruptedException {
		
		driver.findElement(SystemSettings).click();
		Thread.sleep(1000);
		
		System.out.println("Entered at System Settings");
		
		driver.findElement(Activation).click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Activation");
		
		
		driver.findElement(Activation_EmailVerification).click();
		Thread.sleep(1000);
		driver.findElement(Activation_EmailVerification).click();
		Thread.sleep(1000);
		
		//Frontend Translation
		//Off
		driver.findElement(Activation_LanguageTranslation).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//On
		driver.findElement(Activation_LanguageTranslation).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
		
		//Frontend Language Translation
		//Off
		driver.findElement(Activation_FrontendLanguageTranslation).click();
		Thread.sleep(2000);
	/*	driver.findElement(WebsiteButton).click();
		Thread.sleep(2000);
//		driver.findElement(Activation_TranslationDropdown).click();
//		Thread.sleep(1000);
		
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(5000);
		
		driver.close();
		
		
		//On
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
		Thread.sleep(2000);
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
//		driver.findElement(Activation).click();
//		Thread.sleep(2000);
		driver.findElement(Activation_FrontendLanguageTranslation).click();
		Thread.sleep(5000);
		driver.findElement(Activation_FrontendLanguageTranslation).click();
		Thread.sleep(5000);
		driver.findElement(WebsiteButton).click();
		Thread.sleep(5000);
		
		cm.switchnextWindow();
		
		cm.switchpreviousWindow();
		
		*/
		
		driver.findElement(Activation_FrontendLanguageTranslation).click();
		Thread.sleep(5000);
		
		System.out.println("Checkout from Activation");
		
//		driver.findElement(Activation_TranslationDropdown).click();
//		Thread.sleep(2000);
	}
	
	By GeneralSettings = By.xpath("//a[contains(text(),'General Setting')]");
	
	By GeneralSettings_SaveButton = By.xpath("//*[@id=\"general_info_sbmt_btn\"]");
	
	public void generalsettings() throws InterruptedException {
		
	
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at General Settings");
		
		driver.findElement(GeneralSettings).click();
		Thread.sleep(1000);
		
		driver.findElement(GeneralSettings_SaveButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from General Settings");
	}
	
	By Commission = By.xpath("//a[contains(text(),' Commission')]");
	
	By Commission_Flat = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[1]/a");
	
	By Commission_FlatSaveButton = By.xpath("//*[@id=\"Flat\"]/div/form/div/div[3]/div/button");
	
	By Commission_InstructorCommission = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[2]/a");
	
	By Commission_InsUpdateSettingButton = By.xpath("//*[@id=\"Instructor\"]/div[1]/form/div/div[3]/div/button");
	
	By Commission_CourseCommission = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[3]/a");
	
	By Commission_CourseUpdateSettings = By.xpath("//*[@id=\"Course\"]/div[1]/form/div/div[3]/div/button");
	
	public void commission() throws InterruptedException {
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Commission");
		
		driver.findElement(Commission).click();
		Thread.sleep(2000);
		
		driver.findElement(Commission_Flat).click();
		Thread.sleep(2000);
		
		driver.findElement(Commission_FlatSaveButton).click();
		Thread.sleep(2000);
		
		
		driver.findElement(Commission_InstructorCommission).click();
		Thread.sleep(2000);
		
		driver.findElement(Commission_InsUpdateSettingButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Commission_CourseCommission).click();
		Thread.sleep(2000);
		
		driver.findElement(Commission_CourseUpdateSettings).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Comission");
		
	}
	
	By InstructorSetup = By.xpath("//a[contains(text(),'Instructor Setup')]");
	
	By InstructorSetup_InstructorpageBannerButton = By.xpath("//*[@id=\"coupon-form\"]/div[1]/div/div/label/i");
	
	By InstructorSetup_SaveButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	public void instructorsetup () throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Instructor Setup");
		
		
		driver.findElement(InstructorSetup).click();
		Thread.sleep(2000);
		//Off
		driver.findElement(InstructorSetup_InstructorpageBannerButton).click();
		Thread.sleep(2000);
		
		driver.findElement(InstructorSetup_SaveButton).click();
		Thread.sleep(2000);
		
		//On
		driver.findElement(InstructorSetup_InstructorpageBannerButton).click();
		Thread.sleep(2000);
		
		driver.findElement(InstructorSetup_SaveButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Instructor Setup");
	}
	
	By EmailSettngs = By.xpath("//a[contains(text(),' Email Setup')]");
	
	By EmailSettngs_Smtp = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/ul/li[1]/a");
	
	By EmailSettngs_SmtpSaveButton = By.xpath("//*[@id=\"indivitual_email_sms\"]/form/div[3]/div/div/button");
	
	By EmailSettngs_FromMail = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[1]/div/input");
	
	By EmailSettngs_EmailEngineType = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[2]/div/div/span");
	
	By EmailSettngs_ClickDropDown = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[2]/div/div/span");
	
	By EmailSettngs_SelectSmtp = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[2]/div/div/ul/li[2]");
	
	By SendTestMailButton = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[3]/button");
	
	By SMTPBackToHomepage = By.xpath("/html/body/div[3]/div/div/div/div/a");
	
	By EmailSettngs_SendGrid = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/ul/li[2]/a");
	
	By EmailSettngs_SendGridSaveButton = By.xpath("//*[@id=\"file_list\"]/form/div[2]/div[3]/div/button");
	
	By EmailSettngs_SendGridSelect = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[2]/div/div/ul/li[3]");
	
	
	By EmailSettngs_PhpMail = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/ul/li[3]/a");
	
	By EmailSettngs_PhpMailSaveButton = By.xpath("//*[@id=\"smtp\"]/div[2]/div/button");
	
	By EmailSettngs_SelectPhpMail = By.xpath("//*[@id=\"main-content\"]/section[3]/div/div/div/div/div/div/form/div/div[2]/div/div/ul/li[1]");
	
	
	public void emailsettings() throws InterruptedException {
		
		
		
		
		driver.findElement(SystemSettings).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(EmailSettngs).click();
		Thread.sleep(2000);
		
		System.out.println("Entered at Email Setup");
		
		
		//SMTP
		driver.findElement(EmailSettngs_Smtp).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_SmtpSaveButton).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_FromMail).sendKeys("aoradev52@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_ClickDropDown).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_SelectSmtp).click();
		Thread.sleep(2000);
		
		driver.findElement(SendTestMailButton).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
//		driver.findElement(SMTPBackToHomepage).click();
//		Thread.sleep(2000);
		
		//Grid
		
		driver.findElement(EmailSettngs_SendGrid).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettngs_SendGridSaveButton).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_SendGrid).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_FromMail).sendKeys("aoradev52@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_ClickDropDown).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_SendGridSelect).click();
		Thread.sleep(2000);
		
		driver.findElement(SendTestMailButton).click();
		Thread.sleep(2000);
		
		//PHP Mail
		
		driver.findElement(EmailSettngs_PhpMail).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettngs_PhpMailSaveButton).click();
		Thread.sleep(2000);
		driver.findElement(EmailSettngs_PhpMail).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_FromMail).sendKeys("aoradev52@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_ClickDropDown).click();
		Thread.sleep(2000);
		
		driver.findElement(EmailSettngs_SelectPhpMail).click();
		Thread.sleep(2000);
			
		driver.findElement(SendTestMailButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Email Setup");
	}
	
	By EmailTemplate = By.xpath("//a[contains(text(), ' Email Template')]");
	
	public void emailtemplate() throws InterruptedException {
		
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Email Template");
		
		driver.findElement(EmailTemplate).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Email Template");
	}
	
	By PaymentMethodSettings = By.xpath("//a[contains(text(), ' Payment Method Setting')]");
	
	public void paymentmethodsettings() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Payment Method Settings");
		
		
		driver.findElement(PaymentMethodSettings).click();
		Thread.sleep(2000);
		
		System.out.println("checkout from Payment Method Settings");
	}
	
	By API_Settings = By.xpath("//a[contains(text(), ' Api Settings')]");
	
	By API_Settings_LMSKey = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[1]/a");
	
	By API_Settings_LMSKey_Generate = By.xpath("//*[@id=\"generateNewKey\"]");
	
	By API_Settings_LMSKey_update = By.xpath("//*[@id=\"confirmBtn\"]");
	
	By API_Settings_GoogleMapApi = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[2]/a");
	
	By API_Settings_GoogleMapApi_Update = By.xpath("//*[@id=\"googleMap\"]/form/div/div/div[2]/div/button");
	
	By API_Settings_Fixer = By.xpath("/html/body/div[3]/div/section[2]/div/div/div/div[1]/ul/li[3]/a");
	
	By API_Settings_FixerUpdate = By.xpath("//*[@id=\"fixer\"]/form/div/div/div[2]/div/button");
	
	By API_Settings_FCM = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/ul/li[4]/a");
	
	By API_Settings_FCMUpdate = By.xpath("//*[@id=\"fcm\"]/form/div/div/div[2]/div/button");
	
	public void apisettings() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at API Settings");
		
		driver.findElement(API_Settings).click();
		Thread.sleep(2000);
		
		driver.findElement(API_Settings_LMSKey).click();
		Thread.sleep(2000);
		
//		driver.findElement(API_Settings_LMSKey_Generate).click();
//		Thread.sleep(2000);
		
//		driver.findElement(API_Settings_LMSKey_update).click();
//		Thread.sleep(2000);
		
		driver.findElement(API_Settings_Fixer).click();
		Thread.sleep(2000);
		driver.findElement(API_Settings_FixerUpdate).click();
		Thread.sleep(2000);
		
		driver.findElement(API_Settings_GoogleMapApi).click();
		Thread.sleep(2000);
		driver.findElement(API_Settings_GoogleMapApi_Update).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from API Settings");
	}
	
	By VimeoConfig = By.xpath("//a[contains(text(), ' Vimeo Configuration')]");
	
	By VimeoConfig_Update = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[2]/div/button");
	
	public void vimeoconfig() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		System.out.println("Entered at Vimeo Configuration");
		
		driver.findElement(VimeoConfig).click();
		Thread.sleep(2000);
		
		
		driver.findElement(VimeoConfig_Update).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Vimeo Configuration");
	}
	
	By VdoCipher = By.xpath("//a[contains(text(), ' VdoCipher Configuration')]");
	
	By VdoCipherUpdate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[2]/div/button");
	
	public void vdocipher() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		System.out.println("Entered at VdoCipher");
		
		driver.findElement(VdoCipher).click();
		Thread.sleep(2000);
		driver.findElement(VdoCipherUpdate).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Vdocipher");
	}
	
	By gDrive = By.xpath("//a[contains(text(),' gDrive Configuration')]");
	
	By gDriveDoc = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div/div[1]/a[1]");
	
	By gDriveupdate = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div/div[5]/div/button");
	
	public void gDrive() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at GDive");
		
		driver.findElement(gDrive).click();
		Thread.sleep(2000);
		
		driver.findElement(gDriveDoc).click();
		Thread.sleep(2000);
		
		driver.findElement(gDriveupdate).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from  GDive");
	}
	
	By HomepageSeoSetup = By.xpath("//a[contains(text(),' Homepage SEO Setup')]");
	
	By HomepageSeoSetup_SaveButton = By.xpath("//*[@id=\"TexttoLocal_Settings\"]/div/button");
	
	public void HomepageSeoSetup() throws InterruptedException {
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Home Page SEO Setup");
		
		driver.findElement(HomepageSeoSetup).click();
		Thread.sleep(2000);
		driver.findElement(HomepageSeoSetup_SaveButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Home Page SEO Setup");
	}
	
	By Language = By.xpath("//a[contains(text(),' Language')]");
	
	By Language_AddNewlanguage = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/ul/li/a");
	
	By Language_Name = By.xpath("//*[@id=\"language_addForm\"]/div/div[1]/div/input");
	
	By Language_Code = By.xpath("//*[@id=\"language_addForm\"]/div/div[2]/div/input");
	
	By Language_NativeName = By.xpath("//*[@id=\"language_addForm\"]/div/div[3]/div/input");
	
	By Language_SaveButton = By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div[2]/form/div/div[4]/div/button");
	
	By Language_Searchbar = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By Language_SelectButton = By.xpath("//*[@id=\"dropdownMenu2\"]");
	
	By Language_EditButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[5]/div/div/a[1]");
	
	By Language_UpdateButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	By Language_Translation = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[5]/div/div/a[2]");
	
	By Language_SaveButton2 = By.xpath("//*[@id=\"translate_modal\"]/form/div[1]/div/div/button");
	
	
	//DeActive
	
	By Language_DeActive = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td[4]/label/i");
	
	By Language_LanguageCheck = By.xpath("//*[@id=\"main-nav-for-chat\"]/div/div/div/div[6]/div[1]/div");
	
	//Active 
	By Language_Active = By.xpath("//*[@id=\"lms_table\"]/tbody/tr[1]/td[4]/label/i");
	
	
	
	public void language() throws InterruptedException {
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Language");
		
		driver.findElement(Language).click();
		Thread.sleep(1000);
		
		driver.findElement(Language_AddNewlanguage).click();
		Thread.sleep(1000);
		
		driver.getWindowHandle();
		driver.findElement(Language_Name).sendKeys("Test Language");
		Thread.sleep(1000);
		
		driver.findElement(Language_Code).sendKeys("111");
		Thread.sleep(1000);
		
		driver.findElement(Language_NativeName).sendKeys("TL");
		Thread.sleep(1000);
		
		driver.findElement(Language_SaveButton).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(Language_Searchbar).sendKeys("Test Language");
		Thread.sleep(2000);
		driver.findElement(Language_SelectButton).click();
		Thread.sleep(1000);
		driver.findElement(Language_EditButton).click();
		Thread.sleep(2000);
		driver.findElement(Language_UpdateButton).click();
		Thread.sleep(2000);
		
		
		driver.findElement(Language_Searchbar).sendKeys("Test Language");
		Thread.sleep(2000);		
		driver.findElement(Language_SelectButton).click();
		Thread.sleep(1000);
		driver.findElement(Language_Translation).click();
		Thread.sleep(1000);
		driver.findElement(Language_SaveButton2).click();
		Thread.sleep(2000);
		
		
		driver.findElement(SystemSettings).click();
		Thread.sleep(1000);
		driver.findElement(Language).click();
		Thread.sleep(1000); 
		
		
		
		//Deactive
		driver.findElement(Language_Searchbar).sendKeys("Test Language");
		Thread.sleep(2000);	
		
		driver.findElement(Language_DeActive).click();
		Thread.sleep(2000);
		
		driver.findElement(Language_LanguageCheck).click();
		Thread.sleep(2000);
		
		//Active
		driver.findElement(Language_Searchbar).sendKeys("Test Language");
		Thread.sleep(2000);
		
		driver.findElement(Language_Active).click();
		Thread.sleep(2000);
		
		driver.findElement(Language_LanguageCheck).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from Language");
		
	}
	
	By Currency = By.xpath("//a[contains(text(),' Currency')]");
	
	By Currency_AddNewCurrency = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/div[1]/div/div/div/ul/li/a");
	
	By Currency_Name = By.xpath("//*[@id=\"currency_addForm\"]/div/div[1]/div/input");
	
	By Currency_Code = By.xpath("//*[@id=\"currency_addForm\"]/div/div[2]/div/input");
	
	By Currency_Symbol = By.xpath("//*[@id=\"currency_addForm\"]/div/div[3]/div/input");
	
	By Currency_SaveButton = By.xpath("//*[@id=\"save_button_parent\"]");
	
	By Currency_Searchbar = By.xpath("//*[@id=\"lms_table_filter\"]/label/input");
	
	By Currency_SelectButton = By.xpath("//*[@id=\"dropdownMenu2\"]");
	
	By Currency_EditButton = By.xpath("//*[@id=\"lms_table\"]/tbody/tr/td[4]/div/div/a[1]");
	
	By Currency_UpdateBUtton = By.xpath("//*[@id=\"save_button_parent\"]");
	 
	
	
	
	
	public void currency() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
//		
		System.out.println("Entered at Currency");
		
		driver.findElement(Currency).click();
		Thread.sleep(2000);
		
		driver.getWindowHandle();
		driver.findElement(Currency_AddNewCurrency).click();
		Thread.sleep(2000);
		
		driver.findElement(Currency_Name).sendKeys("Test Currency");
		Thread.sleep(2000);
		
		driver.findElement(Currency_Code).sendKeys("11");
		Thread.sleep(2000);
		
		driver.findElement(Currency_Symbol).sendKeys("T");
		Thread.sleep(2000);
		
		driver.findElement(Currency_SaveButton).click();
		Thread.sleep(2000);
		
		//Edit
		driver.findElement(Currency_Searchbar).sendKeys("Test Currency");
		Thread.sleep(2000);
		
		driver.findElement(Currency_SelectButton).click();
		Thread.sleep(2000);
		
		driver.findElement(Currency_EditButton).click();
		Thread.sleep(1000);
		
		driver.findElement(Currency_UpdateBUtton).click();
		Thread.sleep(2000);
		
		
		System.out.println("Checkout from Currency");
	}
	
	By Timezone = By.xpath("//a[contains(text(),' Timezone')]");
	
	By Timezone_AddNewTimezone = By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
	
	By Timezone_Code = By.xpath("//body[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]");
	
	By Timezone_Code1 = By.xpath("//*[@id=\"timezone_addForm\"]/div/div[1]/div/div/ul/li[1]");
	
	By Timezone_Name = By.xpath("//*[@id=\"timezone_addForm\"]/div/div[2]/div/input");
	
	By Timezone_SaveButton = By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div[2]/form/div/div[3]/div/button");
	
	By Searchbar = By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div[2]/form/div/div[1]/div/div/ul/li[1]");
	
	
	
	public void timezone() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Time zone");
		
		driver.findElement(Timezone).click();
		Thread.sleep(2000);
		
		driver.findElement(Timezone_AddNewTimezone).click();
		Thread.sleep(2000);
		
		driver.getWindowHandle();
//		driver.findElement(Timezone_AddNewTimezone).click();
//		Thread.sleep(2000);
		
		driver.findElement(Timezone_Code).click();
		Thread.sleep(2000);
		
		driver.findElement(Timezone_Code1).click();
		Thread.sleep(2000);
		
		driver.findElement(Timezone_Name).sendKeys("Test Timezone");
		Thread.sleep(2000);
		
		driver.findElement(Timezone_SaveButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from time zone");
		
	}
	
	By ModulerManager = By.xpath("//a[contains(text(),' Module Manager')]");
	
	public void modulemanager() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Module Manager");
		
		driver.findElement(ModulerManager).click();
		Thread.sleep(1000);
		System.out.println("Checkout from Module Manager");
		
	}
	
	By aboutupdate = By.xpath("//a[contains(text(),' About & Update')]");
	
	public void aboutupdate() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at About  & Update");
		
		driver.findElement(aboutupdate).click();
		Thread.sleep(1000);
		
		System.out.println("Check out from About  & Update");

	}
	
	By city = By.xpath("//a[contains(text(),' City')]");
	
	By city_AddNewCity = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[2]/div[1]/div/div/div/ul/li/a");
	
	By city_SelectCountryDropdown = By.xpath("//*[@id=\"city_addForm\"]/div/div[1]/div/div/span");
	
	By city_SelectCountry1  = By.xpath("//*[@id=\"city_addForm\"]/div/div[1]/div/div/ul/li[2]");
	
	By city_SelectStateDropdown = By.xpath("//*[@id=\"select2-state_add-container\"]");
	
	By city_SelectState1 = By.xpath("//*[@id=\"select2-state_add-results\"]/li[1]");
	
	By city_CityName = By.xpath("//*[@id=\"city_addForm\"]/div/div[3]/div/input");
	
	By city_SaveButton = By.xpath("/html/body/div[3]/div/div[3]/div/div/div/div[2]/form/div/div[4]/div/button");
	
	public void city() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		driver.findElement(city).click();
		Thread.sleep(2000);
		
		System.out.println("Entered at City");
		
		driver.findElement(city_AddNewCity).click();
		Thread.sleep(2000);
		
		driver.findElement(city_SelectCountryDropdown).click();
		Thread.sleep(2000);
		
		driver.findElement(city_SelectCountry1).click();
		Thread.sleep(2000);
		
		driver.findElement(city_SelectStateDropdown).click();
		Thread.sleep(2000);
		
		driver.findElement(city_CityName).sendKeys("Test City");
		Thread.sleep(2000);
		
		driver.findElement(city_SaveButton).click();
		Thread.sleep(2000);
		
		System.out.println("Checkout from City");
	}
	
	By cookiessetting = By.xpath("//a[contains(text(),' Cookie Setting')]");
	
	By cookiessetting_browse = By.xpath("//*[@id=\"Activation\"]/div/form/div[1]/div/div[2]/div/div/button/label");
	
	By cookiessetting_ButtonTextArea = By.xpath("//*[@id=\"btn_text\"]");
	
	By cookiessetting_BackGroundColor = By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/input[1]");
	
	By cookiessetting_ButotnBackgroundColor = By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/input[1]");
	
	By cookiessetting_SaveButton = By.xpath("//*[@id=\"general_info_sbmt_btn\"]");
	
	public void cookiessetings() throws InterruptedException, AWTException {
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		driver.findElement(cookiessetting).click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Cookies Settings");
		
		driver.findElement(cookiessetting_browse).click();
		Thread.sleep(1000);
		
		
		String filePath= cm.getFilePath("1.jpg");
		
		cm.fileUpload(filePath);
		Thread.sleep(1000);
		
		driver.findElement(cookiessetting_BackGroundColor).click();
		Thread.sleep(1000);
		
		driver.findElement(cookiessetting_ButtonTextArea).click();
		Thread.sleep(1000);
		
		driver.findElement(cookiessetting_ButtonTextArea).clear();
		Thread.sleep(1000);
		
		driver.findElement(cookiessetting_SaveButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Cookies Settings");
		
	}
	
	By CacheSetting = By.xpath("//a[contains(text(),' Cache Setting')]");
	
	By CacheSetting_SaveButton = By.xpath("//*[@id=\"general_info_sbmt_btn\"]");
	
	public void cachesetting() throws InterruptedException {
		
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(2000);
		
		System.out.println("Entered at Cache Settings");
		
		driver.findElement(CacheSetting).click();
		Thread.sleep(1000);
		
		driver.findElement(CacheSetting_SaveButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Cache Settings");
	}
	
	By QueueSetting = By.xpath("//a[contains(text(),' Queue Settings')]");
	
	By QueueSetting_SaveButton = By.xpath("//*[@id=\"general_info_sbmt_btn\"]");
	
	public void queuesetting() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Queue Setting");
		
		driver.findElement(QueueSetting).click();
		Thread.sleep(1000);
		
		driver.findElement(QueueSetting_SaveButton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Queue Setting");
		
		
	}
	
	By Cronjob = By.xpath("//a[contains(text(),' Cron Job')]");
	
	public void cronjob() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		driver.findElement(Cronjob).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Cron Job");
	}
	
	By recaptcha = By.xpath("//a[contains(text(), ' reCaptcha')]");
	
	By recaptcha_savebutton = By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[3]/div/button");
	
	public void recaptcha() throws InterruptedException {
//		driver.findElement(SystemSettings).click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at ReCaptcha");
		
		driver.findElement(recaptcha).click();
		Thread.sleep(1000);
		
		driver.findElement(recaptcha_savebutton).click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Recaptcha");
	}
			

}
