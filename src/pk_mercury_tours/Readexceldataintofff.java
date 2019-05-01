package pk_mercury_tours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Readexceldataintofff {

	WebDriver driver;
	@BeforeMethod
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	}
	@Test(dataProvider="Login")
	public void rag(String uname, String upass) throws InterruptedException {
	
		driver.findElement(By.linkText("SIGN-ON"));
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(upass);
		driver.findElement(By.name("login")).click();
		driver.quit();
		
	
}
	
	@DataProvider(name = "Login")
	public Object[][] authentication() throws Exception{
		
		Read_Excel re = new Read_Excel();
		Object[][] testObjArray = re.getExcelData("C:\\Users\\raghuveer.mh\\eclipse-workspace\\Selenium_Training_3.0\\Test_sele.xls", "Testdata");
		System.out.println(testObjArray);
		return testObjArray;
		
	}
	
 }