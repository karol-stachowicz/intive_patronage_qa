Feature: As a user I want to subscribe to newsletter

  Scenario: test 1 - try to subscribe with subscribed email
    Given User is on automationpractice page
    When I fill newsletter email: "test@wp.pl"
    And I click subscribe button
    Then There is an error info: "This email address is already registered."

  Scenario: test 2 - try to subscribe with invalid email
    Given User is on automationpractice page
    When I fill newsletter email: "test"
    And I click subscribe button
    Then There is an error info: "Invalid email address."

  Scenario: test 3 - subscribe with new email
    Given User is on automationpractice page
    When I fill generated newsletter email: "@net.pl"
    And I click subscribe button
    Then There is a success info: "You have successfully subscribed to this newsletter."

