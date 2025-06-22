package dynamicCode;

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

public class Base_Class {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public static void Hiturl(String url) {

		driver.get(url);
		System.out.println(driver.getTitle());

	}

	public static void takescreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapdeal/" + screenshot_name + ".png");
		FileHandler.copy(source, target);

	}

	public static void takesscreenshot(String Screenshot_name) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./Screenshot/" + Screenshot_name + ".png");

		FileHandler.copy(source, target);

	}

	public static void screenshot(String filename) throws Throwable {

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(Projectpath + "\\Listeners_testfail\\" + filename + ".png");
		FileHandler.copy(source1, target1);

	}

	public static void scroll(int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + y + ")");

	}

}



