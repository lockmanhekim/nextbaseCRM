Feature: Default

	#*US:*
	#
	#As a user, I should be able to see My Profile
	#
	#*AC:*
	#
	#User should be able to display "Edit User Profile" window by clicking on "Edit Profile Settings" menu.
	#*User should be able to display "Contact Information" by clicking on "My Profile" menu*
	@NEXTBASE-815
	Scenario Outline: Verify that user should be able to display "Contact Information" by clicking on "My Profile" menu
		User should be able to display Contact Information
		
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