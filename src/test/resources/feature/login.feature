@login
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
