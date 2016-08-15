package com.jen.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class JenDemo {
	ExtentReports er = new ExtentReports("./ExtentReport.html");
	@Test
	public void testA() 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Satya\\Softwares\\Firefox\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Satya\\Softwares\\chromedriver_win32\\chromedriver.exe");
		ExtentTest t = er.startTest("testA");
		t.log(LogStatus.PASS, "Hi--Bye");
		er.endTest(t);
		//er.flush();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.co.in");
		//Assert.fail();
		//Thread.sleep(10);
		//driver.close();
		System.out.println("Test A");
	}
	
	@Test
	public void testB() 
	{
		
		System.out.println("TestB");
		ExtentTest t = er.startTest("testB");
		t.log(LogStatus.FAIL, "Hi--Fail");
		er.endTest(t);
		er.flush();
		
	}
	

}
