Feature: Default

	#*US:*
	#
	#As a user, I should be able to see My Profile
	#
	#*AC:*
	#
	#*User should be able to display "Edit User Profile" window by clicking on "Edit Profile Settings" menu.*
	#User should be able to display "Contact Information" by clicking on "My Profile" menu
	@NEXTBASE-814
	Scenario Outline: Verify that user should be able to display "Edit User Profile" window by clicking on "Edit Profile Settings" menu.
		User should be able to display Edit User Profile
		    Given User is logged in as "<userType>"
		    When click username icon
		    And click Edit Profile Settings
		    Then user should be able to see Edit Profile Page
		    Examples:
		      | userType  |
		      | HR        |
		      | Helpdesk  |
		      | Marketing |

