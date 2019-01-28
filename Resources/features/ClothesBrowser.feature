Feature: As a user I want to be able to browse clothes catalog

  Scenario: test 1 - go to T-Shirt category
    Given User is on automationpractice page
    When I click "T-Shirts" button
    Then I can see "T-Shirts" page header

  Scenario: test 2 - go to Dresses category
    Given User is on automationpractice page
    When I click "Dresses" button
    Then I can see "Dresses" page header

  Scenario: test 3 - go to Women category
    Given User is on automationpractice page
    When I click "Women" button
    Then I can see "Women" page header

  Scenario: test 4 - filter T-Shirt category by orange color
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Orange" color
    Then I can see "T-SHIRTS > COLOR ORANGE" page header

  Scenario: test 5 - filter T-Shirt category by S size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "S" size
    Then I can see "T-SHIRTS > SIZE S" page header

  Scenario: test 6 - filter T-Shirt category by M size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "M" size
    Then I can see "T-SHIRTS > SIZE M" page header

  Scenario: test 7 - filter T-Shirt category by L size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "L" size
    Then I can see "T-SHIRTS > SIZE L" page header

  Scenario: test 8 - filter Dresses category by L size
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "L" size
    Then I can see "DRESSES > SIZE L" page header

  Scenario: test 9 - filter Dresses category by M size
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "M" size
    Then I can see "DRESSES > SIZE M" page header

  Scenario: test 10 - filter Dresses category by S size
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "S" size
    Then I can see "DRESSES > SIZE S" page header

  Scenario: test 11 - filter Women category by L size
    Given User is on automationpractice page
    When I click "Women" button
    And I select "L" size
    Then I can see "WOMEN > SIZE L" page header

  Scenario: test 12 - filter Women category by M size
    Given User is on automationpractice page
    When I click "Women" button
    And I select "M" size
    Then I can see "WOMEN > SIZE M" page header

  Scenario: test 13 - filter Women category by S size
    Given User is on automationpractice page
    When I click "Women" button
    And I select "S" size
    Then I can see "WOMEN > SIZE S" page header

  Scenario: test 14 - filter T-Shirt category by orange color and S size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Orange" color
    And I select "S" size
    Then I can see "T-SHIRTS > SIZE S > COLOR ORANGE" page header

  Scenario: test 15 - filter T-Shirt category by orange color and M size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Orange" color
    And I select "M" size
    Then I can see "T-SHIRTS > SIZE M > COLOR ORANGE" page header

  Scenario: test 16 - filter T-Shirt category by orange color and L size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Orange" color
    And I select "L" size
    Then I can see "T-SHIRTS > SIZE L > COLOR ORANGE" page header

  Scenario: test 17 - filter T-Shirt category by blue color and L size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Blue" color
    And I select "L" size
    Then I can see "T-SHIRTS > SIZE L > COLOR BLUE" page header

  Scenario: test 18 - filter T-Shirt category by blue color and M size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Blue" color
    And I select "M" size
    Then I can see "T-SHIRTS > SIZE M > COLOR BLUE" page header

  Scenario: test 19 - filter T-Shirt category by blue color and S size
    Given User is on automationpractice page
    When I click "T-Shirts" button
    And I select "Blue" color
    And I select "S" size
    Then I can see "T-SHIRTS > SIZE S > COLOR BLUE" page header

  Scenario: test 20 - filter Dresses category by blue and yellow color
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "Blue" color
    And I add "Yellow" color
    Then I can see "DRESSES > COLOR BLUE/YELLOW" page header

  Scenario: test 21 - filter Dresses category by S and M size
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "S" size
    And I add "M" size
    Then I can see "DRESSES > SIZE S/M" page header

  Scenario: test 22 - filter Dresses category by green and white color
    Given User is on automationpractice page
    When I click "Dresses" button
    And I select "Green" color
    And I add "White" color
    Then I can see "DRESSES > COLOR WHITE/GREEN" page header