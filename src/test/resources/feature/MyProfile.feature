
@MyProfileFeature
Feature: Display Edit User Profile and Contact Information

  Scenario Outline: User should be able to display Edit User Profile
    Given User is logged in as "<userType>"
    When click username icon
    And click Edit Profile Settings
    Then user should be able to see Edit Profile Page
    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |

  Scenario Outline: User should be able to display Contact Information
    Given User is logged in as "<userType>"
    When click My Profile
    Then user should be able to see Contact information
    When user click Edit Profile Actions
    And user can change settings of own profile
    Then user should be able to see the Contact information in own profile
    Examples:
      | userType  |
      | HR        |
      | Helpdesk  |
      | Marketing |