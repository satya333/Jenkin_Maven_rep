package com.jen.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JenDemo {
	
	private static final boolean False = false;

	@Test
	public void testA() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Satya\\Softwares\\Firefox\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Satya\\Softwares\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.google.co.in");
		Assert.assertTrue(False);;
		Thread.sleep(10);
		//driver.close();
	}
	

}
