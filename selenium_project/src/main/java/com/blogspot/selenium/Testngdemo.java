package com.blogspot.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testngdemo {

	
	@Test
	public void tc_1() {
		System.out.println("first test ");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
}
