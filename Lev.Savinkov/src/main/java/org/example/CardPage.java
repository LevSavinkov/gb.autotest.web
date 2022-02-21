package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CardPage extends AbstractPage {

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    private WebElement deleteProduct;

    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void deleteProduct() {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-trash-o']")));
        deleteProduct.click();
    }
}
