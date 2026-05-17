package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    public WebDriver driver;

    public BasePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
}