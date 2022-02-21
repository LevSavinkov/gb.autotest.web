package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class CardPageTest extends AbstractClass{

   @Test
    @DisplayName("Удаление товара из корзины")
    void deleteProductFromCard () {
       new MainPage(getDriver()).goToCard();
       new CardPage(getDriver()).deleteProduct();
       Assertions.assertEquals("В Корзине пока нет товаров", getDriver().findElement(By.xpath("//h1[@class='text-center']")).getText());
   }
}
