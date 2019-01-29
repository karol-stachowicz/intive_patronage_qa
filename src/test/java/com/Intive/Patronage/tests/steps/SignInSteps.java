package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SignInSteps extends DriverFactory {

    private SignInPage signInPage = new SignInPage(driver);

    @Given("^User is on automationpractice page$")
    private void user_Is_On_AutomationPractise_Page()  {
        signInPage.openAutomationPractisePage();
    }

    @When("^I click login button$")
    public void iClickLoginButton() {
        signInPage.getSubmitLoginButton().click();
    }

    @And("^I put email: \"([^\"]*)\"$")
    public void iPutEmail(String email) {
        signInPage.getEmailField().sendKeys(email);
    }

    @Then("^I put password: \"([^\"]*)\"$")
    public void iPutPassword(String password) {
        signInPage.getPasswordField().sendKeys(password);
    }

    @And("^There is an error: \"([^\"]*)\"$")
    public void thereIsAnError(String error) {
        assertThat("User should see error message", signInPage.getErrorMessageText().equals(error));
    }

    @When("^I click sign in button$")
    public void iClickSignInButton() {
        signInPage.getSignInButton().click();
    }

    @And("^I can see detail error message \"([^\"]*)\"$")
    public void iCanSeeDetailErrorMessage(String errorMessage) {
        assertThat("User should see error message detail", signInPage.getDetailErrorMessageInfo().equals(errorMessage));
    }

    @And("^I click forgot password link$")
    public void iClickForgotPasswordLink() {
        signInPage.getForgotPasswordLink().click();
    }

    @And("^I click forgot password submit button$")
    public void iClickForgotPasswordSubmitButton() {
        signInPage.getForgotPasswordSubmitButton().click();
    }

    @And("^I put email: \"([^\"]*)\" in create email field$")
    public void iPutEmailInCreateEmailField(String email) {
        signInPage.getCreateEmailField().sendKeys(email);
    }

    @And("^I click create account button$")
    public void iClickCreateAccountButton() {
        signInPage.getCreateAccountButton().click();
    }
}
