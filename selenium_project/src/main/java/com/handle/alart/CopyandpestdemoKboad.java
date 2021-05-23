package com.handle.alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyandpestdemoKboad {

	public static void main(String[] args) {
		
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/advanced_search");
		//send data in box
		driver.findElement(By.id("xX4UFf")).sendKeys("selenium");
		//select data for copy
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("xX4UFf")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("CwYCWc")).sendKeys(Keys.CONTROL+"v");
	}

}
