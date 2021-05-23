package com.TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotBase {
	
	public static WebDriver driver;
	
	public static void initializiton() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver", "c://DevTool//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
	
	}
	public void failed() {
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("C:\\EclipseWork space\\selenium_project\\screenshot\\testfailur.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
