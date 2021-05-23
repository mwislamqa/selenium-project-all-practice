package com.handle.alart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownload {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		//URL launching
		driver.get("https://www.google.com/");
		//send data in the text box
		driver.findElement(By.name("q")).sendKeys("java");
		//click on enter option on keyboard
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//click head line
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/table/tbody/tr[1]/td[1]/div/span/h3/a")).click();
		Thread.sleep(3000);
		//click java free downlaod
		driver.findElement(By.xpath("//div[@class='jvdl0 jvdl0v0']/a/span")).click();
		
		
	}

}
