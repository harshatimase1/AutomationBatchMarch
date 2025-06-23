package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamicCode.Base_Class;

public class Reports  extends Base_Class{

	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) throws Throwable {

		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\Reports\\GeneratedReport1\\");

		// Configuration set
		Esr.config().setDocumentTitle("Automation Report");
		Esr.config().setReportName("Testing Report");
		Esr.config().setTheme(Theme.STANDARD);

		// System configuration set
		ExtentReports Er = new ExtentReports();
		Er.attachReporter(Esr);

		Er.setSystemInfo("OS", "Window");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Domail", "Ecommerce Domain");
		Er.setSystemInfo("Application", "Amazon");
		Er.setSystemInfo("Client", "AmazonClient");
		Er.setSystemInfo("QA", "Harsha");

		
		//Extent Test --it creates the test cases
		ExtentTest Et = Er.createTest("Hit Url");

		Et.log(Status.INFO, "Amazon Url");

		ExtentTest Et1 = Er.createTest("Search Functionality");
		Et1.log(Status.PASS, "Test pass");

		ExtentTest Et2 = Er.createTest("Send data");
		Et2.log(Status.FAIL, "Test Failed");

		ExtentTest Et3 = Er.createTest("Clicked on search button");

		Et3.log(Status.SKIP, "Amazon Url");
		
		
		launch_browser("chrome");
		
		HitUrl("https://www.amazon.in/deals?ref_=nav_cs_gb");
		
		ScreenShot("ReportSS3");
		
		Et.addScreenCaptureFromPath(projectpath+"\\ReportSS\\ReportSS3\\"+".png");
		
		Er.flush();
		

	}

}
