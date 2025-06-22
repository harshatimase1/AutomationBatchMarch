package practiceSeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCodes.PracticeDynamicCode;

public class Automate_Apps extends PracticeDynamicCode{

	public static void main(String[] args) {
		
		
		launch_browser("chrome");
		//Hiturl("https://www.railyatri.in/");
		
		//Hiturl("https://remotive.com/");
		Hiturl("https://weworkremotely.com/");
		
		WebElement sign_in = driver.findElement(By.xpath("//li[@class=\"btn-new-cta btn-new-nav cta-button\"]//a[@id=\"sign-in-cta-nav\"]"));
		
		//sign_in.click();
		
		WebElement search = driver.findElement(By.xpath("(//input[@id=\"search_term\"])[1]"));
		search.click();
		search.sendKeys("Manual Test engineer");
	}

}
