package com.handle.alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoadTabdemo {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();
		//tab operation
		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("as_epq")).sendKeys(Keys.TAB);
		
	}

}
