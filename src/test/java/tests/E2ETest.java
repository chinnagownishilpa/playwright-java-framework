package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;

public class E2ETest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;

    @BeforeMethod
    public void setupTest(){

        setup();

        page.navigate(
                ConfigReader.getProperty("baseUrl"));

        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
        cartPage = new CartPage(page);

    }

    @Test

    public void verifyUserCanAddProducts(){

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        homePage.addProduct("Sauce Labs Backpack");

        homePage.addProduct("Sauce Labs Bike Light");

        homePage.openCart();

        Assert.assertTrue(
                cartPage.isProductDisplayed("Sauce Labs Backpack"));

        Assert.assertTrue(
                cartPage.isProductDisplayed("Sauce Labs Bike Light"));

    }

}