package com.handle.alart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoberHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.actitime.com/free-time-tracking-software");
		//click mouse hober apply botton
		
		WebElement features = driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));
		//action is a class by selenium
		Actions action= new Actions(driver);
		action.moveToElement(features).build().perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//click link feature
		driver.findElement(By.linkText("Work Scope Management")).click();
		
		
			}

}
