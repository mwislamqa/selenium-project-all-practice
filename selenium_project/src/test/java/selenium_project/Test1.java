package selenium_project;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test1 {

	Reporter report = new Reporter();

	@Test
	public void tc_1() {
		report.log("this test case login with invalid username");
		System.out.println("1st test case");
		//Assert.assertEquals("Test", "Test123");
	}

	@Test
	public void tc_2() {
		report.log("this test case loing invalid password");
		System.out.println("2nd test case");
	}

	@Test
	public void tc_3() {
		String userName = "selenium";

		report.log("this test case loing with valid data:::::::::" + userName);
		System.out.println("3rd test case");
	}
	@BeforeTest
	public void browser() {
		System.out.println("launch the bowser");
		
	}
	@AfterTest
	public void closebowser() {
		System.out.println("close the browser");
	}

}
