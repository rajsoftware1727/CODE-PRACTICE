import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class ListenerDemo extends TestListenerAdapter{
	
	 public void onTestStart(ITestResult t)
	 {
		 System.out.println("test starts");
	 }
	 
	 public void onTestSuccess(ITestResult t)
	 {
		 System.out.println("test success");
		 System.out.println("rajesh this ok don't worry");
	 }

	 
	 public void onTestFailed(ITestResult t)
	 {
		 System.out.println("test failed");
	 }

	 
	 public void onTestSkipped(ITestResult t)
	 {
		 System.out.println("test skipped");
	 }


}
