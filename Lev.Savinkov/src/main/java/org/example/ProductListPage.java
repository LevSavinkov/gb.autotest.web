package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage extends AbstractPage {

    @FindBy(xpath = "//section[@class='product-thumbnail'][1]//a[@itemprop='image']")
    private WebElement firstProduct;

    @FindBy(id = "select2-products-per-page-container")
    private WebElement quantityProductsElement;

    @FindBy(id = "products-per-page")
    private WebElement quantityLisElement;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void goToFirstProduct() {
        firstProduct.click();
    }

    public void openQuantityList() {
        quantityProductsElement.click();
    }

    public void selectQuantity() {
        Select select = new Select(quantityLisElement);
        select.selectByIndex(2);
//                selectByValue("/category/elektrogitary?in-stock=1&amp;pre-order=1&amp;per-page=72");
    }

}
