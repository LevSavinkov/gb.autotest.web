package org.example.productlange;

import org.example.startdriver.StartWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoToProductTest {
    public static void main(String[] args) {
        WebDriver driver = StartWebDriver.startDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);
        ProductSteps productSteps = new ProductSteps();
        productSteps.goToProduct(wait, driver, actions);
    }
}
