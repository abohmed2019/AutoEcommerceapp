@smoke
Feature: User should be able add products to the shopping card
Background: User go to the item banner
  When User select any subcategory
  Then new page for selected subcategory should open

  # Test scenario 1
  Scenario: User add an ite to the shopping card

    When User click on 'add to comparing list icon'
    Then User can see the selected product in the comparing list

