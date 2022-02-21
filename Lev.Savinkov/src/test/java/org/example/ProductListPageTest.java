package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ProductListPageTest extends AbstractClass{


    @Test
    @DisplayName("Переход к первому продукту из списка товаров категории")
    void goToProduct() throws InterruptedException {
        new MainProductMenu(getDriver()).goToCategory();
        new ProductListPage(getDriver()).goToFirstProduct();
        Assertions.assertEquals(1, getDriver().findElements(By.xpath("//a[@class='btn btn-default btn-block btn-product-orange ']")).size());
    }
}
