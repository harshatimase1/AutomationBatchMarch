package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCodes.BaseClass01;

public class Jeevansathi extends BaseClass01 {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");
		Hiturl("https://www.jeevansathi.com/");

		Actions action = new Actions(driver);

		WebElement profile = driver.findElement(By.xpath("//p[text()=\"BROWSE PROFILES BY\"]"));

		action.moveToElement(profile).perform();

		WebElement occupation = driver.findElement(By.xpath("//p[text()=\"Occupation\"]"));
		action.moveToElement(occupation).perform();

		WebElement IT = driver.findElement(By.xpath("//a[text()=\"IT Software\"]"));

		action.moveToElement(IT).click().build().perform();
		System.out.println("The current webpage title is :" + driver.getTitle());

		WebElement help = driver.findElement(By.xpath("//a[text()=\"HELP\"]"));
		// right click use contextClick method
		//action.moveToElement(help).contextClick().build().perform();

		WebElement mail = driver.findElement(By.xpath("//input[@placeholder=\"someone@example.com\"]"));
//		mail.click();
//		mail.sendKeys("ASFD");
//		action.doubleClick(mail).build().perform();
		
		action.moveToElement(mail).click().sendKeys("Sharvi").doubleClick().build().perform();
		
		
		Thread.sleep(2000);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		
		//We can even use sendKeys for page down and page up ..these are keyboard actions
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		
		
	}

}
