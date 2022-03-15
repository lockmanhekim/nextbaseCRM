Feature: As a user, I should be able to create and send workflows by selecting different workflows from "More" tab under Activity Stream

  Background:
    Given the user is on the login page

    #User should be able to send a General Request by entering request Title, Description, priority level and Send Request To field.

  Scenario Outline: User should be able to send General request
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "General Request" under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab
    And the user sets priority level as "<Priority level>" under Workflows in Activity Stream tab for General Request
    And the user sends request to "<id>" under Workflows in Activity Stream tab for General Request
    And the user clicks on save button under Workflows in Activity Stream tab
    And the user accesses the "Workflow Tasks" under Workflows tab
    Then the user should verify the request "General Request" under Workflow Tasks
    And the user refuses the request under Workflow Tasks
    Examples:
      | user      | id  | Priority level |
      | HR        | 695 | Low            |
      | Helpdesk  | 493 | Medium         |
      | Marketing | 594 | High           |
  #Negative scenario without title

  Scenario Outline: User should not be able to send General request without title
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab
    And the user sends request to "<id>" under Workflows in Activity Stream tab for General Request
    And the user clicks on save button under Workflows in Activity Stream tab
    Then the error message "Name is not specified." should be displayed under Workflows in Activity Stream tab for General Requests

    Examples:
      | user      | id  |
      | HR        | 695 |
      | Helpdesk  | 493 |
      | Marketing | 594 |
    #Negative test case without the "send request to" input

  Scenario Outline: User should not be able to send general request without "send request to" input
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "General Requests" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "General request" under Workflows in Activity Stream tab
    And the user enters description as "General request description" under Workflows in Activity Stream tab
    And the user clicks on save button under Workflows in Activity Stream tab
    Then the error message "Required property \"Send request to\" is not specified." should be displayed under Workflows in Activity Stream tab for General Requests

    Examples:
      | user      |
      | HR        |
      | Helpdesk  |
      | Marketing |


  Scenario Outline: User should be able to request a Leave Approval
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "Leave Approval" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user enters "start date" as "<start date>" under Workflows in Activity Stream tab for Leave Request
    And the user enters "end date" as "<end date>" under Workflows in Activity Stream tab for Leave Request
    And the user selects absence type as "<absence type>" under Workflows in Activity Stream tab for Leave Request
    And the user specifies the reason for leave as "<reason>" under Workflows in Activity Stream tab for Leave Request
    Examples:
      | user      | absence type                            | start date | end date   | reason               |
      | HR        | Absent without reason or official leave | 07/05/2022 | 07/17/2022 | No particular reason |
      | Helpdesk  | Annual leave                            | 08/06/2023 | 08/08/2023 | Important reason     |
      | Marketing | Business trip                           | 09/09/2024 | 09/09/2024 |                      |

  Scenario Outline: User should be able to request a Business Trip
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "Business Trip" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "<title>" under Workflows in Activity Stream tab
    And the user enters destination as "<destination>" under Workflows
    And the user enters "start date" as "<start date>" under Workflows in Activity Stream tab for Business Trip
    And the user enters "end date" as "<end date>" under Workflows in Activity Stream tab for Business Trip
    And the user enters description as "<description>" under Workflows in Activity Stream tab
    And the user enters planned expenses as "<expenses>" under Workflows in Activity Stream tab
    And the user sets currency as "<currency>" under Workflows in Activity Stream tab for business trip
    And the user uploads a file "Test.txt" under Workflows in Activity Stream tab for business trip
    Examples:
      | user      | title         | destination | start date | end date   | description          | currency | expenses |
      | HR        | Trip          | New York    | 07/05/2022 | 07/17/2022 | No particular reason | USD      | 2000     |
      | Helpdesk  | Business trip | Budapest    | 08/06/2023 | 08/08/2023 | Important reason     | EUR      | 1        |
      | Marketing | Hello         | Moscow      | 09/09/2024 | 09/09/2024 |                      | GBP      | 9999999  |


  Scenario Outline: User should be able to send purchase request
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "Purchase Request" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "Purchase request" under Workflows in Activity Stream tab
    And the user specifies amount as "<amount>" under Workflows in Activity Stream tab
    And the user sets currency as "<currency>" under Workflows in Activity Stream tab for purchase request
    And the user uploads a file "Test.txt" under Workflows in Activity Stream tab for purchase request
    Examples:
      | user      | amount | currency |
      | HR        | 2000   | CNY      |
      | Helpdesk  | 3000   | JPY      |
      | Marketing | 0      | BRL      |
@dnr
  Scenario Outline: User should be able to send expense report
    When the user enters the "<user>" information
    Then the user should be able to login
    And the user accesses the "Workflows"
    And the user accesses the "Workflows in Activity Stream" under Workflows tab
    And the user clicks on "Expense Report" module under Workflows in Activity Stream tab
    When the user clicks on Add button under Workflows in Activity Stream tab
    And the user specifies the title as "Expense report" under Workflows in Activity Stream tab
    And the user enters description as "Sending an expense report" under Workflows in Activity Stream tab for expense report
    And the user specifies amount as "<amount>" under Workflows in Activity Stream tab for expense report
    And the user sets currency as "<currency>" under Workflows in Activity Stream tab for expense report
    And the user uploads a file "Test.txt" under Workflows in Activity Stream tab for expense report
    Examples:
      | user      | amount | currency |
      | HR        | 2000   | CNY      |
      | Helpdesk  | 3000   | JPY      |
      | Marketing | 0      | BRL      |



