package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest {

    CartPage cartPage;

    @BeforeMethod
    public void setup() {
        cartPage = new CartPage();
        cartPage.goToHome();
    }

    @Test
    public void addToCartTest() {
        cartPage.searchProduct("dress");
        cartPage.addFirstProductToCart();
        cartPage.goToCart();
        Assert.assertTrue(cartPage.isCartNotEmpty());
    }

    @AfterMethod
    public void teardown() {
        cartPage.closeBrowser();
    }
}