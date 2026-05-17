package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        loginPage = new LoginPage();
        loginPage.goToLoginPage();
    }

    @Test
    public void validLoginTest() {
        loginPage.enterEmail("test@example.com");
        loginPage.enterPassword("test123");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }

    @AfterMethod
    public void teardown() {
        loginPage.closeBrowser();
    }
}
