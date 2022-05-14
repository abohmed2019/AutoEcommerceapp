@smoke
Feature: User should be able to Login to the app

  Background: user open browser and navigate to login page
    Given User navigate to the Login page

  # Test scenario 1
  Scenario Outline: User Login with valid email and password

    When User enter <username> and <password>
    And User click on Login button
    Then User can Login successfully

    Examples:
      | username     | password   |
      | "de286a1c6e47@tmail.ws" | "Anaahmedsami" |