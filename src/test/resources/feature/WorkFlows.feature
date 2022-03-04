Feature: As a user, I should be able to create and send workflows by selecting different workflows from "More" tab under Activity Stream

  Background:
    Given the user is on the login page

    #User should be able to send a General Request by entering request Title, Description, priority level and Send Request To field.

  Scenario Outline:
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "General Request" under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab for General Request
    And the user sets priority level as "" under Workflows in Activity Stream tab for General Request
    And the user sends request to "<id>" under Workflows in Activity Stream tab for General Request
    And the user clicks on save button under Workflows in Activity Stream tab
    And the user accesses the "Workflow Tasks" under Workflows tab
    Then the user should verify the request "General Request" under Workflow Tasks
    And the user refuses the request under Workflow Tasks
    Examples:
      | user      | id  |
      | HR        | 695 |
      | Helpdesk  | 493 |
      | Marketing | 594 |
  #Negative scenario without title

  Scenario Outline:
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab for General Request
    And the user sends request to "<id>" under Workflows in Activity Stream tab for General Request
    And the user clicks on save button under Workflows in Activity Stream tab
    Then the error message "Name is not specified." should be displayed under Workflows in Activity Stream tab for General Requests

    Examples:
      | user      | id  |
      | HR        | 695 |
      | Helpdesk  | 493 |
      | Marketing | 594 |
    #Negative test case without the "send request to" input
  @dnr
  Scenario Outline:
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "General request" under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab for General Request
    And the user clicks on save button under Workflows in Activity Stream tab
    Then the error message "Required property \"Send request to\" is not specified." should be displayed under Workflows in Activity Stream tab for General Requests

    Examples:
      | user      |
      | HR        |
      | Helpdesk  |
      | Marketing |





