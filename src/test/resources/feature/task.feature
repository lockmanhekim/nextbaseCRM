@NEXTBASE-837
Feature: Default

	#+*User Story:*+ 
	#
	#As a user, I should be able to use Tasks function on Tasks Page
	#
	# 
	#
	#+*Acceptance Criteria:*+
	#
	#*1.User should be able to display tasks "In Progress" by clicking "All Tasks" tab.*
	#
	#2.User should be able to display tasks "Ongoing Tasks" by clicking "Ongoing Tasks" tab
	@NEXTBASE-835
	Scenario Outline: Verify that user should be able to display tasks "In Progress" by clicking "All Tasks" tab.
		Given the user is on the login page
		    Given the user enters the "<userType>" information
		    When  user navigates to Tasks page
		    Then "<userType>" user should be able to display tasks "<taskStatus>" by clicking "<taskTab>" tab.
		
		    Examples:
		      |userType | taskStatus |taskTab |
		      |HR       |In Progress |All Tasks  |
		      |Helpdesk |In Progress |All Tasks   |
		      |Marketing|In Progress |All Tasks  |	

	#+*User Story:*+ 
	#
	#As a user, I should be able to use Tasks function on Tasks Page
	#
	# 
	#
	#+*Acceptance Criteria:*+
	#
	#*1.User should be able to display tasks "In Progress" by clicking "All Tasks" tab.*
	#
	#2.User should be able to display tasks "Ongoing Tasks" by clicking "Ongoing Tasks" tab
	@NEXTBASE-836
	Scenario Outline: Verify that users able to display tasks "Ongoing Tasks" by clicking "Ongoing Tasks" tab.
		Given the user is on the login page
		      Given the user enters the "<userType>" information
		      When  user navigates to Tasks page
		      Then "<userType>" user should be able to display tasks "<taskStatus>" by clicking "<taskTab>" tab.
		
		      Examples:
		      |userType | taskStatus    |taskTab       |
		      |HR       | Ongoing Tasks | Ongoing Tasks|
		      |Helpdesk |Ongoing Tasks  |Ongoing Tasks |
		      |Marketing|Ongoing Tasks  |Ongoing Tasks |