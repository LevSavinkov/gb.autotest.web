package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage extends AbstractPage{

    @FindBy(xpath = "//section[@class='product-thumbnail'][1]//a[@itemprop='image']")
    private WebElement firstProduct;

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public void goToFirstProduct () {
        firstProduct.click();
    }

}
