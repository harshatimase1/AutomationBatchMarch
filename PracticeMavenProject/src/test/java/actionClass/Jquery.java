package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCodes.BaseClass01;

public class Jquery extends BaseClass01 {

	public static void main(String[] args) {

		launch_Browser("chrome");
		Hiturl("https://jqueryui.com/droppable/");

		WebElement abc = driver.findElement(By.cssSelector("iframe.demo-frame"));

		driver.switchTo().frame(abc);

		Actions action = new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		// action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

		action.dragAndDrop(drag, drop).build().perform();

		// action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		
		//driver needs to go back outside the frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();

	}

}
