@marketplace
Feature: As a user, I can use Applications menu; so that I can install or manage the applications.

  @NEXTBASE-810
  Scenario Outline: Verify that user can display the applications
    Given the user is on the login page
    Given the user enters the "<usertype>" information
    When the user clicks on more button from menu
    And the user clicks on application link from menu
    Then the user should see applications in marketplace
    Examples:
      | usertype  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @NEXTBASE-811
  Scenario Outline: Verify that user can send a request for installing if there is no permission for installing
    Given the user is on the login page
    Given the user enters the "<usertype>" information
    When the user clicks on more button from menu
    And the user clicks on application link from menu
    Then the user should see applications in marketplace
    When the user clicks on the item on the Marketplace page
    And the user clicks on an installation button
    Then the request to install application to the administrators should be sent
    Examples:
      | usertype  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  @NEXTBASE-812
  Scenario Outline: Verify that user can display the application's description, versions, support and installation
    Given the user is on the login page
    Given the user enters the "<usertype>" information
    When the user clicks on more button from menu
    And the user clicks on application link from menu
    Then the user should see applications in marketplace
    When the user clicks on the item on the Marketplace page
    And the browser switch to Application
    And the user clicks on Description tab in the application
    Then the user should be able to see description information
    When the user clicks on Versions tab in the application
    Then the user should be able to see versions information
    When the user clicks on Support tab in the application
    Then the user should be able to see support information
    When the user clicks on Install tab in the application
    Then the user should be able to see install information
    Examples:
      | usertype  |
      | HR        |
      | Helpdesk  |
      | Marketing |







