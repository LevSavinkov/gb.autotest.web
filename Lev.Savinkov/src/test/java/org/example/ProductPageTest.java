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
        new CardPage(getDriver()).deleteProduct();
    }

    @Test
    @DisplayName("Изменение кол-ва выводимых товаров")
    void changeQuantityProducts () throws InterruptedException {
        new MainProductMenu(getDriver()).goToCategory();
        new ProductListPage(getDriver()).openQuantityList();
        Thread.sleep(2000);
        new ProductListPage(getDriver()).selectQuantity();
        Assertions.assertEquals(72, getDriver().findElements(By.xpath("//div[@class='thumbnail-list grid-3']/section")));
    }


}
