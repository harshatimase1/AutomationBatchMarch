package practiceSeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		//enter username
		WebElement username = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]"));

		username.click();
		username.sendKeys("abcd@1234");

		//enter pass
		WebElement pass = driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]"));
		pass.click();
		Thread.sleep(3000);
		pass.sendKeys("123456");
		
		
		//We can only use after sending or entering some value to the field
		pass.clear();
		//click on login button
		
		//WebElement login = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		//login.click();
		
		//click on forgotten password
		//we can capture text that is already present on webpage using getText Method
		WebElement forgottenPass = driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
		System.out.println("The text is as :"+forgottenPass.getText());
		
		forgottenPass.click();
		
		//Find your account 
		WebElement FYA = driver.findElement(By.cssSelector("input#identify_email"));
		FYA.click();
		FYA.sendKeys("abcd@1234");
		//we can capture text entered by us using getAttribute method
		System.out.println("The text entered is is :"+FYA.getAttribute("value"));
		System.out.println("The value of id attribute is "+FYA.getAttribute("id"));
		
		WebElement search = driver.findElement(By.cssSelector("button#did_submit"));
		//search.click();
		
		//We can find location of x and y co-ordinate using getLocation method
		
		System.out.println("The location of x-cordinate for search button is as :"+search.getLocation().x);
		System.out.println("The location of y-cordinate for search button is as :"+search.getLocation().y);
		
		//we can find size of specific button using getSize method
		System.out.println("The size of search button is "+search.getSize());
		
		System.out.println("The tagname of search button is as :"+search.getTagName());
		
		System.out.println("Search button is displayed on UI :"+search.isDisplayed());
		
		System.out.println("Cancel button is enabled on UI :"+search.isEnabled());
		
		Thread.sleep(6000);
		driver.navigate().refresh();
		
		
		Thread.sleep(6000);
		driver.navigate().back();
		
		Thread.sleep(6000);
		driver.navigate().forward();
		
		Thread.sleep(6000);
		driver.close();
		
		

		
	}

}
