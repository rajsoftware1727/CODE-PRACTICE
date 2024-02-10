import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 

public class ExtentReportDemo {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\AKILA RAJESH\\edgedriver_win64_new version\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.close();
		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter stockReport=new ExtentSparkReporter(".src//test-output//1.html");
		//now attach the reports
		extentReport.attachReporter(stockReport);
		//now create the test
		extentReport.createTest("Test1","Verify Login")
		.info("information");
		extentReport.createTest("Test2","verify Login")
		.log(Status.PASS,"test is passed")
		.info(MarkupHelper.createLabel("Rajesh",ExtentColor.LIME));
		extentReport.flush();
		System.out.println("report generated");
 		
		
  		
	}

}
