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

    Scenario Outline: User can upload a file from local
      Given the user is on the login page
      Given the user enters the "<usertype>" information
      When the user navigates to file menu on activity stream page
      Then file is uploaded and the post with "Test.txt" should appear on the Activity Stream "<usertype>"
      Examples:
        | usertype  |
        | HR        |
        | Helpdesk  |
        | Marketing |

  Scenario Outline: User can send appreciation
    Given the user is on the login page
    Given the user enters the "<usertype>" information
    When selects appreciation on Activity Stream page
    And writes "Test" message to "hr55@cybertekschool.com" and clicks submit
    Then message is sent and the post with "Test" and thumbsUp should appear on the Activity Stream "<usertype>"
    Examples:
      | usertype  |
      | HR        |
      | Helpdesk  |
      | Marketing |

    