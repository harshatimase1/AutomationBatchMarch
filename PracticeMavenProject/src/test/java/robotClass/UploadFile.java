package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamicCodes.PracticeDynamicCode;

public class UploadFile extends  PracticeDynamicCode{

	public static void main(String[] args) throws AWTException {
		
		launch_browser("Chrome");
		Hiturl("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.xpath("//a[@id=\"pickfiles\"]")).click();
		
		StringSelection ss=new StringSelection("\"C:\\Users\\Harsha Timase\\OneDrive\\Document 1.docx\"");
		
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
