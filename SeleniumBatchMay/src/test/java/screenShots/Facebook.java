package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamicCode.Base_Class;

public class Facebook extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");

		String projectpath = System.getProperty("user.dir");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// Second way of path declaration of folder
		File target = new File(projectpath + "\\ScreenShot\\SS1.png");

		FileHandler.copy(source, target);

		HitUrl("https://www.amazon.com/");

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		// Second way of path declaration of folder
		File target2 = new File(projectpath + "\\ScreenShot\\SS2.png");

		FileHandler.copy(source1, target2);

		javaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");

	}

}
