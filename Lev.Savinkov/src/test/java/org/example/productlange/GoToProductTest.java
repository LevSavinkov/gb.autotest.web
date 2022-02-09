package org.example.productlange;

import org.example.auth.AuthSteps;
import org.example.startdriver.StartWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoToProductTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = StartWebDriver.startDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);
        AuthSteps authSteps = new AuthSteps();
        ProductSteps productSteps = new ProductSteps();

        authSteps.authPass(wait, driver);
        Thread.sleep(2000);
        productSteps.goToCategory(wait, driver, actions);
        productSteps.goToFirstProduct(wait, driver);

        driver.quit();
    }
}
