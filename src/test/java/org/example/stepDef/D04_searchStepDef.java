package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
   P03_homePage p03homePage = new P03_homePage();
    WebDriver driver = Hooks.driver;

 @When("user click on search field")
    public void user_click_on_search_field(){
     p03homePage.searchField().click();
 }
    @And("^user search with \"(.*)\"$")
    public void user_search_with_productName(String searchWord){
        System.out.println(searchWord);
        p03homePage.searchField().sendKeys(searchWord);
    }
    @And("user click on search button")
    public void user_click_search_button(){
        p03homePage.searchBtn().click();
    }
    @And("user click on product")
    public void user_click_on_product(){
        List<WebElement> products = p03homePage.searchResultProducts();
        products.stream().findFirst().get().click();
    }

    @Then("^user could find \"(.*)\" relative result$")
    public void user_could_find_relative_result(String productName){
        List<WebElement> products = p03homePage.searchResultProducts();
        SoftAssert soft = new SoftAssert();
        System.out.println("productName: " + productName);
        //1
        String currentUrl = driver.getCurrentUrl();
        soft.assertTrue(currentUrl.contains("https://demo.nopcommerce.com/search?q="));

        //2.1
        soft.assertNotEquals(products.size(), 0);

        //2.2 Assertion
        for (WebElement productItem : products) {
            String innerText = productItem.getText();
            System.out.println("innerText: "  + innerText);
            soft.assertTrue(innerText.toLowerCase().contains(productName.toLowerCase()),"First Assertion True");
        }
//        soft.assertAll();
    }

    @Then("^validate that the sku shown in page \"(.*)\"$")
    public void get_the_sku_shown_in_page(String sku){
        WebElement skuElement = p03homePage.skuElement();
        String actualResult = skuElement.getText();
        String expectedResult = sku;

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
