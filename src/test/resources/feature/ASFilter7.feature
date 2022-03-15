Feature: Default

	#US:
	#
	#As a user, I should be able to use "Filter and search" functionality on Active Stream.
	#
	#AC:
	#
	#1. User should be able to see default filters as "my activity, work, favorite, announcements, and workflows"
	# 2. User should be able to add and remove field.
	# 3. User should be able to search by selecting Date,
	# 4. User should be able to search by selecting one or more Type,
	# 5. User should be able to save filter.
	# 6. User should be able to restore default field,
	# *7. User should be able to reset filters to default.*
	@NEXTBASE-983
	Scenario Outline: Verify that User should be able to reset filters to default.
		Given the user is on the login page
		    And the user enters the "<usertype>" information
		    When the user clicks on "Search and Filter" on Activity Stream
		    And the user searches all types from "type" field
		    When the user clicks "Configure filter" on filter pop-up
		    And the user clicks "Reset to default" on filter pop-up
		    When the user accepts pop-up on the page
		    Then there should be no text on filter and search field
		
		    Examples:
		      | usertype  |
		      | Marketing |
		      | Helpdesk  |
		      | HR        |