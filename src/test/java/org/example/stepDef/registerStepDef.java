package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterPage;
import org.testng.asserts.SoftAssert;

public class registerStepDef {
    RegisterPage register = new RegisterPage();

    @Given("click on register link")
    public void click_register() {
        register.RegisterLink.click();
    }

    @When("user select gender type")
    public void select_gender_type() {
        register.Male.click();
    }

    @And("user type {string} and {string}")
    public void first_last_name(String firstname, String lastname) {
        register.FirstName.sendKeys(firstname);
        register.LastName.sendKeys(lastname);
    }

    @And("user enter email {string}")
    public void user_enter_email(String email) {
        register.Email.sendKeys(email);
    }

    @And("user enter password fields {string} and confirm password {string}")
    public void user_renter_password_and_confirm(String pass, String confirmPass) {
        register.Password.sendKeys(pass);
        register.ConfirmPassword.sendKeys(confirmPass);
    }

    @And("user click on register button")
    public void user_click_on_register() {
        register.RegisterButton.click();
    }

    @Then("register success")
    public void registerSuccess() {
        String expectedResult = "Your registration completed";
        String expectedResultColor = "rgba(76, 177, 124, 1)";

        String actualResult = register.SuccessRegister.getText();
        String actualResultColor = register.SuccessRegister.getCssValue("color");

        //**Soft Assertion
        SoftAssert soft = new SoftAssert();
        // First assertion
        System.out.println("First Register Assertion");
        soft.assertTrue(actualResult.contains(expectedResult),"First Assertion True");

        //Second assertion
        System.out.println("Second Register Assertion");
        soft.assertEquals(actualResultColor, expectedResultColor,"Second Assertion");

        soft.assertAll();
    }
}
