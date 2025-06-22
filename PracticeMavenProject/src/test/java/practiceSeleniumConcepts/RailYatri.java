package practiceSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamicCodes.PracticeDynamicCode;

public class RailYatri extends PracticeDynamicCode {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");
		Hiturl("http://www.railyatri.in/");
		// takesScreenshot("Rail Yatri webpage");

		WebElement enter_text = driver.findElement(By.cssSelector("input#search_status"));

		enter_text.click();
		enter_text.sendKeys("12106");
		// ScreenShot("text");
		//takesScreenshot("text1");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		ScreenShot("After Scroll");
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		ScreenShot("Scroll to bottom");
		
		
	}

}
