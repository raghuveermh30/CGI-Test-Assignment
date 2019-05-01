package pk_mercury_tours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Window_alert {
	
WebDriver driver;
	
	@Test
	
	public void dropdown() throws InterruptedException {
		driver.get("http://demo.guru99.com/v4");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("mngr116235");
		driver.findElement(By.name("password")).sendKeys("dEhUsyv");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000L);
		String exp= driver.switchTo().alert().getText();
		System.out.println(exp);
		driver.switchTo().alert().accept();
		}
	
@BeforeTest
	
	public void launch_browser() {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\raghuveer.mh\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 
		//driver = new ChromeDriver();
	driver = new FirefoxDriver();
	}
	
	@AfterTest
	
	public void close_brow() {
		driver.quit();
		
	}
}