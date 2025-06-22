package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamicCodes.BaseClass01;
//another way to use listeners in testNG file i.e in xml file --open listeners tab and <listeners>and packagename.class name
//@Listeners(Listeners_Class.class)
public class Snapdeal extends BaseClass01 {
	@Test(priority=1)
	public void MensFashion() throws InterruptedException {
		System.out.println("MensFashion");
		WebElement Mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		action.moveToElement(Mens).build().perform();
		System.out.println("Moved to element Mens");
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void WomensFashion() throws InterruptedException {
		System.out.println("WomensFashion");
		WebElement Womens = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
		action.moveToElement(Womens).build().perform();
		Thread.sleep(2000);
	}

	@Test(priority=3)
	public void HomenKitchen() throws InterruptedException {
		System.out.println("HomenKitchen");
		WebElement HomenKitchen = driver.findElement(By.xpath("//span[text()=\"Home & Kitchen\"]"));
		action.moveToElement(HomenKitchen).build().perform();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void ToysKids() throws InterruptedException {
		System.out.println("ToysKids");
		WebElement ToysKids = driver.findElement(By.xpath("//span[text()=\"Toys, Kids' Fashion & more\"]"));
		action.moveToElement(ToysKids).build().perform();
		Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void BeautyHealth() throws InterruptedException {
		System.out.println("BeautyHealth");
		WebElement BeautyHealth = driver.findElement(By.xpath("//span[text()=\"Beauty, Health & Daily Needs\"]"));
		action.moveToElement(BeautyHealth).build().perform();
		Thread.sleep(2000);
	}
}
