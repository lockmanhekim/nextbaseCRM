
Feature: Users should be able to login

  Scenario Outline: Login as a user
    Given the user is on the login page
    When the user enters the "<userType>" information
    Then the user should be able to login
    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |


  Scenario Outline: Users should not be able to login with invalid credentials
    Given the user is on the login page
    When the user enters the "<userType>" "<invalid>" information
    Then the user should not be able to login
    Examples:
      | userType | invalid |
      |   HR     | username|
      |   HR     | password|
      |   HR     |  empty  |
      | Helpdesk |username |
      | Helpdesk |password |
      | Helpdesk |  empty  |
      | Marketing|username |
      | Marketing|password |
      | Marketing|  empty  |


  Scenario: Users should not be able to try to login after 5 tries with invalid credentials
    Given the user is on the login page
    When the user enters invalid credentials 5 times
    Then the Error message should be "Please try again after one minute"