package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {

    private static String AUTOMATION_PRACTISE_URL = "http://automationpractice.com/";
    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement signInButton;

    @FindBy(how = How.ID, using = "email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitLoginButton;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    private WebElement forgotPasswordLink;

    @FindBy(how = How.XPATH, using = "//span[text()='Retrieve Password']")
    private WebElement forgotPasswordSubmitButton;

    @FindBy(how = How.ID, using = "email_create")
    private WebElement createEmailField;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement createAccountButton;

    public SignInPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPractisePage() {
        driver.get(AUTOMATION_PRACTISE_URL);
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public String getErrorMessageText() {
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']/p")).getText();
    }

    public String getDetailErrorMessageInfo() {
        return driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
    }

    public WebElement getSubmitLoginButton() {
        return submitLoginButton;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public WebElement getForgotPasswordSubmitButton() {
        return forgotPasswordSubmitButton;
    }

    public WebElement getCreateEmailField() {
        return createEmailField;
    }

    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }
}
