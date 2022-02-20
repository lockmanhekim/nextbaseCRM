@wip
Feature: Joining the Working Groups

  Background:
    Given the user is on the login page

  Scenario Outline:<user> should able to join <open workgroup>
    When the user enters the "<user>" information
    Then the user should be able to login
    When the user click on Workgroups
    Then Workgroups and projects page displayed
    When the user click join button of a "<open workgroup>"
    Then the user should able to see the "<open workgroup>" in My list

    Examples:
      | user      | open workgroup            |
      | HR        | Corporate Christmas Party |
      | HR        | Soccer team               |
      | Helpdesk  | Corporate Christmas Party |
      | Helpdesk  | Soccer team               |
      | Marketing | Corporate Christmas Party |
      | Marketing | Soccer team               |

  Scenario Outline: <user> should able to join private workgroup
    When the user enters the "<user>" information
    Then the user should be able to login
    When the user click on Workgroups
    Then Workgroups and projects page displayed
    When the user click join button of a "<private workgroup>"
    Then the user should able to join the "<private workgroup>"

    Examples:
      | user      | private workgroup  |
      | HR        | PR and advertising |
      | HR        | Sales              |
      | HR        | Technology         |
      | Helpdesk  | PR and advertising |
      | Helpdesk  | Sales              |
      | Helpdesk  | Technology         |
      | Marketing | PR and advertising |
      | Marketing | Sales              |
      | Marketing | Technology         |

  Scenario Outline: <user> should able to add favorite the <workgroup>
    When the user enters the "<user>" information
    Then the user should be able to login
    When the user click on Workgroups
    Then Workgroups and projects page displayed
    When the user click on add favorite icon of "<workgroup>"
    Then the user should able to see the "<workgroup>" in Favorites list

    Examples:
      | user      | workgroup                 |
      | HR        | Corporate Christmas Party |
      | Helpdesk  | PR and advertising        |
      | Marketing | Sales                     |
