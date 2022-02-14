package org.example.productlange;

import org.example.auth.AuthSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ProductSteps {


    public void goToCategory(WebDriverWait wait,WebDriver driver, Actions actions) {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='catalog-menu__i ']/a[@href='/category/gitary']")));
        WebElement guitars = driver.findElement(By.xpath("//div[@class='catalog-menu__i ']/a[@href='/category/gitary']"));
        actions.moveToElement(guitars).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']")));
        WebElement electroGuitars = driver.findElement(By.xpath("//div[@class='catalog-menu__category']/a[@href='/category/elektrogitary']"));
        electroGuitars.click();

    }

    public void goToFirstProduct(WebDriverWait wait, WebDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='product-thumbnail'][1]//div//a[@itemprop='image']")));
        WebElement firstProduct = driver.findElement(By.xpath("//section[@class='product-thumbnail'][1]//div//a[@itemprop='image']"));
        firstProduct.click();
    }

    public void addToCard(WebDriverWait wait, WebDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-default btn-block btn-product-orange ']")));
        WebElement addToCardButton = driver.findElement(By.xpath("//a[@class='btn btn-default btn-block btn-product-orange ']"));
        addToCardButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-block btn-orange']")));
        addToCardButton = driver.findElement(By.xpath("//a[@class='btn btn-block btn-orange']"));
        addToCardButton.click();
    }

}
