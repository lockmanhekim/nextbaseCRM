@wip

Feature:

  Scenario: User should see Company Structure

    Given the user is on the login page
    And the user enters the "HR" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Company Structure"
    Then user should see "Company Structure" text


  Scenario: User should see Telephone Directory
    Given the user is on the login page
    And the user enters the "HR" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Telephone Directory"
    Then user should see "Telephone Directory" text

  Scenario: User should see Company Structure

    Given the user is on the login page
    And the user enters the "Helpdesk" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Company Structure"
    Then user should see "Company Structure" text


  Scenario: User should see Telephone Directory

    Given the user is on the login page
    And the user enters the "Helpdesk" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Telephone Directory"
    Then user should see "Telephone Directory" text

  Scenario: User should see Company Structure

    Given the user is on the login page
    And the user enters the "Marketing" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Company Structure"
    Then user should see "Company Structure" text


  Scenario: User should see Telephone Directory

    Given the user is on the login page
    And the user enters the "Marketing" information
    When user clicks on "Employees" link from left menu
    And user clicks on "Telephone Directory"
    Then user should see "Telephone Directory" text

