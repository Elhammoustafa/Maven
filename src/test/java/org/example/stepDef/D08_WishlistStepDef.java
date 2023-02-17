package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Background;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    P03_homePage home = new P03_homePage();
    @When("user add product to Wishlist")
    public void user_add_product_to_Wishlist() throws InterruptedException {
      home.WishlistBtns().get(2).click();
      Thread.sleep(2000);
    }

    @Then("success message is visible")
    public void success_message_is_visible(){
        SoftAssert soft = new SoftAssert();
       soft.assertTrue(home.SuccessMessage().isDisplayed());
       String backgroundColour= home.SuccessMessage().getCssValue("background-color");
        System.out.println("colour is"+    backgroundColour);
    }

    @And("user get num of wishlist items after adding product")
    public void user_get_num_of_wishlist_items(){

       String text = home.wishListItems().getText();
       text = text.replaceAll("[^0-9]","");
       num = Integer.parseInt(text);

    }
    int num;
    @Then("num of wishlist items increased")
    public void num_of_wishlist_items_increased(){
        Assert.assertTrue(num>0);
    }

}















