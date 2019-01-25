Feature: As a user I want to be able to send info to customer service

  Scenario: test 1 - try to send message without filing form
    Given User is on automationpractice page
    When I click contact us button
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Invalid email address."

  Scenario: test 2 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill message section with text "To jest test"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Invalid email address."

  Scenario: test 3- try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill order reference section with text "referencje zamówienia testowego"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Invalid email address."

  Scenario: test 4 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill e-mail section with text "test@wp.pl"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "The message cannot be blank."

  Scenario: test 5 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill e-mail section with text "test@wp.pl"
    And I fill message section with text "To jest test"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Please select a subject from the list provided."

  Scenario: test 6 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill e-mail section with text "test@wp.pl"
    And I fill order reference section with text "referencje zamówienia testowego"
    And I fill message section with text "To jest test"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Please select a subject from the list provided."

  Scenario: test 7 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill e-mail section with text "testwp.pl"
    And I fill order reference section with text "referencje zamówienia testowego"
    And I fill message section with text "To jest test"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Invalid email address."

  Scenario: test 8 - try to send message filing form
    Given User is on automationpractice page
    When I click contact us button
    And I fill order reference section with text "referencje zamówienia testowego"
    And I fill message section with text "To jest test"
    And I click send button
    Then I can see error message with "1" error
    And There are following details: "Invalid email address."

  Scenario: test 9 - try to select Customer Service Subject
    Given User is on automationpractice page
    When I click contact us button
    And I select "Customer service" subject
    Then I can see following info "For any question about a product, an order" below selector

  Scenario: test 10  - try to select Webmaster Service Subject
    Given User is on automationpractice page
    When I click contact us button
    And I select "Webmaster" subject
    Then I can see following info "If a technical problem occurs on this website" below selector

  Scenario: test 11  - try to select Customer Service and back to Choose Subject
    Given User is on automationpractice page
    When I click contact us button
    And I select "Customer service" subject
    And I back to "-- Choose --" subject
    Then I don't see any info

  Scenario: test 12  - upload file
    Given User is on automationpractice page
    When I click contact us button
    And I upload file "test.jpg"
    Then I see file: "test.jpg" text

  Scenario: test 13  - upload file after upload another
    Given User is on automationpractice page
    When I click contact us button
    And I upload file "test.jpg"
    And I upload file "test_1.png"
    Then I see file: "test_1.png" text

  Scenario: test 14 - send message successfully
    Given User is on automationpractice page
    When I click contact us button
    And I fill e-mail section with text "test@wp.pl"
    And I fill message section with text "To jest test"
    And I fill order reference section with text "referencje zamówienia testowego"
    And I upload file "test.jpg"
    And I select "Customer service" subject
    And I click send button
    Then I see success message: "Your message has been successfully sent to our team." text