package PageObject;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Method.CommonMethod;


public class POM_Quiz {
	
	WebDriver d;
	
	Random random = new Random();
	
	CommonMethod cm= new CommonMethod();
	
	// quiz module
	
	@FindBy(xpath="//span[contains(text(),'Quiz')]")
	WebElement quiz;
	
	
	//question group
	
	@FindBy(xpath="//a[contains(text(),' Question Group')]")
	WebElement questionGroup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[1]/div/div/input[1]")
	WebElement addQuestionGroup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[2]/div/button")
	WebElement saveQuestionGroup;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/button[1]")
	WebElement selectQuestionGroup; //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/button[1]
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/div[1]/div[1]/a[1]")
	WebElement editQuestionGroup;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement updateQuestionGroup;
	
	// add question
	
	@FindBy(xpath="//a[contains(text(),'Add Question')]")
	WebElement addQuestion;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[1]/div[1]/div/span")
	WebElement selectGroup;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[1]/div[1]/div/ul/li[2]")
	WebElement questionGroupSelection;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[1]/div[2]/div/span")
	WebElement selectCategory;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[1]/div[2]/div/ul/li[2]")
	WebElement categorySelection;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[2]/div[1]/div/span")
	WebElement questionTypeSelection;  
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[2]/div[1]/div/ul/li[2]")
	WebElement questionTypeMulti;
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[2]/div[1]/div/ul/li[3]")
	WebElement questionTypeShort;
	

	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")
	WebElement addMark;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]")
	WebElement question;
	
	@FindBy(xpath="//*[@id=\"number_of_option\"]")
	WebElement numberOfOption;
	
	@FindBy(xpath="//*[@id=\"create-option\"]")
	WebElement createButton;
	
	@FindBy(xpath="//*[@id=\"multiple-choice\"]/div/div/div/div/div[3]/div[2]")
	WebElement explanation;
	
	
	@FindBy(xpath="//*[@id=\"question_bank\"]/div/div/div[8]/div/button")
	WebElement saveQuestion;
	
	
	
	
	// question bank
	
	@FindBy(xpath="//a[contains(text(),' Question Bank')]")
	WebElement questionBank;
	
	@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]/button[1]")
	WebElement actionButtonBank;
	
	@FindBy(xpath="//tbody[1]/tr[1]/td[8]/div[1]/div[1]/a[1]")
	WebElement editButtonBank;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[8]/div[1]/button[1]")
	WebElement updateButtonBank;
	
	@FindBy(xpath="//tbody[1]/tr[1]/td[8]/div[1]/div[1]/button[1]")
	WebElement deleteButtonBank;
	
	@FindBy(xpath="//*[@id=\"deleteBank\"]/div/div/div[2]/form/div[2]/button[2]")
	WebElement yesButtonBank;
	
	
	// question Bank
	
	@FindBy(xpath="//a[contains(text(),' Question Import')]")
	WebElement questionImport;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[2]/div/div/div/div/a")
	WebElement sampleQuestionDownload;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div[1]/div/div[2]/div/span")
	WebElement selectQuestionGroupForUpload;
	
	@FindBy(xpath="//li[contains(text(),'BCS Question Bank')]")
	WebElement questionGroupSelectionForUpload;
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]")
	WebElement selectCategoryForUpload;
	
	@FindBy(xpath="//body/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]")
	WebElement categorySelectionForUpload;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/form/div/div[1]/div/div[1]/div/div[5]/div/div/button/label")
	WebElement browseButton;
	
	@FindBy(xpath="//*[@id=\"submitBtn\"]")
	WebElement bulkPrint;
	
	
	//add quiz
	
	@FindBy(xpath="//a[contains(text(),' Add Quiz')]")
	WebElement addQuiz;
	
	@FindBy(xpath="//*[@id=\"elementen\"]/div[1]/div/div/input[1]")
	WebElement quizTitle;
	
	@FindBy(xpath="//*[@id=\"elementen\"]/div[2]/div/div/textarea")
	WebElement instruction;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/span")
	WebElement selectCategoryForAdd;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[3]/div/div/ul/li[2]")
	WebElement categorySelectionForAdd;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/div/span")
	WebElement selectGroupForAdd;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[5]/div/div/ul/li[2]")
	WebElement groupSelectionForAdd;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[6]/div/div/input")
	WebElement minimumPercentage;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[8]/div[2]/div/div[1]/label/span")
	WebElement changeSettings;
	
	@FindBy(xpath="//*[@id=\"per_question_time\"]/div/span")
	WebElement selectPerQuestionTime;
	
	@FindBy(xpath="//*[@id=\"per_question_time\"]/div/ul/li[2]")
	WebElement perQuestionTime;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[9]/div[2]/div/input")
	WebElement time;
	
	
	
	@FindBy(xpath="(//button[@class='primary-btn fix-gr-bg'])[1]")
	WebElement saveOnlineQuiz;
	
	@FindBy(xpath="//button[contains(text(),' Select')]")
	WebElement selectQuiz;
	
	@FindBy(xpath="//a[contains(text(),' Edit')]")
	WebElement editQuiz;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section/div/div/div[1]/div/div/form/div/div/div[9]/div/button")
	WebElement updateQuiz;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/div[1]/div[1]/a[4]")
	WebElement setQuestion;
	
	@FindBy(xpath="//*[@id=\"lms_table\"]/tbody/tr[1]/td[1]/label/span")
	WebElement questionSet;
	
	@FindBy(xpath="//a[contains(text(),'Manage Question')]")
	WebElement manageQuestion;
	
	@FindBy(xpath="//a[contains(text(),'Mark Register')]")
	WebElement markRegister;
	
	@FindBy(xpath="//a[contains(text(),'Delete')]")
	WebElement deleteDropDown;
	
	
	@FindBy(xpath="//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/form[1]/button[1]")
	WebElement deleteDropDownConfirm;
	
	
	
	
	
	
	// Quiz Setup
	@FindBy(xpath="//a[contains(text(),' Quiz Setup')]")
	WebElement quizSetup;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div/div/div/div/form/div/div/div[3]/div/button")
	WebElement saveSetup;
	
	// Quiz Report
	@FindBy(xpath="//a[contains(text(),' Quiz Report')]")
	WebElement quizReport;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/section[2]/div/div[1]/div/div/div/h3/a")
	WebElement export;
	
	
	
	public POM_Quiz(WebDriver driver) {
		 d= driver;
		 PageFactory.initElements(d, this);
		
	}
	
	public void questionGroup() throws InterruptedException{
		
		quiz.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Question Group");
		
		questionGroup.click();
		Thread.sleep(1000);
		
		addQuestionGroup.sendKeys("BCS Question Bank");
		Thread.sleep(1000);
		
		saveQuestionGroup.click();
		Thread.sleep(1000);
		
		selectQuestionGroup.click();
		Thread.sleep(1000);
		
		editQuestionGroup.click();
		Thread.sleep(1000);
		
		updateQuestionGroup.click();
		Thread.sleep(3000);
		
		System.out.println("Checkout from Question Group");
		
		
		
		//System.out.println("After");
	}
	
	public void addQuestion() throws InterruptedException {
		
		
//		quiz.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Add Question");
		
		addQuestion.click();
		Thread.sleep(1000);
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li")).size();
		int i=2;
		
		while(i<=size-1) {
			
			if(i==2) {
				
				selectGroup.click();
				Thread.sleep(1000);
				
				questionGroupSelection.click();
				Thread.sleep(1000);
				
				selectCategory.click();
				Thread.sleep(1000);
				
				categorySelection.click();
				Thread.sleep(1000);
				
				questionTypeSelection.click();
				Thread.sleep(1000);
				
				questionTypeMulti.click();
				Thread.sleep(1000);
				
				addMark.sendKeys("10");
				Thread.sleep(1000);
				
				question.sendKeys("What is the capital city of Bangladesh");
				Thread.sleep(1000);
				
				int option= random.nextInt(3) +1;
				String options= Integer.toString(option);
				
				numberOfOption.sendKeys(options);
				Thread.sleep(1000);
				
				createButton.click();
				Thread.sleep(1000);
				
				
				for(int j=1 ; j<=option ; j++ ) {
					
					d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div["+ j +"]/div[1]/div[1]/input[1]")).sendKeys("Random" + j);
					Thread.sleep(1000);
				}
				
				d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/label[1]/span[1]")).click();
				Thread.sleep(1000);
				
				explanation.sendKeys("Please Attend Here");
				Thread.sleep(1000);
				
				saveQuestion.click();
				Thread.sleep(1000);
				
				addQuestion.click();
				Thread.sleep(1000);
				
			}
			
			else {
				
				selectGroup.click();
				Thread.sleep(1000);
				
				questionGroupSelection.click();
				Thread.sleep(1000);
				
				selectCategory.click();
				Thread.sleep(1000);
				
				categorySelection.click();
				Thread.sleep(1000);
				
				questionTypeSelection.click();
				Thread.sleep(1000);
				
				questionTypeShort.click();
				Thread.sleep(1000);
				
				addMark.sendKeys("10");
				Thread.sleep(1000);
				
				question.sendKeys("Write about yourself.");
				Thread.sleep(1000);
				
				saveQuestion.click();
				Thread.sleep(1000);
				
				break;
				
			}
			
			i++;
			
			
		}

		System.out.println("Checkout from Add Question");
		
	}
	
	public void questionBank() throws InterruptedException {
		
		
//		quiz.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Question Bank");
		
		questionBank.click();
		Thread.sleep(1000);
		
		actionButtonBank.click();
		Thread.sleep(1000);
		
		editButtonBank.click();
		Thread.sleep(1000);
		
		updateButtonBank.click();
		Thread.sleep(1000);
		
	
		
		/*
		
		actionButtonBank.click();
		Thread.sleep(1000);
		
		deleteButtonBank.click();
		Thread.sleep(1000);
		
		d.getWindowHandle();
		
		yesButtonBank.click();
		Thread.sleep(1000);
		 */
		
		System.out.println("Checkout from Question Bank");
	}
	
	
	public void questionImport() throws InterruptedException, AWTException {
		
//		quiz.click();
//		Thread.sleep(1000);
		

		
		questionImport.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Question Import");
		
		sampleQuestionDownload.click();
		Thread.sleep(2000);
		
		selectQuestionGroupForUpload.click();
		Thread.sleep(1000);
		
		questionGroupSelectionForUpload.click();
		Thread.sleep(1000);
		
		selectCategoryForUpload.click();
		Thread.sleep(1000);
		
		categorySelectionForUpload.click();
		Thread.sleep(1000);
		
		browseButton.click();
		Thread.sleep(1000);
		
		String filePath=cm.getFilePath("sample-questions (1).xlsx");
		
		
		cm.fileUpload(filePath);
		Thread.sleep(1000);
		
		bulkPrint.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from Question Import");
		
		
	}
	
	public void addQuiz() throws InterruptedException, AWTException {
		
//		quiz.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Add Quiz");
		
		
		addQuiz.click();
		Thread.sleep(1000);
		
		for (int i=0; i<=1;i++) {
			
			
			if(i==0) {
				quizAdd();
				
			}
			
			else if(i==1) {
				quizAddWithSettings();
				
			}
			
			else {
				break;
			}
			
			
	
		}
		
		quizActions();
		
		System.out.println("Checkout from Add Quiz");
	}
	
	public void quizSetup() throws InterruptedException {
		
		
		
		quiz.click();
		Thread.sleep(1000);
		
		System.out.println("Entered at Quiz Setup");
		
		quizSetup.click();
		Thread.sleep(1000);
		
		saveSetup.click();
		Thread.sleep(1000);
		
		System.out.println("Checkout from");
	}
	
	
	public void quizReport() throws InterruptedException {
//		quiz.click();
//		Thread.sleep(1000);
		
		System.out.println("Entered at Quiz Report");
		
		quizReport.click();
		Thread.sleep(1000);
		
		export.click();
		Thread.sleep(1000);
		
		System.out.println("checkout from Quiz Report");
		
	}
	
	
	
	public void quizAdd() throws InterruptedException {
		
		quizTitle.sendKeys("Sudden Test");
		Thread.sleep(1000);
		
		instruction.sendKeys("Must Attend");
		Thread.sleep(1000);
		
		selectCategoryForAdd.click();
		Thread.sleep(1000);
		
		categorySelectionForAdd.click();
		Thread.sleep(1000);
		
		selectGroupForAdd.click();
		Thread.sleep(1000);
		
		cm.scroll();
		
		groupSelectionForAdd.click();
		Thread.sleep(1000);
		
		
		minimumPercentage.clear();
		minimumPercentage.sendKeys("20");
		Thread.sleep(1000);
		
		saveOnlineQuiz.click();
		Thread.sleep(1000);
	} 
	
	public void quizAddWithSettings() throws InterruptedException {
		quizTitle.sendKeys("Sudden Test");
		Thread.sleep(1000);
		
		instruction.sendKeys("Must Attend");
		Thread.sleep(1000);
		
		selectCategoryForAdd.click();
		Thread.sleep(1000);
		
		categorySelectionForAdd.click();
		Thread.sleep(1000);
		
		selectGroupForAdd.click();
		Thread.sleep(1000);
		
		groupSelectionForAdd.click();
		Thread.sleep(1000);
		
		
		minimumPercentage.clear();
		minimumPercentage.sendKeys("20");
		Thread.sleep(1000);
		
		changeSettings.click();
		Thread.sleep(1000);
		
		selectPerQuestionTime.click();
		Thread.sleep(1000);
		
		perQuestionTime.click();
		Thread.sleep(1000);
		
		time.clear();
		time.sendKeys("1");
		Thread.sleep(1000);
		
		
		
		
		int size= d.findElements(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div/ul[1]/li[1]/label[1]/span[1]")).size();  
		System.out.println(size);
		Thread.sleep(1000);                //body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div[5]/ul[1]/li[1]/label[1]/span[1]
		
		int j=5;
		
		while(j<= size+2) {
			
			if(d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div["+ j +"]/ul[1]/li[1]/label[1]/input[1]")).isSelected()){
				
				 d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div["+ (j+1) +"]/ul[1]/li[1]/label[1]/span[1]")).click();
			}
			
			else {
				
				d.findElement(By.xpath("//body[1]/div[3]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[9]/div["+ j +"]/ul[1]/li[1]/label[1]/span[1]")).click();
			}
			
			System.out.println(j);
			
			
			
			if(j==9) {
				
				d.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[9]/div[10]/div/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[9]/div[10]/div/ul/li[2]")).click();
				Thread.sleep(1000);
				
				d.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[9]/div[11]/input")).clear();
				d.findElement(By.xpath("//*[@id=\"main-content\"]/section[2]/div/div/div[1]/div/div/form/div/div/div[9]/div[11]/input")).sendKeys("2");
				Thread.sleep(1000);
				break;
				
			}
			
			j=j+2;
		}
		
		saveOnlineQuiz.click();
		Thread.sleep(1000);
		
				                                
	}
	
	public void quizActions() throws InterruptedException, AWTException {
		
		selectQuiz.click();
		Thread.sleep(1000);
		
		editQuiz.click();
		Thread.sleep(1000);
		
		updateQuiz.click();
		Thread.sleep(2000);
		
		selectQuiz.click();
		Thread.sleep(1000);
		
		System.out.println(setQuestion.getText());
		
		if(setQuestion.getText().equals("SET QUESTION")) {
			setQuestion.click();
			Thread.sleep(1000);
			
			questionSet.click();
			Thread.sleep(1000);
			
			d.navigate().back();
			Thread.sleep(1000);
			
			d.navigate().refresh();
			Thread.sleep(1000);
			
			
		}
		
		else {
			
			manageQuestion.click();
			Thread.sleep(1000);
			
			d.navigate().back();
			Thread.sleep(1000);
			
			d.navigate().refresh();
			Thread.sleep(1000);
			
		}
		
		
		selectQuiz.click();
		Thread.sleep(1000);
		
		markRegister.click();
		Thread.sleep(1000);
		
		d.navigate().back();
		Thread.sleep(1000);
		
		selectQuiz.click();
		Thread.sleep(1000);
		
		deleteDropDown.click();
		Thread.sleep(1000);
		
		deleteDropDownConfirm.click();
		Thread.sleep(1000);
		
		POM_Courses courses = new POM_Courses(d);
		courses.click_addquiz_button();

	
	}

		
	}

