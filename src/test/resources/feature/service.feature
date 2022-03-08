Feature: Service

  Scenario: Helpdesk user should be able to display "Event Calendar"
    Given the user is on the login page
    When the user enters the helpdesk information
    And the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the Helpdesk click on Meeting Room Booking Calendar View
    Then "Meeting Room Booking" page should be displayed
    When the Helpdesk user click on Book meeting room
    Then Helpdesk User can be redirected to New Event page

  Scenario: Helpdesk user should be able to uncheck the East Meeting Room
    Given the user is on the login page
    When the user enters the helpdesk information
    And the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the Helpdesk click on Meeting Room Booking Calendar View
    Then "Meeting Room Booking" page should be displayed
    When the user uncheck the East Meeting Room
    Then East Meeting Room should be unchecked

  Scenario:Marketing User should be able to suggest new idea
    Given the user is on the login page
    When the user enters the marketing information
    And  the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the user click on "Ideas"
    Then "Ideas" page should be displayed
    When the user click on "New idea"
    When creates new idea using following information
      | Title            | Problems            |
      | Idea description | Reframe the problem |
      | Tags             | problem solving     |
      | Category         | Company Activity    |
    Then the idea should be displayed on page having same content with provided info
      | Idea description | Reframe the problem |

  Scenario Outline:Marketing User should not be able to suggest new idea without title
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

  Scenario Outline:Marketing User should not be able to suggest new idea without Idea description
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

  Scenario:Marketing User should be able to like ideas
    Given the user is on the login page
    When the user enters the marketing information
    And  the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the user click on "Ideas"
    Then "Ideas" page should be displayed
    When the user Like "Problems" idea by clicking on plus icon
    Then title should be Stop liking this item

  Scenario:Marketing User should be able to unlike ideas
    Given the user is on the login page
    When the user enters the marketing information
    And  the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the user click on "Ideas"
    Then "Ideas" page should be displayed
    When the user Unlike "Problems" idea by clicking on minus icon
    Then title should be Stop unliking this item

  Scenario:Marketing User should sort the ideas by date added
    Given the user is on the login page
    When the user enters the marketing information
    And  the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the user click on "Ideas"
    Then "Ideas" page should be displayed
    And sorted ideas by "date added" listed by the most recent date

  Scenario:Marketing User should sort the ideas by rating
    Given the user is on the login page
    When the user enters the marketing information
    And  the user click on "Services"
    Then "Meeting Rooms" page should be displayed
    When the user click on "Ideas"
    Then "Ideas" page should be displayed
    And sorted ideas by "rating" listed by the most recent date

  Scenario: HR User can print the lists by clicking Print button
    Given the user is on the login page
    When the user enters the marketing information
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