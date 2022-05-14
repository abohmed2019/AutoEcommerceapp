@smoke
Feature: User should be able to register to the app

  # Test scenario 1
  Scenario: User register with valid data

  Given User navigate to the register page
  When User enter all the valid data
  And User click on Register button
  Then User can register successfully