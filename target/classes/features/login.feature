@smoke
Feature: user could login the website/app

  Background: user open browser and go to login page
    Given user navigate to login page


       #Test Scenario 1
  Scenario: user login with valid data (email & password)
    When user enter "test@example.com" and "P@ssw0rd"
    And user click on login button
    Then user could login successfully and go to home page

       #Test Scenario 2
    Scenario: user login with invalid data (email & password)
      When user enter "wrong@example.com" and "P@ssw0rd"
      And user click on login button
      Then user could not login successfully
