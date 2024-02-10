import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class L implements ITestListener{
	
	@Override  
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
		System.out.println("hi raj test started");
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Success of test cases and its details are : "+result.getName());  
	System.out.println("raj test success please marry");
	}  
	  
	@Override  
	public void onTestFailure(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName()); 
	System.out.println("raj test failed");
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	// TODO Auto-generated method stub  
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	@Override  
	public void onStart(ITestContext context) {  
	// TODO Auto-generated method stub  
		System.out.println("raj started");
	}  
	  
	@Override  
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
		System.out.println("raj finished");
	}  

}
