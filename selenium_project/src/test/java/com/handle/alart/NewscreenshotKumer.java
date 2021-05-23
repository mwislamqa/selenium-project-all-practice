package com.handle.alart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewscreenshotKumer {
 
	public WebDriver driver;
	@Test(priority=1)
	public void t_1() {
		driver = new FirefoxDriver();
		driver.get("http://wwww.google.com");
	}
	@Test(priority=2)
	public void t_2() {
		driver.findElement(By.name("q")).sendKeys("selenium");
	}
	@Test(priority=3)
	public void t_3() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
}
