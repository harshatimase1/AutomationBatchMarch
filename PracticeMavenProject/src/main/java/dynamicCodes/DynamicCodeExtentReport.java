package dynamicCodes;

import java.io.File;
import java.io.IOException;
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

public class DynamicCodeExtentReport {
	public static WebDriver driver;
	static String projectpath = System.getProperty("user.dir");

	public static void reports(String testname,String testname1, String Testinfo, String browser, String url, String filename) throws Throwable {
		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath + "\\practiceReportSS\\reportsGenerated1");

		ESR.config().setDocumentTitle("Reports Created");
		ESR.config().setReportName("Tester");
		ESR.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(ESR);

		er.setSystemInfo("OS", "windows");
		er.setSystemInfo("Browser", "Chrome");

		er.setSystemInfo("Testing Perform", "Harsha");
		er.setSystemInfo("Client", "HDFC");
		er.setSystemInfo("Ecommerce site", "Amazon");
		

		ExtentTest test = er.createTest(testname);

		test.log(Status.INFO, Testinfo);
		test.addScreenCaptureFromPath(filename);
		
		ExtentTest test1 = er.createTest(testname1);

		test1.log(Status.PASS, Testinfo);
		

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

		driver.get(url);
		System.out.println("The webpage title is :" + driver.getTitle());
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File target1 = new File(projectpath + "\\PracticeSS\\" + filename + ".png");
		FileHandler.copy(source1, target1);
		
		er.flush();

	}
}
