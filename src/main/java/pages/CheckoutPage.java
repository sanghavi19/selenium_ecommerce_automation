package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    public void goToCart() {
        goTo("https://automationexercise.com/view_cart");
    }

    public void clickProceedToCheckout() {
        driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]")).click();
    }

    public boolean isCheckoutPageVisible() {
        return driver.getCurrentUrl().contains("checkout");
    }
}