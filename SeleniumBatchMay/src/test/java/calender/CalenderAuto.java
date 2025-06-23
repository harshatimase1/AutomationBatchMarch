package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.Base_Class;

public class CalenderAuto extends Base_Class {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		HitUrl("https://www.railyatri.in/");
		javaScriptExecutor("window.scrollBy(0,150)");
		
		Thread.sleep(3000);
		WebElement calender = driver.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender.click();
		
		WebElement month_year = driver.findElement(By.xpath("//th[text()='June 2025']"));
		//month_year.click();
		
		System.out.println("The current month_year is :"+month_year.getText());
		
//		WebElement date = driver.findElement(By.xpath("(//td[text()='25'])[2]"));
//		date.click();

//		Thread.sleep(3000);
//		System.out.println("The date captured is as "+calender.getAttribute("value"));
//		
		
		//To inspect next arrow
		driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
		
	
	}

}
