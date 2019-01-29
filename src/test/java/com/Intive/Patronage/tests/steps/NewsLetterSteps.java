package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.NewsLetterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

import static org.hamcrest.MatcherAssert.assertThat;

public class NewsLetterSteps extends DriverFactory {

    private NewsLetterPage newsLetterPage = new NewsLetterPage(driver);

    @Given("^User is on automationpractice page$")
    private void user_Is_On_AutomationPractise_Page()  {
        newsLetterPage.openAutomationPractisePage();
    }

    @When("^I fill newsletter email: \"([^\"]*)\"$")
    public void iFillNewsletterEmail(String email) {
        newsLetterPage.getNewsletterField().sendKeys(email);
    }

    @And("^I click subscribe button$")
    public void iClickSubscribeButton() {
        newsLetterPage.getNewsletterField().sendKeys(Keys.ENTER);
    }

    @Then("^There is an error info: \"([^\"]*)\"$")
    public void thereIsAnErrorInfo(String message) {
        assertThat("User should see error message during subscribing",
                newsLetterPage.getSubscribeErrorStatus().getText().contains(message));
    }

    @Then("^There is a success info: \"([^\"]*)\"$")
    public void thereIsASuccessInfo(String message) {
        assertThat("User should see success message after subscribing",
                newsLetterPage.getSubscribeSuccessStatus().getText().contains(message));
    }

    @When("^I fill generated newsletter email: \"([^\"]*)\"$")
    public void iFillGeneratedNewsletterEmail(String domain) {
        String email = System.currentTimeMillis() +domain;
        newsLetterPage.getNewsletterField().sendKeys(email);
    }
}
