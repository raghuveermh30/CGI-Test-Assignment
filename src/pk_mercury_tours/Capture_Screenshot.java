package pk_mercury_tours;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capture_Screenshot {
	
	public WebDriver driver;
@Test
	
	public void dropdown() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000L);
	
		//call the method to take screen shot
		
		this.takesnapshot(driver, "C:\\Users\\raghuveer.mh\\Desktop\\project\\test1.png");
		
	driver.quit();

}
public void takesnapshot(WebDriver driver, String filewithpath ) throws IOException {
	// TODO Auto-generated method stub
	//convert webdriver object to screenshot
	
	TakesScreenshot scrsht =  ((TakesScreenshot)driver);
	
	//call scrshot
	
	File scrfile = scrsht.getScreenshotAs(OutputType.FILE);
	
	//move img file to new dst
	
	File Dstfile = new File(filewithpath);
	
	//copy file at dst
	
	FileUtils.copyFile(scrfile, Dstfile);
	
	
	
}
}
