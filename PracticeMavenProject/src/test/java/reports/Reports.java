package reports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public static void main(String[] args) {
		//we will get path using System.getProperty method
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//create object of ExtentSparkReporter
	ExtentSparkReporter esr=new ExtentSparkReporter(projectpath+"\\reports\\generated_reports");
		
	esr.config().setDocumentTitle("GenerateDoc");
	esr.config().setReportName("GeneratedReportName");
	esr.config().setTheme(Theme.STANDARD);
	
	//create object for extentreports
	ExtentReports er=new ExtentReports();
	er.attachReporter(esr);
	
	//set extra system information
	
	er.setSystemInfo("Operating System", "Windows");
	er.setSystemInfo("Browser", "Chrome");
	er.setSystemInfo("Quality Analyst", "Harsha");
	er.setSystemInfo("Ecommerce project", "Amazon");
	
	//create test using extentreport class object ref_var
	
	ExtentTest ET = er.createTest("Search functionality");
	
	//create logs
	ET.log(Status.INFO, "Search functionality ");
	ET.log(Status.PASS, "Pass Search functionality ");
	
	
	//launchbrowser
	
	WebDriver driver =new ChromeDriver();
	
	//hiturl
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 	//here you can find elements by inspecting elements whatever you want
	//to get report use flush method
	
	er.flush();
	

	}

}
