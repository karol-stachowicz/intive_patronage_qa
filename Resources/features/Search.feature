Feature: As a user I want to be able to search results

  Scenario: test 1 - try to search non existing element
    Given User is on automationpractice page
    When I fill search field in search form with text: "test"
    And I click search button
    Then There is an info: "No results were found for your search"

  Scenario: test 2 - try to search without search phrase
    Given User is on automationpractice page
    And I click search button
    Then There is an info: "Please enter a search keyword"

  Scenario: test 3 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "dress"
    And I click search button
    Then  "7" items were found

  Scenario: test 4 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "t-shirt"
    And I click search button
    Then  "1" items were found

  Scenario: test 5 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "@"
    And I click search button
    Then There is an info: "No results were found for your search"

  Scenario: test 6 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "@!#$%^&*"
    And I click search button
    Then There is an info: "No results were found for your search"

  Scenario: test 7 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "blouse"
    And I click search button
    Then  "1" items were found

  Scenario: test 8 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "printed"
    And I click search button
    Then  "5" items were found

  Scenario: test 9 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "summer"
    And I click search button
    Then  "4" items were found

  Scenario: test 10 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "           "
    And I click search button
    Then There is an info: "No results were found for your search"

   Scenario: test 11 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "   dress   "
    And I click search button
    Then  "7" items were found

  Scenario: test 12 - try to search existing items
    Given User is on automationpractice page
    When I fill search field in search form with text: "'dress"
    And I click search button
    Then  "7" items were found

