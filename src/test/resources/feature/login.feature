Feature: Users should be able to login
  @login
  Scenario: Login as a HR
    Given the user is on the login page
    When the user enters the HR information
    Then the user should be able to login
  @login
  Scenario:  Login as a helpdesk
    Given the user is on the login page
    When the user enters the helpdesk information
    Then the user should be able to login
  @login
  Scenario: Login as a marketing
    Given the user is on the login page
    When the user enters the marketing information
    Then the user should be able to login