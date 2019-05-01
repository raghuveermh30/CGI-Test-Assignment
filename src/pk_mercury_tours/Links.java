package pk_mercury_tours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links {
	
	WebDriver driver;
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\project\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	driver.get("http://newtours.demoaut.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int li = links.size();
	System.out.println("tottal no of links" +li);
	String [] link = new String [li];
	System.out.println("list of links available");
	
	//print all links 
	
	for(int i=0;i<li;i++) {
		link[i] = links.get(i).getAttribute("href");
		System.out.println(links.get(i).getAttribute("href"));
	}
	
	//navigate to each link on webpage
	for(int i=0;i<li;i++) {
		driver.navigate().to(link[i]);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
	}
	
	

}
}