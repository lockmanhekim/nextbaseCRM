@mms
Feature: User should be able to filter and search on Activity Stream.
  Scenario: HR User can search by "TO"
    Given the user is on the login page
    And the user enters the "HR" information
    When the user search "James" by "To"
    Then user should see "James" activities on Activity Stream



