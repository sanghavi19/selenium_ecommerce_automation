package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest {

    CheckoutPage checkoutPage;

    @BeforeMethod
    public void setup() {
        checkoutPage = new CheckoutPage();
        checkoutPage.goToCart();
    }

    @Test
    public void checkoutTest() {
        checkoutPage.clickProceedToCheckout();
        Assert.assertTrue(checkoutPage.isCheckoutPageVisible());
    }

    @AfterMethod
    public void teardown() {
        checkoutPage.closeBrowser();
    }
}