Feature: Product Search

  Scenario: Search for a product

    Given the user is on the Demo Web Shop home page
    When the user searches for "computer"
    And the user clicks the search button
    Then the search results should be displayed