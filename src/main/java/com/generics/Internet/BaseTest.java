package com.generics.Internet;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseTest  implements AutoConstant 
{
   public static WebDriver driver;
   public ExtentTest logger;
   public ExtentReports extent;
   
   @BeforeTest
   public void setup()
   {
	   ExtentHtmlReporter reporter=new ExtentHtmlReporter(report);
	   extent=new ExtentReports();
	   extent.attachReporter(reporter);
	   logger=extent.createTest("kanika");
   }
   
   @BeforeClass
   public void openBrowser() 
   {
	   System.setProperty(chrome_key, chrome_value);
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
   }
   
  @AfterClass
   public void closeBrowser(ITestResult result) throws IOException 
   {
	   if(result.getStatus()==ITestResult.FAILURE) 
	   {
		  Utility.getScreenshot(driver);
	   }	   
	   
   }
  
  @AfterTest
  public void team() {
	   extent.flush();
  }
  
} 

