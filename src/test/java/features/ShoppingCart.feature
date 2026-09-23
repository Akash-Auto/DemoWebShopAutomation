
Feature: Shopping cart functionality

  Scenario: Add a desktop product to cart

    Given the user is on the Demo Web Shop home page

    When the user clicks on Computers

    And the user clicks on Desktops

    And the user selects a desktop product

    And the user clicks on Add to cart

    Then the product should be added to the shopping cart