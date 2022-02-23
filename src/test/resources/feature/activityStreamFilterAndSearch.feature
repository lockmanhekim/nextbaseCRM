@mms
Feature: User should be able to filter and search on Activity Stream.

  Scenario Outline: User can search by "TO" <users>
    Given the user is on the login page
    And the user enters the "<userType>" information
    When the user search "<Names>" by "To"
    Then user should see "<Result>" activities on Activity Stream
    Examples:
      | users     |  | userType  |  | Names         |  | Result        |
      | HR        |  | HR        |  | James         |  | James         |
      | Helpdesk  |  | Helpdesk  |  | James         |  | James         |
      | Marketing |  | Marketing |  | James         |  | James         |
      | HR        |  | HR        |  | All employees |  | All employees |
      | Helpdesk  |  | Helpdesk  |  | All employees |  | All employees |
      | Marketing |  | Marketing |  | All employees |  | All employees |
      | HR        |  | HR        |  | Depart3       |  | Depart3       |
      | Helpdesk  |  | Helpdesk  |  | Depart3       |  | Depart3       |
      | Marketing |  | Marketing |  | Depart3       |  | Depart3       |


    Scenario Outline: User can search by "Author" <users>
      Given the user is on the login page
      And the user enters the "<userType>" information
      When the user searches "<Names>" by Author
      Then user should see "<Result>" activities on Activity Stream "Author"
      Examples:
        | users     |  | userType  |  | Names         |  | Result        |
        | HR        |  | HR        |  | James         |  | James         |
        | Helpdesk  |  | Helpdesk  |  | James         |  | James         |
        | Marketing |  | Marketing |  | James         |  | James         |





