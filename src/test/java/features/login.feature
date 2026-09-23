
  Feature: User Login
  
  Background:
    Given the user is on the Demo Web Shop home page

@smoke
  Scenario: Successful login with valid credentials
    When the user clicks on the Log in link
    And the user enters a valid email address
    And the user enters a valid password
    And the user clicks the Log in button
    Then the user should be logged in successfully
    
    @regression
   Scenario: Successful logout
   
    When the user clicks on the Log out link
    Then the user should be logged out successfully
    
    @regression
    Scenario Outline: Login with different credentials

   
    When the user clicks on the Log in link
    And the user enters "<email>" as email address
    And the user enters "<password>" as password
    And the user clicks the Log in button
    Then the user should see the "<expectedResult>"

Examples:
    | email                  | password |expectedResult|
    | Ganeshsur@12345.com      | 1234567   |success|
    | abc     | 123456   |failure|