package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class AuthPageTest extends AbstractClass{
    @Test
    @DisplayName("Успешная авторизация")
    void logIn () throws InterruptedException {
        new MainPage(getDriver()).goToAutPage();
        Thread.sleep(1000);
        Assertions.assertEquals("Вход или регистрация", getDriver().findElement(By.xpath("//div[@id='modalAuth']//div[@class='modal__header-title']")).getText());
        new AuthPage(getDriver()).sendLogin("gb.autotest.acc@gmail.com").sendPassword("1234567").clickLogInButton();
        Assertions.assertEquals("Личный кабинет", getDriver().findElement(By.xpath("//div[@id='page']//li[@class='topbar__menu-item _parent _notable']/a[@href='/user/change-auth']")).getText());
        Thread.sleep(1000);

    }

}
