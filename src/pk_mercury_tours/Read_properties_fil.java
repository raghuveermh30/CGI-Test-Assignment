package pk_mercury_tours;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_properties_fil {
	@Test
	
	public void Flight_Login() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		WebDriver 	driver = new ChromeDriver();
		File file = new File("C:\\Users\\raghuveer.mh\\eclipse-workspace\\Selenium_Training_3.0\\src\\pk_mercury_tours\\datafile.properties");
		Properties prop = new Properties();
		FileInputStream file_inp = new FileInputStream(file);
		prop.load(file_inp);
		
		driver.findElement(By.linkText(prop.getProperty("URL")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.linkText(prop.getProperty("sign"))).click();
		Thread.sleep(2000L);
		driver.findElement(By.name(prop.getProperty("uname"))).sendKeys("testing");
		driver.findElement(By.name(prop.getProperty("pass"))).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000L);
		driver.quit();
	}

}
