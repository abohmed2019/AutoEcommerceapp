@smoke
Feature: User should be able to search for a product

  # Test scenario 1
  Scenario: User search with product name

  When User search for specific product with name
  And User click on the search button
  Then User can found the product easily

    # Test scenario 2
  Scenario: User search with product SKU

    When User search for specific product with SKU
    And User click on the search button
    Then User can found the product easily