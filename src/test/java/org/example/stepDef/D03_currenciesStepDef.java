package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.example.pages.P03_homePage;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage p03homePage = new P03_homePage();
    WebDriver driver = Hooks.driver;

    @Given("user go to home page")
    public void go_to_home_page() {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("select euro from currency dropdown")
    public void select_euro_from_currency_dropdown() {
        Select currencyOptions = new Select(p03homePage.CustomerCurrencyDropDownPOM());

        System.out.println(currencyOptions);
        currencyOptions.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }

    @Then("verify Euro Symbol is shown")
    public void verify_Euro_Symbol_shown() {
        String expectedResult = "€";
        List<WebElement> products = p03homePage.getProducts();

        for (WebElement productItem : products) {
            String innerText = productItem.getText();
            System.out.println("First Assertion");
            System.out.println(innerText);
            Assert.assertEquals(innerText.contains(expectedResult), true, "First Assert");
        }

        System.out.println("Second Assertion");
        System.out.println(products.stream().count());
        Assert.assertEquals(products.stream().count(), 4 , "Second Assert");
    }
}