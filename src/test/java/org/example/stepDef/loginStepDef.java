package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginStepDef {
    WebDriver driver = Hooks.driver;
    LoginPage login = new LoginPage();

    @Given("user navigate to login page")
    public void navigate_to_login_page()
    {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void enter_valid_data(String email , String password)
    {
       login.LoginSteps(email,password);
    }

    @And("user click on login button")
    public void click_on_button()
    {
        login.passwordPOM().sendKeys(Keys.ENTER);
    }

    @Then("user could login successfully and go to home page")
    public void login_successfully() {
        String expectedResult = "master-wrapper-page";
        String actualResult = driver.findElement(By.name("master-wrapper-page")).getText();

        Assert.assertEquals(actualResult.contains(expectedResult), true);
        Assert.assertTrue(actualResult.contains(expectedResult), "Assertion True");

        //user go to home page
        Assert.assertEquals("https://demo.nopcommerce.com/", driver.getCurrentUrl());
    }

    @Then("user could not login successfully")
    public void wrong_successfully()
    {
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualResult = driver.findElement(login.ErrorMsg()).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
