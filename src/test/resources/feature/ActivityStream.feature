@wip
Feature: As a user, I should be able to use quick navigate menu; so that I can use the functions of Activity Stream quickly.
  Scenario Outline: User can send a message
    Given the user is on the login page
    Given the user enters the "<usertype>" information
    When the user click on message button on the ActivityStream page
    And sends "Test" message on ActivityStream page
    Then the message should contain "Test" as a text
    Examples:
      | usertype  |
      | HR        |
      | Helpdesk  |
      | Marketing |

    