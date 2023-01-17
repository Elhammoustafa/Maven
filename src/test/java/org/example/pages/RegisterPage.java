package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.stepDef.Hooks;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage() {
        this.driver = Hooks.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement RegisterLink;

    @FindBy(id = "gender-male")
    public WebElement Male;

    @FindBy(id = "FirstName")
    public WebElement FirstName;

    @FindBy(id = "LastName")
    public WebElement LastName;

    @FindBy(id = "Email")
    public WebElement Email;

    @FindBy(id = "Password")
    public WebElement Password;

    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    public WebElement RegisterButton ;

    @FindBy(className = "result")
    public WebElement SuccessRegister ;
}
