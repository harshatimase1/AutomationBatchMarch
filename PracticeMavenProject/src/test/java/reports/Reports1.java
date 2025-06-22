package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamicCodes.BaseClass01;

public class Reports1 extends BaseClass01 {

	public static void main(String[] args) throws Throwable {

		String projectpath = System.getProperty("user.dir");

		System.out.println(projectpath);

		
		//Created object of ExtentSparkReporter
		ExtentSparkReporter ESR = new ExtentSparkReporter(projectpath + "\\practiceReportSS\\reportsGenerated");
		ESR.config().setDocumentTitle("Reports Created");
		ESR.config().setReportName("Tester");
		ESR.config().setTheme(Theme.STANDARD);
		
		//Created Object of extentreport
		
		ExtentReports er=new ExtentReports();
		er.attachReporter(ESR);
		
		er.setSystemInfo("OS", "windows");
		er.setSystemInfo("Browser", "Chrome");
		
		er.setSystemInfo("Testing Perform", "Harsha");
		er.setSystemInfo("Client", "HDFC");
		er.setSystemInfo("Ecommerce site", "Amazon");
		
		ExtentTest ET = er.createTest("Search functionality");
		
		ET.log(Status.INFO, "Search functionality");
		
		ExtentTest ET1 = er.createTest("Clicked functionality");
		ET.log(Status.INFO, "clicked on search");
		
		ExtentTest ET2 = er.createTest("Search Toys");
		ET.log(Status.INFO, "Search Toys");
		
		//ET.log(Status.PASS, "Status pass");
		
		
		launch_Browser("chrome");
		Hiturl("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		search.click();
		search.sendKeys("toys");
		screenshot("Sent Toys");
		
		ET2.addScreenCaptureFromPath(projectpath+"\\PracticeSS\\Sent Toys.png");

		er.flush();
		
		
	}

}
