package com.testautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

public class LoginTestCRM extends BaseClass {

	@Test(priority=1)
	public void loginApp() {

		logger = report.createTest("Login to CRM");

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting application");
		loginpage.logintoCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Logged in Successfully");
	}
	
	

}
