package com.framework.base;

import com.framework.factories.BrowserFactory;
import com.microsoft.playwright.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseTest  {
	

    protected static ThreadLocal<Page> pageThread = new ThreadLocal<>();
    
    private static final Logger logger =
            LogManager.getLogger(BaseTest.class);

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    public void setup() {
    	logger.info("Launching browser");

        playwright = Playwright.create();

        browser = BrowserFactory.launchBrowser(playwright);
        logger.info("Creating browser context");

        context = browser.newContext();

        page = context.newPage();

        pageThread.set(page);
    }

    public void tearDown() {
    	logger.info("Closing browser");
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }

    public static Page getPage() {

        return pageThread.get();

    }

}
