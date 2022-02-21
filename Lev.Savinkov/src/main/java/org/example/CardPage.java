package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CardPage extends AbstractPage{

    @FindBy (xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteProduct;

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void deleteProduct () {
        deleteProduct.click();
    }
}
