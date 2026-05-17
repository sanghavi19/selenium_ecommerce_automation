package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public void goToLoginPage() {
        goTo("https://automationexercise.com/login");
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
    }

    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("automationexercise.com");
    }
}
