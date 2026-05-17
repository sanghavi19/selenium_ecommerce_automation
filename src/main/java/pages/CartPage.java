package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    public void goToHome() {
        goTo("https://automationexercise.com");
    }

    public void searchProduct(String product) {
        driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys(product);
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
    }

    public void addFirstProductToCart() {
        driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
    }

    public void goToCart() {
        goTo("https://automationexercise.com/view_cart");
    }

    public boolean isCartNotEmpty() {
        return driver.findElements(By.xpath("//tbody/tr")).size() > 0;
    }
}