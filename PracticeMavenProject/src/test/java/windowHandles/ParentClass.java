package windowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dynamicCodes.PracticeDynamicCode;

public class ParentClass extends PracticeDynamicCode {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		Hiturl("https://www.naukri.com/");
		takesScreenshot("URL_HitsSS");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"About us\"]")).click();

		takesScreenshot("About us");
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> id = windows.iterator();
		String parent_id = id.next();
		System.out.println("The parent id is :" + parent_id);
		Thread.sleep(2000);

		String child_id = id.next();
		System.out.println("The child id is :" + child_id);
		Thread.sleep(2000);

		driver.switchTo().window(child_id);
		System.out.println("shifted to child window");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		System.out.println("Clicked on Learn More");
		takesScreenshot("Learn More");
		Thread.sleep(2000);

		driver.switchTo().window(parent_id);
		System.out.println("Shifted to parent window");
		Thread.sleep(2000);

		takesScreenshot("parent window");

		Actions act = new Actions(driver);

		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();

		
		takesScreenshot("parent window page up");
		Thread.sleep(2000);
		driver.quit();

	}

}
