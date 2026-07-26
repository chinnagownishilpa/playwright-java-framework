package base;

import com.microsoft.playwright.*;

import factories.BrowserFactory;

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
