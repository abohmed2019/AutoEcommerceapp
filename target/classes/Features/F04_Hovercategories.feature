@smoke
Feature: User should be able to select different Categories


  # Test scenario 1
  Scenario: User could hover on categories and select subcategories

    When User select any subcategory
    Then new page for selected subcategory should open

