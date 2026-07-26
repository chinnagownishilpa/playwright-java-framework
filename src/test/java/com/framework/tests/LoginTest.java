package com.framework.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.framework.base.BaseTest;
import com.framework.utilities.ConfigReader;

public class LoginTest extends BaseTest{
	
	@BeforeMethod
	public void start() {
		setup();
	}
	
	@AfterMethod
	public void end() {
		tearDown();
	}
	
	@Test
	public void verifyLoginPageTitle() {
		page.navigate(ConfigReader.getProperty("baseUrl"));
        String actualTitle = page.title();
        System.out.println(actualTitle);
        
        Assert.assertEquals(actualTitle, "Swag Labs");
	}
	
	
}
