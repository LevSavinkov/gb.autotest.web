package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthPage extends AbstractPage{

    @FindBy(xpath = "//input[@id='login-by-pass_phone-or-email-input']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@id='login-by-pass_password-input']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id='login-by-pass_submit-btn']")
    private WebElement submitAuthButton;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public AuthPage sendLogin(String login){
        loginInput.sendKeys(login);
        return this;
    }

    public AuthPage sendPassword (String pass){
        passwordInput.sendKeys(pass);
        return this;
    }

    public void clickLogInButton () {
        submitAuthButton.click();
    }

}
