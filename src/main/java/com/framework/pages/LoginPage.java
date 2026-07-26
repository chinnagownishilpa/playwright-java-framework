package com.framework.pages;

import com.microsoft.playwright.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {
	
	private static final Logger logger =
	        LogManager.getLogger(LoginPage.class);
	private final Page page;
	
	public LoginPage(Page page) {
		this.page=page;
	}
	
	
	private final String usernameInput =
			"#user-name";
	private final String passwordInput =
            "#password";

    private final String loginButton =
            "#login-button";

    private final String errorMessage =
            "[data-test='error']";

    // Actions
    public void enterUsername(String username) {
    	logger.info("Entering username");

        page.locator(usernameInput)
                .fill(username);
    }
    public void enterPassword(String password) {

        page.locator(passwordInput)
                .fill(password);
    }

    public void clickLogin() {
    	logger.info("Clicking Login button");
        page.locator(loginButton)
                .click();
    }

    // Reusable Business Action
    public void login(String username,
                      String password) {

        enterUsername(username);

        enterPassword(password);

        clickLogin();
    }

    // Validation
    public String getErrorMessage() {

        return page.locator(errorMessage)
                .textContent();
    }
}
