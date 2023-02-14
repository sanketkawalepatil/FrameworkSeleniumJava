package com.mystore.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentListenerClass implements ITestListener{
	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	public void congigureReport() 
	{
		 ReadConfig readConfig = new ReadConfig();
		//Timestamp Report
		String timestamp = new SimpleDateFormat("yyy.mm.dd hh.mm.ss").format(new Date());
		String reportName =  "MystoreTestReport" +timestamp+".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//"+reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("Machine", "testpc1");
		reports.setSystemInfo("OS", "windows 11");
		reports.setSystemInfo("browser:", readConfig.getBrowser());
		reports.setSystemInfo("user name:", "sanket");
		
		
	}
	
	public void onStart(ITestContext Result)
	{
		congigureReport();
		System.out.println("on start method invoked");
	}
	public void onFinish(ITestContext Result)
	{
		System.out.println("on Finish method invoked");
		reports.flush();
	}
	
	public void onTestFailure(ITestResult Result)
	{
		System.out.println("Name of test method failed"+Result.getName());
		test = reports.createTest(Result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel("Name test method failed"+Result.getName(),ExtentColor.RED));
		
		String screenShotPath = System.getProperty("user.dir")+"\\Screenshotes\\"+Result.getName()+".png";
		File scrernshotFile = new File(screenShotPath);
		
		if(scrernshotFile.exists())
		{
			test.fail("Captured Screenshot is below:"+test.addScreenCaptureFromPath(screenShotPath));
		}
		test.addScreenCaptureFromPath(null);
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name test method Skipped"+Result.getName(),ExtentColor.YELLOW));
	}
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of the method sucessfully excuted"+Result.getName());
		
		test = reports.createTest(Result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the test case is pass"+Result.getName(),ExtentColor.GREEN));
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}
	
	
}
  
