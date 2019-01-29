package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {

    private static String AUTOMATION_PRACTISE_URL = "http://automationpractice.com/";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchForm;

    @FindBy(how = How.XPATH, using = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-warning")
    private WebElement searchElemntResult;

    @FindBy(how = How.CLASS_NAME, using = "heading-counter")
    private WebElement searchResultsCounter;

    public SearchPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPractisePage() {
        driver.get(AUTOMATION_PRACTISE_URL);
    }

    public WebElement getSearchForm() {
        return searchForm;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public String getSearchMessageText() {
        return searchElemntResult.getText();
    }

    public WebElement getSearchResultsCounter() {
        return searchResultsCounter;
    }
}