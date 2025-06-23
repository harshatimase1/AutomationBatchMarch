package actionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.Base_Class;

public class ActionClass extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		HitUrl("https://www.amazon.in/");

		Actions act = new Actions(driver);

		// WebElement TD = driver.findElement(By.xpath("//a[text()=\"Today's
		// Deals\"]"));
		// act.moveToElement(TD).perform();

		// act.moveToElement(TD).click().build().perform();

//		act.moveToElement(TD).contextClick().build().perform();
//		
//		WebElement fresh = driver.findElement(By.xpath("(//a[@class=\"nav-a  \"])[1]"));
//		
//		act.moveToElement(fresh).perform();
//		
//		WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//		
//		act.moveToElement(search).click().sendKeys("toys").doubleClick().build().perform();
//	
//		ScreenShot("movoToelement");

		// keyboard Actions

		act.keyDown(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(3000);

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();

	}

	
}
