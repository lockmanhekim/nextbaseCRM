@wip
Feature:


  Scenario Outline: User should see <textShown>

    Given the user is on the login page
    And the user enters the "<usertype>" information
    When user clicks on "Employees" link from left menu
    And user clicks on "<employeeTab>"
    Then user should see "<textShown>" text


    Examples:
      | usertype  | employeeTab         | textShown           |
      | HR        | Company Structure   | Company Structure   |
      | Marketing | Company Structure   | Company Structure   |
      | Helpdesk  | Company Structure   | Company Structure   |
      | HR        | Telephone Directory | Telephone Directory |
      | Marketing | Telephone Directory | Telephone Directory |
      | Helpdesk  | Telephone Directory | Telephone Directory |

