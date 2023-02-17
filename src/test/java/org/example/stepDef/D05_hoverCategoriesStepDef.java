package org.example.stepDef;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();

    String category;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {
        //get main category
        List<WebElement> categories = home.categories();
        int randomNum = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        WebElement mainCategory = categories.get(randomNum);
        hover.moveToElement(mainCategory).perform();

        //get sub category
        List<WebElement> subCategories = home.subCategories(randomNum);
         int randomNumSub = new Random().nextInt(3);
        WebElement subCategory = subCategories.get(randomNumSub);
        String subCategoryText = subCategory.getText().toLowerCase().trim();
        subCategory.click();

        //Get page title
        WebElement pageTitle = home.getPageTitle();
        String pageTitleText = pageTitle.getText().toLowerCase().trim();

        Thread.sleep(1000);
        Assert.assertEquals(pageTitleText, subCategoryText, "First Assert");
    }



}
