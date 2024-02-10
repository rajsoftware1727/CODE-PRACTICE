package com.Raj.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class RajExtentReport {
	
	public static WebDriver driver;
	public static void main(String args[])  
	{
		 ExtentReports extentreport=new ExtentReports();
		 ExtentSparkReporter sparkreports=new ExtentSparkReporter("./src/rajownreport.html");
		 extentreport.attachReporter(sparkreports);
		 //add screen shot
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\AKILA RAJESH\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// driver=new ChromeDriver();
		 //driver.get("http://www.google.com");
 		 //String path=takeScreenShot();
		 //driver.close();

		 extentreport.createTest("Test google home page","Google home page")
		 .info("this is info");
		// .addScreenCaptureFromPath(path);
		 extentreport.flush();
		//Desktop.getDesktop().browse(new File("./src/rajownreport.html").toURI());
		 
	}
	public static  String takeScreenShot() throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\AKILA RAJESH\\Downloads\\screenshotfolder\\google.jpg");
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("raj screenshot taken successfully");
		return destFile.getAbsolutePath();
	}

}
