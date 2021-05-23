package com.blogspot.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.ups.com/us/en/Home.page?");
		
            //upsSing Up
		WebElement signup = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[2]/a"));
		signup.click();
		WebElement inputName = driver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
		inputName.sendKeys("md islam");
		WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
		inputEmail.sendKeys("wislam1981ny@gmail.com");
		WebElement userid = driver.findElement(By.id("ups-user_id_input"));
		userid.sendKeys("mdislam12345");
		WebElement pass = driver.findElement(By.id("ups-user_password_input"));
		pass.sendKeys("123456789ssR");
		/*
		 * //problem click group click botton WebElement clickagree=
		 * driver.findElement(By.xpath("//label[@class='ups-checkbox-custom-label']"));
		 * clickagree.click(); WebElement error=
		 * driver.findElement(By.xpath("//*[@id=\"main\"]")); String
		 * info=error.getText(); System.out.println(info);
		 */
		// find the web page link size
		/*List<WebElement> getTotalLink = driver.findElements(By.tagName("a"));

		System.out.println(getTotalLink.size());
		// find the all link text
		
		 * for(int i=0;i<getTotalLink.size();i++){ String linkTest=
		 * getTotalLink.get(i).getText();}
		 
		for (WebElement linkTest : getTotalLink) {

			System.out.println(linkTest.getText());

		}*/
		Thread.sleep(3000);
		//traking 
		WebElement traking = driver.findElement(
				By.xpath("//a[@role='button' and@class='ups-analytics ups-menu_toggle' and @id='ups-menuLinks0']"));
		traking.click();

		WebElement sublink = driver.findElement(By.xpath("//a[text()='Track & Tracking History']"));
		Thread.sleep(2000);
		sublink.click();
		WebElement subTracNo = driver.findElement(By.xpath("//*[@id='stApp_trackingNumber']"));
		subTracNo.sendKeys("track123456789lock");

		WebElement tracRefNumber = driver.findElement(By.xpath("//button[@class='ups-link' and @type='button' and @id='stApp_btn_refTrack']"));
				

		tracRefNumber.click();

		WebElement mailInnovatins = driver.findElement(By.xpath("//label[@class='ups-radio-custom-label' and @for='trkShipmentTypeMailInnovations']"));
				
		mailInnovatins.click();
		driver.findElement(By.xpath("//input[@id='trkShipmentReference']")).sendKeys("home");
		driver.findElement(By.xpath("//input[@type='text' and @name='trkShipperAcct']")).sendKeys("ac1020113");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ups-icon-x']")).click();
		WebElement services = driver.findElement(By.xpath("//li[@class='ups-navMenu ups-menu']//a[text()='Services']"));
		services.click();

		// login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[1]/a"));
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
		System.out.println(info);
		/*
		 * Thread.sleep(4000); driver.close();
		 */
	}

}
