@NEXTBASE-943
Feature: Default

	#*User Story*: As a user, I should be able to add news under Company.
	#
	#
	#*Acceptance Criteria:*
	#*1.* Marketing User should be able to select type of information under preview text.
	@NEXTBASE-942 @NextBaseCRM
	Scenario Outline: Verify that Marketing User should be able to select type of information under preview text.
		"<userType>" should be able to select "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*2.* Marketing User should be able to select date and set a time under preview text.
	@NEXTBASE-944
	Scenario Outline: Verify that Marketing User should be able to select date and set a time under preview text.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*3.* Marketing User should be able to add and remove a picture under details.
	@NEXTBASE-945
	Scenario Outline: Verify that Marketing User should be able to add and remove a picture under details.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*4.* HR User should be able to select type of information under preview text.
	@NEXTBASE-946
	Scenario Outline: Verify that HR User should be able to select type of information under preview text.
		"<userType>" should be able to select "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*5.* HR User should be able to select date and set a time under preview text.
	@NEXTBASE-947
	Scenario Outline: Verify that HR User should be able to select date and set a time under preview text.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*6.* HR User should be able to add and remove a picture under details.
	@NEXTBASE-948
	Scenario Outline: Verify that HR User should be able to add and remove a picture under details.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*7.* HR User should be able to edit a picture under details.
	@NEXTBASE-949
	Scenario Outline: Verify that HR User should be able to edit a picture under details.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*8.* HR User should be able to add tags under details.
	@NEXTBASE-950
	Scenario Outline: Verify that HR User should be able to add tags under details.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*9.* HR User should be able to select Text, HTML and Visual Editor.
	@NEXTBASE-951
	Scenario Outline: Verify that HR User should be able to select Text, HTML and Visual Editor.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*10.* Helpdesk User should be able to send news.
	@NEXTBASE-952
	Scenario Outline: Verify that Helpdesk User should be able to send news.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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

	#*User Story:* As a user, I should be able to add news under Company.
	#
	#*Acceptance Criteria:*
	#*11.* HR User should be able to send news.
	@NEXTBASE-953
	Scenario Outline: Verify that HR User should be able to send news.
		"<usertype>" should be able to "<fields>" under "<popupTabs>"
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