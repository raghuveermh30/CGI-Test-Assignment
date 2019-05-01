package pk_mercury_tours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get_all_drpdwn {
	
	WebDriver driver;
	@Test(dataProvider = "Login")
	
	public void test() throws InterruptedException {
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
	WebElement ele =driver.findElement(By.name("fromPort"));
	Select osel = new Select(ele);
	List<WebElement> ele_cnt = osel.getOptions();
	
	System.out.println(ele_cnt.size());
	
	for(int i=0;i<ele_cnt.size();i++) {
		String val = ele_cnt.get(i).getText();
		osel.selectByValue(val);
		System.out.println(val);
				
	}
	
	
	driver.quit();
}
}
