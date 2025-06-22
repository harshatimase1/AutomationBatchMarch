package dynamicCodes;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BaseClass01 {

	public static WebDriver driver;
	public static Actions action;
	public static String Projectpath = System.getProperty("user.dir");
	public static JavascriptExecutor js;

	public static void launch_Browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		System.out.println("The browser launched is : " + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public static void Hiturl(String url) {

		driver.get(url);
		System.out.println("The webpage title is :"+driver.getTitle());

	}

	public static void takescreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Listeners_snapdealSS/" + screenshot_name + ".png");
		FileHandler.copy(source, target);

	}

	public static void takesscreenshot(String Screenshot_name) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./snapdealSS/" + Screenshot_name + ".png");

		FileHandler.copy(source, target);

	}

	public static void screenshot(String filename) throws Throwable {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(Projectpath + "\\PracticeSS\\" + filename + ".png");
		FileHandler.copy(source1, target1);

	}

	public static void scroll(int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + y + ")");

	}

}



