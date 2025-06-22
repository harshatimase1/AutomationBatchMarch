package practiceTestNG;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamicCodes.BaseClass01;

public class Listeners_Class extends BaseClass01 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		 action = new Actions(driver);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takesscreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takesscreenshot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skiped");
	
	}

	@Override
	public void onStart(ITestContext context) {
		launch_Browser("chrome");
		Hiturl("https://www.snapdeal.com");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		driver.close();
		
	}

}
