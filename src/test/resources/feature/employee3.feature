

Feature: Default

	#User Story:
	#
	#As a user, I should be able to land on Employee menu; so that I can use Employee modules.
	#
	# 
	#
	#Acceptance Criteria:
	#
	#*1.User should be able to display company structure.*
	#*2.User should be able to display telephone directory.*
	@NEXTBASE-802
	Scenario Outline: Verify that all user types are able to see Company Structure and Telephone Directory

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