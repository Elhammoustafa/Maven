package org.example.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage home = new P03_homePage();

    @When("user click on facebook link")
    public void user_click_on_facebook_link() throws InterruptedException {
        WebElement url = home.GetFacebookUrl();
        url.click();
        Thread.sleep(2000) ;
    }

    @When("user click on twitter link")
    public void user_click_on_twitter_link() throws InterruptedException {
        WebElement url = home.GetTwitterUrl();
        url.click();
        Thread.sleep(2000) ;
    }

    @When("user click on rss link")
    public void user_click_on_rss_link() throws InterruptedException {
        WebElement url = home.GetRssUrl();
        url.click();
        Thread.sleep(2000) ;
    }

    @When("user click on youtube link")
    public void user_click_on_youtube_link() throws InterruptedException {
        WebElement url = home.GetYoutubeUrl();
        url.click();
        Thread.sleep(2000) ;
    }
    @Then("get url from new opened tab {string}")
    public void get_url_from_new_opened_tab(String expectedUrl) throws InterruptedException {
        //1- get window list inside array
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        if(tabs.size() == 2) {
            //2- switch from tab 0 to tab 1
            Hooks.driver.switchTo().window(tabs.get(1));

            String actualUrl = Hooks.driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl);

            //3- close new tab
            Thread.sleep(1000) ;
            Hooks.driver.close();

            //4- back to tab 0
            Hooks.driver.switchTo().window(tabs.get(0));
        }
        else {
            Assert.assertEquals(tabs.size(), 2);
        }
    }

}
