package com.framework.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.base.BaseTest;
import com.framework.utilities.ConfigReader;

import retry.RetryAnalyzer;

public class LoginTest extends BaseTest {
	
	@BeforeMethod
	public void start() {
		setup();
	}
	
	@AfterMethod
	public void end() {
		tearDown();
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyLoginPageTitle() {
		page.navigate(ConfigReader.getProperty("baseUrl"));
        String actualTitle = page.title();
        System.out.println(actualTitle);
        
        Assert.assertEquals(actualTitle, "Swag Labs");
	}
	
	
}
