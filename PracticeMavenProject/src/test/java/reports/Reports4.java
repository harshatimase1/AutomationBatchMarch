package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCodes.Reports;

public class Reports4 extends Reports {

	public static void main(String[] args) throws Throwable {
		
		report("Reports", "Testing", "https://www.snapdeal.com/");
		test("Chrome", "Browser launch", "Chrome_captSS1");
		test("URL", "URL Hit", "url_captSS1");
		
		
		test("Search", "Serach launch", "Search SS");
		test("Clicked", "Clicked", "ClickedSS");
		test("Text", "Text Enter", "Text enterSS");
		
		launch_Browser("chrome");
		takescreenshot("Chrome_captSS1");
		
		Hiturl("https://www.snapdeal.com/");
		
		takescreenshot("url_captSS1");
		
		
		WebElement search = driver.findElement(By.xpath("(//input[@nam=\"keyword\"])[1]"));
		takescreenshot("Search SS");
		
		search.click();
		takescreenshot("ClickedSS");
		
		search.sendKeys("Toys");
		takescreenshot("Text terSS");
		
		
		er.flush();
		

	}

}
