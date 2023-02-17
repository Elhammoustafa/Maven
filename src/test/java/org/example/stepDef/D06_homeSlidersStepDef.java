package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class D06_homeSlidersStepDef {

        P03_homePage home = new P03_homePage();

        @When("user click on first slider")
        public void user_click_on_first_slider() {
                WebElement GetUrl = home.GetUrl();
                GetUrl.click();
        }
        @Then("get url")
                public void get_url(){
                String actualUrl = Hooks.driver.getCurrentUrl();
                String expectedUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
                Assert.assertEquals(actualUrl, expectedUrl);
        }

        @When("user click on second slider")
                public void user_click_on_second_slider(){
                WebElement GetUrl = home.GetUrl();
                GetUrl.click();
        }
        @Then("get url2")
        public void get_url2(){
                String actualUrl = Hooks.driver.getCurrentUrl();
                String expectedUrl = "https://demo.nopcommerce.com/iphone-6";
                Assert.assertEquals(actualUrl, expectedUrl);
        }

}
