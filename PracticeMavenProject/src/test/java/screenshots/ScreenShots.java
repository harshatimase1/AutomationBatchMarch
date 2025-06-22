package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapdealSS/SS1.png");

		FileHandler.copy(source, target);
		
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./snapdealSS/SS2.png");

		FileHandler.copy(source1, target1);
		
		
		//second way of declaration of folder path
		
		
		String projectpath = System.getProperty("user.dir");
		
		TakesScreenshot ts3=(TakesScreenshot) driver;
		File source3 = ts3.getScreenshotAs(OutputType.FILE);
		File target3=new File(projectpath+"\\snapdealSS\\SS3.png");
		FileHandler.copy(source3, target3);
		driver.close();
		
		
	}
	
	

}
