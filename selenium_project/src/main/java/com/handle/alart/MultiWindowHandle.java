package com.handle.alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		WebDriver driver;

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.hdfcbank.com");
		// click mouse hober apply botton
		driver.findElement(By.id("div-close")).click();
		WebElement applyNow = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span"));

		Actions action = new Actions(driver);
		action.moveToElement(applyNow).build().perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// click link feature
		driver.findElement(By.linkText("Credit Card")).click();
		Thread.sleep(5000);

		String parentwind = driver.getWindowHandle();
		System.out.println("parent window:::::::::::::" + parentwind);

		for (String childwindow : driver.getWindowHandles()) {
			System.out.println("child window property::::" + childwindow);
			// switch to focus child window
			driver.switchTo().window(childwindow);
		}
		driver.findElement(By.xpath("//*[@id=\"rightNavPanel\"]/div[1]/img")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("3475747644");

		Thread.sleep(3000);
		// switch to focus parent window
		driver.switchTo().window(parentwind);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='searchbox']")).sendKeys("car loan");

	}

}
