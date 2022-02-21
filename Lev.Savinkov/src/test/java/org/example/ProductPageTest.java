package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ProductPageTest extends AbstractClass{

    @Test
    @DisplayName("Добавление товара в корзину из карточки товара")
    void addToCard () {
        new MainProductMenu(getDriver()).goToCategory();
        new ProductListPage(getDriver()).goToFirstProduct();
        new ProductPage(getDriver()).AddToCard();
        Assertions.assertEquals(1, getDriver().findElements(By.id("cart-accept")).size());
    }
}
