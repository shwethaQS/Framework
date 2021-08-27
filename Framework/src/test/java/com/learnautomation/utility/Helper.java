package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	// screenshot,alerts,sync issues,javascript executor, frames, windows

	public static String captureScreenshort(WebDriver driver) {

		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath = System.getProperty("user.dir")+"/Screenshots/FreeCRM"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotpath));
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot " + e.getMessage());

		}
		return screenshotpath;

	}

	public void handleFrames() {

	}

	public static String getCurrentDateTime() {
		DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customformat.format(currentDate);
		
	}

}
