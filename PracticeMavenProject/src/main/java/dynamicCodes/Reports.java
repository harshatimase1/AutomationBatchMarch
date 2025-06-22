package dynamicCodes;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public static ExtentReports er;
	public static ExtentTest ET;
	public static String projectpath = System.getProperty("user.dir");
	public static WebDriver driver;

	public static void report(String Doctitle, String ReportName, String app) {

		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath + "\\practiceReportSS\\reports7");
		ESR.config().setDocumentTitle(Doctitle);
		ESR.config().setReportName(ReportName);
		ESR.config().setTheme(Theme.STANDARD);

		// Created Object of extentreport

		er = new ExtentReports();
		er.attachReporter(ESR);

		er.setSystemInfo("OS", "windows");
		er.setSystemInfo("Browser", "Chrome");

		er.setSystemInfo("Testing Perform", "Harsha");
		er.setSystemInfo("Client", "HDFC");
		er.setSystemInfo("Application", app);

	}

	public static void test(String Testname, String Testinfo, String screenshot_name) {

		ET = er.createTest(Testname);

		ET.log(Status.INFO, Testinfo);
		ET.addScreenCaptureFromPath(projectpath + "\\PracticeSS\\" + screenshot_name + ".png");

	}

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
		System.out.println("The webpage title is :" + driver.getTitle());

	}

	public static void takescreenshot(String screenshot_name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./PracticeSS/" + screenshot_name + ".png");
		FileHandler.copy(source, target);

	}

}
