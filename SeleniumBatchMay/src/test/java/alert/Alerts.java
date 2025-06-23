package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamicCode.Base_Class;

public class Alerts extends Base_Class {

	public static void main(String[] args) throws Throwable {
		launch_browser("chrome");

		HitUrl("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();

		Alert SA = driver.switchTo().alert();

		System.out.println(SA.getText());

		Thread.sleep(3000);

		SA.accept();

		System.out.println("----------------------------------------------------------");

		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();

		Alert CA = driver.switchTo().alert();

		System.out.println(CA.getText());

		Thread.sleep(3000);

		// CA.accept();

//		WebElement txtmsg = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
//		System.out.println(txtmsg.getText());

		CA.dismiss();
		WebElement txtmsg1 = driver.findElement(By.xpath("//p[@id=\"demo\"]"));

		System.out.println(txtmsg1.getText());

		System.out.println("-----------------------------------------------------------");

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();

		Alert PA = driver.switchTo().alert();

		System.out.println(PA.getText());

		Thread.sleep(3000);

		PA.sendKeys("Good Morning");
		PA.accept();

		WebElement msg = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));
		System.out.println(msg.getText());

		// PA.dismiss();

	}

}
