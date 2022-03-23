
Feature: As a user, I should be able to add news under Company.

  Scenario Outline: "<userType>" should be able to select "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  User should be able to select type of information under preview text
    Examples:
      | userType  | popupTabs    | fields              |
      | HR        | Preview text | Type of information |
      | Marketing | Preview text | Type of information |

  @wip1
  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to select a date and set a time
    Examples:
      | userType  | popupTabs    | fields        |
      | HR        | Preview text | calendar icon |
      | Marketing | Preview text | calendar icon |


  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to add or remove the picture
    Examples:
      | userType  | popupTabs | fields                     |
      | HR        | Details   | add picture remove picture |
      | Marketing | Details   | add picture remove picture |


  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to edit a picture under details
    Examples:
      | userType | popupTabs | fields       |
      | HR       | Details   | edit picture |


  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to add tags under details
    Examples:
      | userType | popupTabs | fields |
      | HR       | Details   | Tags   |


  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to select Text, HTML and Visual Editor
    Examples:
      | userType | popupTabs | fields                                         |
      | HR       | Details   | textRadioBtn htmlRadioBtn visualEditorRadioBtn |


  Scenario Outline: "<usertype>" should be able to "<fields>" under "<popupTabs>"
    Given the user is on the login page
    Then the user enters the "<userType>" information
    When user clicks on "Company" link from left side
    And  the user should display "ADD NEWS" button on the page title menu
    When the user click "ADD NEWS" button
    Then the user clicks "<popupTabs>" tab on the work area
    Then user should clicks "<fields>" field on the work area
    And  user should be able to send news

    Examples:
      | userType | popupTabs    | fields              |
      | HR       | Preview text | titleBox saveButton |
      | Helpdesk | Preview text | titleBox saveButton |
