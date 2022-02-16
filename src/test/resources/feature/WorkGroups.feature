Feature: Joining the Working Groups

  Background:
    Given the user is on the login page

  @wip
  Scenario Outline:<user> should able to join open workgroup
    When the user enters the "<user>" information
    Then the user should be able to login
    When the user click on Workgroups
    Then Workgroups and projects page displayed
    When the user click join button of "<open workgroup>"
    Then the user should able to see the "<open workgroup>" in My list

    Examples:
      | user      | open workgroup            |
      | HR        | Corporate Christmas Party |
      | HR        | Soccer team               |
      | helpdesk  | Corporate Christmas Party |
      | helpdesk  | Soccer team               |
      | marketing | Corporate Christmas Party |
      | marketing | Soccer team               |
