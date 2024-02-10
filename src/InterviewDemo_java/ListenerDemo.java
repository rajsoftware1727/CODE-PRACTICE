package InterviewDemo_java;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test starts");
		 
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		 
	}

	@Override
	public void onStart(ITestContext context) {
		 System.out.println("on start");
	}

	@Override
	public void onFinish(ITestContext context) {
		 System.out.println("test finish");
	}
	
	

}
