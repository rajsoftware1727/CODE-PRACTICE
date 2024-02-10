import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class ExtentReportsdemo {
	
	//create the instance of two classes 
	//1.ExtentReports
	//2.ExtentTest
	
	ExtentReports extent;
	ExtentTest test;
	
	
	@BeforeTest                   //setup the test environments
	public void setup()
	{
		extent=new ExtentReports("C:\\Users\\AKILA RAJESH\\eclipse-workspace\\CodePractice\\test-output\\ownReport.html", true);
		extent.addSystemInfo("HostName","LocalHost");
		extent.loadConfig(new File("C:\\Users\\AKILA RAJESH\\eclipse-workspace\\CodePractice\\extentreport.xml"));
	}
	
	@Test
	public void testpass()
	{
		test=extent.startTest("testpass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"Assert true as test pass");
		
	}
	
	@Test
	public void testfail()
	{
		test=extent.startTest("testpass");
		Assert.assertTrue(true);
		test.log(LogStatus.FAIL,"Assert false as test fail");
		
	}
	
	@AfterTest
	public void end()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void incaseFailiure(ITestResult r)
	{
		if(r.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL,r.getThrowable());
		}
		extent.endTest(test);
	}


}
