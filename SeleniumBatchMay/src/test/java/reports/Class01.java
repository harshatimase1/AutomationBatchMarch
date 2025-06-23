package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.DynamicCodeReports;

public class Class01 extends DynamicCodeReports {

	
	public static void main(String[] args) throws Throwable {
		
		reports("DynamicReport", "Testing", "https://www.flipkart.com/", "Flipkart");
		
		testCases("Browserlaunched", "chrome", "ChromeSS1");
		testCases("Url Hit", "TestPass","URLSS1");
		testCases("Search", "Search Functionality","SearchSS2");
		testCases("Data send", "Text entered","DataSS3");
		
		
		launch_browser("chrome");
		takeScreenShot("ChromeSS1");
		HitUrl("https://www.flipkart.com/");
		takeScreenShot("URLSS1");
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		
		search.click();
		takeScreenShot("SearchSS2");
		search.sendKeys("Toys");
		takeScreenShot("DataSS3");
		
		
		Er.flush();

	}

}
