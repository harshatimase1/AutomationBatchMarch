package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCodes.BaseClass01;

public class JquerySlider  extends BaseClass01{

	public static void main(String[] args) throws Throwable {
	launch_Browser("chrome");
	Hiturl("https://jqueryui.com/slider/");
	
	WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
	driver.switchTo().frame(frame1);
	
	
	Actions action=new Actions(driver);
	WebElement slider = driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));
	
	Thread.sleep(2000);
	action.moveToElement(slider).clickAndHold(slider).moveByOffset(500, 0).release().build().perform();

	Thread.sleep(2000);

	action.dragAndDropBy(slider, -400, 0).build().perform();
	Thread.sleep(2000);

	action.clickAndHold(slider).moveByOffset(400, 0).release().build().perform();
	
	}

}
