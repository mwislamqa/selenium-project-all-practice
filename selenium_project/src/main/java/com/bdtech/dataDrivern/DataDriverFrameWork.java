package com.bdtech.dataDrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDriverFrameWork {

	public static ChromeDriver driver;

	public static void main(String[] args) throws IOException, Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.newtours.demoaut.com/");

		// driver.manage().window().maximize();
		//String excelProperty = System.getProperty("usr.dir");
		FileInputStream file = new FileInputStream("./Data/Book11.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");// providing sheet name
		// XSSFSheet sheet = workBook.getSheetAt(0);//if we provied index number we can
		// one of two
		int rowCount = sheet.getLastRowNum();// row count
		// int columnCount =sheet.getRow(0).getLastCellNum();//column count
		for (int row = 1; row < rowCount; row++) {

			XSSFRow currentrow = sheet.getRow(row);// focous of current row

			String first_name = currentrow.getCell(0).getStringCellValue();
			String last_name = currentrow.getCell(1).getStringCellValue();
			String phone = currentrow.getCell(2).getStringCellValue();
			String email = currentrow.getCell(3).getStringCellValue();
			String address = currentrow.getCell(4).getStringCellValue();
			String city = currentrow.getCell(5).getStringCellValue();
			String state = currentrow.getCell(6).getStringCellValue();
			String postcode = currentrow.getCell(7).getStringCellValue();
			String country = currentrow.getCell(8).getStringCellValue();
			String username = currentrow.getCell(9).getStringCellValue();
			String password = currentrow.getCell(10).getStringCellValue();

			// registraiton process
			driver.findElement(By.linkText("REGISTER")).click();
			// enter contact information
			driver.findElement(By.name("firstName")).clear();
			driver.findElement(By.name("firstName")).sendKeys(first_name);

			driver.findElement(By.name("lastName")).clear();
			driver.findElement(By.name("lastName")).sendKeys(last_name);

			driver.findElement(By.name("phone")).clear();
			driver.findElement(By.name("phone")).sendKeys(phone);

			driver.findElement(By.name("userName")).clear();
			driver.findElement(By.name("userName")).sendKeys(email);

			driver.findElement(By.name("address1")).clear();
			driver.findElement(By.name("address1")).sendKeys(address);

			driver.findElement(By.name("city")).clear();
			driver.findElement(By.name("city")).sendKeys(city);

			driver.findElement(By.name("state")).clear();
			driver.findElement(By.name("state")).sendKeys(state);

			driver.findElement(By.name("postalCode")).clear();
			driver.findElement(By.name("postalCode")).sendKeys(postcode);

			// select dropcountry

			Select sc = new Select(driver.findElement(By.name("country")));
			sc.selectByVisibleText("INDIA");

			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);

			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);

			driver.findElement(By.name("confirmPassword")).clear();
			driver.findElement(By.name("confirmPassword")).sendKeys(password);

			// submit botton
			Thread.sleep(3000);
			driver.findElement(By.name("register")).click();
			if (driver.getPageSource().contains("thank you for regesistaiton")) {
				System.out.println("registraiton complete for" + row + "record");

			} else {
				System.out.println("registraiton failed for" + row + "record");
			}

			/*
			 * for(int j=0;j<columnCount;j++) { String
			 * value=currentrow.getCell(j).toString();//red the value from cell
			 * 
			 * //getStringCellvalue() if value is string //getNumaricCellvalue() if value is
			 * numaric //getBooleanCellvalue() if value is true or false //.toString we() we
			 * can use all value
			 * 
			 * System.out.print("   "+value);
			 * 
			 * } System.out.println();
			 */
		}
		System.out.println("data driven completed");
		driver.close();
		driver.quit();
		file.close();
	}

}
