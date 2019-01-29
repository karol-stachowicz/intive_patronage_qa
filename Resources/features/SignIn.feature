Feature: As a user I want to be able to sign in to app

  Scenario: test 1 - try to login with wrong credentials
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I put password: "haslo"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Authentication failed."


  Scenario: test 2 - try to login without password
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Password is required."

  Scenario: test 3 - try to login without email
    Given User is on automationpractice page
    When I click sign in button
    And I put password: "haslo"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "An email address required."

  Scenario: test 4 - try to login with invalid password
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I put password: "1"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Invalid password."

  Scenario: test 5 - try to login with invalid password
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I put password: "12"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Invalid password."

  Scenario: test 6 - try to login with invalid password
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I put password: "123"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Invalid password."

  Scenario: test 7 - try to login with invalid password
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "test@wp.pl"
    And I put password: "1234"
    And I click login button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Invalid password."

  Scenario: test 8 - try to fill forgot password form with not existing email in database
    Given User is on automationpractice page
    When I click sign in button
    And I click forgot password link
    And I put email: "test@wp.pl"
    And I click forgot password submit button
    Then There is an error: "There is 1 error"
    And I can see detail error message "There is no account registered for this email address."

  Scenario: test 9 - try to fill forgot password form with wrong email address
    Given User is on automationpractice page
    When I click sign in button
    And I click forgot password link
    And I put email: "testwp.pl"
    And I click forgot password submit button
    Then There is an error: "There is 1 error"
    And I can see detail error message "Invalid email address."

  Scenario: test 10 - try to create account with wrong email address
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "testwp.pl" in create email field
    And I click create account button
    Then I can see detail error message "Invalid email address."

  Scenario: test 11 - try to create account with empty email address
    Given User is on automationpractice page
    When I click sign in button
    And I put email: "" in create email field
    And I click create account button
    Then I can see detail error message "Invalid email address."