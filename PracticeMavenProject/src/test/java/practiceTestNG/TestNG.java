package practiceTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	public static void main(String[] args) {
	}

}
