package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	ReadConfig readconfig = new ReadConfig();
	String url = readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();
	
	//public String emailAddress = readconfig.getEmail();
	//String password = readconfig.getPassword();
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	 
	@BeforeClass
	public void setup()
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		default:
			driver = null;
		break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger = LogManager.getLogger("MyStore");
		//logger = LogManager.getLogger("MyStore");
		
		//open url
		driver.get(url);
	 	logger.info("url opened");
	}
	
	@AfterClass
	/*public void tearDown()
	{
		//driver.close();
		//driver.quit();
	}*/
	
	
	public void captureScreenshot(WebDriver driver,String testName) throws IOException
	{
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir")+"//Screenshots//"+testName+".png");
		
		FileUtils.copyFile(src, dest);
	}
	
}
