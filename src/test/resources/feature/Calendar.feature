
Feature: As a user, I should be able to use Calendar function

  Scenario Outline: User should see <textTab>
    Given the user is on the login page
    And the user enters the "<usertype>" information
    When user clicks on "Calendar" link from left menu.
    And the user clicks "<calendarMenu>" tab on the page header
    Then the user should display "<textTab>" on the content area.
    Examples:
      | usertype  | calendarMenu     | textTab        |
      | HR        | My Calendar      | Calendar       |
      | Marketing | My Calendar      | Calendar       |
      | Helpdesk  | My Calendar      | Calendar       |
      | HR        | Company Calendar | Event Calendar |
      | Marketing | Company Calendar | Event Calendar |
      | Helpdesk  | Company Calendar | Event Calendar |