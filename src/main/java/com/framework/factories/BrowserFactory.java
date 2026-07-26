package com.framework.factories;

import com.framework.utilities.ConfigReader;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class BrowserFactory {
	
	public static Browser launchBrowser(Playwright playwright) {
		String browserName=ConfigReader.getProperty("browser");
		boolean headless=Boolean.parseBoolean(ConfigReader.getProperty("headless"));
		
		Browser browser; 
		switch(browserName.toLowerCase()) {
		case "firefox" : 
			browser=playwright.firefox().launch(
				new BrowserType.LaunchOptions().setHeadless(headless));
			break;
			
		case "webkit" : 
			browser=playwright.webkit().launch(
				new BrowserType.LaunchOptions().setHeadless(headless));	
			break;
		default : 
			browser=playwright.chromium().launch(
					new BrowserType.LaunchOptions().setHeadless(headless));
		}
		return browser;
	}

}
