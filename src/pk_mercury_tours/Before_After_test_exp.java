package pk_mercury_tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Before_After_test_exp extends Login_testdata {

	WebDriver driver;
	//@Parameters({"uname","upass",})
	
	@Test(dataProvider="Login")
	public void test(String uname, String upass) throws InterruptedException {
	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(upass);
		driver.findElement(By.name("login")).click();
		WebElement eleme;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		eleme =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN-OFF")));
		

		
		WebElement element = driver.findElement(By.linkText("SIGN-OFF"));
		String str=element.getText();
		Assert.assertEquals("SIGN-OFF", str);
		
		
		
	// sign off
		driver.findElement(By.partialLinkText("SIGN")).click();
		
		/*String stURl= driver.getCurrentUrl();
		System.out.println(stURl);
		Assert.assertEquals("http://newtours.demoaut.com/mercurysignon.php", stURl);
		*/
		
	}
	
	@BeforeTest()
	//@Parameters({"browser"})
	
	public void launch_browser(String browser)  {
		if(browser.compareTo("chrome")==0) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\raghuveer.mh\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
			
		}
		
	}
	
	@AfterTest
	
	public void close_brow() {
		driver.quit();
		
	}
}
