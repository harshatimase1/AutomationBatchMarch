package webelementsMethods;

import java.io.File;
import java.time.Duration;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookUsedWebelementsMethods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.facebook.com/");
		// if we want to perform more than one action then we can store our webelement
		// in variable

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.click();
		email.sendKeys("avbg@1234");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./ScreenShot/SS3.png");
		FileHandler.copy(source, target);

		Thread.sleep(4000);
		// email.clear();

		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));

		pass.click();
		pass.sendKeys("123454321");

		WebElement login = driver.findElement(By.cssSelector("button[value=\"1\"]"));

		System.out.println("The text present on web page is as:" + login.getText());

		System.out.println("The text entered in email section is as :" + email.getAttribute("value"));

		// need to pass attribute
		System.out.println("The attribute value of pass button is as :" + pass.getAttribute("type"));

		System.out.println("The attribute value of id attribute of email webelement is as:" + email.getAttribute("id"));

		WebElement CNA = driver.findElement(By.xpath("(//a[@role=\"button\"])[1]"));
		System.out.println("The attribute value is as:" + CNA.getAttribute("role"));

		System.out.println("The x cordinate of login btn is as :" + login.getLocation().x);

		System.out.println("The y cordinate of login btn is as :" + login.getLocation().y);

		System.out.println("The size of login btn is as:" + login.getSize());

		System.out.println("The tagname of login btn is as :" + login.getTagName());

		System.out.println("The login btn is dispalyed on webpage is as : " + login.isDisplayed());

		System.out.println("The login btn is enabled on webpage is as :" + login.isEnabled());

		System.out.println("The login btn is selected or not :" + login.isSelected());

		Thread.sleep(5000);
		// to refresh
		driver.navigate().refresh();

		Thread.sleep(5000);
		// to back
		driver.navigate().back();

		Thread.sleep(5000);
		// to forward
		driver.navigate().forward();

		Thread.sleep(5000);
		driver.close();

	}

}
