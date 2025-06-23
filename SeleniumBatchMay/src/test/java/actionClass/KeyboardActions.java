package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamicCode.Base_Class;

public class KeyboardActions  extends Base_Class{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		HitUrl("https://www.jeevansathi.com/");
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		Actions act=new Actions(driver);
		act.moveToElement(email).click().sendKeys("abcd").build().perform();
		
		//keyboard actions
		
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).build().perform();
		
		
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.cssSelector("div#eye")).click();

	}

}
