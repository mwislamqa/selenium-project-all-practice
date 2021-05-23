package com.TestNg;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver", "c://DevTool//geckodriver.exe");
		driver = new FirefoxDriver();
		// watch bellow link video testng
		// https://www.youtube.com/watch?v=AzVyetnW3hU
	}

	@Test
	public void tc_1() {
		
		System.out.println("my first test");
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.close();
	}
	
     // i want to skip second test case
	@Test(enabled=false)
	public void tc_2() {
		System.out.println("my second test case");

	}



	@Test
	public void tc_3() {
		System.out.println("my 3rd test case");

	}

	@AfterTest
	public void teardownTest() {
		System.out.println("test is succesful");
		
		//driver.close();

		driver.quit();

	}

}



