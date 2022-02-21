package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends AbstractPage{
    @FindBy(xpath = "//a[@class='btn btn-default btn-block btn-product-orange ']")
    WebElement inCardButton;

    @FindBy(xpath = "//a[@class='btn btn-block btn-orange']")
    WebElement placeAnOrder;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void AddToCard () {
        inCardButton.click();
        placeAnOrder.click();
    }

}
