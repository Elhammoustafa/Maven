package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver = Hooks.driver;

    public WebElement CustomerCurrencyDropDownPOM() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> getProducts() {
        return driver.findElements(By.className("actual-price"));
    }
}
