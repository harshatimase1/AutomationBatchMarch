package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCodes.BaseClass01;

public class AllAlerts extends BaseClass01 {

	public static void main(String[] args) throws Throwable {

		launch_Browser("chrome");
		Hiturl("https://demo.automationtesting.in/Alerts.html");

		//simple alert
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());

		Thread.sleep(2000);
		simpleAlert.accept();

		System.out.println("--------------------------------");
		//confirmation alert
		
		driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Alert confirmalert = driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		
		Thread.sleep(2000);
		//to press ok use accept
		//confirmalert.accept();
		
		//to press cancle
		confirmalert.dismiss();
		WebElement textmsg = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println(textmsg.getText());
		System.out.println("-------------------------------------------");
		//promp alert
		driver.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptalert.sendKeys("STP Infotech");
		System.out.println(promptalert.getText());
		promptalert.accept();
	
		
		WebElement msg = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println(msg.getText());
	}

}
