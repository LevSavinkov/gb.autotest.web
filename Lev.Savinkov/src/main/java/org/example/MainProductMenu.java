package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainProductMenu extends AbstractPage {

    @FindBy(xpath = "//div[@class='catalog-menu__i ']/a[@href='/category/gitary']")
    private WebElement guitarMenuPoint;

    @FindBy(xpath = "//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']")
    private WebElement electroGuitarPointSubMenu;

    public MainProductMenu(WebDriver driver) {
        super(driver);
    }

    public void goToCategory () {
        Actions actions = new Actions(getDriver());
        actions
                .moveToElement(this.guitarMenuPoint)
                .build()
                .perform();
        new WebDriverWait(getDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']")));
        getDriver().findElement(By.xpath("//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']")).click();
    }
}
