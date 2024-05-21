Feature: Validate the Adactin login function

   
  @Test
  Scenario Outline: validate Adactin login functionality
 Given User lunch the Adactin url
  When User Enter the "<UserName>" and "<Password>"
  Then User click on login button
  And User validate the home page title
    Examples: 
      | UserName | Password     |
      | username | userpassword |

  @Test
  Scenario Outline: Validate invalide user
    Given User lunch the Adactin url
    When User Enter the invalid "<invalidUser>" and "<invalidPassword>"
    Then User click on login button
    When User select the location
Examples: 
      | invalidUser | invalidPassword |
      | User        | Passwords       |
    