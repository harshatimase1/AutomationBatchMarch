package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamicCodes.PracticeDynamicCode;

public class Dynamic_Dropdown extends PracticeDynamicCode {

	public static void main(String[] args) {
		launch_browser("chrome");
		Hiturl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//input[@id=\"from_stn_input\"]")).sendKeys("Nagp");

//		List<WebElement> from = driver.findElements(By.xpath("//ul[@id=\"ui-id-5\"]//child::li"));
//
//		for (int x = 0; x <= from.size(); x++) {
//			try {
//				if (from.get(x).getText().equalsIgnoreCase("NAGPUR ROAD | NPRD")) {
//					from.get(x).click();
//				}
//			} catch (IndexOutOfBoundsException e) {
//				e.printStackTrace();
//			}
//
//		}
		
		
	}
}
