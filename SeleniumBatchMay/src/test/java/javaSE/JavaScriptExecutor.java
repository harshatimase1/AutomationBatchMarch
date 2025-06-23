package javaSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dynamicCode.Base_Class;

public class JavaScriptExecutor extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		HitUrl("https://www.railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		ScreenShot("ScrollToBottom");

		Thread.sleep(3000);
		// To refresh
		js.executeScript("window.history.go(0)");

		Thread.sleep(3000);
		// To back
		js.executeScript("window.history.back()");
		ScreenShot("BackSS");

		Thread.sleep(3000);
		// To forward
		js.executeScript("window.history.forward()");
		ScreenShot("ForwardSS");

		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,0)");
		ScreenShot("BottomToTopSS");

	}

}
