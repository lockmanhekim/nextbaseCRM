@NEXTBASE-845
  Feature: default

  Scenario Outline: Login as a user
    Given the user is on the login page
    When the user enters the "<userType>" information
    Then the user should be able to login
    When the user clicks Drive
    Then the user should be able to display My Drive
    And the user should be able to display Company Drive
    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

