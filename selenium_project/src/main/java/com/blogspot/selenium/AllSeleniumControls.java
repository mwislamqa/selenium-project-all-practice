package com.blogspot.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllSeleniumControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// FirefoxDriver driver = null;

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://softwaretesting-guru.blogspot.com/p/main-page.html");
		driver.manage().window().maximize();

		WebElement wt=driver.findElement(By.linkText("Selenium Practice page"));
		wt.click();
		//Actions ad=new Actions(driver);
		

		driver.findElement(By.name("Name")).sendKeys("selenium");
		// driver.findElement(By.name("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("subscribe")).click();
		String value = driver.findElement(By.name("subscribe")).getAttribute("vlaue");

		driver.findElement(By.name("comments")).sendKeys("i love selenium framework");

		// handling drop down
		new Select(driver.findElement(By.name("countries"))).selectByVisibleText("Afganistain");
		// enter password
		driver.findElement(By.name("pwd")).sendKeys("mdsialm123");
		// handling radio botton
		driver.findElement(By.name("rating")).click();
		Thread.sleep(3000);
		// click submit botton
		driver.findElement(By.xpath("//input[@type='button' and @ value='Submit']")).click();
		Thread.sleep(3000);
		// alart handling
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@value='Display a confirm box']")).click();
		// handling cancle button
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

		// alert is predefine api interface Alert alert= driver.switchTo().alert();
		// alert.dismiss();
		// System.out.println("alert text::::::::::::::::"+alert.getText());

		driver.close();
	}

}
