package com.handle.alart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSurchHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.google.com");

		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(7000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']"));
		System.out.println("list of the number" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("java jdk")) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
		}
		Thread.sleep(3000);
		driver.close();

	}

}
