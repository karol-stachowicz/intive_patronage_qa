package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.ClothesBrowserPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.hamcrest.MatcherAssert.assertThat;

public class ClothesBrowserSteps extends DriverFactory {

    private ClothesBrowserPage clothesBrowserPage = new ClothesBrowserPage(driver);

    @Given("^User is on automationpractice page$")
    public void user_Is_On_AutomationPractise_Page() {
        clothesBrowserPage.openAutomationPractisePage();
    }

    @When("^I click \"([^\"]*)\" button$")
    public void iClickButton(String category) {
        clothesBrowserPage.getCategory(category).click();
    }

    @Then("^I can see \"([^\"]*)\" page header$")
    public void iCanSeePageHeader(String header) throws InterruptedException {
        Thread.sleep(5000);
        String headerText = clothesBrowserPage.getCategoryHeader().getText().trim();
        assertThat(String.format("Page header should have text %s", header),
                header.equalsIgnoreCase(headerText));
    }

    @And("^I select \"([^\"]*)\" color$")
    public void iSelectColor(String color) throws InterruptedException {
        clothesBrowserPage.getColorItem(color).click();
        Thread.sleep(5000);
        clothesBrowserPage.getColorItem(color).click();
    }

    @And("^I select \"([^\"]*)\" size$")
    public void iSelectSize(String size) throws InterruptedException {
        clothesBrowserPage.getSizeItem(size).click();
        Thread.sleep(5000);
        clothesBrowserPage.getSizeItem(size).click();
    }

    @And("^I add \"([^\"]*)\" size$")
    public void iAddSize(String size) throws InterruptedException {
        Thread.sleep(5000);
        clothesBrowserPage.getSizeItem(size).click();
    }

    @And("^I add \"([^\"]*)\" color$")
    public void iAddColor(String color) throws InterruptedException {
        Thread.sleep(5000);
        clothesBrowserPage.getColorItem(color).click();
    }
}
