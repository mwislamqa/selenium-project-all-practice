package com.TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Screenshot {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver", "c://DevTool//geckodriver.exe");
		driver = new FirefoxDriver();

	}

	@Test
	public void t_1() throws IOException {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java download");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\md islam\\Documents\\temp\\screenshot.png"));
		Assert.assertEquals("test", "test123");

	}

	@AfterTest
	public void tearDown() {
		System.out.println("process suceess");
		driver.close();
		// driver.quit();
	}

}
