package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		//to maximize window
		driver.manage().window().maximize();
		
		//Hit url 
		driver.get("https://www.amazon.in/deals?_encoding=UTF8&ref_=sv_gb_4&bubble-id=deals-collection-coupons");	
		//Will get html source code 
		//driver.getPageSource();
		
		
		driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[1]"));
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
//		//explicit --webdriverWait--
//		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated("locator")));
//		
//		
		//fluentwait
		
		
//		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);
		
	}

}
