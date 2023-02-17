package org.example.pages;

import org.example.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class P03_homePage {
    WebDriver driver = Hooks.driver;

    public WebElement CustomerCurrencyDropDownPOM() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> getProducts() {
        return driver.findElements(By.className("actual-price"));
    }

    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> searchResultProducts(){
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]>a"));
    }

    public WebElement skuElement (){
        return Hooks.driver.findElement(By.cssSelector("span[id*=\"sku-\"]"));
    }

    public List<WebElement> categories() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }
    public List<WebElement> subCategories(int randomCategoryNum) {
            randomCategoryNum = randomCategoryNum + 1;
           return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li:nth-child("+randomCategoryNum+")>ul[class=\"sublist first-level\"]>li>a[href]"));
    }

    public WebElement getPageTitle() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }

    public WebElement GetUrl() {
      return Hooks.driver.findElement(By.id("nivo-slider"));
    }

    public WebElement GetFacebookUrl() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"]>a[href]"));
    }
    public WebElement GetTwitterUrl() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]>a[href]"));
    }
    public WebElement GetRssUrl() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"]>a[href]"));
    }
    public WebElement GetYoutubeUrl() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"]>a[href]"));
    }

    public List<WebElement> WishlistBtns() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }
    public WebElement SuccessMessage (){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement wishListItems (){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]"));
    }
}

