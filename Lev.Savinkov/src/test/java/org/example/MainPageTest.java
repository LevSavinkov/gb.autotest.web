package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MainPageTest extends AbstractClass {


    @Test
    @DisplayName("Переход к списку товаров категории")
    void goToCategory(){
        new MainProductMenu(getDriver()).goToCategory();
        Assertions.assertEquals(getDriver().getCurrentUrl(),"https://www.muztorg.ru/category/elektrogitary", "Не осуществлен переход к требуемой старнице");
    }

}
