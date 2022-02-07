package org.example.productlange;

import org.example.auth.AuthSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class ProductSteps {


    public void goToCategory (WebDriverWait wait, WebDriver driver, Actions actions) {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='catalog-menu__i ']/a[@href='/category/gitary']")));
        WebElement guitars = driver.findElement(By.xpath("//div[@class='catalog-menu__i ']/a[@href='/category/gitary']"));
//        actions.moveToElement(guitars).build().perform();
        guitars.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']")));
        WebElement electroGuitars = driver.findElement(By.xpath("//div[@class='catalog-menu__i ']/a[@href='/category/gitary']"));
        electroGuitars.click();

    }

    public void goToProduct (WebDriverWait wait, WebDriver driver, Actions actions) {

    }

}
