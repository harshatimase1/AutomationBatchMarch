package dynamicCodes;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PracticeDynamicCode {
	public static WebDriver driver;

	public static String projectpath = System.getProperty("user.dir");

	public static void launch_browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();

		}

		System.out.println("The bouser launch is :" + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public static void Hiturl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static void takesScreenshot(String screenshot_name) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./windowHandles_screenshots/" + screenshot_name + ".png");
		FileHandler.copy(source, target);

	}

	// second way to capture screenshot using projectpath
	public static void ScreenShot(String screenShot_name1) throws Throwable {
		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(projectpath + "\\railYatriSS\\" + screenShot_name1 + ".png");

		FileHandler.copy(source1, target1);
	}

}
