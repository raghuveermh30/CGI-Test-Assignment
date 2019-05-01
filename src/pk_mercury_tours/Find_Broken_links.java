package pk_mercury_tours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class Find_Broken_links {
	
	WebDriver driver;

	public void test() throws InterruptedException {
		
		driver.get("http://opensource.demo.orangehrmlive.com");
	      	
	driver.manage().window().maximize();
	Thread.sleep(3000L);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click();
	driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']")).click();
	Thread.sleep(3000L);
	driver.findElement(By.id("btnAdd")).click();
	driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//select[@id='addJobVacancy_jobTitle']"));
	
	Select sel = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
	sel.selectByValue("IT Executive");
	Thread.sleep(2000L);
	
	driver.findElement(By.id("addJobVacancy_name")).sendKeys("Test Automation Engineer");
	driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys("ABCD");
	driver.findElement(By.id("addJobVacancy_noOfPositions")).sendKeys("3");
	driver.findElement(By.id("addJobVacancy_description")).sendKeys("Hiring for Selenuim Test Engineer");
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']")).click();
	Thread.sleep(3000L);
	
	driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	Thread.sleep(3000L);
	
	driver.findElement(By.id("addCandidate_firstName")).sendKeys("sada");
	driver.findElement(By.id("addCandidate_middleName")).sendKeys("dasda");
	driver.findElement(By.id("addCandidate_lastName")).sendKeys("jljl");
	driver.findElement(By.id("addCandidate_email")).sendKeys("raghu@gmail.com");
	driver.findElement(By.id("addCandidate_contactNo")).sendKeys("3123123");
	
	
	
	Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='addCandidate_vacancy']")));
	sel1.selectByValue("AutomationTest Emgineer");
	Thread.sleep(2000L);
	
	
	//upload the file
	
	driver.findElement(By.id("addCandidate_resume")).sendKeys("C:\\Users\\raghuveer.mh\\Desktop\\216320_Raghuveer_MH");
	Thread.sleep(3000L);
	driver.findElement(By.id("addCandidate_keyWords")).sendKeys("ads");
	driver.findElement(By.id("addCandidate_comment")).sendKeys("asdas");
	driver.findElement(By.xpath("//input[@id='addCandidate_appliedDate']")).sendKeys("2018-06-19");
	
	driver.findElement(By.id("btnSave")).click();
	Thread.sleep(3000L);
	
	driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']")).click();
	
	
}
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}

	  @AfterMethod
	  public void afterMethod() throws InterruptedException {
	                  
		  Thread.sleep(20000L);
	        driver.close();
	  
}
	}