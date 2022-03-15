@NEXTBASE-885
Feature: Default

	#*US:* As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#*Acceptance Criteria:*
	#
	#1. HR User can add new important repeating event with description by specifying the start-end dates in the specific time zones, adding certain location, adding attendees, color as "Pink" and availability as "Occupied".
  @NEXTBASE-873
  Scenario: Verify that HR User can add new important event with description by specifying the start-end dates in the specific time zones, adding certain location, adding attendees, color as "Pink" and availability as "Occupied".
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    When the user click ADD
    And the user fill necessary sections
    When the user click SAVE
    Then the user should be able to add new important repeating event

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#2. HR User can edit the 1st AC's task color as "Navy Blue" by using "other color".
  @NEXTBASE-874
  Scenario: Verify that HR User can edit the 1st AC's task color as "Navy Blue" by using "other color".
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user click MORE
    And the user click OTHER COLOR
    And the user select color of Navy Blue
    And the user click SAVE
    Then the user should be able to edit the 1st AC's task color.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#3. HR User can edit the 1st AC's privacy as "Private event".
  @NEXTBASE-875
  Scenario: Verify that HR User can edit the 1st AC's privacy as "Private event".
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user click MORE
    And the user click Private event
    And the user click SAVE
    Then Verify that user should be able to edit the 1st AC's privacy as Private event.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#4. Marketing user can not display the 3rd AC's private event on his/her calendar.
  @NEXTBASE-876
  Scenario: Verify that Marketing user can not display the 3rd AC's private event on his/her calendar.
    Given the user is on the login page
    Given the user enters the marketing information
    When the user navigate to calender page
    And the user search for AC's event's name
    Then verify that Marketing user can't display the 3rd AC's private event on his or her calendar.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#5. HR User can edit his/her availability from "Occupied" to "Unsure".
  @NEXTBASE-877
  Scenario: Verify that HR User can edit his/her availability from "Occupied" to "Unsure".
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user click MORE
    And select Availability as Unsure
    Then verify that user should be able to edit his or her availability from Occupied to Unsure.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#6. HR User can edit his/her event's name.
  @NEXTBASE-878
  Scenario: Verify that HR User can edit his/her event's name.
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user change event's name
    And the user click SAVE
    Then verify that user should be able to edit his or her event's name.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#7. HR User can edit Repeat section as "Daily".
  @NEXTBASE-879
  Scenario: Verify that  HR User can edit Repeat section as "Daily".
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user select Repeat section as Daily
    And the user click SAVE
    Then verify that user should be able to edit Repeat section as Daily.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#8. HR User can delete attendee by editing the event.
  @NEXTBASE-880
  Scenario: Verify that HR User can delete attendee by editing the event.
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user delete attendee
    And the user click SAVE
    Then verify that user should be able to delete attendee by editing the event.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#9. HR User can add one more attendee by editing the event.
  @NEXTBASE-881
  Scenario: Verify that HR User can add one more attendee by editing the event.
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user search for AC's event's name
    And the user click the event
    And the user click EDIT
    And the user add attendee
    And the user click SAVE
    Then verify that user should be able to add attendee by editing the event.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#10. Marketing User can display the invitations by using "Filter and search" box after clicking "Invitations" button.
  @NEXTBASE-882
  Scenario: Verify that Marketing User can display the invitations by using "Filter and search" box after clicking "Invitations" button.
    Given the user is on the login page
    Given the user enters the marketing information
    When the user navigate to calender page
    And the user click Invitation
    Then verify that user should be able display the invitations by using Filter and search box after clicking Invitations button.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#11. HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button.
  @NEXTBASE-883
  Scenario: Verify that HR User can filter events and/or tasks by using "Filter and search" box after clicking "I'M AN ORGANISER" button.
    Given the user is on the login page
    Given the user enters the HR information
    When the user navigate to calender page
    And the user click Filter and search
    And the user click I'M AN ORGANISER
    Then verify that user should be able display the events by using Filter and search box after clicking I'M AN ORGANISER button.

	#US: As a user, I should be able to navigate "Calendar" page so that user can filter and search, display, add and track the tasks or events either on "Calendar" page.
	#
	#Acceptance Criteria:
	#
	#12. Helpdesk User can reset after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status".
  @NEXTBASE-884
  Scenario: Verify that Helpdesk User can reset after selecting "Yes" under "Event with participants" menu and "Invited" under "Participant status".
    Given the user is on the login page
    Given the user enters the helpdesk information
    When the user navigate to calender page
    And the user click Filter and search
    And the user select Yes under Event with participants menu and Invited
    And the user click Search
    And the user click Reset
    Then verify that user should be able to reset Filter and Search options.