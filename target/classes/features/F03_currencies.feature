@smoke
Feature: users choose currency

  Scenario: users choose currency
    Given user go to home page
    And select euro from currency dropdown
    Then verify Euro Symbol is shown