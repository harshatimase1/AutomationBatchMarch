package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.Base_Class;

public class RailYatri extends Base_Class {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");

		HitUrl("https://www.railyatri.in/");
		javaScriptExecutor("window.scrollBy(0,150)");

		Thread.sleep(3000);
		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender.click();

		while (true) {

			String month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]")).getText();

			System.out.println("The current month_year is :" + month_year);

			if (!(month_year.equalsIgnoreCase("August 2025"))) {

				driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();

			} else {

				break;

			}

		}
		
		driver.findElement(By.xpath("//td[text()='14']")).click();
		System.out.println("The selected date is as :"+calender.getAttribute("value"));
		

	}

}
