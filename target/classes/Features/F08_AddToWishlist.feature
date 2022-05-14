@smoke
Feature: User should be able add products to the wishlist


  # Test scenario 1
  Scenario: User could click on the heart icon

    When User click on the heart icon below the product
    Then User can see the selected product in the wishlist

