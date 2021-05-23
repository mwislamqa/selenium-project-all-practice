import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/drivers/geckodriver.exe");

		
		//System.setProperty("WedDriver.gecko.driver", System.getProperty("user.dir")+"//drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
		

	}

}
