package org.example.auth;

import org.example.startdriver.StartWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassAuthTest {
    public static void main(String[] args) {
        WebDriver driver = StartWebDriver.startDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        AuthSteps authSteps = new AuthSteps();

        authSteps.authPass(wait, driver);

        driver.quit();
    }
}
