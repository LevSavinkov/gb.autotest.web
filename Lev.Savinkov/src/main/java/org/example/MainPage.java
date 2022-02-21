package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends AbstractPage{

    @FindBy(xpath = "//li[@class='topbar__menu-item _notable']/a[@data-target='#modalAuth']")
    private WebElement loginButton;

    @FindBy(css = ".header__cart-text")
    private WebElement cardButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goToAutPage () {
        loginButton.click();
    }

    public void goToCard () {
        cardButton.click();
    }
}
