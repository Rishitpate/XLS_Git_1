package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed:  "+result.getName());
		System.out.println(result.getThrowable().getMessage());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed:  "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped:  "+result.getName());
	}
}
