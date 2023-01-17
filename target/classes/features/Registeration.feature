@smoke
Feature: users could register with new accounts

  Scenario: user could register with valid data successfully
    Given click on register link
    When user select gender type
    And user type "automation" and "tester"
    And user enter email "test@example.com"
    And user enter password fields "P@sswOrd" and confirm password "P@sswOrd"
    And user click on register button
    Then register success


