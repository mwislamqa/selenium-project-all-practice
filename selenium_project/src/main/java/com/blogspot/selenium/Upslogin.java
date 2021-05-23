package com.blogspot.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upslogin {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		// "/drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "c://DevTool//geckodriver.exe");

		//WebDriver driver;
		driver = new FirefoxDriver();

		driver.get("https://www.ups.com/us/en/Home.page");
		
		//login();
		
		login("mytest", "test123"); 
		
		//closeApp();
		
		/*WebElement login = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[1]/a"));
		login.click();
		WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
		userId.sendKeys("mdislam123");
		WebElement passWord = driver.findElement(By.id("pwd"));
		passWord.sendKeys("mdislam123");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div/div/form/div[3]/div/label"));
		checkbox.click();
		WebElement userlogin = driver.findElement(By.id("submitBtn"));
		userlogin.click();
		WebElement error = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div/div/form/p[2]"));
		String info = error.getText();
		System.out.println(info);*/

	}
	
	public static void login(String uid, String pass) {
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[1]/a"));
		login.click();
		WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
		userId.sendKeys(uid);
		WebElement passWord = driver.findElement(By.id("pwd"));
		passWord.sendKeys(pass);
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div/div/form/div[3]/div/label"));
		checkbox.click();
		WebElement userlogin = driver.findElement(By.id("submitBtn"));
		userlogin.click();
		WebElement error = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div/div/form/p[2]"));
		String info = error.getText();
		System.out.println(info);
	}
	
	static void closeApp() {
		driver.close();
	}

}
