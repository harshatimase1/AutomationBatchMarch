package dynamicCode;

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

public class DynamicCodeReports  {

	public static String projectpath = System.getProperty("user.dir");
	public static ExtentTest Et;
	public static ExtentReports Er;
	static public WebDriver driver;

	public static void reports(String DocTitle, String ReportName, String App, String ClientName) {

		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\Reports\\GeneratedReport3\\");

		// Configuration set
		Esr.config().setDocumentTitle(DocTitle);
		Esr.config().setReportName(ReportName);
		Esr.config().setTheme(Theme.STANDARD);

		// System configuration set
		Er = new ExtentReports();
		Er.attachReporter(Esr);

		Er.setSystemInfo("OS", "Window");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Domail", "Ecommerce Domain");
		Er.setSystemInfo("Application", App);
		Er.setSystemInfo("Client", ClientName);
		Er.setSystemInfo("QA", "Harsha");

	}

	public static void testCases(String testname, String testinfo, String ScreenShot_name ) {

		Et = Er.createTest(testname);

		Et.log(Status.INFO, testinfo);
		Et.addScreenCaptureFromPath(projectpath+"\\ReportSS\\"+ScreenShot_name+".png");
		

	}

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}

		System.out.println("The browser launched is as:" + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	}

	public static void HitUrl(String url) {

		driver.get(url);

		System.out.println("The title of webpaage is as :" + driver.getTitle());

	}
	public static void takeScreenShot(String ScreenShot_name) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./ReportSS/" + ScreenShot_name + ".png");

		FileHandler.copy(source, target);

	}
	
	

}
