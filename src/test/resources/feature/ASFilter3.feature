Feature: Default

	#US:
	#
	#As a user, I should be able to use "Filter and search" functionality on Active Stream.
	#
	#AC:
	#
	#1. User should be able to see default filters as "my activity, work, favorite, announcements, and workflows"
	# 2. User should be able to add and remove field.
	# *3. User should be able to search by selecting Date,*
	# 4. User should be able to search by selecting one or more Type,
	# 5. User should be able to save filter.
	# 6. User should be able to restore default field,
	# 7. User should be able to reset filters to default.
	@NEXTBASE-1004 @wip
	Scenario Outline: Verify that user should be able to search by selecting Date
		Given the user is on the login page
		    And the user enters the "<usertype>" information
		    When the user clicks on "Search and Filter" on Activity Stream
		    And the user selects "<dates>" from "date" field
		    And the user clicks "search" on filter pop-up
		    Then the user should be able to display "<dates>" based results on Activity Stream page
		
		
		    Examples:
		      | usertype  | dates        |
		      | Marketing | Yesterday    |
		      | Helpdesk  | Last N days  |
		      | HR        | Custom range |
		      | Marketing | Last N days  |
		      | HR        | Yesterday    |
		      | Helpdesk  | Custom range |
		      | Helpdesk  | Yesterday    |
		      | HR        | Last N days  |
		      | Marketing | Custom range |