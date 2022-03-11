@NEXTBASE-974
Feature: Default

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#*1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.*
	#*2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".*
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-961
	Scenario: Verify that Helpdesk user should be able to display "Event Calendar"
		Given the user is on the login page
		    When the user enters the helpdesk information
		    And the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the Helpdesk click on Meeting Room Booking Calendar View
		    Then "Meeting Room Booking" page should be displayed
		    When the Helpdesk user click on Book meeting room
		    Then Helpdesk User can be redirected to New Event page	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#*3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.*
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-962
	Scenario: Verify that Helpdesk user should be able to uncheck the East Meeting Room
		Given the user is on the login page
		    When the user enters the helpdesk information
		    And the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the Helpdesk click on Meeting Room Booking Calendar View
		    Then "Meeting Room Booking" page should be displayed
		    When the user uncheck the East Meeting Room
		    Then East Meeting Room should be unchecked	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#*4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.*
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-963
	Scenario: Verify that Marketing User should be able to suggest new idea
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    When the user click on "New idea"
		    When creates new idea using following information
		      | Title            | Meetings            |
		      | Idea description | Effective meetings  |
		      | Tags             | problem solving     |
		      | Category         | Company Activity    |
		    Then the idea should be displayed on page having same content with provided info
		      | Idea description | Effective meetings  |	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#*4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.*
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-964
	Scenario Outline: Verify that Marketing User should not be able to suggest new idea without title
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    When the user click on "New idea"
		    When the user enters "<Title>", "<Idea description>", "<Tags>", "<Category>"
		    Then the "warning message" should be displayed
		
		    Examples:
		      | Title | Idea description      | Tags     | Category         |
		      |       | Workflow is important | job      | Company Activity |
		      |       |                       | vacation | Holidays         |	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#*4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.*
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-965
	Scenario Outline: Verify that Marketing User should not be able to suggest new idea without Idea description
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    When the user click on "New idea"
		    When the user enters "<Title>", "<Idea description>", "<Tags>", "<Category>"
		    Then the "warning message" should be displayed
		
		    Examples:
		      | Title              | Idea description | Tags          | Category               |
		      | Communication      |                  | communication | Domestic business      |
		      | Customer Relations |                  | customer      | International business |	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#*6. Marketing User can like the idea.*
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-966
	Scenario: Verify that Marketing User should be able to like ideas
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    When the user Like "Meetings" idea by clicking on plus icon
		    And the user hover over the "plus icon"
		    Then title should be Stop liking this item	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#*5. Marketing User can dislike the idea.*
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-967
	Scenario: Verify that Marketing User should be able to unlike ideas
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    When the user Unlike "Meetings" idea by clicking on minus icon
		    And the user hover over the "minus icon"
		    Then title should be Stop unliking this item	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#*7. Marketing User can sort the ideas by date added.*
	#8. Marketing User can sort the ideas by rating.
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-968
	Scenario: Verify that Marketing User should sort the ideas by date added
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    And sorted ideas by "date added" listed by the most recent date	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#*8. Marketing User can sort the ideas by rating.*
	#9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.
	@NEXTBASE-969
	Scenario: Verify that Marketing User should sort the ideas by rating
		Given the user is on the login page
		    When the user enters the marketing information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Ideas"
		    Then "Ideas" page should be displayed
		    And sorted ideas by "rating" listed by the most recent date	

	#{color:#ff0000}*US:* {color}As a user, I should be able to use "Services" functionality so that I can take advantage of company's services.
	#
	#{color:#ff0000}*AC:*{color}
	#
	#1. Helpdesk User can display "Event Calendar" after switching view from table view to calendar view by clicking "Meeting Room Booking Table View" on "Meeting Room Booking" page.
	#2. Helpdesk User can be redirected to "New Event" page for booking a meeting room after clicking "Book meeting room".
	#3. Helpdesk User can uncheck the "East Meeting Room" under "Calendars" section on "Meeting Room Booking" page.
	#4. Marketing User can suggest new idea by clicking "New idea" under Ideas page of Services module.
	#5. Marketing User can dislike the idea.
	#6. Marketing User can like the idea.
	#7. Marketing User can sort the ideas by date added.
	#8. Marketing User can sort the ideas by rating.
	#*9. HR User can print the lists by clicking "Print" button under Lists page of Services menu.*
	@NEXTBASE-972
	Scenario: Verify that HR User should be able to print the lists by clicking Print button
		Given the user is on the login page
		    When the user enters the HR information
		    And  the user click on "Services"
		    Then "Meeting Rooms" page should be displayed
		    When the user click on "Lists"
		    Then "Lists" page should be displayed
		    When the user add following info to Lists
		      | Custom info |
		      | Call list   |
		      |             |
		      | 132465/?^., |
		    And the user click on Print