package windowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import dynamicCode.Base_Class;

public class Naukari extends Base_Class {

	public static void main(String[] args) {
		launch_browser("chrome");
		
		HitUrl("https://www.naukri.com/");
		
		javaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		
		
		Set<String> window_id = driver.getWindowHandles();
		System.out.println(window_id.size());
		
		Iterator<String> id = window_id.iterator();
		
		String parent_id = id.next();
		
		System.out.println("The parent id is as:"+parent_id);
		
		String child_id = id.next();
		System.out.println("The child id is as:"+child_id);
		
	
		driver.switchTo().window(child_id);
		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		
		
		driver.switchTo().window(parent_id);
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		
	
		
	}

}
