package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamicCode.Base_Class;

public class UploadFile extends Base_Class {

	public static void main(String[] args) throws Throwable {
	
		launch_browser("chrome");
		HitUrl("https://www.ilovepdf.com/pdf_to_word");
		
		
		driver.findElement(By.xpath("//a[@id=\"pickfiles\"]")).click();
		
		
		
		StringSelection ss=new StringSelection("\"C:\\Users\\Harsha Timase\\Desktop\\Study materials\\JAVA NOTES\\2. Introduction to Java .pdf\"");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r=new Robot();
		
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
