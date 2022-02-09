package org.example.auth;

import org.example.startdriver.StartWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AuthSteps {

    public void authPass (WebDriverWait wait, WebDriver driver) {
        WebElement authButton = driver.findElement(By.xpath("//li[@class='topbar__menu-item _notable']/a[@data-target='#modalAuth']"));
        authButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-by-pass_phone-or-email-input']")));
        WebElement loginInput = driver.findElement(By.xpath("//input[@id='login-by-pass_phone-or-email-input']"));
        loginInput.sendKeys("gb.autotest.acc@gmail.com");


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-by-pass_password-input']")));
        WebElement passInput = driver.findElement(By.xpath("//input[@id='login-by-pass_password-input']"));
        passInput.sendKeys("1234567");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='login-by-pass_submit-btn']")));
        WebElement submitAuth = driver.findElement(By.xpath("//button[@id='login-by-pass_submit-btn']"));
        submitAuth.click();

    }

}
