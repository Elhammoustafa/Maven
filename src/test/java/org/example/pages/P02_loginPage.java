package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_loginPage {
    WebDriver driver = Hooks.driver;

    public WebElement EmailPOM() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordPOM() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginMsg() {
        return driver.findElement(By.name("master-wrapper-page"));
    }

    public By ErrorMsg() {
        return By.className("message-error");
    }

    public void LoginSteps(String email, String password) {
        //Enter email using POM pattern
        EmailPOM().clear();
        EmailPOM().sendKeys(email);

        //Enter password using POM pattern
        passwordPOM().sendKeys(password);
    }
}
