package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamicCode.Base_Class;

public class OrangeHRM extends Base_Class {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// Folder path --"./FolderName/ScreenShotName.png"
		File target = new File("./ScreenShot/launchbrowserSS1.png");

		FileHandler.copy(source, target);
		
		
		HitUrl("https://www.amazon.com/");

		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		// Folder path --"./FolderName/ScreenShotName.png"
		File target1 = new File("./ScreenShot/hiturlSS2.png");

		FileHandler.copy(source1, target1);
		
		

	}

}
