package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustoemsListener.class)
public class Screenshotdemo extends ScreenshotBase{
	
	@BeforeMethod
	public void setUp() {
		initializiton();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@Test
	public void screenShot() {
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals(false, true);
		
	}

}
