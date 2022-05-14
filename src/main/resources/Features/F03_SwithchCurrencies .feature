@smoke
Feature: User should be able switch between currencies



  # Test scenario 1
  Scenario: User could switch between currencies [$, €]

    When User Select “Euro” from currency dropdown list
    Then User can see the prices with the new selected currency

