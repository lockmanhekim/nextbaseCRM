@NEXTBASE-807
Feature: Default

	#*US:*
	#
	#As a user, I should be able to use Workgroups function on Activity Stream
	#
	#*AC:*
	#
	#*User should be able to Join groups*
	#User should be able to add groups to favorite
	@NEXTBASE-799
	Scenario Outline: Verfiy that user should able to join open workgroup
		Given the user is on the login page
		    When the user enters the "<user>" information
		    Then the user should be able to login
		    When the user click on Workgroups
		    Then Workgroups and projects page displayed
		    When the user click join button of a "<open workgroup>"
		    Then the user should able to see the "<open workgroup>" in My list
		    
		    Examples:
		      | user      | open workgroup            |
		      | HR        | Corporate Christmas Party |
		      | HR        | Soccer team               |
		      | Helpdesk  | Corporate Christmas Party |
		      | Helpdesk  | Soccer team               |
		      | Marketing | Corporate Christmas Party |
		      | Marketing | Soccer team               |	

	#*US:*
	#
	#As a user, I should be able to use Workgroups function on Activity Stream
	#
	#*AC:*
	#
	#*User should be able to Join groups*
	#User should be able to add groups to favorite
	@NEXTBASE-800
	Scenario Outline: Verfiy that user should able to join private workgroup
		Given the user is on the login page
		    When the user enters the "<user>" information
		    Then the user should be able to login
		    When the user click on Workgroups
		    Then Workgroups and projects page displayed
		    When the user click join button of a "<private workgroup>"
		    Then the user should able to join the "<private workgroup>"
		    
		    Examples:
		      | user      | private workgroup  |
		      | HR        | PR and advertising |
		      | HR        | Sales              |
		      | HR        | Technology         |
		      | Helpdesk  | PR and advertising |
		      | Helpdesk  | Sales              |
		      | Helpdesk  | Technology         |
		      | Marketing | PR and advertising |
		      | Marketing | Sales              |
		      | Marketing | Technology         |	

	#*US:*
	#
	#As a user, I should be able to use Workgroups function on Activity Stream
	#
	#*AC:*
	#
	#User should be able to Join groups
	#*User should be able to add groups to favorite*
	@NEXTBASE-801
	Scenario Outline: Verify that user should able to add favorite the workgroup
		Given the user is on the login page
		    When the user enters the "<user>" information
		    Then the user should be able to login
		    When the user click on Workgroups
		    Then Workgroups and projects page displayed
		    When the user click on add favorite icon of "<workgroup>"
		    Then the user should able to see the "<workgroup>" in Favorites list
		
		    Examples:
		      | user      | workgroup                 |
		      | HR        | Corporate Christmas Party |
		      | Helpdesk  | PR and advertising        |
		      | Marketing | Sales                     |