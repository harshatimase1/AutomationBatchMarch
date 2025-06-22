package calender;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import dynamicCodes.PracticeDynamicCode;

public class RailYatri extends PracticeDynamicCode {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");
		Hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));

		calender.click();

		System.out.println("Clicked on calender");
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]"));

		System.out.println("The current month_year is:" + month_year);

	}
}
