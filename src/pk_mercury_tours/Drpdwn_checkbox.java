package pk_mercury_tours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drpdwn_checkbox {
	WebDriver driver;
	
	@Test
	
	public void dropdown() throws InterruptedException {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select osel = new Select(driver.findElement(By.name("fromPort")));
		osel.selectByValue("London");
		
		Thread.sleep(2000L);
		Select to = new Select(driver.findElement(By.name("toPort")));
		to.selectByValue("New York");
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(2000L);
		
		List<WebElement> chkboxlist = driver.findElements(By.name("outFlight"));
		chkboxlist.get(2).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		Thread.sleep(2000L);
		
		driver.findElement(By.name("passFirst0")).sendKeys("abc");
		Thread.sleep(2000L);
		driver.findElement(By.name("passLast0")).sendKeys("pqr");
		Thread.sleep(2000L);
		
		
		
		driver.findElement(By.name("creditnumber")).sendKeys("123456789");
		Thread.sleep(2000L);
		driver.findElement(By.name("buyFlights")).click();
		Thread.sleep(2000L);
		
	
		
		// sign off
		driver.findElement(By.partialLinkText("SIGN")).click();
				
				
			}
@BeforeTest
	
	public void launch_browser() {
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\raghuveer.mh\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 
	// driver = new ChromeDriver();
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	
	public void close_brow() {
		driver.quit();
		
	}
}


