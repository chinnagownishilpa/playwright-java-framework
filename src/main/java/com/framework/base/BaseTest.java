package com.framework.base;

import com.framework.factories.BrowserFactory;
import com.microsoft.playwright.*;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    public void setup() {

        playwright = Playwright.create();

        browser = BrowserFactory.launchBrowser(playwright);

        context = browser.newContext();

        page = context.newPage();
    }

    public void tearDown() {

        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}
