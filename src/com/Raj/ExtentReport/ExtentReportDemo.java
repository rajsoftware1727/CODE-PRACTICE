package com.Raj.ExtentReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
 
public class ExtentReportDemo {
	
	public static void main(String args[])
	{
		ExtentReports report=new ExtentReports();
		 
		ExtentSparkReporter extentReport=new ExtentSparkReporter("D:\\report\\1.html");
		report.attachReporter(extentReport);
		report.flush();
 		
	}

}
