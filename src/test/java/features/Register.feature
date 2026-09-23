Feature: User registration functionality

  Scenario: Successful user registration
    Given the user is on the Demo Web Shop home page
    When the user clicks on the Register link
    And the user selects the gender
    And the user enters a unique first name
    And the user enters a unique last name
    And the user enters a unique email address
    And the user enters a valid registration password
    And the user confirms the registration password
    And the user clicks the Register button
    Then the user should be registered successfully
    
    Scenario: Registration with an already registered email

    Given the user is on the Demo Web Shop home page

    When the user clicks on the Register link

    And the user selects the gender

    And the user enters a first name

    And the user enters a last name

    And the user enters an already registered email address

    And the user enters a valid registration password

    And the user confirms the registration password

    And the user clicks the Register button

    Then the user should see an email already registered error
    
    Scenario: Registration with mismatched passwords

    Given the user is on the Demo Web Shop home page

    When the user clicks on the Register link

    And the user selects the gender

    And the user enters a first name

    And the user enters a last name

    And the user enters a unique email address

    And the user enters a valid registration password

    And the user confirms the registration password incorrectly

    And the user clicks the Register button

    Then the user should see a password mismatch error
    
 
    
    
    
    
    
    
    