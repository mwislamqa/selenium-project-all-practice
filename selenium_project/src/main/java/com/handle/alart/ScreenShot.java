package com.handle.alart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	WebDriver driver;

	public void screenshot(WebDriver driver, String name) throws IOException {

		TakesScreenshot st = (TakesScreenshot) driver;

		File source = st.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshot/" + name + ".png");
		FileUtils.copyFile(source, target);
	}

}
