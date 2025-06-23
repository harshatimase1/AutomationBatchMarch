package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.Base_Class;

public class DragAndDrop extends Base_Class {

	public static void main(String[] args) {

		launch_browser("chrome");
		HitUrl("https://jqueryui.com/droppable/");
		
		WebElement abc = driver.findElement(By.cssSelector("iframe.demo-frame"));
		
		driver.switchTo().frame(abc);
		
		Actions act=new Actions(driver);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		
		//act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		act.dragAndDrop(drag, drop).build().perform();
		
		
		//driver will return back or it will be outside the frame
		driver.switchTo().defaultContent();
		WebElement sortable = driver.findElement(By.xpath("//a[text()=\"Sortable\"]"));
		sortable.click();
		
		
	}

}
