package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSteps extends DriverFactory {

    private SearchPage searchPage = new SearchPage(driver);

    @Given("^User is on automationpractice page$")
    private void user_Is_On_AutomationPractise_Page()  {
        searchPage.openAutomationPractisePage();
    }

    @When("^I fill search field in search form with text: \"([^\"]*)\"$")
    public void iFillSearchFieldInSearchFormWithText(String searchText) throws Throwable {
        searchPage.getSearchForm().sendKeys(searchText);
    }

    @And("^I click search button$")
    public void iClickSearchButton() {
        searchPage.getSearchForm().sendKeys(Keys.ENTER);
    }

    @Then("^There is an info: \"([^\"]*)\"$")
    public void thereIsAnInfo(String searchResult) {
        assertThat("User should see search result message", searchPage.getSearchMessageText().contains(searchResult));
    }

    @Then("^\"([^\"]*)\" items were found$")
    public void itemsWereFound(String numberOfItems) {
        assertThat("User should see search number of found elements",
                searchPage.getSearchResultsCounter().getText().contains(numberOfItems));
    }
}
